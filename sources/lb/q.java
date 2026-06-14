package lb;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q extends t9.g implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f94116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f94117g;

    @Override // t9.g, t9.a
    public void c() {
        super.c();
        this.f94116f = null;
    }

    @Override // lb.k
    public List getCues(long j10) {
        return ((k) q9.a.e(this.f94116f)).getCues(j10 - this.f94117g);
    }

    @Override // lb.k
    public long getEventTime(int i10) {
        return ((k) q9.a.e(this.f94116f)).getEventTime(i10) + this.f94117g;
    }

    @Override // lb.k
    public int getEventTimeCount() {
        return ((k) q9.a.e(this.f94116f)).getEventTimeCount();
    }

    @Override // lb.k
    public int getNextEventTimeIndex(long j10) {
        return ((k) q9.a.e(this.f94116f)).getNextEventTimeIndex(j10 - this.f94117g);
    }

    public void m(long j10, k kVar, long j11) {
        this.f104996c = j10;
        this.f94116f = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f94117g = j10;
    }
}
