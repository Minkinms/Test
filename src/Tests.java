import java.util.Arrays;

public class Tests {
    //TODO:Здесь записывать код для тестов

    public static void main(String[] args) {
        //System.out.println(fractional(5.5));
        //System.out.println(fractional(3.235));

        //System.out.println(addAsStrings(3,2));

        //System.out.println(factorial(3));
        //System.out.println(factorial(0));
        //System.out.println(factorial(8));
        /*
        int[] testArray = {1, 5, 8, 3, 22};
        int[] testArray1 = {1, 23, 8, 13, 22};
        int[] zeroArray = new int[0];
        System.out.println(arrayMax(testArray));
        System.out.println(arrayMax(testArray1));
        System.out.println(arrayMax(zeroArray));

         */

        System.out.println(juniorByte((byte) 0b01001010));
        System.out.println(juniorByte((byte) 0b01001011));

    }



    //Код возвращающий младший бит байта
    static public int juniorByte(byte value) {
        //byte value = (byte) 0b01001010;
        byte keyValue = (byte) 0b00000001;
        int result;

        if ((value & keyValue) > 0){
            result = 1;
        } else {
            result = 0;
        }


        return result;
    }


    static public int arrayMax(int[] a) {
        Arrays.sort(a);
        if (a.length > 0) {
            return a[a.length - 1];
        } else {
            return 0;
        }
    }



    static double fractional(double num) {
        int b = (int) num;
        //System.out.println(b);

        return num-b;
    }

    static int addAsStrings(int n1, int n2) {
        //String string = Integer.toString(n1) + Integer.toString(n2);
        //int a;
        return Integer.parseInt(Integer.toString(n1) + Integer.toString(n2));
    }

    static String textGrade(int grade) {
        String mStringGrade = null;
        if (grade == 0)                mStringGrade = "не оценено";
        if (grade >=1 && grade <=20)   mStringGrade = "очень плохо";
        if (grade >=21 && grade <=40)  mStringGrade = "плохо";
        if (grade >=41 && grade <=60)  mStringGrade = "удовлетворительно";
        if (grade >=61 && grade <=80)  mStringGrade = "хорошо";
        if (grade >=81 && grade <=100) mStringGrade = "отлично";
        if (grade >100)                mStringGrade = "не определено";
        return mStringGrade;
    }

    static long factorial(long n){
        long Result;
        if (n==0) Result = 1L;
        else {
            Result=1L;
            for (int i=1; i<=n; i++){
                Result *=  i;
            }
        }
        return Result;
    }
}
