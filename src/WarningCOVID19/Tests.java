package WarningCOVID19;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Tests {
    @Test
    public void test1()
    {
        SkahiNetCovidy entity = new SkahiNetCovidy();

        boolean value = entity.NetCovidy(5);

        Assert.assertFalse(value);
    }

    @Test
    public void test2()
    {
        try{

            SkahiNetCovidy entity = new SkahiNetCovidy();

            boolean value = entity.BolisheNylailiMenisheNyla(1);

            Assert.assertFalse(value);

    } catch (AssertionError ex) {
            System.out.println("ЭЭЭЭЭ ни правильна");
            System.out.println("ПЕРЕДЕЛЫВАЙ");
    }
    }


}
