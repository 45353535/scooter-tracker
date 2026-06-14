package s9;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class h extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99812b;

    public h(int i10) {
        this.f99812b = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof h) && ((h) cause).f99812b == 2008) {
                return true;
            }
        }
        return false;
    }

    public h(Throwable th2, int i10) {
        super(th2);
        this.f99812b = i10;
    }

    public h(String str, int i10) {
        super(str);
        this.f99812b = i10;
    }

    public h(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f99812b = i10;
    }
}
