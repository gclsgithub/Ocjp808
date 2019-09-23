# Ocjp808

## 这是考ocjp808考试题目解析。

1. 考察引用传递是否改变值.输出的结果是 400.0 ：100.0;这里面当newprice传递给updatePrice方法，prcie对象指向newPrice指向的数值，当price✖️2的时候并不会影响到newPrice
```

public class Test {
    public void updatePrice (Product product,double price) {
        price = price *2;
        product.price  = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;
        Test t = new Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price + ":" +newPrice);
    }
}

class Product {
    double price;
}

```

2. LocalDate转换的日期类，但是format的时候采取的格式是“ISO_DATE_TIME”的格式，所以就会报类型匹配失败，抛出异常。

> LocalDate        -->   DateTimeFormatter.ISO_DATE_TIME

> LocalDateTime    -->   DateTimeFormatter.ISO_DATE  

```
String date = LocalDate.parse("2011-12-03").format(DateTimeFormatter.ISO_DATE_TIME);
System.out.println(date);
```

3.  限定符定义

```
abstract class Plnet{
    protected void revolve(){  //n1
    }
    abstract void rotate();
}

class Earth extends  Plnet{

    @Override
    void revolve(){ //这里报错，是因为revolve()方法是受保护的，当方法是protected的时候无法进行覆盖成protected的，所以修改方法要么就是修改n1，要么是修改这个方法的限定符号为public。
    }
    @Override
    void rotate() {
    }
}

```

4.  n1处MyCar()的 构造方法会调用其父类的构造方法，而MyVehicle有一个两个参数的构造函数，所以覆盖了无参数的构造函数，所以在n1处报错。

```
class MyVehicle {
    String type = "4W";
    int maxSpeed = 100;
    MyVehicle(String type,int maxSpeed){
            this.type = type;
            this.maxSpeed = maxSpeed;
    }
}

class MyCar extends  MyVehicle {

    String trans;

    MyCar(String trans){       //n1
        this.trans = trans;
    }

    MyCar(String type, int maxSpeed,String trans) {
        super(type, maxSpeed);
        trans = trans;
    }
}

```

5. 对象比较，sb和s的比较调用Object.equals()，而就可以比较

```

public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";

        if (sb.equals(s)){
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())){
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
    }

```

6.replace方法是返回新的字符串，得到的结果才是被替换的。

```

    String ta  = "A ";
    //A B
    ta = ta.concat("B ");

    String tb =  "C ";
    ta = ta.concat(tb);

    //A B C

    //A B D
    String relace = ta.replace('C','D');
    //A B D C
    ta = ta.concat(tb);
    System.out.println(ta);
    System.out.println(relace);
        
```

7.  n1处，如果构造DVD这个类就必须例化他的父类，但是又缺少无参数的构造方法。

```
class CD {
    int r;
    CD (int r){
        this.r = r;
    }
}

class DVD extends CD {
    int c;
    DVD(int r,int c){
        super(r); //n1
        this.c= c;
    }
}
```
8. 按照下标志打印数组

```
     /**
     * Which option can replace N1 to enable the code to print 135?
     * @param args
     */
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        for (int e = 0; e< 5 ; e+=2){ //N1
            System.out.print(a[e]);
        }
    }
```
9. 这道题目比较有意思，是询问encapsulation（封装）的描述。题目本身比较简单，看看描述，A选项为正确选项。
JAVA程序三大特性是封装，继承和多态。
    * 封装 （Encapsulation）
        一种将抽象性函式接口的实现细节部份包装、隐藏起来的方法。而它利用的是public，private，default，protect这四种修饰符
           * default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
           * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
           * public : 对所有类可见。使用对象：类、接口、变量、方法
           * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
    * 继承 （Inheritable）
        继承是java面向对象编程技术的一块基石，因为它允许创建分等级层次的类。继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。注意，java中继承只能够继承共有成员方法和变量。
    * 多态 （Polymorphism）
       多态是同一个行为具有多个不同表现形式或形态的能力。多态就是同一个接口，使用不同的实例而执行不同操作，如图所示：
```
QUESTION 15
Which statement best describes encapsulation?
A. Encapsulation ensures that classes can be designed so that only certain fields and methods of an object are accessible from other objects.
  //封装确保了类与类之间方法和域的独立性。
B. Encapsulation ensures that classes can be designed so that their methods are inheritable.（继承的特性质）
  //封装确保了类设计的可以被遗传
C. Encapsulation ensures that classes can be designed with some fields and methods declared as abstract.（继承的特性质）
 //封装确保了类的设计的抽象
D. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x, any subclass of MyType can be passed to that method.
//方法的传递并不是封装的特性，可以理解为继承的特性
```

10 异常处理，异常氛围两种，运行时和检查。如果是运行时异常不需要自动抛出。检查异常需要代码中进行手动抛出，所以在n1处错误，

```
public class Demo11 {
    public static void main(String[] args) {
        Test1 te = new Test1();
        int no = 12344;
        te.readTest(no);//n1
        te.chedk(no);

    }
}

class Test1 {
    void readTest(int no) throws Exception {
        System.out.println("a");
    }

    void chedk(int no) throws RuntimeException {
        System.out.println("vv");
    }
}

```
11  1.5之前，switch支持的数据类型只有byte，int，short，char这四种；
    1.5之后支持这四种类型的包装了，1.7之后支持string。但是从来没有支持boolean类型
```
 //boolean str = true;

String str= "true";
switch (str){
    case "true":
        System.out.println("TRUE");
        break;
        default:
            System.out.println("****");
}
System.out.println("AA");
```
