package com.company;

public class Main {

    public static void main(String[] args) {
        int MyValue = 10000;
        int MinIntValue = Integer.MIN_VALUE;
        int MaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + MinIntValue);
        System.out.println("Integer Maximum Value =" + MaxIntValue);
        System.out.println("Busted Maximum Value = " + (MaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (MinIntValue - 1));

        byte MinByteValue = Byte.MIN_VALUE;
        byte MaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte minimum value =" + MinByteValue);
        System.out.println("byte maximum value =" + MaxByteValue);

        long MyLongValue = 2147483647;

        long MinLongValue = Long.MIN_VALUE;
        long MaxLongValue = Long.MAX_VALUE;
        System.out.println("long minimum value =" + MinLongValue);
        System.out.println("long maximum value =" + MaxLongValue);
        long MyBigLongLiteral = 2147483648L;
        System.out.println(MyLongValue);
        System.out.println(MyBigLongLiteral);

        int newintvalue = (MaxIntValue/2);
        byte newbytevalue = (byte) (MaxByteValue/2);
        System.out.println( newintvalue);
        System.out.println( newbytevalue);

    }
}
