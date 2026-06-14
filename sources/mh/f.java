package mh;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.google.common.net.HttpHeaders;
import hh.b0;
import hh.d0;
import hh.l;
import hh.r;
import hh.s;
import hh.u;
import hh.y;
import hh.z;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import ph.f;
import ph.m;
import ph.n;
import vh.m0;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends f.c implements hh.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f94974t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f94975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f94976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f94977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f94978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f94979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private y f94980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ph.f f94981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private vh.g f94982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private vh.f f94983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f94984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f94985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f94986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f94987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f94988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f94989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f94990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f94991s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hh.g f94992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f94993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ hh.a f94994h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hh.g gVar, s sVar, hh.a aVar) {
            super(0);
            this.f94992f = gVar;
            this.f94993g = sVar;
            this.f94994h = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            uh.c cVarD = this.f94992f.d();
            Intrinsics.checkNotNull(cVarD);
            return cVarD.a(this.f94993g.d(), this.f94994h.l().h());
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            s sVar = f.this.f94979g;
            Intrinsics.checkNotNull(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
            for (Certificate certificate : listD) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public f(g connectionPool, d0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f94975c = connectionPool;
        this.f94976d = route;
        this.f94989q = 1;
        this.f94990r = new ArrayList();
        this.f94991s = Long.MAX_VALUE;
    }

    private final boolean A(List list) {
        List<d0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (d0 d0Var : list2) {
            Proxy.Type type = d0Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f94976d.b().type() == type2 && Intrinsics.areEqual(this.f94976d.d(), d0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void E(int i10) throws SocketException {
        Socket socket = this.f94978f;
        Intrinsics.checkNotNull(socket);
        vh.g gVar = this.f94982j;
        Intrinsics.checkNotNull(gVar);
        vh.f fVar = this.f94983k;
        Intrinsics.checkNotNull(fVar);
        socket.setSoTimeout(0);
        ph.f fVarA = new f.a(true, lh.e.f94307i).q(socket, this.f94976d.a().l().h(), gVar, fVar).k(this).l(i10).a();
        this.f94981i = fVarA;
        this.f94989q = ph.f.D.a().d();
        ph.f.R0(fVarA, false, null, 3, null);
    }

    private final boolean F(u uVar) {
        s sVar;
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        u uVarL = this.f94976d.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (Intrinsics.areEqual(uVar.h(), uVarL.h())) {
            return true;
        }
        if (!this.f94985m && (sVar = this.f94979g) != null) {
            Intrinsics.checkNotNull(sVar);
            if (e(uVar, sVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(u uVar, s sVar) {
        List listD = sVar.d();
        if (!listD.isEmpty()) {
            uh.d dVar = uh.d.f105672b;
            String strH = uVar.h();
            Object obj = listD.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i10, int i11, hh.e eVar, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f94976d.b();
        hh.a aVarA = this.f94976d.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : b.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVarA.j().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f94977e = socketCreateSocket;
        rVar.j(eVar, this.f94976d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            rh.h.f99497a.g().f(socketCreateSocket, this.f94976d.d(), i10);
            try {
                this.f94982j = x.d(x.l(socketCreateSocket));
                this.f94983k = x.c(x.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f94976d.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(mh.b bVar) throws Throwable {
        hh.a aVarA = this.f94976d.a();
        SSLSocketFactory sSLSocketFactoryK = aVarA.k();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f94977e, aVarA.l().h(), aVarA.l().l(), true);
            Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    rh.h.f99497a.g().e(sSLSocket2, aVarA.l().h(), aVarA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f73738e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                s sVarB = aVar.b(sslSocketSession);
                HostnameVerifier hostnameVerifierE = aVarA.e();
                Intrinsics.checkNotNull(hostnameVerifierE);
                if (hostnameVerifierE.verify(aVarA.l().h(), sslSocketSession)) {
                    hh.g gVarA = aVarA.a();
                    Intrinsics.checkNotNull(gVarA);
                    this.f94979g = new s(sVarB.e(), sVarB.a(), sVarB.c(), new c(gVarA, sVarB, aVarA));
                    gVarA.b(aVarA.l().h(), new d());
                    String strH = lVarA.h() ? rh.h.f99497a.g().h(sSLSocket2) : null;
                    this.f94978f = sSLSocket2;
                    this.f94982j = x.d(x.l(sSLSocket2));
                    this.f94983k = x.c(x.h(sSLSocket2));
                    this.f94980h = strH != null ? y.f73828c.a(strH) : y.HTTP_1_1;
                    rh.h.f99497a.g().b(sSLSocket2);
                    return;
                }
                List listD = sVarB.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().h() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(StringsKt.p("\n              |Hostname " + aVarA.l().h() + " not verified:\n              |    certificate: " + hh.g.f73611c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + uh.d.f105672b.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    rh.h.f99497a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    ih.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void j(int i10, int i11, int i12, hh.e eVar, r rVar) throws IOException {
        z zVarL = l();
        u uVarL = zVarL.l();
        for (int i13 = 0; i13 < 21; i13++) {
            h(i10, i11, eVar, rVar);
            zVarL = k(i11, i12, zVarL, uVarL);
            if (zVarL == null) {
                return;
            }
            Socket socket = this.f94977e;
            if (socket != null) {
                ih.d.n(socket);
            }
            this.f94977e = null;
            this.f94983k = null;
            this.f94982j = null;
            rVar.h(eVar, this.f94976d.d(), this.f94976d.b(), null);
        }
    }

    private final z k(int i10, int i11, z zVar, u uVar) throws IOException {
        String str = "CONNECT " + ih.d.R(uVar, true) + " HTTP/1.1";
        while (true) {
            vh.g gVar = this.f94982j;
            Intrinsics.checkNotNull(gVar);
            vh.f fVar = this.f94983k;
            Intrinsics.checkNotNull(fVar);
            oh.b bVar = new oh.b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().g(i10, timeUnit);
            fVar.timeout().g(i11, timeUnit);
            bVar.w(zVar.e(), str);
            bVar.finishRequest();
            b0.a responseHeaders = bVar.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            b0 b0VarC = responseHeaders.r(zVar).c();
            bVar.v(b0VarC);
            int iQ = b0VarC.q();
            if (iQ == 200) {
                if (gVar.getBuffer().exhausted() && fVar.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iQ != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + b0VarC.q());
            }
            z zVarA = this.f94976d.a().h().a(this.f94976d, b0VarC);
            if (zVarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.N("close", b0.M(b0VarC, "Connection", null, 2, null), true)) {
                return zVarA;
            }
            zVar = zVarA;
        }
    }

    private final z l() {
        z zVarB = new z.a().m(this.f94976d.a().l()).h("CONNECT", null).f(HttpHeaders.HOST, ih.d.R(this.f94976d.a().l(), true)).f("Proxy-Connection", HttpHeaders.KEEP_ALIVE).f("User-Agent", Util.userAgent).b();
        z zVarA = this.f94976d.a().h().a(this.f94976d, new b0.a().r(zVarB).p(y.HTTP_1_1).g(407).m("Preemptive Authenticate").b(ih.d.f74838c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return zVarA == null ? zVarB : zVarA;
    }

    private final void m(mh.b bVar, int i10, hh.e eVar, r rVar) throws Throwable {
        if (this.f94976d.a().k() != null) {
            rVar.C(eVar);
            i(bVar);
            rVar.B(eVar, this.f94979g);
            if (this.f94980h == y.HTTP_2) {
                E(i10);
                return;
            }
            return;
        }
        List listF = this.f94976d.a().f();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(yVar)) {
            this.f94978f = this.f94977e;
            this.f94980h = y.HTTP_1_1;
        } else {
            this.f94978f = this.f94977e;
            this.f94980h = yVar;
            E(i10);
        }
    }

    public final void B(long j10) {
        this.f94991s = j10;
    }

    public final void C(boolean z10) {
        this.f94984l = z10;
    }

    public Socket D() {
        Socket socket = this.f94978f;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public final synchronized void G(e call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f98549b == ph.b.REFUSED_STREAM) {
                    int i10 = this.f94988p + 1;
                    this.f94988p = i10;
                    if (i10 > 1) {
                        this.f94984l = true;
                        this.f94986n++;
                    }
                } else if (((n) iOException).f98549b != ph.b.CANCEL || !call.isCanceled()) {
                    this.f94984l = true;
                    this.f94986n++;
                }
            } else if (!v() || (iOException instanceof ph.a)) {
                this.f94984l = true;
                if (this.f94987o == 0) {
                    if (iOException != null) {
                        g(call.n(), this.f94976d, iOException);
                    }
                    this.f94986n++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ph.f.c
    public synchronized void a(ph.f connection, m settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f94989q = settings.d();
    }

    @Override // ph.f.c
    public void b(ph.i stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.d(ph.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f94977e;
        if (socket != null) {
            ih.d.n(socket);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.f94976d.c() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r12.f94977e == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        throw new mh.i(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        r12.f94991s = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r13, int r14, int r15, int r16, boolean r17, hh.e r18, hh.r r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.f.f(int, int, int, int, boolean, hh.e, hh.r):void");
    }

    public final void g(hh.x client, d0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            hh.a aVarA = failedRoute.a();
            aVarA.i().connectFailed(aVarA.l().q(), failedRoute.b().address(), failure);
        }
        client.z().b(failedRoute);
    }

    public final List n() {
        return this.f94990r;
    }

    public final long o() {
        return this.f94991s;
    }

    public final boolean p() {
        return this.f94984l;
    }

    public final int q() {
        return this.f94986n;
    }

    public s r() {
        return this.f94979g;
    }

    public final synchronized void s() {
        this.f94987o++;
    }

    public final boolean t(hh.a address, List list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f94990r.size() >= this.f94989q || this.f94984l || !this.f94976d.a().d(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.l().h(), z().a().l().h())) {
            return true;
        }
        if (this.f94981i == null || list == null || !A(list) || address.e() != uh.d.f105672b || !F(address.l())) {
            return false;
        }
        try {
            hh.g gVarA = address.a();
            Intrinsics.checkNotNull(gVarA);
            String strH = address.l().h();
            s sVarR = r();
            Intrinsics.checkNotNull(sVarR);
            gVarA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f94976d.a().l().h());
        sb2.append(':');
        sb2.append(this.f94976d.a().l().l());
        sb2.append(", proxy=");
        sb2.append(this.f94976d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f94976d.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f94979g;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb2.append(objA);
        sb2.append(" protocol=");
        sb2.append(this.f94980h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f94977e;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f94978f;
        Intrinsics.checkNotNull(socket2);
        vh.g gVar = this.f94982j;
        Intrinsics.checkNotNull(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ph.f fVar = this.f94981i;
        if (fVar != null) {
            return fVar.D0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f94991s;
        }
        if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        return ih.d.G(socket2, gVar);
    }

    public final boolean v() {
        return this.f94981i != null;
    }

    public final nh.d w(hh.x client, nh.g chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f94978f;
        Intrinsics.checkNotNull(socket);
        vh.g gVar = this.f94982j;
        Intrinsics.checkNotNull(gVar);
        vh.f fVar = this.f94983k;
        Intrinsics.checkNotNull(fVar);
        ph.f fVar2 = this.f94981i;
        if (fVar2 != null) {
            return new ph.g(client, this, chain, fVar2);
        }
        socket.setSoTimeout(chain.j());
        m0 m0VarTimeout = gVar.timeout();
        long jG = chain.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m0VarTimeout.g(jG, timeUnit);
        fVar.timeout().g(chain.i(), timeUnit);
        return new oh.b(client, this, gVar, fVar);
    }

    public final synchronized void x() {
        this.f94985m = true;
    }

    public final synchronized void y() {
        this.f94984l = true;
    }

    public d0 z() {
        return this.f94976d;
    }
}
