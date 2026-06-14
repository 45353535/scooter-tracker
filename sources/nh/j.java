package nh;

import com.google.common.net.HttpHeaders;
import hh.a0;
import hh.b0;
import hh.d0;
import hh.u;
import hh.v;
import hh.x;
import hh.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f96170b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f96171a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(x client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f96171a = client;
    }

    private final z a(b0 b0Var, String str) {
        String strM;
        u uVarO;
        if (!this.f96171a.x() || (strM = b0.M(b0Var, "Location", null, 2, null)) == null || (uVarO = b0Var.r0().l().o(strM)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(uVarO.p(), b0Var.r0().l().p()) && !this.f96171a.y()) {
            return null;
        }
        z.a aVarI = b0Var.r0().i();
        if (f.b(str)) {
            int iQ = b0Var.q();
            f fVar = f.f96156a;
            boolean z10 = fVar.d(str) || iQ == 308 || iQ == 307;
            if (!fVar.c(str) || iQ == 308 || iQ == 307) {
                aVarI.h(str, z10 ? b0Var.r0().a() : null);
            } else {
                aVarI.h("GET", null);
            }
            if (!z10) {
                aVarI.j(HttpHeaders.TRANSFER_ENCODING);
                aVarI.j("Content-Length");
                aVarI.j("Content-Type");
            }
        }
        if (!ih.d.j(b0Var.r0().l(), uVarO)) {
            aVarI.j("Authorization");
        }
        return aVarI.m(uVarO).b();
    }

    private final z b(b0 b0Var, mh.c cVar) throws ProtocolException {
        mh.f fVarH;
        d0 d0VarZ = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.z();
        int iQ = b0Var.q();
        String strH = b0Var.r0().h();
        if (iQ != 307 && iQ != 308) {
            if (iQ == 401) {
                return this.f96171a.k().a(d0VarZ, b0Var);
            }
            if (iQ == 421) {
                a0 a0VarA = b0Var.r0().a();
                if ((a0VarA != null && a0VarA.isOneShot()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().x();
                return b0Var.r0();
            }
            if (iQ == 503) {
                b0 b0VarE0 = b0Var.e0();
                if ((b0VarE0 == null || b0VarE0.q() != 503) && f(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.r0();
                }
                return null;
            }
            if (iQ == 407) {
                Intrinsics.checkNotNull(d0VarZ);
                if (d0VarZ.b().type() == Proxy.Type.HTTP) {
                    return this.f96171a.I().a(d0VarZ, b0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iQ == 408) {
                if (!this.f96171a.L()) {
                    return null;
                }
                a0 a0VarA2 = b0Var.r0().a();
                if (a0VarA2 != null && a0VarA2.isOneShot()) {
                    return null;
                }
                b0 b0VarE02 = b0Var.e0();
                if ((b0VarE02 == null || b0VarE02.q() != 408) && f(b0Var, 0) <= 0) {
                    return b0Var.r0();
                }
                return null;
            }
            switch (iQ) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(b0Var, strH);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, mh.e eVar, z zVar, boolean z10) {
        if (this.f96171a.L()) {
            return !(z10 && e(iOException, zVar)) && c(iOException, z10) && eVar.z();
        }
        return false;
    }

    private final boolean e(IOException iOException, z zVar) {
        a0 a0VarA = zVar.a();
        return (a0VarA != null && a0VarA.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(b0 b0Var, int i10) {
        String strM = b0.M(b0Var, "Retry-After", null, 2, null);
        if (strM == null) {
            return i10;
        }
        if (!new Regex("\\d+").g(strM)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.r();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        ih.d.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.b0().o(r7.b0().b(null).c()).c();
     */
    @Override // hh.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hh.b0 intercept(hh.v.a r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.j.intercept(hh.v$a):hh.b0");
    }
}
