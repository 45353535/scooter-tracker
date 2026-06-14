package lc;

import android.webkit.WebView;
import id.a0;
import id.z0;
import io.bidmachine.iab.mraid.b;
import io.bidmachine.iab.mraid.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f94154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.c f94155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yc.b f94156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hd.e f94157d;

    public h(g htmlAdForm, jc.c adFormListener, yc.b eventCallback, hd.e eVar) {
        Intrinsics.checkNotNullParameter(htmlAdForm, "htmlAdForm");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f94154a = htmlAdForm;
        this.f94155b = adFormListener;
        this.f94156c = eventCallback;
        this.f94157d = eVar;
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void a(io.bidmachine.iab.mraid.b mraidAdView, y8.b iabError) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        jc.c cVar = this.f94155b;
        g gVar = this.f94154a;
        String strD = iabError.d();
        Intrinsics.checkNotNullExpressionValue(strD, "iabError.message");
        cVar.e(gVar, new a0(strD));
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void b(io.bidmachine.iab.mraid.b mraidAdView, n mraidOrientationProperties) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(mraidOrientationProperties, "mraidOrientationProperties");
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public boolean c(io.bidmachine.iab.mraid.b mraidAdView) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        return true;
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void d(io.bidmachine.iab.mraid.b mraidAdView) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void e(io.bidmachine.iab.mraid.b mraidAdView) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        this.f94156c.onClose();
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void f(io.bidmachine.iab.mraid.b mraidAdView, String url) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(url, "url");
        hd.e eVar = this.f94157d;
        if (eVar != null) {
            eVar.onClicked();
        }
        this.f94156c.a(url);
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void g(io.bidmachine.iab.mraid.b mraidAdView, String url) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(url, "url");
        f(mraidAdView, url);
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void h(io.bidmachine.iab.mraid.b mraidAdView, boolean z10) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        this.f94156c.c(z10);
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void i(io.bidmachine.iab.mraid.b mraidAdView, y8.b iabError) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        g gVar = this.f94154a;
        String strD = iabError.d();
        Intrinsics.checkNotNullExpressionValue(strD, "iabError.message");
        gVar.Z(new a0(strD));
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void j(io.bidmachine.iab.mraid.b mraidAdView) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void k(io.bidmachine.iab.mraid.b mraidAdView, String url) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void l(io.bidmachine.iab.mraid.b mraidAdView, y8.b iabError) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        g gVar = this.f94154a;
        String strD = iabError.d();
        Intrinsics.checkNotNullExpressionValue(strD, "iabError.message");
        gVar.U(new a0(strD));
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void m(io.bidmachine.iab.mraid.b mraidAdView) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        this.f94156c.e();
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void n(io.bidmachine.iab.mraid.b mraidAdView, String url, WebView webView, boolean z10) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        hd.e eVar = this.f94157d;
        if (eVar != null) {
            eVar.onViewReady(webView);
        }
        this.f94155b.a(this.f94154a);
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void o(io.bidmachine.iab.mraid.b mraidAdView, String url) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(url, "url");
        f(mraidAdView, url);
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public void p(io.bidmachine.iab.mraid.b mraidAdView, z0 privacySheetParams) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
    }

    @Override // io.bidmachine.iab.mraid.b.d
    public boolean q(io.bidmachine.iab.mraid.b mraidAdView, WebView webView, n nVar, boolean z10) {
        Intrinsics.checkNotNullParameter(mraidAdView, "mraidAdView");
        Intrinsics.checkNotNullParameter(webView, "webView");
        return true;
    }
}
