import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CtverecTest {

    @org.junit.jupiter.api.Test
    void getStrana() {
        Random rnd =new Random();
        Ctverec c = new Ctverec(rnd.nextInt(10));

        assertEquals(9,c.getStrana(),"spatna strana");

    }

    @org.junit.jupiter.api.Test
    void setStrana() {
        fail("failed");

    }
}