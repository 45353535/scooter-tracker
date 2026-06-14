package wf;

import androidx.core.provider.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                c.a(autoCloseable);
                return;
            }
            try {
                c.a(autoCloseable);
            } catch (Throwable th3) {
                lf.c.a(th2, th3);
            }
        }
    }
}
