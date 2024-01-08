class Test{
    public void createProcessNoncompliant(HttpServletRequest request) {
    String favoriteColor = request.getParameter("favoriteColor");
    // Noncompliant: user-supplied parameter is passed to an OS command and could be malicious.
    ProcessBuilder pb = new ProcessBuilder("/usr/local/bin/program", "--color", favoriteColor);
    try {
        pb.start();
    } catch (IOException e) {
        System.out.println(e);
    }
}
}