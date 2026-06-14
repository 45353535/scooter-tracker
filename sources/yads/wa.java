package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wa implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k83 f117362c;

    public wa(String str, k83 k83Var) {
        this.f117361b = str;
        this.f117362c = k83Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f117361b.length() > 0) {
            this.f117362c.a(this.f117361b);
        }
    }
}
