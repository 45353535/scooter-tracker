package ha;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f72978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f72980d;

    public b(long j10, long j11) {
        this.f72978b = j10;
        this.f72979c = j11;
        d();
    }

    protected final void a() {
        long j10 = this.f72980d;
        if (j10 < this.f72978b || j10 > this.f72979c) {
            throw new NoSuchElementException();
        }
    }

    protected final long b() {
        return this.f72980d;
    }

    public boolean c() {
        return this.f72980d > this.f72979c;
    }

    public void d() {
        this.f72980d = this.f72978b - 1;
    }

    @Override // ha.n
    public boolean next() {
        this.f72980d++;
        return !c();
    }
}
