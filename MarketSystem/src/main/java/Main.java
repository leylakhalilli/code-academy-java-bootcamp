import az.code.Print;
import az.code.business.SalesService;
import az.code.entities.Product;
import az.code.repo.SaleRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static az.code.entities.ProductCategory.FOOD;

public class Main {
    public static void main(String[] args) throws Exception {
        Print print = new Print();
        print.forMenu();


//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        System.out.println("start");
//        entityManager.getTransaction().begin();
//
//        SalesService salesService = new SalesService();


//        SaleRepository saleRepository = new SaleRepository();
//        List<Product> productList = saleRepository.getProductList();
//        System.out.println();/
//        Product product=new Product(1,"milk",2,10,"111111",FOOD)
//        salesService.addItem(new Product(1,"milk",2,10,"111111",FOOD));


    }
}
