package study.Hero;

public class HeroHealException extends Exception {
    HeroHealException() {
        super();
    }
    HeroHealException(String msg) {
        super(msg);
    }
    HeroHealException(String msg, Throwable cause) {
        super(msg, cause);
    }
    HeroHealException(Throwable cause) {
        super(cause);
    }
}
