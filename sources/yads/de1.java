package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class de1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109901d;

    public de1(int i10, int i11, int i12, int i13) {
        this.f109898a = i10;
        this.f109899b = i11;
        this.f109900c = i12;
        this.f109901d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f109898a - this.f109899b <= 1) {
                return false;
            }
        } else if (this.f109900c - this.f109901d <= 1) {
            return false;
        }
        return true;
    }
}
