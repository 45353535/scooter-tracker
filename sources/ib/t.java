package ib;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f74136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f74137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f74138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f74140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f74141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f74142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u[] f74143l;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, io.bidmachine.media3.common.a aVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f74132a = i10;
        this.f74133b = i11;
        this.f74134c = j10;
        this.f74135d = j11;
        this.f74136e = j12;
        this.f74137f = j13;
        this.f74138g = aVar;
        this.f74139h = i12;
        this.f74143l = uVarArr;
        this.f74142k = i13;
        this.f74140i = jArr;
        this.f74141j = jArr2;
    }

    public t a(io.bidmachine.media3.common.a aVar) {
        return new t(this.f74132a, this.f74133b, this.f74134c, this.f74135d, this.f74136e, this.f74137f, aVar, this.f74139h, this.f74143l, this.f74142k, this.f74140i, this.f74141j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f74143l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
