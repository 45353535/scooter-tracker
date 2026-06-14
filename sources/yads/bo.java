package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bo extends tt {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f109066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f109067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f109068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Cdo f109069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f109070n;

    public bo(c30 c30Var, h30 h30Var, yv0 yv0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(c30Var, h30Var, 1, yv0Var, i10, obj, j10, j11);
        yv0Var.getClass();
        this.f109066j = j14;
        this.f109067k = j12;
        this.f109068l = j13;
    }

    public final int a(int i10) {
        int[] iArr = this.f109070n;
        if (iArr != null) {
            return iArr[i10];
        }
        throw new IllegalStateException();
    }

    public long c() {
        long j10 = this.f109066j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
