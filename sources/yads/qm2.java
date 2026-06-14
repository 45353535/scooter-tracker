package yads;

import android.util.Base64;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vs1 f115091a;

    static {
        vs1 vs1Var = vs1.f117164b;
        f115091a = us1.a();
    }

    public static final void a(long j10, km2 km2Var, r62 r62Var) {
        String strF;
        String str;
        byte[] bArrB = km2Var.b();
        String strF2 = null;
        if (bArrB != null) {
            try {
                strF = StringsKt.F(bArrB);
            } catch (Exception unused) {
                strF = "UNKNOWN_CONTENT";
            }
            str = strF;
        } else {
            str = null;
        }
        byte[] bArr = r62Var.f115341b;
        if (bArr != null) {
            if (km2Var instanceof z21) {
                strF2 = "IMAGE_CONTENT";
            } else {
                try {
                    strF2 = StringsKt.F(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    strF2 = StringsKt.F(bArr);
                } catch (Exception unused3) {
                    strF2 = "UNKNOWN_CONTENT";
                }
            }
        }
        vs1 vs1Var = f115091a;
        int i10 = km2Var.f112763c;
        String str2 = i10 == 0 ? "GET" : i10 == 1 ? "POST" : i10 == 2 ? "PUT" : i10 == 3 ? "DELETE" : i10 == 4 ? "HEAD" : i10 == 5 ? "OPTIONS" : i10 == 6 ? "TRACE" : i10 == 7 ? "PATCH" : "UNKNOWN";
        String strG = km2Var.g();
        Map mapD = km2Var.d();
        Integer numValueOf = Integer.valueOf(r62Var.f115340a);
        Map map = r62Var.f115342c;
        vs1Var.getClass();
        if (qs1.f115145b) {
            ts1 ts1Var = new ts1(new ys1(j10, str2, strG, mapD, str), new bt1(System.currentTimeMillis(), numValueOf, map, strF2));
            synchronized (vs1.f117165c) {
                try {
                    if (vs1Var.f117166a.size() > 100) {
                        vs1Var.f117166a.removeFirst();
                    }
                    vs1Var.f117166a.add(ts1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
