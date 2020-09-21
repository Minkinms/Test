public class Homework_H3 {
    public static void main(String[] args) {
        System.out.println(reversDigits(361));
    }

    public static int reversDigits(int number) {
        int mDigit1;
        int mDigit2;
        int mDigit3;
        int mReversedDigit;

       /* mDigit1 = number/10;
        System.out.println(mDigit1);
        mDigit3 = mDigit1/10;
        System.out.println(mDigit3);
        mDigit2 = mDigit1 - mDigit3*10;
        System.out.println(mDigit2);
        mDigit1 = number - mDigit1*10;
        System.out.println(mDigit1);
        */

       /* mDigit1 = number/100;
        System.out.println(mDigit1);
        mDigit3 = number%10;
        System.out.println(mDigit3);
        mDigit2 = number/10 - mDigit1*10;
        System.out.println(mDigit2);
        */


        // 1. Определяем остаток отделения на 10 и получаем последнюю цифру. Это сотни, поэтому в ответе умножаем на 100
        // 2. Делим на 10 с присвоением. Перезаписываем Number и отрезаем таким образом последнюю цифру.
        // Далее определяем остаток от деления уже двух первых цифр и получаем вторую цифру числа. Это десятки, умножаем на 10.
        // 3. Перезаписанный Number (с двумя цифрами) делим на 10 и получаем первую цифру.
        mReversedDigit = 100*(number%10) + 10*((number/=10)%10) + number/10;


        //return mDigit3*100 + mDigit2*10 + mDigit1;
        return mReversedDigit;
    }

}
