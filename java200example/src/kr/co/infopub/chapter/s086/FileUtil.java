package kr.co.infopub.chapter.s086;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;

public class FileUtil {
    public static PrintWriter reader(String folderName) {
        File f = null;
        boolean ret = false;
        PrintWriter printWriter = null;

        if (folderName != null && !folderName.isEmpty()) {
            String packageName = MessageFormat.format("src/{0}/{1}", FileUtil.class.getPackageName(), folderName);
            System.out.println(packageName);
            f = new File(packageName);

            // 디렉토리가 존재하지 않으면 billboard 디렉토리를 생성한다
            if (!f.exists()) {
                f.mkdirs();
            }

            printWriter = FileUtil.getPrintWriter(packageName + "/bill.txt", false);
        }
        return printWriter;
    }

    public static PrintWriter getPrintWriter(String filename, boolean mode) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(filename, false), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return printWriter;
    }
}
