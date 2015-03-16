import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
         * Создание массива покупок из 5 товаров
         */
        Purchase listPurchase [] = { new Purchase("Pencil",10,135,Weekday.Tuesday),
                                     new Purchase("Pen",25,250,Weekday.Wednesday),
                                     new Purchase("Workbook",40,80,Weekday.Friday),
                                     new Purchase("Book",80,50,Weekday.Wednesday),
                                     new Purchase("Blackboard",347,5,Weekday.Tuesday)
        };
        /*
         * Печать созданного списка на консоль
         */
        System.out.println("Print the array content to the console " +
                "(constants one time at first).");
        for (Purchase alistPurchase : listPurchase){
            System.out.println(alistPurchase);
        }
        /*
         * Расчет средней стоимости всех купленных товаров;
         * Расчет общей стоимости покупок за понедельник
         * Определения дня недели, где стоимость покупок максимальна
         */
        int sumCost = 0;
        System.out.println("");
        System.out.println("The mean cost of all purchases: ");
        for (Purchase alistPurchase : listPurchase){
            sumCost += alistPurchase.getCost();
        }
        System.out.println(Double.toString((double)sumCost/listPurchase.length));
        System.out.println("The total cost of all purchases in monday: ");
        sumCost = 0;
        for (Purchase alistPurchase : listPurchase){
            if (alistPurchase.getDay() == Weekday.Monday)
                sumCost += alistPurchase.getCost();
        }
        System.out.println(Integer.toString(sumCost));
        System.out.println("The day with the maximum cost purchase: ");
        int [] costDay = new int[]{0,0,0,0,0,0,0};
        for (Purchase alistPurchase : listPurchase){
            switch (alistPurchase.getDay()){
                case Monday:
                    costDay[0] += alistPurchase.getCost();
                    break;
                case Tuesday:
                    costDay[1] += alistPurchase.getCost();
                    break;
                case Wednesday:
                    costDay[2] += alistPurchase.getCost();
                    break;
                case Thursday:
                    costDay[3] += alistPurchase.getCost();
                    break;
                case Friday:
                    costDay[4] += alistPurchase.getCost();
                    break;
                case Saturday:
                    costDay[5] += alistPurchase.getCost();
                    break;
                case Sunday:
                    costDay[6] += alistPurchase.getCost();
                    break;
                default:
                    break;
            }
        }
        int max = costDay[0];
        String result = listPurchase[0].indexDay(0);
        for (int i = 1; i < costDay.length; i++){
            if (max < costDay[i]) {
                result = listPurchase[0].indexDay(i);
                max = costDay[i];
            }

        }
        System.out.println(result);
        /*
         * Сортировка списка и вывод в консоль
         */
        System.out.println("");
        Arrays.sort(listPurchase);
        System.out.println("Sort an array by the method sort( ) of the class Arrays " +
                "and print the array content to the console");
        for (Purchase alistPurchase : listPurchase){
            System.out.println(alistPurchase);
        }
    }
}
