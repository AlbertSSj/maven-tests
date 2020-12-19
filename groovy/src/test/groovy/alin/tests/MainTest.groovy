package alin.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest
{

    @Test
    @DisplayName("1 + 1 = 2")
    def onePlusOne() {
        assertEquals(1 + 1, 2);
    }

}
