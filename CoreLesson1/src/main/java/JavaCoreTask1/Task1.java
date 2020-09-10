package JavaCoreTask1;

public class Task1 {
     /* дз №1  public static void main(String[] args) {}
    //дз №2
    int a = 5;
    float b = 20f;
    double c = 16;
    byte f = 1;
    short val = 2;
    long val1 = 2000l;
    char val2 = '*';
    boolean val3 = false;
    String val4 = "Hay";
    дз №3*/

    public static float calculate(int a,int b,int c,int d) {
        return (float) a * (b + (c / d));
    }

//дз №4

    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

//дз №5

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

//дз №6

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

//дз №7

    public static void greeting(String name) {
        System.out.println("Привет, " + name + "! Как тебе Java?");
    }

// дз №8

    public static void bissextile(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - невисокосный год.");
        }
    }



    /*static boolean  bissextileFerst(int year) {
        if (year % 100 != 0) {
            if (year % 4 == 0 || year % 400 == 0) {
                return true;
            }
        }
    }
*/
/*
//как я бы написала, не уверена, что это правильно, еслиб нужно было проверить какой-то конкретный год
    public static void visYear(int year1){
        if (year1 % 4 == 0 || year1 % 400 ==0){
            System.out.println(year1 + " -  вис. год");
        }else if(year1 % 100 != 0){
            System.out.println(year1 + " -  не вис. год");
        }else {
            System.out.println(year1 + " -  не вис. год");
        }
    }

    //либо как в методичке, если выражение верное, то выводится сообщение, это больше на правду похоже
    if (year1 % 4 == 0 || year1 % 400 == 0 && year1 % 100 != 0){
System.out.println(Каждый 4 год - високосный, кроме каждого 100, но каждый 400 – високосный.)
    }
*/

    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(0, 0));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-4));
        greeting("Максим");
        bissextile(900);
        //bissextileFerst(200);
    }

}
