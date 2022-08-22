package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        //Department obj = new Department(1, "livros");
        //SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");

        //Seller sl = new Seller(1, "Vanessa", "teste@teste", sf.parse("17/03/1993"), 3000.00, obj);

        //SellerDao sellerDao = DaoFactory.createSellerDao();
        //System.out.println(obj);
        //System.out.println(sl);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
