import java.io.File;

public class Main {

    public static void main(String[] args) {

        String folderPath = "D:\\Games\\steamapps\\common";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));

    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long totalSize = 0;
        File [] files = folder.listFiles();
        for (File file : files) {
            totalSize += getFolderSize(file);
        }
        return totalSize;
    }

}
