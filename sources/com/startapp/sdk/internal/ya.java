package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class ya extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65599a;

    public ya(za zaVar) {
        this.f65599a = zaVar;
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean a(String str) {
        return !this.f65599a.D && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b(WebView webView, String str) {
        za zaVar = this.f65599a;
        zaVar.getClass();
        if (vi.c(webView.getContext(), str)) {
            return true;
        }
        if (!zaVar.A) {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "fake_click";
            g9Var.f64556g = zaVar.a();
            g9Var.f64554e = "jsTag=" + zaVar.D;
            g9Var.a();
        }
        if (!zaVar.D || zaVar.A) {
            return zaVar.a(str, false);
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(WebView webView, String str) {
        za zaVar = this.f65599a;
        vi.a(zaVar.f65681v, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        vi.a(zaVar.f65681v, true, "gClientInterface.setMode", zaVar.f65435g);
        vi.a(zaVar.f65681v, true, "enableScheme", "externalLinks");
        zaVar.q();
    }
}
