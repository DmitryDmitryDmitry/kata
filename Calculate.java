import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пример без пробелов: ");
        String text = scanner.nextLine();
        String[] d = text.split(" ");


        if(d.length != 3){
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else{
            String a = String.valueOf(d[0]);
            String b = String.valueOf(d[1]);
            String c = String.valueOf(d[2]);


            String[] string = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXVIII", "XXIX", "XL", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "LC", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            int x = 0;
            int y = 0;





            if ((a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) && (c.equals("1") || c.equals("2") || c.equals("3") || c.equals("4") || c.equals("5") || c.equals("6") || c.equals("7") || c.equals("8") || c.equals("9") || c.equals("10"))){
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            }else if ((c.equals("I") || c.equals("II") || c.equals("III") || c.equals("IV") || c.equals("V") || c.equals("VI") || c.equals("VII") || c.equals("VIII") || c.equals("IX") || c.equals("X")) && (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10"))){
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            }else if ((a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) && (c.equals("I") || c.equals("II") || c.equals("III") || c.equals("IV") || c.equals("V") || c.equals("VI") || c.equals("VII") || c.equals("VIII") || c.equals("IX") || c.equals("X"))){
                for(int i = 0; i < string.length; i++){
                    if(a.equals(string[i])){
                        x = i + 1;
                    }
                    if(c.equals(string[i])){
                        y = i + 1;
                    }
                }
                if (x > 10 || y > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("+")) {
                    int summ = x + y;
                    System.out.println(string[summ - 1]);
                }

                if (x > 10 || y > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("-")) {
                    if ((x - y) < 0){
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }else {
                        int summ = x - y;
                        System.out.println(string[summ - 1]);
                    }
                }

                if (x > 10 || y > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("*")) {
                    int summ = x * y;
                    System.out.println(string[summ - 1]);
                }

                if (x > 10 || y > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("/")) {
                    int summ = x / y;
                    System.out.println(string[summ - 1]);
                }
            }else{
                if (Integer.parseInt(a) > 10 || Integer.parseInt(c) > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("+")) {
                    int summ = Integer.parseInt(a) + Integer.parseInt(c);
                    if(summ < 0){
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }else{
                        System.out.println(summ);
                    }
                }

                if (Integer.parseInt(a) > 10 || Integer.parseInt(c) > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("-")) {
                    int summ = Integer.parseInt(a) - Integer.parseInt(c);
                    if(summ < 0){
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }else{
                        System.out.println(summ);
                    }
                }

                if (Integer.parseInt(a) > 10 || Integer.parseInt(c) > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("*")) {
                    int summ = Integer.parseInt(a) * Integer.parseInt(c);
                    if(summ < 0){
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }else{
                        System.out.println(summ);
                    }
                }

                if (Integer.parseInt(a) > 10 || Integer.parseInt(c) > 10){
                    System.out.print("throws Exception //т.к. число больше 10");
                }else if (b.equals("/")) {
                    int summ = Integer.parseInt(a) / Integer.parseInt(c);
                    if(summ < 0){
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }else{
                        System.out.println(summ);
                    }
                }
            }
        }
    }
}
