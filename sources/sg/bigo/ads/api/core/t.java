package sg.bigo.ads.api.core;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102228d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f102225a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f102226b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f102227c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f102229e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102230f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f102231g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f102232h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f102233i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f102235k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f102236l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f102237m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f102238n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f102234j = false;

    public t(int i10) {
        this.f102228d = i10;
    }

    public final void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f102235k <= 0) {
                this.f102235k = jCurrentTimeMillis;
            }
        } else if (i10 == 2) {
            if (this.f102236l <= 0) {
                this.f102236l = jCurrentTimeMillis;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            if (this.f102237m <= 0) {
                this.f102237m = jCurrentTimeMillis;
            }
            if (this.f102238n <= 0) {
                this.f102238n = jCurrentTimeMillis;
            }
        }
    }

    public final void b(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            if (this.f102226b <= 0) {
                long j10 = this.f102235k;
                if (j10 > 0) {
                    this.f102226b = jCurrentTimeMillis - j10;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f102234j = true;
            if (this.f102227c <= 0) {
                long j11 = this.f102236l;
                if (j11 > 0) {
                    this.f102227c = jCurrentTimeMillis - j11;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (this.f102229e <= 0) {
                long j12 = this.f102237m;
                if (j12 > 0) {
                    this.f102229e = jCurrentTimeMillis - j12;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4 && this.f102230f <= 0) {
            long j13 = this.f102238n;
            if (j13 > 0) {
                this.f102230f = jCurrentTimeMillis - j13;
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        this.f102231g = str;
        this.f102233i = str2;
        this.f102232h = z10;
    }
}
