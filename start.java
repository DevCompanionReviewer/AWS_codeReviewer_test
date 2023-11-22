public void createSqlConnectionNoncompliant() throws Exception {
    // Noncompliant: password is hardcoded.
    final Connection connection = DriverManager.getConnection("some url",
            "username", "password");
    connection.close();
}