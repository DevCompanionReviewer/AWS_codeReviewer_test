@ThreadSafe
public class ThreadSafetyClassViolationsNoncompliant {

    private HashMap<String, FileInfo> fileInfoMap = new HashMap<String, FileInfo>();

    public synchronized void reset() {
        fileInfoMap.clear();
    }

    public synchronized void addFileInfo(String fileName, long fileSize) {
        FileInfo fileInfo = new FileInfo(fileName, fileSize);
        fileInfoMap.put(fileName, fileInfo);
    }

    // Noncompliant: the method doesn't protect the parallel use of map.
    public FileInfo getFileInfo(String fileName) {
        return fileInfoMap.get(fileName);
    }

    public synchronized FileInfo getFileInfoSync(String fileName) {
        return fileInfoMap.get(fileName);
    }
}