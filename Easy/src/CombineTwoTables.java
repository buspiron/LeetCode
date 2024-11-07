public class CombineTwoTables {
    private final static String QUERY = "SELECT p.firstName, p.lastName, a.city, a.state FROM Person AS p LEFT JOIN Address as A ON p.personId = a.personId";
}
