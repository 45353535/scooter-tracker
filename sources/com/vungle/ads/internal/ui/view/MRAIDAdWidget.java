package com.vungle.ads.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 >2\u00020\u0001:\u0007;<=>?@AB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0003J\u0006\u0010%\u001a\u00020$J\u0018\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/J\b\u00100\u001a\u00020$H\u0014J\u0006\u00101\u001a\u00020$J\b\u00102\u001a\u00020$H\u0002J\u0006\u00103\u001a\u00020$J\u000e\u00104\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u00105\u001a\u00020$2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u00106\u001a\u00020$2\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u000e\u0010:\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u0005R&\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Landroid/widget/RelativeLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "eventId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "closeDelegate", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "getCloseDelegate$vungle_ads_release$annotations", "()V", "getCloseDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "setCloseDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;)V", "getEventId", "()Ljava/lang/String;", "onViewTouchListener", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "getOnViewTouchListener$vungle_ads_release$annotations", "getOnViewTouchListener$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "setOnViewTouchListener$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;)V", "orientationDelegate", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "getOrientationDelegate$vungle_ads_release$annotations", "getOrientationDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "setOrientationDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;)V", "url", "getUrl", "webView", "Landroid/webkit/WebView;", "bindListeners", "", "close", "destroyWebView", "webViewDestroyDelay", "", "isMaliBuggy", "", "linkWebView", "vngWebViewClient", "Landroid/webkit/WebViewClient;", "webViewSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "onAttachedToWindow", "pauseWeb", "prepare", "resumeWeb", "setCloseDelegate", "setOnViewTouchListener", "setOrientation", "requestedOrientation", "", "setOrientationDelegate", "showWebsite", "AdStopReason", "AudioContextWrapper", "CloseDelegate", y.f66058y, "DestroyRunnable", "OnViewTouchListener", "OrientationDelegate", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MRAIDAdWidget extends RelativeLayout {

    @NotNull
    private static final String TAG = "MRAIDAdWidget";

    @Nullable
    private CloseDelegate closeDelegate;

    @Nullable
    private final String eventId;

    @Nullable
    private OnViewTouchListener onViewTouchListener;

    @Nullable
    private OrientationDelegate orientationDelegate;

    @Nullable
    private WebView webView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AdStopReason;", "", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdStopReason {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AdStopReason$Companion;", "", "()V", "IS_AD_FINISHED_BY_API", "", "IS_AD_FINISHING", "IS_CHANGING_CONFIGURATION", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AudioContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getSystemService", "", "name", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AudioContextWrapper extends ContextWrapper {
        public AudioContextWrapper(@Nullable Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        @NotNull
        public Object getSystemService(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Object systemService = Intrinsics.areEqual("audio", name) ? getApplicationContext().getSystemService(name) : super.getSystemService(name);
            Intrinsics.checkNotNullExpressionValue(systemService, "if (AUDIO_SERVICE == nam…rvice(name)\n            }");
            return systemService;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "", "close", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CloseDelegate {
        void close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$DestroyRunnable;", "Ljava/lang/Runnable;", "widget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "isMaliBuggy", "", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Z)V", "()Z", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class DestroyRunnable implements Runnable {
        private final boolean isMaliBuggy;

        @NotNull
        private final MRAIDAdWidget widget;

        public DestroyRunnable(@NotNull MRAIDAdWidget widget, boolean z10) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.widget = widget;
            this.isMaliBuggy = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
        public static final void m7580run$lambda0(DestroyRunnable this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: run$lambda-10, reason: not valid java name */
        public static final void m7581run$lambda10(WebView wv, DestroyRunnable this$0) {
            Intrinsics.checkNotNullParameter(wv, "$wv");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                wv.destroy();
                String eventId = this$0.widget.getEventId();
                if (eventId != null) {
                    WebViewManager.INSTANCE.destroyWebView(eventId);
                }
                this$0.widget.webView = null;
            } catch (Throwable th2) {
                Logger.INSTANCE.e(MRAIDAdWidget.TAG, "Destroy webview " + th2.getMessage());
            }
        }

        /* JADX INFO: renamed from: isMaliBuggy, reason: from getter */
        public final boolean getIsMaliBuggy() {
            return this.isMaliBuggy;
        }

        @Override // java.lang.Runnable
        public void run() {
            final WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.DestroyRunnable.m7580run$lambda0(this.f68095b);
                    }
                });
                return;
            }
            try {
                try {
                    Result.Companion companion = Result.f93230c;
                    webView.onPause();
                    Result.b(Unit.f93236a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(d.a(th2));
                }
                try {
                    webView.stopLoading();
                    Result.b(Unit.f93236a);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.f93230c;
                    Result.b(d.a(th3));
                }
                try {
                    webView.setWebChromeClient(null);
                    Result.b(Unit.f93236a);
                } catch (Throwable th4) {
                    Result.Companion companion4 = Result.f93230c;
                    Result.b(d.a(th4));
                }
                try {
                    webView.setWebViewClient(new WebViewClient());
                    Result.b(Unit.f93236a);
                } catch (Throwable th5) {
                    Result.Companion companion5 = Result.f93230c;
                    Result.b(d.a(th5));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        webView.setWebViewRenderProcessClient(null);
                        Result.b(Unit.f93236a);
                    } catch (Throwable th6) {
                        Result.Companion companion6 = Result.f93230c;
                        Result.b(d.a(th6));
                    }
                }
                webView.setVisibility(8);
                if (this.isMaliBuggy) {
                    webView.setLayerType(1, null);
                }
                try {
                    webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                    Result.b(Unit.f93236a);
                } catch (Throwable th7) {
                    Result.Companion companion7 = Result.f93230c;
                    Result.b(d.a(th7));
                }
                try {
                    webView.clearHistory();
                    Result.b(Unit.f93236a);
                } catch (Throwable th8) {
                    Result.Companion companion8 = Result.f93230c;
                    Result.b(d.a(th8));
                }
                try {
                    webView.removeAllViews();
                    Result.b(Unit.f93236a);
                } catch (Throwable th9) {
                    Result.Companion companion9 = Result.f93230c;
                    Result.b(d.a(th9));
                }
                new HandlerScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.ui.view.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.DestroyRunnable.m7581run$lambda10(webView, this);
                    }
                }, this.isMaliBuggy ? 300L : 100L);
            } catch (Throwable th10) {
                Logger.INSTANCE.e(MRAIDAdWidget.TAG, "Destroy webview: " + th10.getMessage());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "", "onTouch", "", "event", "Landroid/view/MotionEvent;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnViewTouchListener {
        boolean onTouch(@Nullable MotionEvent event);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "", "setOrientation", "", "orientation", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OrientationDelegate {
        void setOrientation(int orientation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(@NotNull Context context) throws InstantiationException {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return MRAIDAdWidget.m7579bindListeners$lambda0(this.f68094b, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m7579bindListeners$lambda0(MRAIDAdWidget this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnViewTouchListener onViewTouchListener = this$0.onViewTouchListener;
        if (onViewTouchListener != null) {
            return onViewTouchListener.onTouch(motionEvent);
        }
        return false;
    }

    public static /* synthetic */ void destroyWebView$default(MRAIDAdWidget mRAIDAdWidget, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        mRAIDAdWidget.destroyWebView(j10, z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void destroyWebView(long webViewDestroyDelay, boolean isMaliBuggy) {
        try {
            Result.Companion companion = Result.f93230c;
            ViewParent parent = getParent();
            Unit unit = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                unit = Unit.f93236a;
            }
            Result.b(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(d.a(th2));
        }
        try {
            removeAllViews();
            Result.b(Unit.f93236a);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.f93230c;
            Result.b(d.a(th3));
        }
        if (webViewDestroyDelay <= 0) {
            new DestroyRunnable(this, isMaliBuggy).run();
        } else {
            new HandlerScheduler().schedule(new DestroyRunnable(this, isMaliBuggy), webViewDestroyDelay);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCloseDelegate$vungle_ads_release, reason: from getter */
    public final CloseDelegate getCloseDelegate() {
        return this.closeDelegate;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnViewTouchListener$vungle_ads_release, reason: from getter */
    public final OnViewTouchListener getOnViewTouchListener() {
        return this.onViewTouchListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getOrientationDelegate$vungle_ads_release, reason: from getter */
    public final OrientationDelegate getOrientationDelegate() {
        return this.orientationDelegate;
    }

    @Nullable
    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(@NotNull WebViewClient vngWebViewClient, @Nullable AdPayload.WebViewSettings webViewSettings) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final void setCloseDelegate(@NotNull CloseDelegate closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(@Nullable OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientation(int requestedOrientation) {
        OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(requestedOrientation);
        }
    }

    public final void setOrientationDelegate(@Nullable OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void showWebsite(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.INSTANCE.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public /* synthetic */ MRAIDAdWidget(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) throws InstantiationException {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(@NotNull Context context, @Nullable String str) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.eventId = str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = ViewUtility.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }
}
