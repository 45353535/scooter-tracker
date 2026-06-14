package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends g.j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f51241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f51242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f51243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f51244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f51245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w f51246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f51247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f51248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f51249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51252m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f51253n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f51254o = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.f51241b = iVar;
        this.f51242c = c0Var;
    }

    private y e() throws IOException {
        y yVarA = new y.a().a(this.f51242c.a().k()).a("CONNECT", (z) null).b(HttpHeaders.HOST, com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51242c.a().k(), true)).b("Proxy-Connection", HttpHeaders.KEEP_ALIVE).b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y yVarA2 = this.f51242c.a().g().a(this.f51242c, new a0.a().a(yVarA).a(w.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f51203c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return yVarA2 != null ? yVarA2 : yVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r13, int r14, int r15, int r16, boolean r17, com.mbridge.msdk.thrid.okhttp.d r18, com.mbridge.msdk.thrid.okhttp.o r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.c.a(int, int, int, int, boolean, com.mbridge.msdk.thrid.okhttp.d, com.mbridge.msdk.thrid.okhttp.o):void");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f51245f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.f51242c;
    }

    public void d() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51243d);
    }

    public boolean f() {
        return this.f51247h != null;
    }

    public Socket g() {
        return this.f51244e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f51242c.a().k().g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f51242c.a().k().j());
        sb2.append(", proxy=");
        sb2.append(this.f51242c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f51242c.d());
        sb2.append(" cipherSuite=");
        q qVar = this.f51245f;
        sb2.append(qVar != null ? qVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f51246g);
        sb2.append('}');
        return sb2.toString();
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y yVarE = e();
        s sVarG = yVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, oVar);
            yVarE = a(i11, i12, yVarE, sVarG);
            if (yVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51243d);
            this.f51243d = null;
            this.f51249j = null;
            this.f51248i = null;
            oVar.connectEnd(dVar, this.f51242c.d(), this.f51242c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy proxyB = this.f51242c.b();
        this.f51243d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f51242c.a().i().createSocket() : new Socket(proxyB);
        oVar.connectStart(dVar, this.f51242c.d(), proxyB);
        this.f51243d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f51243d, this.f51242c.d(), i10);
            try {
                this.f51248i = l.a(l.b(this.f51243d));
                this.f51249j = l.a(l.a(this.f51243d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f51242c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f51242c.a().j() == null) {
            List<w> listE = this.f51242c.a().e();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (listE.contains(wVar)) {
                this.f51244e = this.f51243d;
                this.f51246g = wVar;
                a(i10);
                return;
            } else {
                this.f51244e = this.f51243d;
                this.f51246g = w.HTTP_1_1;
                return;
            }
        }
        oVar.secureConnectStart(dVar);
        a(bVar);
        oVar.secureConnectEnd(dVar, this.f51245f);
        if (this.f51246g == w.HTTP_2) {
            a(i10);
        }
    }

    private void a(int i10) throws IOException {
        this.f51244e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new g.h(true).a(this.f51244e, this.f51242c.a().k().g(), this.f51248i, this.f51249j).a(this).a(i10).a();
        this.f51247h = gVarA;
        gVarA.m();
    }

    private void a(b bVar) throws Throwable {
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f51242c.a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) aVarA.j().createSocket(this.f51243d, aVarA.k().g(), aVarA.k().j(), true);
                try {
                    j jVarA = bVar.a(sSLSocket2);
                    if (jVarA.c()) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2, aVarA.k().g(), aVarA.e());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    q qVarA = q.a(session);
                    if (!aVarA.d().verify(aVarA.k().g(), session)) {
                        List<Certificate> listB = qVarA.b();
                        if (!listB.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listB.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
                    }
                    aVarA.a().a(aVarA.k().g(), qVarA.b());
                    String strB = jVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket2) : null;
                    this.f51244e = sSLSocket2;
                    this.f51248i = l.a(l.b(sSLSocket2));
                    this.f51249j = l.a(l.a(this.f51244e));
                    this.f51245f = qVarA;
                    this.f51246g = strB != null ? w.a(strB) : w.HTTP_1_1;
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
                } catch (AssertionError e10) {
                    e = e10;
                    if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (AssertionError e11) {
            e = e11;
        }
    }

    private y a(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f51248i, this.f51249j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f51248i.b().a(i10, timeUnit);
            this.f51249j.b().a(i11, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a0VarA = aVar.a(false).a(yVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0VarA);
            if (jA == -1) {
                jA = 0;
            }
            com.mbridge.msdk.thrid.okio.s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = a0VarA.k();
            if (iK == 200) {
                if (this.f51248i.a().f() && this.f51249j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK == 407) {
                y yVarA = this.f51242c.a().g().a(this.f51242c, a0VarA);
                if (yVarA != null) {
                    if ("close".equalsIgnoreCase(a0VarA.b("Connection"))) {
                        return yVarA;
                    }
                    yVar = yVarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a0VarA.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, c0 c0Var) {
        if (this.f51253n.size() >= this.f51252m || this.f51250k || !com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(this.f51242c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f51247h == null || c0Var == null) {
            return false;
        }
        Proxy.Type type = c0Var.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f51242c.b().type() != type2 || !this.f51242c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f51558a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f51242c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.f51242c.a().k().g())) {
            return true;
        }
        return this.f51245f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f51558a.a(sVar.g(), (X509Certificate) this.f51245f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f51247h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.f51247h);
        }
        this.f51244e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f51248i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f51249j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.f51248i, this.f51249j);
    }

    public boolean a(boolean z10) {
        if (this.f51244e.isClosed() || this.f51244e.isInputShutdown() || this.f51244e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f51247h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f51244e.getSoTimeout();
                try {
                    this.f51244e.setSoTimeout(1);
                    return !this.f51248i.f();
                } finally {
                    this.f51244e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f51241b) {
            this.f51252m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.f51246g;
    }
}
