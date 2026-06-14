package z9;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.common.io.ByteStreams;
import java.util.List;
import java.util.Map;
import s9.k;
import z9.h;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a0 {

    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(s9.g gVar, String str, byte[] bArr, Map map) throws o0 {
        s9.x xVar = new s9.x(gVar);
        s9.k kVarA = new k.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        s9.k kVarA2 = kVarA;
        while (true) {
            try {
                s9.i iVar = new s9.i(xVar, kVarA2);
                try {
                    byte[] byteArray = ByteStreams.toByteArray(iVar);
                    q9.o0.m(iVar);
                    return byteArray;
                } catch (s9.t e10) {
                    try {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        kVarA2 = kVarA2.a().j(strC).a();
                        q9.o0.m(iVar);
                    } catch (Throwable th2) {
                        q9.o0.m(iVar);
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                throw new o0(kVarA, xVar.d(), xVar.getResponseHeaders(), xVar.c(), e11);
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return q9.o0.b0(q9.o0.c0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (q9.o0.f98837a >= 23 && a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof p0) {
            return 6001;
        }
        if (th2 instanceof h.e) {
            return 6003;
        }
        if (th2 instanceof m0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(s9.t tVar, int i10) {
        Map map;
        List list;
        int i11 = tVar.f99887e;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = tVar.f99889g) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean d(Throwable th2) {
        return q9.o0.f98837a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return q9.o0.f98837a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
