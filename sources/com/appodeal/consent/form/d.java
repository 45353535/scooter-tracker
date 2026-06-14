package com.appodeal.consent.form;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.consent.ConsentManagerError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f15413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f15415c;

    public d(AtomicBoolean atomicBoolean, String str, kotlinx.coroutines.e eVar) {
        this.f15413a = atomicBoolean;
        this.f15414b = str;
        this.f15415c = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.f15413a.compareAndSet(false, true)) {
            com.appodeal.consent.logger.a.b("[WebView] - onPageFinished: url: " + str, null);
            kotlinx.coroutines.e eVar = this.f15415c;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Result.a(ResultExtKt.asSuccess(Unit.f93236a))));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f15413a.compareAndSet(false, true)) {
            Integer numValueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
            String str = "[WebView] - onReceivedError, code=" + numValueOf + ", description=" + ((Object) description) + " (" + this.f15414b + ")";
            com.appodeal.consent.logger.a.b(str, null);
            kotlinx.coroutines.e eVar = this.f15415c;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Result.a(ResultExtKt.asFailure(new ConsentManagerError.FormNotReadyError(str)))));
        }
    }
}
