public class Main {
    public static void changeValue(Integer[] value) {
        value = new Integer []{1, 2};

        for (int i = 0; i < value.length; i++) {
            System.out.println("value[i] = " + value[i]);
        }
    }

    public static void main (String[] arg) {
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
    }
}

//Напишите метод, который изменяет значение массива типа Integer.
//Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
//Внутри метода с помощью оператора присваивания запишите в параметр новый массив {1,2}.
//В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
//В следующей строке вызовите метод changeValue и передайте в него этот массив.