public class DuplicateEmails {
    public static final String QUERY = "SELECT email AS Email FROM Person GROUP BY email HAVING COUNT(*) > 1;";
}
