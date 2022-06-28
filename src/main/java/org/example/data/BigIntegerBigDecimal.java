package org.example.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("111111111111111111111111111111");
        //  bigInt =  bigInt.add(new BigInteger("111111111111111111111111111111"));
        bigInt = bigInt.multiply(new BigInteger("111111111111111111111111111111"));

        System.out.println(bigInt);

        //------------------
        BigDecimal decimal = new BigDecimal("34321.1251512");
        decimal = decimal.pow(3);
        System.out.println(decimal);
    }
}
