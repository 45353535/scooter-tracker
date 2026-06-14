package nh;

import com.google.common.net.HttpHeaders;
import hh.a0;
import hh.b0;
import hh.c0;
import hh.v;
import hh.z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f96150a;

    public b(boolean z10) {
        this.f96150a = z10;
    }

    private final boolean a(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [hh.b0$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [hh.b0$a] */
    @Override // hh.v
    public b0 intercept(v.a chain) throws IOException {
        boolean z10;
        ?? r92;
        ?? Q;
        b0.a aVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        mh.c cVarF = gVar.f();
        Intrinsics.checkNotNull(cVarF);
        z zVarH = gVar.h();
        a0 a0VarA = zVarH.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cVarF.u(zVarH);
            ?? B = f.b(zVarH.h());
            try {
                if (B == 0 || a0VarA == null) {
                    cVarF.o();
                    z10 = true;
                    B = 0;
                } else {
                    if (StringsKt.N("100-continue", zVarH.d(HttpHeaders.EXPECT), true)) {
                        cVarF.f();
                        b0.a aVarQ = cVarF.q(true);
                        try {
                            cVarF.s();
                            z10 = false;
                            aVar = aVarQ;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r92 = aVarQ;
                            if (e instanceof ph.a) {
                                throw e;
                            }
                            Q = r92;
                            if (!cVarF.k()) {
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        cVarF.o();
                        B = aVar;
                        if (!cVarF.h().v()) {
                            cVarF.n();
                            B = aVar;
                        }
                    } else if (a0VarA.isDuplex()) {
                        cVarF.f();
                        a0VarA.writeTo(x.c(cVarF.c(zVarH, true)));
                        B = aVar;
                    } else {
                        vh.f fVarC = x.c(cVarF.c(zVarH, false));
                        a0VarA.writeTo(fVarC);
                        fVarC.close();
                        B = aVar;
                    }
                }
                if (a0VarA == null || !a0VarA.isDuplex()) {
                    cVarF.e();
                }
                e = null;
                Q = B;
            } catch (IOException e11) {
                e = e11;
                r92 = B;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r92 = 0;
        }
        if (Q == 0) {
            try {
                Q = cVarF.q(false);
                Intrinsics.checkNotNull(Q);
                if (z10) {
                    cVarF.s();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                lf.c.a(e, e13);
                throw e;
            }
        }
        b0 b0VarC = Q.r(zVarH).i(cVarF.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iQ = b0VarC.q();
        if (a(iQ)) {
            b0.a aVarQ2 = cVarF.q(false);
            Intrinsics.checkNotNull(aVarQ2);
            if (z10) {
                cVarF.s();
            }
            b0VarC = aVarQ2.r(zVarH).i(cVarF.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iQ = b0VarC.q();
        }
        cVarF.r(b0VarC);
        b0 b0VarC2 = (this.f96150a && iQ == 101) ? b0VarC.b0().b(ih.d.f74838c).c() : b0VarC.b0().b(cVarF.p(b0VarC)).c();
        if (StringsKt.N("close", b0VarC2.r0().d("Connection"), true) || StringsKt.N("close", b0.M(b0VarC2, "Connection", null, 2, null), true)) {
            cVarF.n();
        }
        if (iQ == 204 || iQ == 205) {
            c0 c0VarM = b0VarC2.m();
            if ((c0VarM != null ? c0VarM.getContentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iQ);
                sb2.append(" had non-zero Content-Length: ");
                c0 c0VarM2 = b0VarC2.m();
                sb2.append(c0VarM2 != null ? Long.valueOf(c0VarM2.getContentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return b0VarC2;
    }
}
