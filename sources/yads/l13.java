package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l13 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z43 f112913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ap0 f112914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c82 f112915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f112916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f112917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f112918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f112919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f112920i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f112922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f112924m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a82 f112912a = new a82();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j13 f112921j = new j13();

    public abstract long a(w92 w92Var);

    public void a(long j10) {
        this.f112918g = j10;
    }

    public abstract boolean a(w92 w92Var, long j10, j13 j13Var);

    public void a(boolean z10) {
        if (z10) {
            this.f112921j = new j13();
            this.f112917f = 0L;
            this.f112919h = 0;
        } else {
            this.f112919h = 1;
        }
        this.f112916e = -1L;
        this.f112918g = 0L;
    }
}
