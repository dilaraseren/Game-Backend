
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1=new Customer();
        Customer customer2=new Customer();
        Game game1=new Game();
        Game game2=new Game();
        Campaign campaign1=new Campaign();

        CustomerManager customerManager=new CustomerManager(new CustomerCheckManager());
        GameManager gameManager= new GameManager();
        CampaignManager campaignManager= new CampaignManager();

        customer1.setId(101);
        customer1.setNationalIdentity("12345678900");
        customer1.setFirstName("Dilara");
        customer1.setLastName("Seren");
        customer1.setDateTime(new Date(2000,3,8));


        customer2.setId(201);
        customer2.setNationalIdentity("15937475650");
        customer2.setFirstName("Serhat");
        customer2.setLastName("Seren");
        customer2.setDateTime(new Date(2003,1,8));


        game1.setId(1);
        game1.setName("Call of Duty");
        game1.setPrice(669);

        game2.setId(2);
        game2.setName("Cyberpunk 2077");
        game2.setPrice(400);

        campaign1.setId(1);
        campaign1.setName("patron çıldırdı");
        campaign1.setDiscountPercentage(20);

        customerManager.Add(customer1);

        campaignManager.Add(campaign1);


        gameManager.Add(game1);

        gameManager.sell(customer1,game1);
        gameManager.sell(customer2,game2,campaign1);
    }
}
