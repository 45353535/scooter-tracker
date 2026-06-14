package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3290a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f3290a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
