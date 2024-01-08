class Test{
    void outOfSyncNoncompliant(String deploymentId) {
    String deploymentItem = null;
    try {
        // Noncompliant: the output value would not be updated if the producing method
        // throws an exception, resulting the input and output values becoming out of sync.
        deploymentItem = loadDeployment(deploymentId);
    } catch (final Exception e) {
        log.warn("Exception: ", e);
    }
    doSomething(deploymentId, deploymentItem);
}
}