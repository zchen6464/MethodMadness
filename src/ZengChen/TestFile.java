package ZengChen;

public class TestFile {

    public static void main (String[] args) {
        System.out.println(Zchenlib.dateStr("12/12/12") + " \nProcess end"); // test "12/12/12"
        System.out.println(Zchenlib.cutOut("catatonic cat","cat") + "\nProcess end"); // test "catatonic cat"
        System.out.println(Zchenlib.isFibonnaci(9) + "\nProcess end"); // test the number 9
        Zchenlib.multiplicationTable(2, 9); // test the multiplication table of 2 up to 2 * 9
        System.out.println(Zchenlib.sumUpTo(10) + "\nProcess end"); // 0 + 1 + 2... + 10
        System.out.println(Zchenlib.leastCommonMultiple(5,10,15) + "\nProcess end"); // checks for lcm of 3 int (5,10,15).
    }
}
