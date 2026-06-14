package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class eh2 implements j43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv f110376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f110378c;

    public eh2(ProgressBar progressBar, uv uvVar, long j10) {
        this.f110376a = uvVar;
        this.f110377b = j10;
        this.f110378c = new WeakReference(progressBar);
    }

    @Override // yads.j43
    public final void a(long j10, long j11) {
        ProgressBar progressBar = (ProgressBar) this.f110378c.get();
        if (progressBar != null) {
            uv uvVar = this.f110376a;
            long j12 = this.f110377b;
            uvVar.f116788a.getClass();
            ye.a(progressBar, j12, j12 - j10);
        }
    }
}
