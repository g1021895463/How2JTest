package study;

import study.Hero.CustomException;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileC {
    /**
     * 文件拷贝 此处“复制”一律视为“拷贝”
     * 拷贝步骤：原件（src）至内存，内存根据参数路径输出至复件（dest）
     * @param srcPath 源文件路径
     * @param destPath 目标文件路径
     * @throws CustomException.FileNotMatching
     * @throws IOException
     */
    public static void fileContCopy(String srcPath, String destPath) throws CustomException.FileNotMatching, IOException {
        File srcFile = new File(srcPath);// 文件对象
        File destFile = new File(destPath);
        if (!srcFile.exists()) {// 源文件检查
            throw new FileNotFoundException("源文件不存在");
        }
        if (srcFile.isDirectory() || destFile.isDirectory()) {
            throw new CustomException.FileNotMatching("fileContCopy无法作用于目录");
        }
        FileInputStream srcFileIn = new FileInputStream(srcFile);// 文件输入流
        FileChannel inputChannel = srcFileIn.getChannel();

        if (!destFile.getParentFile().exists()) {// ————————————————————以下开始文件输出
            destFile.getParentFile().mkdirs();// 目录输出，不存在则创建
        }
        FileOutputStream destFileOut = new FileOutputStream(destFile);//文件输出流
        try {
            FileChannel outputChannel = destFileOut.getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                destFileOut.close();
                srcFileIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("关闭流");
            }
        }
    }
}
