package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f109517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public je f109519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cq2 f109520d;

    public cq2(int i10, long j10) {
        a(i10, j10);
    }

    public final void a(int i10, long j10) {
        if (this.f109519c != null) {
            throw new IllegalStateException();
        }
        this.f109517a = j10;
        this.f109518b = j10 + ((long) i10);
    }
}
