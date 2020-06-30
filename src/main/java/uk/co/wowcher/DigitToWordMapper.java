package uk.co.wowcher;

import java.util.HashMap;
import java.util.Map;

public class DigitToWordMapper {
        Map<String, String> digitToWordMap = new HashMap<>();

        private DigitToWordMapper(){
            digitToWordMap.put("00", "zero");
            digitToWordMap.put("01", "one");
            digitToWordMap.put("02", "two");
            digitToWordMap.put("03", "three");
            digitToWordMap.put("04", "four");
            digitToWordMap.put("05", "five");
            digitToWordMap.put("06", "six");
            digitToWordMap.put("07", "seven");
            digitToWordMap.put("08", "eight");
            digitToWordMap.put("09", "nine");
            digitToWordMap.put("10", "ten");
            digitToWordMap.put("11", "eleven");
            digitToWordMap.put("12", "twelve");
            digitToWordMap.put("13", "thirteen");
            digitToWordMap.put("14", "fourteen");
            digitToWordMap.put("15", "fifteen");
            digitToWordMap.put("16", "sixteen");
            digitToWordMap.put("17", "seventeen");
            digitToWordMap.put("18", "eighteen");
            digitToWordMap.put("19", "nineteen");
            digitToWordMap.put("20", "twenty");
            digitToWordMap.put("21", "twenty one");
            digitToWordMap.put("22", "twenty two");
            digitToWordMap.put("23", "twenty three");
            digitToWordMap.put("24", "twenty four");
            digitToWordMap.put("25", "twenty five");
            digitToWordMap.put("26", "twenty six");
            digitToWordMap.put("27", "twenty seven");
            digitToWordMap.put("28", "twenty eight");
            digitToWordMap.put("29", "twenty nine");
            digitToWordMap.put("30", "thirty");
            digitToWordMap.put("31", "thirty one");
            digitToWordMap.put("32", "thirty two");
            digitToWordMap.put("33", "thirty three");
            digitToWordMap.put("34", "thirty four");
            digitToWordMap.put("35", "thirty five");
            digitToWordMap.put("36", "thirty six");
            digitToWordMap.put("37", "thirty seven");
            digitToWordMap.put("38", "thirty eight");
            digitToWordMap.put("39", "thirty nine");
            digitToWordMap.put("40", "forty");
            digitToWordMap.put("41", "forty one");
            digitToWordMap.put("42", "forty two");
            digitToWordMap.put("43", "forty three");
            digitToWordMap.put("44", "forty four");
            digitToWordMap.put("45", "forty five");
            digitToWordMap.put("46", "forty six");
            digitToWordMap.put("47", "forty seven");
            digitToWordMap.put("48", "forty eight");
            digitToWordMap.put("49", "forty nine");
            digitToWordMap.put("50", "fifty");
            digitToWordMap.put("51", "fifty one");
            digitToWordMap.put("52", "fifty two");
            digitToWordMap.put("53", "fifty three");
            digitToWordMap.put("54", "fifty four");
            digitToWordMap.put("55", "fifty five");
            digitToWordMap.put("56", "fifty six");
            digitToWordMap.put("57", "fifty seven");
            digitToWordMap.put("58", "fifty eight");
            digitToWordMap.put("59", "fifty nine");
        }

        private static class MapperHelper{
            private static final DigitToWordMapper INSTANCE = new DigitToWordMapper();
        }

        public static DigitToWordMapper getInstance(){
            return MapperHelper.INSTANCE;
        }

}
