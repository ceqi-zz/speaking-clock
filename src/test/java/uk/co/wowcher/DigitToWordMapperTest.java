package uk.co.wowcher;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DigitToWordMapperTest {
    @Test
    public void shouldHave60ItemsInMapper(){
        assertThat(DigitToWordMapper.getInstance().digitToWordMap.size(), is(60));
    }
}