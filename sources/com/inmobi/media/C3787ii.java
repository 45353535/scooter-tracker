package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3787ii extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878m9 f38767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3887mi f38768b;

    public C3787ii(InterfaceC3878m9 interfaceC3878m9, C3887mi c3887mi) {
        this.f38767a = interfaceC3878m9;
        this.f38768b = c3887mi;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f38767a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + " " + webViewRenderProcess);
        }
        C3887mi c3887mi = this.f38768b;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            mapA.put("creativeId", c3887mi.f39041a.f38646g);
            int i10 = c3887mi.f39045e + 1;
            c3887mi.f39045e = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3887mi.a("RenderProcessResponsive");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38767a;
        if (interfaceC3878m92 == null || (gh2 = ((C3903n9) interfaceC3878m92).f39085a) == null) {
            return;
        }
        gh2.a();
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Gh gh2;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f38767a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + " " + webViewRenderProcess);
        }
        C3887mi c3887mi = this.f38768b;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            mapA.put("creativeId", c3887mi.f39041a.f38646g);
            int i10 = c3887mi.f39044d + 1;
            c3887mi.f39044d = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = c3887mi.a("RenderProcessUnResponsive");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38767a;
        if (interfaceC3878m92 == null || (gh2 = ((C3903n9) interfaceC3878m92).f39085a) == null) {
            return;
        }
        gh2.a();
    }
}
