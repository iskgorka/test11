import java.util.*;

public class Collections {
}

/*
Presentation example 1
        class ListDemo {
            public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list1 = new ArrayList<>();

                list.add(1);
                list.add(1,10);
                list.add(2,7);
                System.out.println(list);
                list.remove(0);
                System.out.println(list);
                System.out.println(list.isEmpty());
                System.out.println(list1.isEmpty());
                System.out.println(list.size());
                System.out.println(list1.size());
                System.out.println(list.contains(7));
                list.add(9);
                System.out.println(list.get(1));
                list1.add(14);
                list1.add(2);
                list1.add(6);
                list1.add(80);
                list1.add(6);
                System.out.println(list1);
                System.out.println(list1.indexOf(6));
                System.out.println(list1.lastIndexOf(6));
                list1.set(1,66);
                System.out.println(list1);
            }
        }

Presentation example 2
        class SetDemo {
            public static void main(String[] args) {
                Set<Integer> set = new HashSet<>();
                set.add(8);
                set.add(14);
                set.add(32);
                set.add(90);
                set.add(90);
                for (Integer i : set) System.out.print(i + ",");
            }
        }

Presentation example 3
        class QueueDemo {
            public static void main(String[] args) {
                Queue<Integer> queue = new ArrayDeque<>();
                queue.add(10);
                queue.add(7);
                queue.add(11);
                queue.add(11);
                queue.offer(6);
                //queue.remove(); //removes first element
                for (Integer i : queue) {
                    System.out.println(i);
                }
                //System.out.println(queue.element()); //first element
                System.out.println(queue.poll());
                System.out.println(queue.peek());

                System.out.println(queue.offer(10)); //true
                System.out.println(queue.offer(4)); //true
                System.out.println(queue.peek()); //10
                System.out.println(queue.poll()); //10
                System.out.println(queue.poll()); //4
                System.out.println(queue.peek()); //null
            }
        }

Presentation example 4
        class MapDemo {
            public static void main(String[] args) {
                Map<String, String> map = new HashMap<>();
                map.put("koala", "bamboo");
                map.put("lion", "meat");
                map.put("giraffe", "leaf");
                //map.clear();
                System.out.println("The map is empty: " + map.isEmpty());
                String food = map.get("koala"); //bamboo
                map.put("aaa", "zzz");
                map.remove("lion");
                for (String key : map.keySet()) System.out.println(key);
                System.out.println("The koala eats: " + map.get("koala"));
                System.out.println("The map size is: " + map.size());
                System.out.println(map.containsValue("leaf"));
                System.out.println(map.containsValue("lion"));
                System.out.println(map.keySet());
                System.out.println(map.values());
            }
        }

Presentation example 5
        class ArrayListDemo {
            public static void main(String[] args) {
                //List<String> birds = new ArrayList<>();
                //birds.add("hawk");
                //System.out.println(birds);
                //birds.set(0, "robin");
                //System.out.println(birds);
                //birds.set(1, "sparrow"); // IndexOutOfBoundsException

                //ArrayList list = new ArrayList();
                //list.add("halk");
                //list.add(true);
                //list.add(2.3);
                //System.out.println(list);

                List<String> one = new ArrayList<>();
                List<String> two = new ArrayList<>();
                System.out.println(one.equals(two));
                one.add("1");
                System.out.println(one.equals(two));
                two.add("1");
                System.out.println(one.equals(two));
                one.add("2");
                two.set(0, "2");
                System.out.println(one.equals(two));
            }
        }

Presentation example 6
        class ConvertingDemo {
            public static void main(String[] args) {
                List<String> list = new ArrayList<>();
                list.add("hawk");
                list.add("robin");
                Object[] objectArray = list.toArray();
                System.out.println(objectArray.length); //2
                String[] stringArray = list.toArray(new String[0]);
                System.out.println(stringArray.length);

                String[] array = {"Hawk", "Robin", "Sparrow"};
                List<String> list1 = Arrays.asList(array);
                System.out.println(list1.size());
            }
        }

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
        //Продемонстрироват применение класса LinkedList
        class LinkedListDemo {
            public static void main(String[] args) {
        //создать связный список
                LinkedList<String> ll = new LinkedList<>();
        //ввести элементы в связный список
                System.out.println(ll.isEmpty());
                ll.add("F");
                ll.add("B");
                ll.add("D");
                ll.add("E");
                ll.add("C");
                ll.addLast("Z");
                ll.addFirst("A");
                ll.add(1,"A2");
                System.out.println("Исходное содержимое связного списка ll: " + ll);
        //удалить элементы из связного списка
                ll.remove("F");
                ll.remove(2);
                System.out.println("Содержимое связного списка ll после удаления элементов: " + ll);
        //удалить первый и последний элементы из связного списка
                ll.removeFirst();
                ll.removeLast();
                System.out.println("Содержимое связного списка ll после удаления первого и последнего элементов: " + ll);
        //получить и присвоить значение
                String val = ll.get(2);
                ll.set(2, val + " изменено");
                System.out.println("Содержимое связного списка ll после изменения: " + ll);
            }
        }

Collection example 5
        //Продемонстрировать применение класса HashSet
        class HashSetDemo {
            public static void main(String[] args) {
        //создать хеш-множество
                HashSet<String> hs = new HashSet<>();
        //ввести элементы в хеш-множество
                hs.add("Бета");
                hs.add("Альфа");
                hs.add("Гамма");
                hs.add("Эпсилон");
                hs.add("Омега");
                System.out.println(hs);
            }
        }

Collection example 6
        //Продемонстрировать применение класса TreeSet
        class TreeSetDemo {
            public static void main(String[] args) {
        //создать древовидное множество типа TreeSet
                TreeSet<String> ts = new TreeSet<>();
        //ввести элементы в древовидное множество типа TreeSet
                ts.add("C");
                ts.add("A");
                ts.add("B");
                ts.add("E");
                ts.add("F");
                ts.add("D");
                System.out.println(ts);
                System.out.println(ts.subSet("C","F"));
            }
        }

Collection example 7
        //Продемонстрировать применение класса ArrayDeque
        class ArrayDequeDemo {
            public static void main(String[] args) {
        //создать двухстороннюю очередь
                ArrayDeque<String> adq = new ArrayDeque<>();
        //использовать класса ArrayDeque для организации стека
                adq.push("A");
                adq.push("B");
                adq.push("D");
                adq.push("E");
                adq.push("F");
                System.out.println("adq содержит B: " + adq.contains("B"));
                System.out.println("adq содержит T: " + adq.contains("T"));
                ArrayDeque<String> adq2 = new ArrayDeque<>();
        //использовать класса ArrayDeque для организации стека
                adq2.push("A");
                adq2.push("B");
                adq2.push("D");
                adq2.push("E");
                adq2.push("F");
                System.out.println("Извлечение из стека adq: ");
                while (adq.peek() != null)
                    System.out.print(adq.pop() + " ");
                System.out.println();
                System.out.println("adq2 пустой: " + adq2.isEmpty());
                System.out.println("размер adq2: " + adq2.size());
                adq2.clear();
                System.out.println("adq2 пустой: " + adq2.isEmpty());
                System.out.println("размер adq2: " + adq2.size());
            }
        }

Collection example 8
        //Продемонстрировать применение итераторов
        class IteratorDemo {
            public static void main(String[] args) {
        //Создать списочный массив
                ArrayList<String> al = new ArrayList<>();
        //ввести элементы в списочный массив
                al.add("C");
                al.add("A");
                al.add("E");
                al.add("B");
                al.add("D");
                al.add("F");
        //использовать итераторы для вывода содержимого
        //списочного массива
                System.out.print("Исходное содержимое списочного массива al: ");
                Iterator<String> itr = al.iterator();
                while (itr.hasNext()) {
                    String element = itr.next();
                    System.out.print(element + " ");
                }
                System.out.println();
        //видоизменить перебираемые объекты
                ListIterator<String> litr = al.listIterator();
                while (litr.hasNext()) {
                    String element = litr.next();
                    litr.set(element + "+");
                }
                System.out.print("Измененное содержимое списочного массива al: ");
                itr = al.iterator();
                while (itr.hasNext()) {
                    String element = itr.next();
                    System.out.print(element + " ");
                }
                System.out.println();
        //а теперь отобразить список в обратном порядке
                System.out.print("Измененный в обратном порядке список: ");
                while (litr.hasPrevious()) {
                    String element = litr.previous();
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

Collection example 9
        //применение цикла foreach для перебора элементов коллекции
        class ForEachDemo {
            public static void main(String[] args) {
        //создать списочный массив для целых чисел
                ArrayList<Integer> vals = new ArrayList<>();
        //ввести числовые значения в списочный массив
                vals.add(1);
                vals.add(2);
                vals.add(3);
                vals.add(4);
                vals.add(5);
        //организовать цикл для вывода числовых значений
                System.out.println("Исходное содержимое списочного массива vals: ");
                for (int v : vals)
                    System.out.print(v + " ");
                System.out.println();
        //суммировать числовые значения в цикле for
                int sum = 0;
                for (int v : vals)
                    sum += v;
                System.out.println("Сумма числовых значений: " + sum);
            }
        }

Collection example 10
        class HashMapDemo {
            public static void main(String[] args) {
        //создать хеш-отображение
                HashMap<String, Double> hm = new HashMap<>();
        //ввести элементы в хеш-отображение
                hm.put("John Doe", new Double(34.34));
                hm.put("Tom Smith", new Double(23.22));
                hm.put("Jain Becker", new Double(87.21));
                hm.put("Tad Hol", new Double(99.22));
                hm.put("Ralph Gus", new Double(-19.08));
        //получить множество записей
                Set<Map.Entry<String, Double>> set = hm.entrySet();
        //вывести множество записей
                for(Map.Entry<String, Double> me:set) {
                    System.out.print(me.getKey() + ". ");
                    System.out.println(me.getValue());
                }
                System.out.println();
        //внести 1000 на John Doe
                double balance = hm.get("John Doe");
                hm.put("John Doe", balance + 100);
                System.out.println("Новый остаток на счету John Doe: " + hm.get("John Doe"));
            }
        }

Collection example 11
        class TreeMapDemo {
            public static void main(String[] args) {
        //создать древовидное отображение
                TreeMap<String, Double> tm = new TreeMap<>();
        //ввести элементы в древовидное отображение
                tm.put("John Doe", new Double(34.34));
                tm.put("Tom Smith", new Double(23.22));
                tm.put("Jain Becker", new Double(87.21));
                tm.put("Tad Hol", new Double(99.22));
                tm.put("Ralph Gus", new Double(-19.08));
                System.out.println(tm.containsKey("Ralph Gus"));
                System.out.println(tm.containsKey("Ralph Gus 2"));
        //получить множество записей
                Set<Map.Entry<String, Double>> set = tm.entrySet();
        //вывести множество записей
                for(Map.Entry<String, Double> me:set) {
                    System.out.print(me.getKey() + ". ");
                    System.out.println(me.getValue());
                }
                System.out.println();
                //внести 1000 на John Doe
                double balance = tm.get("John Doe");
                tm.put("John Doe", balance + 100);
                System.out.println("Новый остаток на счету John Doe: " + tm.get("John Doe"));
            }
        }
*/