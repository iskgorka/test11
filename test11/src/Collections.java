import java.util.*;

public class Collections {
}

/*
Collection example 1
        //Продемонстрировать применение класса ArrayList
        class ArrayListDemo {
            public static void main(String[] args) {
        //Создать списочный массив
                ArrayList<String> al = new ArrayList<>();
                System.out.println("Начальный размер списочного массива al: " + al.size());
        //Ввести элементы в списочный массив
                al.add("C");
                al.add("A");
                al.add("E");
                al.add("B");
                al.add("D");
                al.add("F");
                al.add(1,"A2");
                System.out.println("Размер списочного массива al после ввода элементов: " + al.size());
        //Вывести списочный массив
                System.out.println("Содержимое списочного массива al: " + al);
        //Удалить элементы из списочного массива
                al.remove("F");
                al.remove(2);
                System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
                System.out.println("Содержимое списочного массива al: " + al);
            }
        }

Collection example 2
        //Продемонстрировать применение класса ArrayList
        class ArrayListDemo {
            public static void main(String[] args) {
        //Создать списочный массив
                ArrayList<String> al = new ArrayList<String>(2);
                System.out.println("Начальный размер списочного массива: " + al.size());
        //Добавить элементы в списочный массив
                al.ensureCapacity(20);
                System.out.println("Размер списочного массива al: " + al.size());
                al.add("C");
                al.add("A");
                al.add("E");
                al.add("B");
                al.add("D");
                al.add("F");
                al.add(1,"A2");
                System.out.println("Размер списочного массива al после ввода элементов: " + al.size());
        //Вывести списочный массив
                System.out.println("Содержимое списочного массива al: " + al);
        //Удалить элементы из списочного массива
                al.remove("F");
                al.remove(2);
                System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
                System.out.println("Содержимое списочного массива al: " + al);
                al.trimToSize();
                System.out.println("Размер списочного массива al после trimToSize(): " + al.size());
            }
        }

Collection example 3
        //Преобразовать списочный массив ArrayList в обычный массив
        class ArrayListToArray {
            public static void main(String[] args) {
        //Создать списочный массив
                ArrayList<Integer> al = new ArrayList<>();
        //Ввести элементы в списочный массив
                al.add(1);
                al.add(2);
                al.add(3);
                al.add(4);
                System.out.println("Содержимое списочного массива al: " + al);
        //Получить обычный массив
                Integer[] ia = new Integer[al.size()];
                ia = al.toArray(ia);
                int sum = 0;
        //Сумировать элементы массива
                for (int i : ia) sum += i;
                System.out.println("Сумма: " + sum);
                Character[] ch = {'a', 'c', 'f'};
                List<Character> list = Arrays.asList(ch);
                System.out.println(list.size());
                System.out.println(list);
            }
        }

Collection example 4

*/