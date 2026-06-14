package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f51386f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f51387g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f51388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f51389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f51390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f51391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f51392e;

    class a extends com.mbridge.msdk.thrid.okio.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f51394c;

        a(s sVar) {
            super(sVar);
            this.f51393b = false;
            this.f51394c = 0L;
        }

        private void a(IOException iOException) {
            if (this.f51393b) {
                return;
            }
            this.f51393b = true;
            f fVar = f.this;
            fVar.f51389b.a(false, fVar, this.f51394c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f51394c += jB;
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f51388a = aVar;
        this.f51389b = gVar;
        this.f51390c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f51392e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        return this.f51391d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f51390c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f51391d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public static List<c> b(y yVar) {
        com.mbridge.msdk.thrid.okhttp.r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f51355f, yVar.e()));
        arrayList.add(new c(c.f51356g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a(HttpHeaders.HOST);
        if (strA != null) {
            arrayList.add(new c(c.f51358i, strA));
        }
        arrayList.add(new c(c.f51357h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f51386f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.f51391d != null) {
            return;
        }
        i iVarA = this.f51390c.a(b(yVar), yVar.a() != null);
        this.f51391d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f51388a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f51391d.l().a(this.f51388a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f51391d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        a0.a aVarA = a(this.f51391d.j(), this.f51392e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static a0.a a(com.mbridge.msdk.thrid.okhttp.r rVar, w wVar) throws IOException {
        r.a aVar = new r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(Header.RESPONSE_STATUS_UTF8)) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f51387g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f51313b).a(kVarA.f51314c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f51389b;
        gVar.f51274f.responseBodyStart(gVar.f51273e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f51391d.e())));
    }
}
