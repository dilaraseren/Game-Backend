public interface GameService extends BaseService<Game>{

    public void sell(Customer customer, Game game);

    public void sell(Customer customer, Game game, Campaign campaign);
}
