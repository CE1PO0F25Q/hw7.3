public class Main {
    public static void main(String[] args){
        task8();
        task9();
        task10();

    }
    public static void task8(){
        System.out.println(" задание 8");
        int delayed = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total=total+ delayed;
        }
        System.out.println( " месяц " + delayed + ", сумма накопления равна " + total);
    }
    public static void task9() {
        System.out.println(" задание 9");
        int delayed = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 120;
            total = total + delayed;
        }
        System.out.println(" месяц " + delayed + " ,сумма накоплений равна " + total);
    }
    public static void task10(){
        System.out.println(" задание 10");
        int multiplication =2;
        int sum = 0 ;
        for (int i = 1; i <=10; i++) {
            sum=sum+ multiplication ;

            System.out.println(  "2 * " + i + " = " + sum);


        }

}   }