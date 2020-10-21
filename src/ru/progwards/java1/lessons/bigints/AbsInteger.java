package ru.progwards.java1.lessons.bigints;

public class AbsInteger {
    public static void main(String[] args) {
        byte b = 8;
        byte b1 = 18;
        ByteInteger byteInteger = new ByteInteger(b);
        //System.out.println(byteInteger.toString());
        //System.out.println(byteInteger.getClass());

        ByteInteger byteInteger1 = new ByteInteger(b1);

        short sh = 20;
        ShortInteger shortInteger = new ShortInteger(sh);

        System.out.println(add(byteInteger, byteInteger1));
        //add(byteInteger, shortInteger);

    }

    //Метод вычисления суммы
    static AbsInteger add(AbsInteger num1, AbsInteger num2){
       return num1.addNumbers(num2);

        /*if (num1.equals(num2)){
            System.out.println("Объекты равны по классу");
            return null;
        } else{
            System.out.println("Объекты НЕ равны по классу");
            return null;
        }

         */

    }

    AbsInteger addNumbers(AbsInteger num2){
        return null;
    }

/*----------------------------------------------------*/
    static class ByteInteger extends AbsInteger{
        //Переменные класса
        byte mByteNumber;

        //Конструктор класса
        ByteInteger(byte mByteNumber){
            this.mByteNumber = mByteNumber;
        }

    @Override
    AbsInteger addNumbers(AbsInteger num2) {
        //num2 = (ByteInteger) num2;

        //        result = (byte) (this.mByteNumber + ((ByteInteger) num2).mByteNumber);
    //    if (this.getClass() == num1.getClass() && this.getClass() == num2.getClass()) {
    //        return  result = (AbsInteger) result;
    //    } else {
            return new ByteInteger((byte) (this.mByteNumber + ((ByteInteger) num2).mByteNumber));
    //    }

    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass(); //Если сравиниваемый объект не пустой и того же класса, то true
    }

    @Override
        public String toString() {
            return Byte.toString(mByteNumber);
        }
    }

/*----------------------------------------------------*/
    static class ShortInteger extends AbsInteger{
        //Переменные класса
        short mShortNumber;

        //Конструктор класса
        ShortInteger(short mShortNumber){
            this.mShortNumber = mShortNumber;
        }

        @Override
        public String toString() {
            return Short.toString(mShortNumber);
        }
    }

/*----------------------------------------------------*/
    static class IntInteger extends AbsInteger{
        //Переменные класса
        int mIntNumber;

        //Конструктор класса
        IntInteger(int mIntNumber) {
            this.mIntNumber = mIntNumber;
        }

    @Override
    public String toString() {
        return Integer.toString(mIntNumber);
    }
}


}
