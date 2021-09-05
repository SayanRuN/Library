package Library;

public class Test {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("Sayan");
        SupplierReader supplierReader = new SupplierReader("Jenya");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Jihan");
        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        supplierReader.returnBook(userAdministrator);
        librarianAdministrator.orderBook(supplierReader);
    }
}
