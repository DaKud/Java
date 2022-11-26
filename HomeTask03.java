import java.util.ArrayList;
import java.util.Collections;
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// public class HomeTask03 {
//     public static void main(String[] args){
//         ArrayList<Integer> number = new ArrayList<>();
       
//         number.add(1);
//         number.add(2);
//         number.add(3);
//         number.add(4);
//         number.add(5);
//         System.out.println(number);
        
//          for (int i=0;i<number.size();i++){      
//             int even=number.get(i)%2;       
//              if (even==0){
//                  System.out.println("This is Even Number:"+ number.get(i));
//                  number.remove(i);
//              }    
//          }
//          System.out.println(number);
//     }
// }
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class HomeTask03 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(111);
        
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
    }
}
// ArrayList<Integer> list = new ArrayList<Integer>();
// list.add(100);
// list.add(-666);
// list.add(666);

// int min = list.get(0);
// int max = list.get(0);

// for (Integer i: list) {
//     if(i < min) 
//         min = i;
//     if(i > max) 
//         max = i;
//      
// }

// System.out.println("минимальное число: " + min);
// System.out.println("максимальное число: " + max);