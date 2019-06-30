package tests.dp;

import org.testng.annotations.DataProvider;

public class DataProvidersMethods {

    @DataProvider(name = "lessThanOneMillion")
    protected Object[][] lessThanOneMillion() {
        return new Object[][] {
                { 0.0 , "0" },
                { 500000.12 , "500000.1" },
                { 999999 , "999999" },
        };
    }


    @DataProvider(name = "OneMillionAndLessThanOneBillionTest")
    protected Object[][] OneMillionAndLessThanOneBillionTest() {
        return new Object[][] {
                { 1000000 , "1M" },
                { 500000000 , "500M" },
                { 999999999 , "1000.0M" },
                { 1340000 , "1.3M" }
        };
    }

    @DataProvider(name = "OneBillionAndLessThanOneTrillonTest")
    protected Object[][] OneBillionAndLessThanOneTrillonTest() {
        return new Object[][] {
                { 1000000000 , "1B" },
                { 500000000000.0 , "500B" },
                { 999999999999.0 , "1000.0B" },
                { 1340000000 , "1.3B" }
        };
    }

    @DataProvider(name = "OneTrillionAndLessThanOneCuatrillionTest")
    protected Object[][] OneTrillionAndLessThanOneCuatrillionTest() {
        return new Object[][] {
                { 1000000000000.0 , "1T" },
                { 500000000000000.0 , "500T" },
                { (1000000000000000.0-1)  , "1000.0T" },
                { 1340000000000.0 , "1.3T" }
        };
    }

    @DataProvider(name = "MoreThanOneTrillon")
    protected Object[][] MoreThanOneTrillon() {
        return new Object[][] {
                { 1000000000000000.0 , "1.0E15" },
        };
    }

}
