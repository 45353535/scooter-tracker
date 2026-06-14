package vh;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x {
    public static final j0 a(File file) {
        return y.b(file);
    }

    public static final j0 b() {
        return z.a();
    }

    public static final f c(j0 j0Var) {
        return z.b(j0Var);
    }

    public static final g d(l0 l0Var) {
        return z.c(l0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return y.c(assertionError);
    }

    public static final j0 f(File file, boolean z10) {
        return y.d(file, z10);
    }

    public static final j0 g(OutputStream outputStream) {
        return y.e(outputStream);
    }

    public static final j0 h(Socket socket) {
        return y.f(socket);
    }

    public static final l0 j(File file) {
        return y.h(file);
    }

    public static final l0 k(InputStream inputStream) {
        return y.i(inputStream);
    }

    public static final l0 l(Socket socket) {
        return y.j(socket);
    }
}
