import java.util.ArrayList;
import java.util.List;


public class TeaTotal {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Green Tea", 2022, 10.0));
        products.add(new Product("Black Tea", 2022, 5.0));
        products.add(new Product("Herbal Tea", 2021, 8.0));
        products.add(new Product("Iced Tea", 2021, 12.0));
        products.add(new Product("Chai Tea", 2023, 15.0));

     
     int totalprice2021= (int)products.stream().filter(f->f.getYear()==2021).filter(m-> m.getName().contains("Tea")).mapToDouble(s->s.getPrice()).sum();
       int totalprice2022= (int)products.stream().filter(f->f.getYear()==2022).filter(m-> m.getName().contains("Tea")).mapToDouble(s->s.getPrice()).sum();
      int totalprice2023= (int)products.stream().filter(f->f.getYear()==2023).filter(m-> m.getName().contains("Tea")).mapToDouble(s->s.getPrice()).sum();
       //printing the results
       System.out.println("totalpricein2021"+": "+totalprice2021);
       System.out.println("totalpricein2022"+": "+totalprice2022);
       System.out.println("totalpricein2023"+": "+totalprice2023);
    }
}
class Product {

    private String name;
    private int year;
    private double price;
    
    public Product(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }
    
   

    public String getName() {
        return name;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getPrice() {
        return price;
    }
}


