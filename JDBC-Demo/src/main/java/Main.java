import com.Persistance.*;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        //User andrew = new User("Andrew","Jackson","ajckson@aol.com");
        //UserDAO userDAO = new UserDAO();
        //System.out.println(userDAO.create(andrew));

        UserDAO userDAO = new UserDAO();
        AccountTypeDAO accountTypeDAO = new AccountTypeDAO();
        AccountDAO accountDAO = new AccountDAO();

        User benji = new User("Benji","Johnson","benjisoutofthebuilding@gmail.com");
        Integer benjiUserId = userDAO.create(benji);

        AccountType accType = new AccountType("checking");
        Integer accTypeId = accountTypeDAO.create(accType);

        Account bankAccount = new Account(100.00,accTypeId,benjiUserId,Date.valueOf(LocalDate.now()));
        System.out.println(accountDAO.create(bankAccount));
    }
}
