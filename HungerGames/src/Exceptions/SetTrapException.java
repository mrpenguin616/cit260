package Exceptions;

/**
 * Created by mrpenguin616 on 7/4/15.
 */
public class SetTrapException extends Exception {
    public SetTrapException() {
    }

    public SetTrapException(String message) {
        super(message);
    }

    public SetTrapException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetTrapException(Throwable cause) {
        super(cause);
    }

    public SetTrapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
