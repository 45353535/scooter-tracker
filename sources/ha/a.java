package ha;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f72974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f72975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f72976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f72977n;

    public a(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(gVar, kVar, aVar, i10, obj, j10, j11, j14);
        this.f72974k = j12;
        this.f72975l = j13;
    }

    public final int g(int i10) {
        return ((int[]) q9.a.i(this.f72977n))[i10];
    }

    protected final c h() {
        return (c) q9.a.i(this.f72976m);
    }

    public void i(c cVar) {
        this.f72976m = cVar;
        this.f72977n = cVar.a();
    }
}
