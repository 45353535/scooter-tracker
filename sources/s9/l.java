package s9;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q9.o0;
import s9.g;
import s9.m;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f99840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f99841b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f99842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f99843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f99844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f99845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f99846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f99847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f99848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f99849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f99850k;

    public static final class a implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f99851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g.a f99852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private y f99853c;

        public a(Context context) {
            this(context, new m.b());
        }

        @Override // s9.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createDataSource() {
            l lVar = new l(this.f99851a, this.f99852b.createDataSource());
            y yVar = this.f99853c;
            if (yVar != null) {
                lVar.a(yVar);
            }
            return lVar;
        }

        public a(Context context, g.a aVar) {
            this.f99851a = context.getApplicationContext();
            this.f99852b = (g.a) q9.a.e(aVar);
        }
    }

    public l(Context context, g gVar) {
        this.f99840a = context.getApplicationContext();
        this.f99842c = (g) q9.a.e(gVar);
    }

    private void c(g gVar) {
        for (int i10 = 0; i10 < this.f99841b.size(); i10++) {
            gVar.a((y) this.f99841b.get(i10));
        }
    }

    private g d() {
        if (this.f99844e == null) {
            s9.a aVar = new s9.a(this.f99840a);
            this.f99844e = aVar;
            c(aVar);
        }
        return this.f99844e;
    }

    private g e() {
        if (this.f99845f == null) {
            d dVar = new d(this.f99840a);
            this.f99845f = dVar;
            c(dVar);
        }
        return this.f99845f;
    }

    private g f() {
        if (this.f99848i == null) {
            e eVar = new e();
            this.f99848i = eVar;
            c(eVar);
        }
        return this.f99848i;
    }

    private g g() {
        if (this.f99843d == null) {
            p pVar = new p();
            this.f99843d = pVar;
            c(pVar);
        }
        return this.f99843d;
    }

    private g h() {
        if (this.f99849j == null) {
            w wVar = new w(this.f99840a);
            this.f99849j = wVar;
            c(wVar);
        }
        return this.f99849j;
    }

    private g i() {
        if (this.f99846g == null) {
            try {
                g gVar = (g) Class.forName("io.bidmachine.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f99846g = gVar;
                c(gVar);
            } catch (ClassNotFoundException unused) {
                q9.u.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f99846g == null) {
                this.f99846g = this.f99842c;
            }
        }
        return this.f99846g;
    }

    private g j() {
        if (this.f99847h == null) {
            z zVar = new z();
            this.f99847h = zVar;
            c(zVar);
        }
        return this.f99847h;
    }

    private void k(g gVar, y yVar) {
        if (gVar != null) {
            gVar.a(yVar);
        }
    }

    @Override // s9.g
    public void a(y yVar) {
        q9.a.e(yVar);
        this.f99842c.a(yVar);
        this.f99841b.add(yVar);
        k(this.f99843d, yVar);
        k(this.f99844e, yVar);
        k(this.f99845f, yVar);
        k(this.f99846g, yVar);
        k(this.f99847h, yVar);
        k(this.f99848i, yVar);
        k(this.f99849j, yVar);
    }

    @Override // s9.g
    public long b(k kVar) {
        q9.a.g(this.f99850k == null);
        String scheme = kVar.f99819a.getScheme();
        if (o0.J0(kVar.f99819a)) {
            String path = kVar.f99819a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f99850k = g();
            } else {
                this.f99850k = d();
            }
        } else if ("asset".equals(scheme)) {
            this.f99850k = d();
        } else if ("content".equals(scheme)) {
            this.f99850k = e();
        } else if ("rtmp".equals(scheme)) {
            this.f99850k = i();
        } else if ("udp".equals(scheme)) {
            this.f99850k = j();
        } else if ("data".equals(scheme)) {
            this.f99850k = f();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f99850k = h();
        } else {
            this.f99850k = this.f99842c;
        }
        return this.f99850k.b(kVar);
    }

    @Override // s9.g
    public void close() {
        g gVar = this.f99850k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f99850k = null;
            }
        }
    }

    @Override // s9.g
    public Map getResponseHeaders() {
        g gVar = this.f99850k;
        return gVar == null ? Collections.EMPTY_MAP : gVar.getResponseHeaders();
    }

    @Override // s9.g
    public Uri getUri() {
        g gVar = this.f99850k;
        if (gVar == null) {
            return null;
        }
        return gVar.getUri();
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) {
        return ((g) q9.a.e(this.f99850k)).read(bArr, i10, i11);
    }
}
