package vh;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
final class k0 extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f106873o;

    public k0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f106873o = socket;
    }

    @Override // vh.c
    protected void B() {
        try {
            this.f106873o.close();
        } catch (AssertionError e10) {
            if (!x.e(e10)) {
                throw e10;
            }
            y.f106909a.log(Level.WARNING, "Failed to close timed out socket " + this.f106873o, (Throwable) e10);
        } catch (Exception e11) {
            y.f106909a.log(Level.WARNING, "Failed to close timed out socket " + this.f106873o, (Throwable) e11);
        }
    }

    @Override // vh.c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
