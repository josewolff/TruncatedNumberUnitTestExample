package tests;

import auxClasses.CalculateTruncatedNumber;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.dp.DataProvidersMethods;

public class CalculateTruncatedNumberTests extends DataProvidersMethods {

    @Test(dataProvider = "lessThanOneMillion", dataProviderClass = DataProvidersMethods.class)
    public void lessThanOneMillionTest (double input, String expectedOutput){
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String output = calc.getTruncatedNumber(input);
        Assert.assertEquals(output,expectedOutput);
    }

    @Test(dataProvider = "OneMillionAndLessThanOneBillionTest", dataProviderClass = DataProvidersMethods.class)
    public void OneMillionAndLessThanOneBillionTest (double input, String expectedOutput){
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String output = calc.getTruncatedNumber(input);
        Assert.assertEquals(output,expectedOutput);
    }

    @Test(dataProvider = "OneBillionAndLessThanOneTrillonTest", dataProviderClass = DataProvidersMethods.class)
    public void OneBillionAndLessThanOneTrillonTest (double input, String expectedOutput){
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String output = calc.getTruncatedNumber(input);
        Assert.assertEquals(output,expectedOutput);
    }

    @Test(dataProvider = "OneTrillionAndLessThanOneCuatrillionTest", dataProviderClass = DataProvidersMethods.class)
    public void OneTrillionAndLessThanOneCuatrillionTest (double input, String expectedOutput){
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String output = calc.getTruncatedNumber(input);
        Assert.assertEquals(output,expectedOutput);
    }

    @Test(dataProvider = "MoreThanOneTrillon", dataProviderClass = DataProvidersMethods.class)
    public void MoreThanOneTrillonTest (double input, String expectedOutput){
        CalculateTruncatedNumber calc = new CalculateTruncatedNumber();
        String output = calc.getTruncatedNumber(input);
        Assert.assertEquals(output,expectedOutput);
    }
}

