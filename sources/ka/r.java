package ka;

import android.net.Uri;
import ga.y;
import java.io.InputStream;
import java.util.Map;
import ka.o;
import q9.o0;
import s9.k;
import s9.x;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements o.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.k f93134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f93136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f93137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f93138f;

    public interface a {
        Object parse(Uri uri, InputStream inputStream);
    }

    public r(s9.g gVar, Uri uri, int i10, a aVar) {
        this(gVar, new k.b().i(uri).b(1).a(), i10, aVar);
    }

    public long a() {
        return this.f93136d.c();
    }

    public Map b() {
        return this.f93136d.e();
    }

    public final Object c() {
        return this.f93138f;
    }

    public Uri d() {
        return this.f93136d.d();
    }

    @Override // ka.o.e
    public final void load() {
        this.f93136d.f();
        s9.i iVar = new s9.i(this.f93136d, this.f93134b);
        try {
            iVar.n();
            this.f93138f = this.f93137e.parse((Uri) q9.a.e(this.f93136d.getUri()), iVar);
        } finally {
            o0.m(iVar);
        }
    }

    public r(s9.g gVar, s9.k kVar, int i10, a aVar) {
        this.f93136d = new x(gVar);
        this.f93134b = kVar;
        this.f93135c = i10;
        this.f93137e = aVar;
        this.f93133a = y.a();
    }

    @Override // ka.o.e
    public final void cancelLoad() {
    }
}
