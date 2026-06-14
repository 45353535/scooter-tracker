package vh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f106909a = Logger.getLogger("okio.Okio");

    public static final j0 b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return x.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.g0(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final j0 d(File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return x.g(new FileOutputStream(file, z10));
    }

    public static final j0 e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new b0(outputStream, new m0());
    }

    public static final j0 f(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        k0 k0Var = new k0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return k0Var.z(new b0(outputStream, k0Var));
    }

    public static /* synthetic */ j0 g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return x.f(file, z10);
    }

    public static final l0 h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new t(new FileInputStream(file), m0.f106880e);
    }

    public static final l0 i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new t(inputStream, new m0());
    }

    public static final l0 j(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        k0 k0Var = new k0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return k0Var.A(new t(inputStream, k0Var));
    }
}
