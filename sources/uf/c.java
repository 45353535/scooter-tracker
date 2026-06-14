package uf;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                lf.c.a(th2, th3);
            }
        }
    }
}
