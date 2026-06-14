package f1;

/* JADX INFO: loaded from: classes6.dex */
public class ka implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w9 f70261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70262c;

    public ka(w9 w9Var, boolean z10, int i10) {
        this.f70261b = w9Var;
        this.f70262c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f70261b.a(this.f70262c);
    }
}
