//ClassLoader  загружает классы в metaspace необходимые для работы IDEA
//ClassLoader  загружает в metaspace пользовательский клас JvmComprehension
public class JvmComprehension {
    //стартует метод  main в стеке памяти создается frame(main)
    public static void main(String[] args) {
        // в этот же frame(main) заносится переменная i
        int i = 1;
        //в heap создается объект Object
        //в  frame(main) создается ссылка  " о "на объект Object
        Object o = new Object();

        // в frame(main) создается ссылка на объект Integer
        Integer ii = 2;
        //стартует метод  printAll в стеке создается frame(printAll)
        // с сылками " о " и " ii " и переменная i
        printAll(o, i, ii);
        //стартует метод  println создается  frame(println ) в heap создается объект "finished"
        System.out.println("finished");
        //сборщик мусора очищает память
    }

    private static void printAll(Object o, int i, Integer ii) {
        //в heap создается объект uselessVar  со значением 700
        //в frame(printAll) создается ссылка на объект uselessVar;
        Integer uselessVar = 700;
        //   стартует метод println создается  frame(println )
        //   в  frame(println ) сохраняются переменные "i" и "ii"
        //   и ссылка "o"  на об]ект Object  находящийся в  heap
        //стартует метод toString создается frame(oString)
        // в него сохраняется ссылка "o" на объект Object
        System.out.println(o.toString() + i + ii);
        //из heap  удаляется uselessVar
    }
}
