package f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s0 {
    public static final String a(Exception exc) {
        String message;
        return (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }
}
