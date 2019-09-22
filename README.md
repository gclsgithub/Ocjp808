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
