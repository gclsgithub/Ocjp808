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
