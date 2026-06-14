package yads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class b01 extends d30 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108880d;

    public b01() {
        super(a(2008, 1));
        this.f108880d = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static b01 a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ci.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new a01(iOException) : new b01(iOException, i11, i10);
    }

    public b01(IOException iOException, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.f108880d = i11;
    }

    public b01(String str, int i10) {
        super(a(i10, 1), str);
        this.f108880d = 1;
    }

    public b01(String str, IOException iOException, int i10) {
        super(str, iOException, a(i10, 1));
        this.f108880d = 1;
    }
}
