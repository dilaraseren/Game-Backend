public class CustomerManager implements CustomerService{

    CustomerCheckService _customerCheckService;
    public CustomerManager(CustomerCheckService customerCheckService){
        this._customerCheckService=customerCheckService;
    }

    @Override
    public void Add(Customer customer) {
    if(_customerCheckService.checkIfRealPerson(customer)){
        System.out.println("Müşteri veritabanına eklendi : "+customer.getFirstName()+" "+customer.getLastName());
    }else{
        System.out.println("Kimlik doğrulanamadı");
    }

    }

    @Override
    public void Delete(Customer customer) {
        System.out.println("Müşteri veritabanından silindi : "+customer.getFirstName()+" "+customer.getLastName());
    }

    @Override
    public void Update(Customer customer) {
        System.out.println("Müşteri veritabanında güncellendi : "+customer.getFirstName()+" "+customer.getLastName());
    }
}
