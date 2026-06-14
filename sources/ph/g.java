package ph;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.google.common.net.HttpHeaders;
import hh.b0;
import hh.t;
import hh.x;
import hh.y;
import hh.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.j0;
import vh.l0;
import vh.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements nh.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f98479g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f98480h = ih.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f98481i = ih.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh.f f98482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nh.g f98483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f98484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f98485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f98486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f98487f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(z request) {
            Intrinsics.checkNotNullParameter(request, "request");
            t tVarE = request.e();
            ArrayList arrayList = new ArrayList(tVarE.size() + 4);
            arrayList.add(new c(c.f98374g, request.h()));
            arrayList.add(new c(c.f98375h, nh.i.f96169a.c(request.l())));
            String strD = request.d(HttpHeaders.HOST);
            if (strD != null) {
                arrayList.add(new c(c.f98377j, strD));
            }
            arrayList.add(new c(c.f98376i, request.l().p()));
            int size = tVarE.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = tVarE.e(i10);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strE.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f98480h.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(tVarE.i(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, tVarE.i(i10)));
                }
            }
            return arrayList;
        }

        public final b0.a b(t headerBlock, y protocol) throws ProtocolException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            t.a aVar = new t.a();
            int size = headerBlock.size();
            nh.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strE = headerBlock.e(i10);
                String strI = headerBlock.i(i10);
                if (Intrinsics.areEqual(strE, Header.RESPONSE_STATUS_UTF8)) {
                    kVarA = nh.k.f96172d.a("HTTP/1.1 " + strI);
                } else if (!g.f98481i.contains(strE)) {
                    aVar.c(strE, strI);
                }
            }
            if (kVarA != null) {
                return new b0.a().p(protocol).g(kVarA.f96174b).m(kVarA.f96175c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public g(x client, mh.f connection, nh.g chain, f http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f98482a = connection;
        this.f98483b = chain;
        this.f98484c = http2Connection;
        List listG = client.G();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f98486e = listG.contains(yVar) ? yVar : y.HTTP_2;
    }

    @Override // nh.d
    public void a(z request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f98485d != null) {
            return;
        }
        this.f98485d = this.f98484c.F0(f98479g.a(request), request.a() != null);
        if (this.f98487f) {
            i iVar = this.f98485d;
            Intrinsics.checkNotNull(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f98485d;
        Intrinsics.checkNotNull(iVar2);
        m0 m0VarV = iVar2.v();
        long jG = this.f98483b.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m0VarV.g(jG, timeUnit);
        i iVar3 = this.f98485d;
        Intrinsics.checkNotNull(iVar3);
        iVar3.E().g(this.f98483b.i(), timeUnit);
    }

    @Override // nh.d
    public l0 b(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        i iVar = this.f98485d;
        Intrinsics.checkNotNull(iVar);
        return iVar.p();
    }

    @Override // nh.d
    public long c(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (nh.e.b(response)) {
            return ih.d.v(response);
        }
        return 0L;
    }

    @Override // nh.d
    public void cancel() {
        this.f98487f = true;
        i iVar = this.f98485d;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // nh.d
    public j0 d(z request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = this.f98485d;
        Intrinsics.checkNotNull(iVar);
        return iVar.n();
    }

    @Override // nh.d
    public void finishRequest() {
        i iVar = this.f98485d;
        Intrinsics.checkNotNull(iVar);
        iVar.n().close();
    }

    @Override // nh.d
    public void flushRequest() {
        this.f98484c.flush();
    }

    @Override // nh.d
    public mh.f getConnection() {
        return this.f98482a;
    }

    @Override // nh.d
    public b0.a readResponseHeaders(boolean z10) throws IOException {
        i iVar = this.f98485d;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        b0.a aVarB = f98479g.b(iVar.C(), this.f98486e);
        if (z10 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }
}
