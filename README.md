# Абстрактные классы и интерфейсы 

6.4. Заполнение массива

Задача
--------

Задача, немного похожая на предыдущую:
Напишите метод fill, который принимает массив объектов, и реализацию интерфейса Function (или своего).

Метод fill должен заполнить массив, получая новое значение по индексу с помощью реализации интерфейса Function. 

То есть, использовать его хочется так:

    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares, integer -> integer * integer); // 0, 1, 4, 9, 16 .....
    }

Решение:
--------

### **- пусто**

# **Здесь ответов и решения нету `(￢_￢)`**

### Как по идее должно быть:

    public static <T> void fill(T[] objects, Function<Integer, ? extends T> function) {
        for(int i = 0; i < objects.length; i++){
            objects[i] = function.apply(i);
        }
    }

Но я без понятия как он (~~**гений**~~, что придумал задание `(￢_￢)` ) реализовал через лябда выражение и джинерик, так как он ругается на: 

    integer -> integer * integer

**`(」°ロ°)」`**

Ведь нельзя передавать в метод умножение, да и к тому же что за `integer`?! **`Integer`** знаю, `int` тоже, но что за `integer`?!

Так если ты наткнулся случайно, в поиске ответов, то их здесь нету... (если разбирусь в этом, то напишу полный код, а не как этот чудик `(￢_￢)`)

Просто я максимум знаю как работают лямбда, пример:

    public interface Lambda {
        //Метод интерфейса  с отсутсвующей реализацией
        int getDoubleValue(int val);
    
        //Метод интерфейса с реализацией по-умолчанию
        default void printVal(int val) { 
            System.out.println(val);
        }
    }
    
    public class ClassForLambda {
        public static void main(String[] args) {
            //Объявляем ссылку на функциональный интерфейс
            Lambda lam;
            //Параметр для нашего абстрактногго метода
            int num =9;
    
            //Прописываем первый вариант реализации
            lam = (val) ->  val * 2;
            System.out.println(lam.getDoubleValue(num));
    
            //Прописываем второй вариант реализации
            lam = (val) ->  {
                System.out.println("Your number is "+val);
                return val * 2;
            };
            System.out.println(lam.getDoubleValue(num));
        }
    }