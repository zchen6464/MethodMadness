package ZengChen;

public class Zchenlib {

    public static String dateStr(String input) // goes through each individual char of input, replaces all "/" w/ "-"
    {
        String output = "";
        for (int i =0; i < input.length();i++)
        {
            if(input.charAt(i) == '/')
            {
                output = output + "-";
            }
            else
            {
                output = output + input.charAt(i);
            }
        }
        return output;
    }

    public static String cutOut(String mainStr, String subStr) // return (first char to first index) + (char after substr to end)
    {
        int x = mainStr.indexOf(subStr) + subStr.length();
        return  mainStr.substring(0,x) + mainStr.substring(x);
    }

    public static boolean isFibonnaci(int num) // checks if num fits (1, 1, 2, 3, 5, 8, 13, 21...)
    {
        boolean check = false;
        int x = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++)
        {
            if(x+i == num)
            {
                check = true;
            }
        }
        return check;
    }

    public static void multiplicationTable(int base, int range) // base * 1, * 2 ... base * range
    {
        for(int i = 0; i < range; i ++)
        {
            System.out.println(base * i);
        }
        System.out.println("Process end");
    }

    public static int sumUpTo(int input) // 0 + 1 + 2.... + input
    {
        int output = 0; // sum
        for (int i = 0; i < input; i++)
        {
            output = output + i;
        }
        return output;
    }

    public static int leastCommonMultiple(int input1, int input2, int input3) // finds the smallest of 3 inputs, and going through the multiple until lcm is found
    {
        int i = 1; // multiple of x
        int x = 0; // smallest input
        if(input1 < input2 && input1 < input3)
        {
            x = input1;
        }
        else if(input2 < input3)
        {
            x = input2;
        }
        else
        {
            x = input3;
        }
        while(((i * x) % input3 != 0) || ((i * x) % input2 != 0))
        {
            i++;
        }
        return (i * x);
    }
}
