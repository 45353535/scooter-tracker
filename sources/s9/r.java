package s9;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes12.dex */
public class r extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f99884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f99885d;

    public r(k kVar, int i10, int i11) {
        super(b(i10, i11));
        this.f99884c = kVar;
        this.f99885d = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static r c(IOException iOException, k kVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new q(iOException, kVar) : new r(iOException, kVar, i11, i10);
    }

    public r(String str, k kVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f99884c = kVar;
        this.f99885d = i11;
    }

    public r(IOException iOException, k kVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f99884c = kVar;
        this.f99885d = i11;
    }

    public r(String str, IOException iOException, k kVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f99884c = kVar;
        this.f99885d = i11;
    }
}
