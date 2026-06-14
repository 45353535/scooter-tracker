package com.inmobi.media;

import android.content.Context;
import android.view.View;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3837ki extends GestureDetectorOnGestureListenerC3635ci {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final byte f38890i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final C3903n9 f38891j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final String f38892k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f38893l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final C3812ji f38894m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3837ki(Context context, byte b10, C3903n9 c3903n9, C3919o0 adMetaData, ko webViewFactory, Di route, AdConfig adConfig) {
        super(context, b10, null, null, adMetaData.f39140r, 0L, adMetaData.f39141s, c3903n9, route, webViewFactory, adMetaData, adConfig, 92);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.f38890i1 = b10;
        this.f38891j1 = c3903n9;
        this.f38892k1 = "RenderViewSibling - " + route.f36741b;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter("default", "id");
        this.f38893l1 = (GestureDetectorOnGestureListenerC3635ci) webViewFactory.f38911b.get("default");
        this.f38894m1 = new C3812ji(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3635ci getAdRenderView() {
        C3903n9 c3903n9;
        if (this.f38893l1 == null && (c3903n9 = this.f38891j1) != null) {
            c3903n9.b(this.f38892k1, "Ad RenderView not found for id: " + getRoute().f36741b);
        }
        return this.f38893l1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci
    public final void C() {
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3903n9 c3903n9 = this.f38891j1;
        if (c3903n9 != null) {
            c3903n9.a(this.f38892k1, "initialize RenderViewSibling");
        }
        a(this.f38894m1);
        GestureDetectorOnGestureListenerC3635ci adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3635ci adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3635ci adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C3837ki)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3903n9 c3903n92 = this.f38891j1;
        if (c3903n92 != null) {
            c3903n92.a(this.f38892k1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(MapsKt.toMutableMap(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci
    public final void a(Ff orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        C3903n9 c3903n9 = this.f38891j1;
        if (c3903n9 != null) {
            c3903n9.a(this.f38892k1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci, com.inmobi.media.C
    public final void b() {
        j();
        removeAllViews();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    @Nullable
    public final InterfaceC3878m9 getLogger() {
        return this.f38891j1;
    }

    public final byte getMPlacementType() {
        return this.f38890i1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci, com.inmobi.media.C
    @NotNull
    public Fn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new D9(this, this, new C3976q7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.f38891j1), this.f38891j1));
        }
        Fn mViewableAd = getMViewableAd();
        Intrinsics.checkNotNull(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci
    public final void m() {
        C3903n9 c3903n9 = this.f38891j1;
        if (c3903n9 != null) {
            c3903n9.a(this.f38892k1, "dismissCurrentViewContainer " + this);
        }
        C4130wc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3757hc c3757hc = mediaProcessor.f39841c;
            if (c3757hc != null) {
                c3757hc.b();
            }
            mediaProcessor.f39841c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        ko webViewFactory = getWebViewFactory();
        String id2 = getRoute().f36740a;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webViewFactory.f38911b.get(id2);
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            c(gestureDetectorOnGestureListenerC3635ci, getRoute().f36741b);
            return;
        }
        C3903n9 c3903n9 = this.f38891j1;
        if (c3903n9 != null) {
            c3903n9.b(this.f38892k1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3635ci
    public final void u() {
    }
}
