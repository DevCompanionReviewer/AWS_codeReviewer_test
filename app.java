class Test{
    static void stringEqualityCheckNoncompliant(String string1, String string2) {
    // Noncompliant: the == operator doesn't compare the contents of the strings.
    if(string1 == string2) {
        System.out.println("The strings are equal.");
    }
}
    try {
        doSomething();
        throw new SomeException();
    } catch (IndexOutOfBoundsException e) {
        log.error(e.getMessage());
    } catch (Exception e) {
        log.error(e.getMessage());
    }
    public static void main(String[] args) {
        stringEqualityCheckNoncompliant("bisd","bisd");
    }
}
