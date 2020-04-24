package study;

//import com.sun.istack.internal.NotNull;
//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import study.Hero.*;
import study.Item.*;
import javax.swing.*;
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App
{
    public int age;

    public static void main(String[] args) {

//        Hero gailun = new ADHero();
//        gailun.name = "盖伦";
//        gailun.rageHarm = (float) 2.0;
//        gailun.ragePorbability = (float) 0.15;
//        gailun.armor = 40;
//        gailun.attackSpeed = (float) 0.89;
//        gailun.hitPoint = 520;
//        gailun.level = 1;
//        gailun.magicPoint = 0;
//        gailun.magicPower = 0;
//        gailun.magicRival = 60;
//        gailun.physicPower = 110;
//        gailun.speed = 360;
//        Hero zhaoxin = new ADHero();
//        zhaoxin.name = "赵信";
//        zhaoxin.rageHarm = (float) 2.0;
//        zhaoxin.ragePorbability = (float) 0.23;
//        zhaoxin.armor = 38;
//        zhaoxin.attackSpeed = (float) 0.92;
//        zhaoxin.hitPoint = 460;
//        zhaoxin.level = 1;
//        zhaoxin.magicPoint = 0;
//        zhaoxin.magicPower = 0;
//        zhaoxin.magicRival = 48;
//        zhaoxin.physicPower = 98;
//        gailun.speed = 355;
//        Item wujin = new AttackItem("无尽之剑", 0, (float) 0.2, (float) 0.5, 210, 0);
//        Item fangjia = new DefenceItem("荆棘之甲", 0, 0, 180, 0);
//        zhaoxin.useItem(wujin);
//        gailun.useItem(fangjia);
        //_________________________________________________以上为类测试的初始化


        // _______________________________________________________________________一下为存款
//        Account nuoke = new Account(2000, 400);
//        Account dema = new Account(1000, 200);
//        try {
//            dema.deposit(1000000);
//        } catch (Account.MoneyException e) {
//            System.out.println(e.getMessage());
//        }
        //_____________________________________________________________________________以下为序列化
//        System.out.println(gailun.physicPower);
//        String path = new String("E:/How2J_Test/Study/Hero/gailunFile.lol");
//        File objectOutPath = new File(path);
//        try {
//            if (!objectOutPath.exists()) {
//                objectOutPath.getParentFile().mkdirs();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        gailun.physicPower += 11000;
//        Hero gailun_I = null;
//        try (ObjectOutputStream OOS_gailun = new ObjectOutputStream(new FileOutputStream(objectOutPath))) {
//            OOS_gailun.writeObject(gailun);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try (ObjectInputStream OIS_gailun = new ObjectInputStream(new FileInputStream(objectOutPath))) {
//            gailun_I = (Hero) OIS_gailun.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(gailun_I.physicPower);
//    }
//        String srcFilePath = "D:\\Other_Related\\ShadowsocksR-win-5.1.5\\user.rule";
//        String destFilePath = "C:\\Users\\Administrator\\Desktop\\user.txt";
//        try {
//            FileC.fileContCopy(srcFilePath, destFilePath);
//        } catch (FileNotFoundException | CustomException.FileNotMatching e) {
//            e.printStackTrace();
//            System.out.println("指定的源文件存在问题，检查其是否存在");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("文件复制操作结束");
//        }
        //_______________________________________________________________________以下为匿名内部类测试
//        AD ad = new AD() {
//            @Override
//            public int ADAttack() {
//                System.out.println("发动了一次牛逼的攻击");
//                return 10;
//            }
//        };
//        System.out.println("造成了"+ad.ADAttack()+"点伤害");
        //___________________________________________________________________________多线程
//        Thread zhaoxinAttcThr = new Thread() {//多线程测试
//            public void run() {
//                while (!zhaoxin.isDead()) {
//                    try {
//                        zhaoxin.normalAttack(gailun);
//                        Thread.sleep((int)(zhaoxin.attackSpeed * 1000));
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        Thread gailunAttThr = new Thread() {
//            public void run() {
//                while (!gailun.isDead()) {
//                    try {
//                        gailun.normalAttack(zhaoxin);
//                        Thread.sleep((int)(gailun.attackSpeed * 1000));
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        gailunAttThr.start();
//        zhaoxinAttcThr.start();
//        JFrame form1 = new JFrame();
//        form1.setSize(640, 360);
//        form1.setLocation(300, 200);
//        form1.setLayout(null);
//        JButton button1 = new JButton("close the window");
//        button1.setBounds(100,100,170,30);
//        form1.add(button1);
//        Runnable =
//        form1.setVisible(true);
    }
}
