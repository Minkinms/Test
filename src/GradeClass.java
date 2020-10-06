public class GradeClass {
    public static void main(String[] args) {
        GradeClass g = new GradeClass();

    }

    enum Grade {
        VERYBAD,
        BAD,
        SATISFACTORILY,
        GOOD,
        EXCELLENT,
        NOTDEFINED
    }

    //Задание раздела 7.
    // Метод возвращающий значение enum через switch case
    static Grade intToGrade (int grade){
        switch (grade) {
            case 1:
                return Grade.VERYBAD;
            case 2:
                return Grade.BAD;
            case 3:
                return Grade.SATISFACTORILY;
            case 4:
                return Grade.GOOD;
            case 5:
                return Grade.EXCELLENT;
            default:
                return Grade.NOTDEFINED;

        }
    }
}
