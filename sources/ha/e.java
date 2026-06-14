package ha;

import android.net.Uri;
import ga.y;
import java.util.Map;
import ka.o;
import s9.x;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e implements o.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73004a = y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.k f73005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f73007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f73009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f73010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f73011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final x f73012i;

    public e(s9.g gVar, s9.k kVar, int i10, io.bidmachine.media3.common.a aVar, int i11, Object obj, long j10, long j11) {
        this.f73012i = new x(gVar);
        this.f73005b = (s9.k) q9.a.e(kVar);
        this.f73006c = i10;
        this.f73007d = aVar;
        this.f73008e = i11;
        this.f73009f = obj;
        this.f73010g = j10;
        this.f73011h = j11;
    }

    public final long a() {
        return this.f73012i.c();
    }

    public final long b() {
        return this.f73011h - this.f73010g;
    }

    public final Map c() {
        return this.f73012i.e();
    }

    public final Uri d() {
        return this.f73012i.d();
    }
}
