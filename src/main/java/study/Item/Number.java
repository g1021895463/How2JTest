package study.Item;

//import com.sun.org.apache.bcel.internal.generic.ALOAD;
//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
//import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
//import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.print.DocFlavor;
import javax.xml.crypto.dom.DOMCryptoContext;
import java.io.*;
import java.lang.Math;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Number {

    public static void main(String[] args) throws IOException {
//        Double num = 3.14;
//        String str = num.toString();
//        System.out.println("the str num: 3.14 str is:   "+str);
//        String str1 = "3.14";
//        Double num1 = Double.parseDouble(str1);
//        System.out.println(num1);
//        String str2 = "3.1a4";
//        try {
//            double num2 = Double.parseDouble(str2);
//            System.out.println(num2);
//        } catch (Exception e) {
//            System.out.println("String switch number failure!");
//            e.printStackTrace();
//        } finally {
//            System.out.println("Class Number test end");
//        }

//        StringBuilder path = new StringBuilder("E:/.Config.json");//磁盘文件路径
//        File test = new File(String.valueOf(path));//实例化文件对象
//        try {
//            test.createNewFile();//创建文件
//        } catch (Exception e) {
//            System.out.println("创建文件失败！");
//            e.printStackTrace();;
//        } finally {
//            System.out.println("End 文件创建结束");
//        }
//        System.out.println("the exit");
//        FileWriter fw = new FileWriter(test);//实例化一个文件写入对象，该对象具有对文件进行写入的各类方法
//        try {
//            fw.write("终于搞定了\n");
//            fw.append("现在开始读取测试\n");
//            fw.append("此处应为第三行\n");
//            fw.append("第四行\n");
//        } catch (FileNotFoundException e) {
//            System.out.println("文件写入时出错");
//            e.printStackTrace();
//        } finally {
//            fw.close();//结束文件输出流
//            System.out.println("End 文件写入结束");
//        }
//        FileReader fr = new FileReader(test);
//        BufferedReader br = new BufferedReader(fr);
//        ArrayList<String> strArr = new ArrayList<String>();
//        String str;
//        try {
//            while ((str = br.readLine()) != null) {
//                strArr.add(str);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("文件读取时出错");
//            e.printStackTrace();
//        } finally {
//            System.out.println("End 文件读取结束");
//        }
//        System.out.println("文件内容：");
//        for (String tmp : strArr) {
//            System.out.println(tmp);
//        }

        File path = new File("E:/Nier_Automata/NieRAutomata_chs");
        File[] files = path.listFiles();//保存path路径下所有文件到files数组中
        LinkedList<String> folder = new LinkedList<>();
        LinkedList<String> file = new LinkedList<>();
        try {
            for (File fileTmp : files) {
                if (fileTmp.isDirectory()) {
                folder.add(fileTmp.getName());
                } else {
                    file.add(fileTmp.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(path+"下共有文件"+files.length+"个");
        System.out.println("其中目录: "+folder.size());
        for (String folderTmp : folder) {
            System.out.println(folderTmp);
        }
        System.out.println("其中文件: "+file.size());
        for (String fileTmp : file) {
            System.out.println(fileTmp);
        }
    }
}
