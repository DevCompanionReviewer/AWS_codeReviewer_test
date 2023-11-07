class App{
    static void createSqlConnectionNoncompliant() throws Exception {
    // Noncompliant: password is hardcoded.
    final Connection connection = DriverManager.getConnection("some url",
            "username", "password");
    connection.close();
}
    public static void main(String[] args) {
        createSqlConnectionNoncompliant();
    }
}