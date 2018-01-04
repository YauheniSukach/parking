import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    private  static void chek(ArrayList<Integer> parking) {
          for(int i=0;i<parking.size();i++){
              if(parking.get(i)==0){
                  System.out.println("Место "+(i+1)+" свободно!");
              }else System.out.println("Место "+(i+1)+ " занято!");
          }
    }
    private  static void remove(ArrayList<Integer> parking,int number) {
            try {
                if ((parking.get(number-1) != 0)) {
                   parking.set(number-1,0);
                    System.out.println("Место освободилось!");
                } else
                    System.out.println("Место свободно!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Такого номера парковки нет!");
            }
        }
    private  static void add(ArrayList<Integer> parking) {
        for(int i=0;i<parking.size();i++){
            if(parking.get(i)==0){
                System.out.println("Место "+(i+1)+" свободно!");
                parking.set(i,1);
                System.out.println("Парковка завершена!!!");
                break;
            }else System.out.println("Место "+(i+1)+ " занято!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во мест стоянки:");
        int park = sc.nextInt();
        ArrayList<Integer> parking= new ArrayList<>();
        for(int i=0;i<park;i++){
            parking.add(0);
        }
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Функции:");
            System.out.println("1 - Проверка парковочных мест.");
            System.out.println("2 - Выезд машины из парковочного места.");
            System.out.println("3 - Въезд машины на парковочное место.");
            System.out.println("4 - Закрыть программу.");
            System.out.println("-------------------------------------------");
            String answer = sc.next();
            int answ = Integer.parseInt(answer);
            switch (answ) {
                case 1:
                    chek(parking);
                    break;
                case 2:
                    System.out.println("Введите место!");
                    int number = sc.nextInt();
                     remove(parking,number);
                    break;
                case 3:
                    add(parking);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
