package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.V5;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class V5 extends AbstractC4170y2 implements InterfaceC3911nh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f37885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3878m9 f37886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U5 f37887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f37888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f37889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(Context context, long j10, String placementType, String impressionId, String creativeId, Function1 onLpLifecycleEvent, InterfaceC3878m9 interfaceC3878m9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.f37881b = j10;
        this.f37882c = placementType;
        this.f37883d = impressionId;
        this.f37884e = creativeId;
        this.f37885f = onLpLifecycleEvent;
        this.f37886g = interfaceC3878m9;
        this.f37888i = V5.class.getSimpleName();
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final Unit a(V5 v52) {
        T5 t52;
        ViewParent parent = v52.getParent();
        Q5 q52 = parent instanceof Q5 ? (Q5) parent : null;
        if (q52 != null && (t52 = q52.f37576d) != null) {
            C c10 = ((L8) t52).f37270a.f37348b;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = c10 instanceof GestureDetectorOnGestureListenerC3635ci ? (GestureDetectorOnGestureListenerC3635ci) c10 : null;
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                gestureDetectorOnGestureListenerC3635ci.D();
            }
        }
        return Unit.f93236a;
    }

    private final AdConfig getAdConfig() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) Y3.f38021a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f38021a.a(AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean c() {
        String TAG = this.f37888i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.AbstractC4170y2
    public final Ua d() {
        Va va2 = new Va(true, null, getAdConfig().getCctEnabled(), 18);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new Ua(context, va2, null, this, null, this.f37886g, 140);
    }

    public final void e() {
        U5 u52 = new U5("IN_CUSTOM_EXPAND", new Function0() { // from class: w3.b5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V5.a(this.f106989b);
            }
        }, new Function1() { // from class: w3.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V5.a(this.f107002b, (JSONObject) obj);
            }
        }, new Function2() { // from class: w3.d5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V5.a(this.f107014b, (String) obj, (Map) obj2);
            }
        }, this.f37886g);
        setWebViewClient(u52);
        this.f37887h = u52;
    }

    @Nullable
    public final Ya getLandingPageTelemetryControlInfo() {
        return this.f37889j;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public long getViewTouchTimestamp() {
        return this.f37881b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.loadData(data, str, str2);
        U5 u52 = this.f37887h;
        if (u52 != null) {
            u52.f40031d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        U5 u52 = this.f37887h;
        if (u52 != null) {
            u52.f40031d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f37891l) {
            this.f37891l = true;
            Function1 function1 = this.f37885f;
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            function1.invoke(Mh.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.f37890k) {
            this.f37890k = true;
            Function1 function1 = this.f37885f;
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            function1.invoke(Mh.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(@Nullable Ya ya2) {
        this.f37889j = ya2;
        U5 u52 = this.f37887h;
        if (u52 != null) {
            u52.f37825j = ya2;
            u52.f37826k = new Wa(ya2, u52);
        }
    }

    public void setViewTouchTimestamp(long j10) {
        this.f37881b = j10;
    }

    public static final Unit a(V5 v52, JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        v52.f37885f.invoke(it);
        return Unit.f93236a;
    }

    public static final Unit a(V5 v52, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ViewParent parent = v52.getParent();
        Q5 q52 = parent instanceof Q5 ? (Q5) parent : null;
        if (q52 != null) {
            Intrinsics.checkNotNullParameter(trackerName, "trackerName");
            Intrinsics.checkNotNullParameter(macros, "macros");
            T5 t52 = q52.f37576d;
            if (t52 != null) {
                Intrinsics.checkNotNullParameter(trackerName, "trackerName");
                Intrinsics.checkNotNullParameter(macros, "macros");
                C c10 = ((L8) t52).f37270a.f37348b;
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = c10 instanceof GestureDetectorOnGestureListenerC3635ci ? (GestureDetectorOnGestureListenerC3635ci) c10 : null;
                if (gestureDetectorOnGestureListenerC3635ci != null) {
                    gestureDetectorOnGestureListenerC3635ci.b(trackerName, macros);
                }
            }
        }
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean a() {
        String TAG = this.f37888i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        HashMap map = new HashMap();
        map.put("creativeId", this.f37884e);
        map.put("trigger", api);
        map.put("impressionId", this.f37883d);
        map.put("adType", this.f37882c);
        Wj wj = Wj.f37959a;
        Wj.b("BlockAutoRedirection", map, EnumC3585ak.f38215a);
    }
}
