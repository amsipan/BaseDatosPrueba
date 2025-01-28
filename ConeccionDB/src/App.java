import DataAccess.DAO.GeneroDAO;

public class App {
    public static void main(String[] args) throws Exception {
        GeneroDAO generoDAO = new GeneroDAO();
        System.out.println(generoDAO.readBy(1));
    }
} 