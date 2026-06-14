package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ld implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md f113045b;

    public ld(md mdVar) {
        this.f113045b = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd ndVar = this.f113045b.f113429c;
        if (ndVar != null) {
            ((tc) ndVar).f116166a.f116958d.removeCallbacksAndMessages(null);
        }
    }
}
