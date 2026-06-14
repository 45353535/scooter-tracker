package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class gt3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f111337b;

    public gt3(kt3 kt3Var) {
        this.f111337b = kt3Var.f112849g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f111337b.destroy();
    }
}
