public class GameManager implements GameService{
    @Override
    public void Add(Game entity) {
        System.out.println("Oyun sisteme eklendi:"+ entity.getName());
    }

    @Override
    public void Delete(Game entity) {
        System.out.println("Oyun sistemden silindi:"+entity.getName());
    }

    @Override
    public void Update(Game entity) {
        System.out.println("Oyun güncellendi:"+entity.getName());
    }

    @Override
    public void sell(Customer customer, Game game) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli oyuncuya " +game.getName()+" oyunu "+game.getPrice()+" liraya satıldı.");
    }

    @Override
    public void sell(Customer customer, Game game, Campaign campaign) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli oyuncuya "+game.getName()+" oyunu "+campaign.getDiscountPercentage()+" indirimle "+game
        .getPrice()+" liraya satıldı.");
    }
}
