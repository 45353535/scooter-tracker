package com.mobilefuse.sdk.omid;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser;", "", "()V", "WEB_VIEW_RELEASE_DELAY_MS", "", "lockedWebViews", "", "Landroid/webkit/WebView;", "createWebViewClient", "com/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1", "()Lcom/mobilefuse/sdk/omid/OmidWebViewReleaser$createWebViewClient$1;", "freeWebView", "", "webView", "scheduleWebViewRelease", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class OmidWebViewReleaser {
    private static final long WEB_VIEW_RELEASE_DELAY_MS = 4000;

    @NotNull
    public static final OmidWebViewReleaser INSTANCE = new OmidWebViewReleaser();
    private static final List<WebView> lockedWebViews = new ArrayList();

    private OmidWebViewReleaser() {
    }

    public static final /* synthetic */ List access$getLockedWebViews$p(OmidWebViewReleaser omidWebViewReleaser) {
        return lockedWebViews;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.omid.OmidWebViewReleaser$createWebViewClient$1] */
    public final AnonymousClass1 createWebViewClient() {
        return new WebViewClient() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser.createWebViewClient.1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @Nullable String url) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (url == null) {
                    return;
                }
                try {
                    HttpRequestTracker.logHttpRequest(url);
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freeWebView(WebView webView) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            lockedWebViews.remove(webView);
            webView.stopLoading();
            webView.destroy();
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public static final void scheduleWebViewRelease(@Nullable final WebView webView) {
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser.scheduleWebViewRelease.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (webView == null) {
                    return;
                }
                OmidWebViewReleaser omidWebViewReleaser = OmidWebViewReleaser.INSTANCE;
                OmidWebViewReleaser.access$getLockedWebViews$p(omidWebViewReleaser).add(webView);
                webView.setWebViewClient(omidWebViewReleaser.createWebViewClient());
                SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser.scheduleWebViewRelease.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OmidWebViewReleaser.INSTANCE.freeWebView(webView);
                    }
                }, OmidWebViewReleaser.WEB_VIEW_RELEASE_DELAY_MS);
            }
        }, 1, null);
    }
}
