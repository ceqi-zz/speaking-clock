package uk.co.wowcher;

public class TimeToWord {
    private final DigitToWordMapper mapper;

    public TimeToWord(DigitToWordMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Convert the time in digit format to words if it is present and in valid format,
     * see {@link #isValid(String)} method for detailed validation checking.
     *
     * @param time time string represented in digit format, if present
     * @return words converted from time digits
     * @throws IllegalArgumentException  if the time format is invalid
     */
    public String parseTime(String time) {
        if (!isValid(time))
            throw new IllegalArgumentException("Input doesn't match required format: 00:00 - 23:59");

        String[] hhmm = time.split(":");
        String hh = hhmm[0], mm = hhmm[1];

        if (hh.equals("12") && mm.equals("00")) return "It's Midday";
        if (hh.equals("00") && mm.equals("00")) return "It's Midnight";

        String hhWord = mapper.digitToWordMap.get(hh);
        String mmWord = mapper.digitToWordMap.get(mm);

        return String.format("It's %s %s", hhWord, mmWord);
    }

    /**
     * Checks a time string in digit format using a regex pattern.
     * The range for a 24 hour time is from 00:00 - 23:59
     *
     * @param time time string represented in digit format, if present
     * @return true if the time format is correct
     */
    boolean isValid(String time) {
        String pattern = "^([01]\\d|2[0-3]):([0-5]\\d)$";
        return time != null && time.matches(pattern);
    }


}
