public class CustomersWhoNeverOrdered {
    public static final String QUERY = "SELECT c.name AS Customers FROM Customers c LEFT JOIN Orders o ON c.id = o.customerId WHERE o.id IS NULL;";
}
