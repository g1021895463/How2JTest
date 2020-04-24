package study.Hero;

public class CustomException extends Exception {
    public static class FileNotMatching extends Exception {// 操作对象类型异常——非文件对象
        public FileNotMatching(String msg) {
            super(msg);
        }
    }
}
