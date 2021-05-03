public class CampaignManager implements CampaignService{
    @Override
    public void Add(Campaign campaign) {
        System.out.println("Kampanya sisteme eklendi:"+campaign.getName());
    }

    @Override
    public void Delete(Campaign campaign) {
        System.out.println("Kampanya sistemden silindi:"+campaign.getName());
    }

    @Override
    public void Update(Campaign campaign) {
        System.out.println("Kampanya güncellendi:"+campaign.getName());
    }
}
