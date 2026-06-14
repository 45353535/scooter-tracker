package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class lw2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mw2 f113244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw2(rw2 rw2Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f113244b = rw2Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        mw2 mw2Var = this.f113244b;
        mw2Var.getClass();
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (mw2Var.e());
    }
}
