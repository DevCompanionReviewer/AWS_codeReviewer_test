import java.util.Scanner;

public class SecureInputExample {

   public void executeSqlStatementNoncompliant(HttpServletRequest request, java.sql.Connection connection) {
    final String favoriteColor = request.getParameter("favoriteColor");
    try {
        // Noncompliant: user-given input is not sanitized before use.
    } catch (java.sql.SQLException e) {
        throw new RuntimeException(e);
    }
}
}
