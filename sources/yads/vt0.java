package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f117173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f117174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f117175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f117176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f117177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f117178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f117179g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117180h;

    public final boolean a() {
        return this.f117176d > 15 && this.f117180h == 0;
    }

    public final void a(long j10) {
        long j11 = this.f117176d;
        if (j11 == 0) {
            this.f117173a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f117173a;
            this.f117174b = j12;
            this.f117178f = j12;
            this.f117177e = 1L;
        } else {
            long j13 = j10 - this.f117175c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f117174b) <= 1000000) {
                this.f117177e++;
                this.f117178f += j13;
                boolean[] zArr = this.f117179g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f117180h--;
                }
            } else {
                boolean[] zArr2 = this.f117179g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f117180h++;
                }
            }
        }
        this.f117176d++;
        this.f117175c = j10;
    }
}
