package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class kd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va0 f112678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f112681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f112682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f112683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f112685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f112686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f112687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112688k;

    public kd0() {
        this(new va0());
    }

    public static void a(int i10, int i11, String str, String str2) {
        fi.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final boolean b() {
        return this.f112686i;
    }

    public kd0(va0 va0Var) {
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f112678a = va0Var;
        long j10 = 50000;
        this.f112679b = w83.a(j10);
        this.f112680c = w83.a(j10);
        this.f112681d = w83.a(2500);
        this.f112682e = w83.a(5000);
        this.f112683f = -1;
        this.f112687j = 13107200;
        this.f112684g = false;
        this.f112685h = w83.a(0);
        this.f112686i = false;
    }

    public final long a() {
        return this.f112685h;
    }

    public final void a(boolean z10) {
        int i10 = this.f112683f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f112687j = i10;
        this.f112688k = false;
        if (z10) {
            va0 va0Var = this.f112678a;
            synchronized (va0Var) {
                if (va0Var.f116911a) {
                    va0Var.a(0);
                }
            }
        }
    }
}
