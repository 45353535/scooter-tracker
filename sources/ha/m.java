package ha;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f73058j;

    public m(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12) {
        super(gVar, kVar, 1, aVar, i10, obj, j10, j11);
        q9.a.e(aVar);
        this.f73058j = j12;
    }

    public long e() {
        long j10 = this.f73058j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
