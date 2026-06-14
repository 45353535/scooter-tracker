package com.startapp.sdk.ads.banner.bannerstandard;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.AnyThread;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import com.startapp.sdk.internal.ad;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.dd;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.ed;
import com.startapp.sdk.internal.fb;
import com.startapp.sdk.internal.g3;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i1;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.kk;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.lk;
import com.startapp.sdk.internal.p1;
import com.startapp.sdk.internal.q1;
import com.startapp.sdk.internal.r1;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.s7;
import com.startapp.sdk.internal.sc;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.tc;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.w1;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yc;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zc;
import com.startapp.sdk.internal.zf;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    private static final String LOG_TAG = "BannerStandard";
    protected r1 adHtml;
    private RelativeLayout adInformationContatiner;
    private com.startapp.sdk.adsbase.adinformation.a adInformationLayout;

    @Nullable
    private vd adSession;

    @NonNull
    private final Object adSessionLock;
    private boolean callLoadHtmlOnAttached;
    private boolean callbackSent;

    @Nullable
    private CloseableLayout closeableAdContainer;
    private boolean defaultLoad;

    @NonNull
    private final lb externalAds;

    @NonNull
    private final zf impressionListener;
    protected boolean jsTag;
    protected BannerListener listener;

    @Nullable
    private a mraidController;
    private BannerOptions options;

    @Nullable
    private ViewGroup rootView;

    @Nullable
    private ag scheduledImpression;
    private boolean sessionStarted;

    @NonNull
    private BannerSize size;

    @Nullable
    private WebView twoPartWebView;
    private double viewHeightDp;
    private double viewWidthDp;
    private boolean visible;

    @Nullable
    private WebView webView;
    private RelativeLayout webViewContainer;
    protected boolean webViewTouched;

    public class a extends w1 implements sc {

        @Nullable
        private MraidState mraidState;
        private boolean mraidVisibility;

        @NonNull
        private final zc nativeFeatureManager;

        @NonNull
        private final ad orientationProperties;

        @Nullable
        private dd resizeProperties;

        @Nullable
        private a twoPart;

        @Nullable
        private kk viewabilityTracker;

        @Nullable
        lk visibilityResult;

        @NonNull
        private final WebView webView;

        public a(WebView webView, @NonNull v1 v1Var) {
            super(v1Var);
            this.webView = webView;
            this.nativeFeatureManager = new zc(BannerStandard.this.getContext());
            this.orientationProperties = new ad();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVisibilityTracker() {
            if (this.viewabilityTracker == null) {
                this.viewabilityTracker = new kk(this.webView, BannerStandard.this.getAdLoadingSize(), BannerMetaData.c().a(), new e(this));
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.addVisibilityTracker();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireExposureChangeEvent(@NonNull lk lkVar) {
            String string;
            if (lkVar.equals(this.visibilityResult)) {
                return;
            }
            this.visibilityResult = lkVar;
            Rect rect = lkVar.f64894b;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("left", rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("width", rect.width());
                jSONObject.put("height", rect.height());
                Rect[] rectArr = lkVar.f64895c;
                int length = rectArr == null ? 0 : rectArr.length;
                if (length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("left", rectArr[i10].left);
                        jSONObject2.put("top", rectArr[i10].top);
                        jSONObject2.put("width", rectArr[i10].width());
                        jSONObject2.put("height", rectArr[i10].height());
                        jSONArray.put(jSONObject2);
                    }
                    string = jSONArray.toString();
                } else {
                    string = null;
                }
                vi.a(this.webView, false, "mraid.fireExposureChangeEvent", Float.valueOf(lkVar.f64893a), jSONObject.toString(), string);
            } catch (JSONException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z10) {
            if (this.mraidVisibility == z10) {
                return;
            }
            this.mraidVisibility = z10;
            vi.a(this.webView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z10));
        }

        private void updateDisplayMetrics(@NonNull WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f10 = i11;
                vi.a(webView, true, "mraid.setScreenSize", Integer.valueOf(li.b(context, i10)), Integer.valueOf(Math.round(f10 / context.getResources().getDisplayMetrics().density)));
                tc.b(context, i12, i13, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
                vi.a(webView, true, "mraid.setMaxSize", Integer.valueOf(li.b(context, i10)), Integer.valueOf(Math.round(f10 / context.getResources().getDisplayMetrics().density)));
                tc.a(context, i12, i13, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }

        public void cancelViewabilityTracking() {
            kk kkVar = this.viewabilityTracker;
            if (kkVar != null) {
                kkVar.f64835a.removeCallbacksAndMessages(null);
                this.viewabilityTracker = null;
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.cancelViewabilityTracking();
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void close() {
            BannerStandard.this.handleCollapse();
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void expand(@Nullable String str) {
            BannerStandard.this.cancelReloadTask();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            boolean z10 = !zIsEmpty;
            if (!zIsEmpty) {
                BannerStandard.this.setupTwoPartMraidController(str);
            }
            if (getState() == MraidState.DEFAULT) {
                BannerStandard.this.onMraidExpandDefault(new FrameLayout.LayoutParams(-1, -1), z10);
            } else if (getState() == MraidState.RESIZED && !zIsEmpty) {
                BannerStandard.this.onMraidExpandResized(new FrameLayout.LayoutParams(-1, -1));
            }
            BannerStandard.this.setCloseableAdContainerLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setState(MraidState.EXPANDED);
        }

        @Nullable
        public dd getResizeProperties() {
            return this.resizeProperties;
        }

        @Nullable
        public MraidState getState() {
            return this.mraidState;
        }

        public void init() {
            this.webView.setWebViewClient(new ed(this, this));
        }

        public void initTwoPart(@NonNull WebView webView) {
            if (this.twoPart == null) {
                a aVar = BannerStandard.this.new a(webView, this.openListener);
                this.twoPart = aVar;
                aVar.init();
                this.twoPart.onMraidDetected();
            }
        }

        @Override // com.startapp.sdk.internal.w1
        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f65694b.contains(str);
        }

        @Override // com.startapp.sdk.internal.sc
        public void onMraidDetected() {
            if (this.mraidState != null) {
                return;
            }
            this.mraidState = MraidState.LOADING;
            addVisibilityTracker();
        }

        @Override // com.startapp.sdk.internal.sc
        public void onPageFinished(@NonNull String str) {
            BannerStandard.this.getContext();
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(2, "StartAppSDK", "Banner received callback onPageFinished()");
            ((z6) ((y6) ((BannerBase) BannerStandard.this).eventTracer.a())).c(BannerStandard.this, ii.F);
            BannerStandard.this.makeImpression(this.mraidState != null);
            WebView webView = this.webView;
            if (this.mraidState == MraidState.LOADING) {
                vi.a(webView, true, "mraid.setPlacementType", "inline");
                yc.a(BannerStandard.this.getContext(), webView, this.nativeFeatureManager);
                vi.a(this.webView, true, "gClientInterface.onPageFinished", Boolean.valueOf(this.mraidState != null));
                updateDisplayMetrics(webView);
                MraidState mraidState = MraidState.DEFAULT;
                this.mraidState = mraidState;
                vi.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
                vi.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            }
            BannerStandard.this.onWebviewPageFinished(webView);
        }

        public void release() {
            cancelViewabilityTracking();
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.release();
                this.twoPart = null;
            }
        }

        public boolean releaseTwoPart() {
            a aVar = this.twoPart;
            if (aVar == null) {
                return false;
            }
            aVar.release();
            this.twoPart = null;
            return true;
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void resize() {
            BannerStandard.this.handleResize();
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setOrientationProperties(Map<String, String> map) {
            boolean z10 = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            ad adVar = this.orientationProperties;
            if (adVar.f64267a == z10) {
                int i10 = adVar.f64268b;
                int iIndexOf = ad.f64266c.indexOf(str);
                if (iIndexOf == -1) {
                    iIndexOf = 2;
                }
                if (i10 == iIndexOf) {
                    return;
                }
            }
            ad adVar2 = this.orientationProperties;
            adVar2.f64267a = z10;
            int iIndexOf2 = ad.f64266c.indexOf(str);
            adVar2.f64268b = iIndexOf2 != -1 ? iIndexOf2 : 2;
            applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void setResizeProperties(@NonNull Map<String, String> map) {
            try {
                int i10 = Integer.parseInt(map.get("width"));
                int i11 = Integer.parseInt(map.get("height"));
                int i12 = Integer.parseInt(map.get("offsetX"));
                int i13 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                this.resizeProperties = new dd(i10, i11, i12, i13, map.get("customClosePosition"), str == null || Boolean.parseBoolean(str));
            } catch (Exception unused) {
                tc.a(this.webView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(@Nullable MraidState mraidState) {
            this.mraidState = mraidState;
            if (mraidState != null) {
                vi.a(this.webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            }
        }

        @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
        public void useCustomClose(String str) {
            BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
        }
    }

    @Keep
    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    public static /* synthetic */ Void a(BannerStandard bannerStandard, String str, Boolean bool) {
        ExternalConfig externalConfigU;
        bannerStandard.getClass();
        if (!Boolean.FALSE.equals(bool) || (externalConfigU = MetaData.E().u()) == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            return null;
        }
        bannerStandard.reloadInnerAd(str);
        return null;
    }

    private void addAdInformationLayout() {
        if (this.adInformationLayout == null && this.adInformationContatiner == null) {
            this.adInformationContatiner = new RelativeLayout(getContext());
            com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(getContext(), AdInformationObject$Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.adHtml.getAdInfoOverride(), this.adHtml.getConsentData(), this.adHtml.getRequestUrl(), this.adHtml.getDParam(), this.adHtml.getErid(), this.adHtml.getEridUrl());
            this.adInformationLayout = aVar;
            aVar.a(this.adInformationContatiner);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.adInformationContatiner.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adInformationContatiner);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.adInformationContatiner, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachAdViewToContainer(@NonNull View view, int i10, int i11) {
        this.webViewContainer.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(li.a(getContext(), i10), li.a(getContext(), i11));
        layoutParams.addRule(13);
        this.webViewContainer.addView(view, layoutParams);
    }

    public static /* synthetic */ void b(final BannerStandard bannerStandard, i7 i7Var, final int i10) {
        final i7 i7Var2;
        Throwable th2;
        AdUnitConfig adUnitConfig;
        bannerStandard.getClass();
        try {
            final MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(bannerStandard.getAdTag());
                } catch (Throwable th3) {
                    th2 = th3;
                    i7Var2 = i7Var;
                }
            } else {
                adUnitConfig = null;
            }
            final AdUnitConfig adUnitConfig2 = adUnitConfig;
            if (adUnitConfig2 == null) {
                i7Var.a(Boolean.FALSE);
                return;
            }
            i7Var2 = i7Var;
            try {
                ((k0) bannerStandard.externalAds.a()).a(adUnitConfig2, new Function1() { // from class: com.startapp.sdk.ads.banner.bannerstandard.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BannerStandard.d(this.f63739b, i7Var2, adUnitConfig2, i10, metaDataE, (ea) obj);
                    }
                });
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            i7Var2 = i7Var;
        }
        th2 = th;
        i7Var2.a(Boolean.FALSE);
        g9.a(th2);
    }

    public static /* synthetic */ Void c(BannerStandard bannerStandard, String str, Boolean bool) {
        bannerStandard.getClass();
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        bannerStandard.sendLoadError(str);
        return null;
    }

    private void cancelViewabilityTracking() {
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.cancelViewabilityTracking();
        }
    }

    public static Unit d(BannerStandard bannerStandard, i7 i7Var, AdUnitConfig adUnitConfig, int i10, MetaData metaData, ea eaVar) {
        if (eaVar == null) {
            bannerStandard.listener.onFailedToReceiveAd(bannerStandard);
            i7Var.a(Boolean.FALSE);
            return Unit.f93236a;
        }
        Point adLoadingSize = bannerStandard.getAdLoadingSize();
        s7 s7Var = (s7) eaVar;
        s7Var.f65245c = adLoadingSize.x;
        s7Var.f65246d = adLoadingSize.y;
        s7Var.f65247e = new b(bannerStandard, adLoadingSize, i7Var, adUnitConfig, i10, metaData);
        s7Var.a();
        return Unit.f93236a;
    }

    private void detachTwoPartMraidController() {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.twoPartWebView);
        }
        this.twoPartWebView.stopLoading();
        this.twoPartWebView = null;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.rootView == null) {
            this.rootView = getTopmostView();
        }
        return this.rootView;
    }

    private long getImpressionDelayMillis() {
        Long l10 = this.adHtml.f65005j;
        return l10 != null ? TimeUnit.SECONDS.toMillis(l10.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    private ViewGroup getTopmostView() {
        View rootView;
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.webViewContainer;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (relativeLayout != null && (rootView = relativeLayout.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewFindViewById;
        }
        return viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : this.webViewContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:39:0x00e6, B:42:0x00ed, B:44:0x00f6, B:46:0x00ff, B:51:0x0115), top: B:85:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:39:0x00e6, B:42:0x00ed, B:44:0x00f6, B:46:0x00ff, B:51:0x0115), top: B:85:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean handleClick(@androidx.annotation.NonNull java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.handleClick(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCollapse() {
        a aVar = this.mraidController;
        if (aVar == null || aVar.getState() == MraidState.LOADING) {
            return;
        }
        MraidState state = this.mraidController.getState();
        MraidState mraidState = MraidState.HIDDEN;
        if (state == mraidState) {
            return;
        }
        if (this.mraidController.getState() == MraidState.RESIZED || this.mraidController.getState() == MraidState.EXPANDED) {
            if (this.mraidController.releaseTwoPart()) {
                detachTwoPartMraidController();
            } else {
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    closeableLayout.removeView(this.webView);
                }
                WebView webView = this.webView;
                if (webView != null) {
                    attachAdViewToContainer(webView, this.size.getWidth(), this.size.getHeight());
                }
                updateBannerView();
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null && closeableLayout2.getParent() != null && (closeableLayout2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) closeableLayout2.getParent()).removeView(closeableLayout2);
            }
            this.mraidController.setState(MraidState.DEFAULT);
        } else if (this.mraidController.getState() == MraidState.DEFAULT) {
            updateBannerView();
            this.mraidController.setState(mraidState);
        }
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomClose(boolean z10) {
        if (this.closeableAdContainer == null || z10 == (!r0.a())) {
            return;
        }
        this.closeableAdContainer.setCloseVisible(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResize() {
        a aVar = this.mraidController;
        if (aVar == null) {
            return;
        }
        dd resizeProperties = aVar.getResizeProperties();
        if (resizeProperties == null) {
            tc.a(this.webView, "requires: setResizeProperties first", "resize");
            return;
        }
        cancelReloadTask();
        if (this.mraidController.getState() == MraidState.LOADING || this.mraidController.getState() == MraidState.HIDDEN) {
            return;
        }
        if (this.mraidController.getState() == MraidState.EXPANDED) {
            tc.a(this.webView, "Not allowed to resize from an already expanded ad", "resize");
            return;
        }
        int i10 = resizeProperties.f64420a;
        int i11 = resizeProperties.f64421b;
        int i12 = resizeProperties.f64422c;
        int i13 = resizeProperties.f64423d;
        int[] iArr = new int[2];
        this.webView.getLocationOnScreen(iArr);
        Context context = getContext();
        int iB = li.b(context, iArr[0]) + i12;
        int iRound = Math.round(iArr[1] / context.getResources().getDisplayMetrics().density) + i13;
        Rect rect = new Rect(iB, iRound, i10 + iB, i11 + iRound);
        ViewGroup topmostView = getTopmostView();
        int iRound2 = Math.round(topmostView.getWidth() / context.getResources().getDisplayMetrics().density);
        int iRound3 = Math.round(topmostView.getHeight() / context.getResources().getDisplayMetrics().density);
        topmostView.getLocationOnScreen(new int[2]);
        int iRound4 = Math.round(r6[0] / context.getResources().getDisplayMetrics().density);
        int iRound5 = Math.round(r6[1] / context.getResources().getDisplayMetrics().density);
        if (!resizeProperties.f64425f) {
            if (rect.width() > iRound2 || rect.height() > iRound3) {
                tc.a(this.webView, "Not enough room for the ad", "resize");
                return;
            }
            rect.offsetTo(clampInt(iRound4, rect.left, (iRound4 + iRound2) - rect.width()), clampInt(iRound5, rect.top, (iRound5 + iRound3) - rect.height()));
        }
        Rect rect2 = new Rect();
        try {
            CloseableLayout.ClosePosition closePositionA = CloseableLayout.ClosePosition.a(resizeProperties.f64424e);
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.a(closePositionA, rect, rect2);
            }
            if (!new Rect(iRound4, iRound5, iRound2 + iRound4, iRound3 + iRound5).contains(rect2)) {
                tc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            if (!rect.contains(rect2)) {
                tc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            this.closeableAdContainer.setCloseVisible(false);
            this.closeableAdContainer.setClosePosition(closePositionA);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = rect.left - iRound4;
            layoutParams.topMargin = rect.top - iRound5;
            if (this.mraidController.getState() == MraidState.DEFAULT) {
                RelativeLayout relativeLayout = this.webViewContainer;
                if (relativeLayout != null) {
                    relativeLayout.removeView(this.webView);
                    this.webViewContainer.setVisibility(4);
                }
                this.closeableAdContainer.addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
                getAndMemoizeRootView().addView(this.closeableAdContainer, layoutParams);
            } else if (this.mraidController.getState() == MraidState.RESIZED) {
                setCloseableAdContainerLayoutParams(layoutParams);
            }
            this.closeableAdContainer.setClosePosition(closePositionA);
            this.mraidController.setState(MraidState.RESIZED);
        } catch (Exception e10) {
            tc.a(this.webView, e10.getMessage() != null ? e10.getMessage() : "", "resize");
        }
    }

    private boolean isEnoughSize() {
        return this.viewWidthDp >= ((double) this.size.getWidth()) && this.viewHeightDp >= ((double) this.size.getHeight());
    }

    private void loadExternalInline(final int i10, @NonNull final i7 i7Var) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.A);
        h0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.m
            @Override // java.lang.Runnable
            public final void run() {
                BannerStandard.b(this.f63749b, i7Var, i10);
            }
        });
    }

    private void loadHtml() {
        String strA;
        r1 r1Var = this.adHtml;
        if (r1Var == null || this.webView == null || (strA = r1Var.a()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(getAdTag())) {
            strA = strA.replaceAll("startapp_adtag_placeholder", getAdTag());
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.release();
            this.mraidController = null;
        }
        a aVar2 = new a(this.webView, new v1() { // from class: com.startapp.sdk.ads.banner.bannerstandard.n
            @Override // com.startapp.sdk.internal.v1
            public final boolean a(String str) {
                return this.f63752a.onMraidClickEvent(str);
            }
        });
        this.mraidController = aVar2;
        aVar2.init();
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.E);
        attachAdViewToContainer(this.webView, this.size.getWidth(), this.size.getHeight());
        getContext();
        vi.a(this.webView, strA);
        onAdLoadedToView();
    }

    private void onFailedToReceiveBanner(final String str) {
        if (e7.a(true, getAdTag(), true, false)) {
            loadExternalInline(2, new i7() { // from class: com.startapp.sdk.ads.banner.bannerstandard.k
                @Override // com.startapp.sdk.internal.i7
                public final Object a(Object obj) {
                    return BannerStandard.c(this.f63746b, str, (Boolean) obj);
                }
            });
        } else {
            sendLoadError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onImpressionSent(@Nullable String str) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.G);
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        w6.a("onImpression", bannerListener != null, str, null);
        h0.a(bannerListener != null ? new i1(context, bannerListener, this) : null);
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandDefault(@NonNull FrameLayout.LayoutParams layoutParams, boolean z10) {
        if (z10) {
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.addView(this.twoPartWebView, layoutParams);
            }
        } else {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.webView);
                this.webViewContainer.setVisibility(4);
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null) {
                closeableLayout2.addView(this.webView, layoutParams);
            }
        }
        getAndMemoizeRootView().addView(this.closeableAdContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandResized(@NonNull FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.webView);
        }
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this.webView, layoutParams);
            this.webViewContainer.setVisibility(4);
        }
        this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
    }

    private void onPause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onPause();
        }
    }

    private void onResume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    private void prepareWebView(WebView webView) {
        webView.setBackgroundColor(0);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOnTouchListener(new c(this));
        webView.setOnLongClickListener(new p1(this));
        webView.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceedWithImpression() {
        ag agVar = this.scheduledImpression;
        if (agVar != null) {
            agVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadImpl(@Nullable String str) {
        if (this.adHtml != null) {
            Point adLoadingSize = getAdLoadingSize();
            this.adHtml.f65181s = isFixedSize();
            r1 r1Var = this.adHtml;
            int i10 = adLoadingSize.x;
            int i11 = adLoadingSize.y;
            r1Var.f64998c = i10;
            r1Var.f64999d = i11;
            r1Var.setState(Ad.AdState.UN_INITIALIZED);
            this.adHtml.f65182t = getBannerType();
            ((z6) ((y6) this.eventTracer.a())).a(this, this.adHtml);
            ((z6) ((y6) this.eventTracer.a())).c(this, ii.B);
            this.adHtml.load(prepareAdPreferences(), this, str);
        }
    }

    private void reloadInnerAd(@Nullable String str) {
        if (!waitForFinishAdSession()) {
            reloadImpl(str);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new d(this, str), MetaData.E().N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z10, @NonNull String uuid, @NonNull String originalTS, @NonNull AdPreferences adPreferences, @NonNull Point size, @NonNull AdUnitConfig config, int i10) {
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f64356b = z10;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        caVar.f64357c = uuid;
        Intrinsics.checkNotNullParameter(originalTS, "originalTS");
        caVar.f64359e = originalTS;
        Intrinsics.checkNotNullParameter(config, "config");
        caVar.f64358d = config;
        Intrinsics.checkNotNullParameter(size, "size");
        caVar.f64360f = size;
        caVar.f64361g = Integer.valueOf(getBannerType());
        caVar.f64362h = Integer.valueOf(i10);
        caVar.f64363i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLoadError(String str) {
        setErrorMessage(str);
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        k1.a(getContext(), this.listener, (BannerBase) this, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseableAdContainerLayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.setLayoutParams(layoutParams);
        }
    }

    private boolean setSize(int i10, int i11) {
        if (this.webView == null) {
            return false;
        }
        this.size = new BannerSize(i10, i11);
        int iA = li.a(getContext(), this.size.getWidth());
        int iA2 = li.a(getContext(), this.size.getHeight());
        this.webViewContainer.setMinimumWidth(iA);
        this.webViewContainer.setMinimumHeight(iA2);
        ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iA, iA2);
        } else {
            layoutParams.width = iA;
            layoutParams.height = iA2;
        }
        this.webView.setLayoutParams(layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupTwoPartMraidController(String str) {
        this.webViewTouched = false;
        if (this.twoPartWebView == null) {
            this.twoPartWebView = ((tk) this.webViewFactory.a()).c();
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.initTwoPart(this.twoPartWebView);
        }
        prepareWebView(this.twoPartWebView);
        this.twoPartWebView.loadUrl(str);
    }

    private void startAdSession(@NonNull WebView webView) {
        try {
            startAdSessionUnsafe(webView);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    @MainThread
    private void startAdSessionUnsafe(@NonNull WebView webView) {
        vd vdVar;
        synchronized (this.adSessionLock) {
            try {
                vdVar = this.adSession;
                if (vdVar == null) {
                    vdVar = new vd(webView);
                    this.adSession = vdVar;
                    this.sessionStarted = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AdSession adSession = vdVar.f65397a;
        if (adSession != null) {
            adSession.start();
            try {
                RelativeLayout relativeLayout = this.adInformationContatiner;
                if (relativeLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    AdSession adSession2 = vdVar.f65397a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose, null);
                    }
                }
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession3 = vdVar.f65397a;
                    if (adSession3 != null) {
                        adSession3.addFriendlyObstruction(closeableLayout, friendlyObstructionPurpose2, null);
                    }
                }
            } catch (RuntimeException unused) {
            }
            AdSession adSession4 = vdVar.f65397a;
            if (adSession4 != null) {
                adSession4.registerAdView(webView);
            }
            if (vdVar.f65398b != null && vdVar.f65401e.compareAndSet(false, true)) {
                vdVar.f65398b.loaded();
            }
            vdVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBannerView() {
        if (this.visible && isAdLoadedToView() && isEnoughSize()) {
            h0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63737b.showBannerViewImpl();
                }
            });
        } else {
            h0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63738b.hideBannerViewImpl();
                }
            });
        }
    }

    @AnyThread
    private boolean waitForFinishAdSession() {
        vd vdVar;
        synchronized (this.adSessionLock) {
            vdVar = this.adSession;
            this.adSession = null;
        }
        if (vdVar == null) {
            return false;
        }
        try {
            AdSession adSession = vdVar.f65397a;
            if (adSession == null) {
                return true;
            }
            adSession.finish();
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    protected void cancelScheduledImpression(@Nullable String str) {
        ag agVar = this.scheduledImpression;
        if (agVar != null) {
            agVar.a(str, null);
        }
    }

    int clampInt(int i10, int i11, int i12) {
        return Math.max(i10, Math.min(i11, i12));
    }

    protected void finalize() throws Throwable {
        try {
            cancelScheduledImpression("AD_CLOSED_TOO_QUICKLY");
            waitForFinishAdSession();
        } finally {
            super.finalize();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    @NonNull
    protected Point getAdLoadingSize() {
        Point point = this.desirableSizeForManualLoading;
        return point != null ? point : super.getAdLoadingSize();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected String getBannerName() {
        return "StartApp Banner";
    }

    protected int getBannerType() {
        return 0;
    }

    @Nullable
    @Keep
    public String getBidToken() {
        r1 r1Var = this.adHtml;
        if (r1Var != null) {
            return vi.a(r1Var.a(), "@bidToken@", "@bidToken@");
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getHeightInDp() {
        return 50;
    }

    protected int getOffset() {
        r1 r1Var = this.adHtml;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.f65180r;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected long getRefreshDelayMillis() {
        long jN;
        synchronized (this.adSessionLock) {
            try {
                jN = this.adSession != null ? MetaData.E().N() : 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jN;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getRefreshRate() {
        return this.options.i();
    }

    @Nullable
    @VisibleForTesting
    public WebView getTwoPartWebView() {
        return this.twoPartWebView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    @NonNull
    protected View getViewableBanner() {
        RelativeLayout relativeLayout = this.webViewContainer;
        return relativeLayout != null ? relativeLayout : super.getViewableBanner();
    }

    @Nullable
    @VisibleForTesting
    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getWidthInDp() {
        return 320;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    @Keep
    public void hideBanner() {
        this.visible = false;
        updateBannerView();
    }

    protected void hideBannerViewImpl() {
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    @SuppressLint({"AddJavascriptInterface"})
    protected void initRuntime() {
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.closeableAdContainer = closeableLayout;
            closeableLayout.setOnCloseListener(new g3() { // from class: com.startapp.sdk.ads.banner.bannerstandard.l
                @Override // com.startapp.sdk.internal.g3
                public final void a() {
                    this.f63748a.handleCollapse();
                }
            });
            this.webView = ((tk) this.webViewFactory.a()).c();
            this.options = new BannerOptions();
            if (this.adHtml == null) {
                this.adHtml = new r1(context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
            }
            prepareWebView(this.webView);
            this.options = BannerMetaData.c().b();
            setMinimumWidth(li.a(getContext(), this.size.getWidth()));
            setMinimumHeight(li.a(getContext(), this.size.getHeight()));
            WebView webView = this.webView;
            Context context2 = getContext();
            q1 q1Var = new q1(this);
            TrackingParams trackingParams = new TrackingParams(getAdTag());
            boolean zA = this.adHtml.a(0);
            fb fbVar = new fb(context2, q1Var, trackingParams);
            fbVar.f64495b = zA;
            webView.addJavascriptInterface(fbVar, "startappwall");
            this.webViewContainer = new RelativeLayout(getContext());
            updateBannerView();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.webViewContainer, layoutParams);
        } catch (Throwable th2) {
            g9.a(th2);
            hideBanner();
            onFailedToReceiveBanner("BannerStandard.init - webview failed");
        }
    }

    protected boolean isFixedSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected boolean isTiedToAdm() {
        r1 r1Var = this.adHtml;
        return r1Var != null && r1Var.isTiedToAdm();
    }

    protected void makeImpression(boolean z10) {
        long jMax = Math.max(0L, getImpressionDelayMillis() - getTimePassedSinceAdLoadedToViewMillis());
        getContext();
        WeakHashMap weakHashMap = vi.f65408a;
        Log.println(2, "StartAppSDK", "Banner will send impression in " + jMax + " millis");
        TrackingParams trackingParams = new TrackingParams(getAdTag());
        trackingParams.a(z10);
        MraidMetadata mraidMetadataK = MetaData.E().K();
        ag agVar = new ag(getContext(), AdPreferences.Placement.INAPP_BANNER, this.adHtml.f65004i, trackingParams, jMax, z10 && mraidMetadataK != null && vi.a(mraidMetadataK.a()), this.impressionListener);
        this.scheduledImpression = agVar;
        startVisibilityRunnable(agVar);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f64700e);
        super.onAttachedToWindow();
        if (this.callLoadHtmlOnAttached) {
            this.callLoadHtmlOnAttached = false;
            loadHtml();
        }
        onResume();
        if (this.defaultLoad && !isAdLoadedToView()) {
            loadBanner(null);
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.addVisibilityTracker();
        }
        if (this.webView != null) {
            synchronized (this.adSessionLock) {
                try {
                    if (this.sessionStarted) {
                        startAdSession(this.webView);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        waitForFinishAdSession();
        onPause();
        cancelViewabilityTracking();
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.H);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f64700e);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(@Nullable Ad ad2) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64702g);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f64698c);
        onFailedToReceiveBanner(ad2 != null ? ad2.getErrorMessage() : null);
    }

    public boolean onMraidClickEvent(String str) {
        if (!this.webViewTouched) {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "fake_click";
            g9Var.f64556g = h0.a(str, (String) null);
            g9Var.f64554e = "jsTag=" + this.jsTag;
            g9Var.a();
        }
        if ((!this.jsTag || this.webViewTouched) && str != null) {
            return handleClick(str);
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(@NonNull Ad ad2) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64701f);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f64698c);
        this.webViewTouched = false;
        removeView(this.adInformationContatiner);
        r1 r1Var = this.adHtml;
        if (r1Var == null || r1Var.a() == null || this.adHtml.a().compareTo("") == 0) {
            onFailedToReceiveBanner("No Banner received");
            return;
        }
        this.jsTag = "true".equals(vi.a(this.adHtml.a(), "@jsTag@", "@jsTag@"));
        String strA = vi.a(this.adHtml.a(), "@width@", "@width@");
        String strA2 = vi.a(this.adHtml.a(), "@height@", "@height@");
        if (strA != null && strA2 != null) {
            try {
                if (!setSize(Integer.parseInt(strA), Integer.parseInt(strA2))) {
                    onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                    return;
                }
            } catch (NumberFormatException unused) {
                onFailedToReceiveBanner("Error parsing width and height from HTML: " + strA + " x " + strA2);
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                onFailedToReceiveBanner(th2.getMessage());
                return;
            }
        }
        if (isAttachedToWindow()) {
            loadHtml();
        } else {
            this.callLoadHtmlOnAttached = true;
        }
        addAdInformationLayout();
        addDisplayEventOnLoad();
        updateBannerView();
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        String[] strArr = this.adHtml.f65004i;
        k1.b(context, bannerListener, this, h0.a(strArr.length <= 0 ? null : strArr[0], (String) null));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.viewWidthDp = Math.ceil(i10 / displayMetrics.density);
        this.viewHeightDp = Math.ceil(i11 / displayMetrics.density);
        updateBannerView();
    }

    protected void onWebviewPageFinished(@NonNull WebView webView) {
        if (MetaData.E().j0()) {
            startAdSession(webView);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            onResume();
        } else {
            onPause();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void reload(@Nullable final String str) {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f64698c);
        if (e7.a(false, getAdTag(), true, false)) {
            loadExternalInline(1, new i7() { // from class: com.startapp.sdk.ads.banner.bannerstandard.j
                @Override // com.startapp.sdk.internal.i7
                public final Object a(Object obj) {
                    return BannerStandard.a(this.f63744b, str, (Boolean) obj);
                }
            });
        } else {
            reloadInnerAd(str);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void scheduleReloadTask() {
        ag agVar = this.scheduledImpression;
        if (agVar == null || agVar.f64280j.get() == 0) {
            return;
        }
        super.scheduleReloadTask();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    @Keep
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    @Keep
    public void showBanner() {
        try {
            ((sf) this.runtimeClassDetector.a()).a(2048);
        } catch (Throwable unused) {
        }
        this.visible = true;
        updateBannerView();
    }

    protected void showBannerViewImpl() {
        if (isEnoughSize()) {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.adHtml != null) {
                sg sgVar = (sg) this.showIntentionsKeeper.a();
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                int bannerType = getBannerType();
                String strA = vi.a(this.adHtml.a(), "@adId@", "@adId@");
                if (strA != null) {
                    sgVar.f65269a.put(new rg(placement, bannerType), strA);
                }
            }
        }
    }

    @Keep
    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Keep
    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Keep
    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Keep
    @Deprecated
    public BannerStandard(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    @Keep
    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences) {
        this(context, z10, adPreferences, null);
    }

    @Keep
    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences, r1 r1Var) {
        this(context, null, 0, z10, adPreferences, r1Var);
    }

    @VisibleForTesting(otherwise = 4)
    public BannerStandard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10, @Nullable AdPreferences adPreferences, @Nullable r1 r1Var) {
        this(context, attributeSet, i10, z10, adPreferences, r1Var, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).f64183j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).N, com.startapp.sdk.components.a.a(context).f64175b, com.startapp.sdk.components.a.a(context).f64187n, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).f64196w, com.startapp.sdk.components.a.a(context).f64176c, com.startapp.sdk.components.a.a(context).f64194u, com.startapp.sdk.components.a.a(context).f64185l, com.startapp.sdk.components.a.a(context).f64174a);
    }

    @VisibleForTesting(otherwise = 4)
    public BannerStandard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10, @Nullable AdPreferences adPreferences, @Nullable r1 r1Var, @NonNull lb lbVar, @NonNull lb lbVar2, @NonNull lb lbVar3, @NonNull lb lbVar4, @NonNull lb lbVar5, @NonNull lb lbVar6, @NonNull lb lbVar7, @NonNull lb lbVar8, @NonNull lb lbVar9, @NonNull lb lbVar10, @NonNull lb lbVar11, @NonNull lb lbVar12) {
        super(context, attributeSet, i10, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9, lbVar10, lbVar11);
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.size = new BannerSize(getWidthInDp(), getHeightInDp());
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        this.adSessionLock = new Object();
        this.impressionListener = new com.startapp.sdk.ads.banner.bannerstandard.a(this);
        this.externalAds = lbVar12;
        try {
            this.defaultLoad = z10;
            this.adHtml = r1Var;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    @Keep
    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Keep
    public BannerStandard(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, true, null, null);
    }
}
