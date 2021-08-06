public class CustomerManager {
    //Burada private Logger tanımlamamız design patters'dır. (Dependency injection) Bağımlı olduğumuz ifadeyi bu şekilde tanımlarız.
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Müşteri eklendi : "+customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi "+customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());
    }
}
