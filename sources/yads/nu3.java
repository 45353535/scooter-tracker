package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class nu3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f114050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f114051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pu3 f114052d;

    public nu3(pu3 pu3Var, WebView webView, String str) {
        this.f114052d = pu3Var;
        this.f114050b = webView;
        this.f114051c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pu3 pu3Var = this.f114052d;
        WebView webView = this.f114050b;
        String str = this.f114051c;
        pu3Var.getClass();
        pu3.a(webView, str);
    }
}
