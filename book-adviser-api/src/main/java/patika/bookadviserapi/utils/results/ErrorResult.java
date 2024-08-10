package patika.bookadviserapi.utils.results;

import java.util.Date;

public class ErrorResult extends Result {
    public ErrorResult() {
        super("500", "Başarısız", new Date());
    }

    public ErrorResult(String message) {
        super("500", message, new Date());
    }
}
