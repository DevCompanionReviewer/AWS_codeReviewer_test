class AppOne{
    public List<Path> autoCloseableStreamNoncompliant(final Path path) throws Exception {
        final List<Path> files;
        // Noncompliant: does not close the auto-closeable streams of file system objects.
        Stream<Path> pathStream = Files.walk(path);
        files = pathStream.filter(p -> Files.isRegularFile(p))
                .map(path::relativize)
                .collect(Collectors.toList());
        log.info("Relativized files: {}", files);
        return files;
}
    public static void main(String[] args) {
        return;
    }
}