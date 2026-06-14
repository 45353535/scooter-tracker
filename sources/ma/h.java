package ma;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94563d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f94565f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f94560a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f94561b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f94564e = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f94566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f94567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f94568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f94569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f94570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f94571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f94572g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94573h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f94570e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f94571f / j10;
        }

        public long b() {
            return this.f94571f;
        }

        public boolean d() {
            long j10 = this.f94569d;
            if (j10 == 0) {
                return false;
            }
            return this.f94572g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f94569d > 15 && this.f94573h == 0;
        }

        public void f(long j10) {
            long j11 = this.f94569d;
            if (j11 == 0) {
                this.f94566a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f94566a;
                this.f94567b = j12;
                this.f94571f = j12;
                this.f94570e = 1L;
            } else {
                long j13 = j10 - this.f94568c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f94567b) <= 1000000) {
                    this.f94570e++;
                    this.f94571f += j13;
                    boolean[] zArr = this.f94572g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f94573h--;
                    }
                } else {
                    boolean[] zArr2 = this.f94572g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f94573h++;
                    }
                }
            }
            this.f94569d++;
            this.f94568c = j10;
        }

        public void g() {
            this.f94569d = 0L;
            this.f94570e = 0L;
            this.f94571f = 0L;
            this.f94573h = 0;
            Arrays.fill(this.f94572g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f94560a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f94560a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f94565f;
    }

    public long d() {
        if (e()) {
            return this.f94560a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f94560a.e();
    }

    public void f(long j10) {
        this.f94560a.f(j10);
        if (this.f94560a.e() && !this.f94563d) {
            this.f94562c = false;
        } else if (this.f94564e != -9223372036854775807L) {
            if (!this.f94562c || this.f94561b.d()) {
                this.f94561b.g();
                this.f94561b.f(this.f94564e);
            }
            this.f94562c = true;
            this.f94561b.f(j10);
        }
        if (this.f94562c && this.f94561b.e()) {
            a aVar = this.f94560a;
            this.f94560a = this.f94561b;
            this.f94561b = aVar;
            this.f94562c = false;
            this.f94563d = false;
        }
        this.f94564e = j10;
        this.f94565f = this.f94560a.e() ? 0 : this.f94565f + 1;
    }

    public void g() {
        this.f94560a.g();
        this.f94561b.g();
        this.f94562c = false;
        this.f94564e = -9223372036854775807L;
        this.f94565f = 0;
    }
}
