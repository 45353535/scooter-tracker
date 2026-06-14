package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider;
import com.pubmatic.sdk.openwrap.core.banner.POBBannerRenderer;
import com.pubmatic.sdk.openwrap.core.interstitial.POBInterstitialRenderer;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRenderer;
import com.pubmatic.sdk.video.renderer.POBVideoRendering;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBRenderer {

    class a implements POBBannerRenderer.RendererBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f62792b;

        a(Context context, int i10) {
            this.f62791a = context;
            this.f62792b = i10;
        }

        @Override // com.pubmatic.sdk.openwrap.core.banner.POBBannerRenderer.RendererBuilder
        public POBBannerRendering build(POBAdDescriptor pOBAdDescriptor, int i10) {
            if (pOBAdDescriptor.isVideo()) {
                return POBRenderer.videoRenderer(this.f62791a, pOBAdDescriptor, "inline", this.f62792b, false);
            }
            return POBRenderer.b(this.f62791a, "inline", Math.max(pOBAdDescriptor.getRefreshInterval(), 15), i10);
        }
    }

    class b implements POBInterstitialRenderer.RendererBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBBid f62794b;

        b(Context context, POBBid pOBBid) {
            this.f62793a = context;
            this.f62794b = pOBBid;
        }

        @Override // com.pubmatic.sdk.openwrap.core.interstitial.POBInterstitialRenderer.RendererBuilder
        public POBBannerRendering build(POBAdDescriptor pOBAdDescriptor, int i10) {
            return pOBAdDescriptor.isVideo() ? POBRenderer.videoRenderer(this.f62793a, pOBAdDescriptor, "interstitial", this.f62794b.getRemainingExpirationTime(), false) : POBRenderer.b(this.f62793a, "interstitial", 15, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static POBBannerRendering b(Context context, String str, int i10, int i11) {
        POBMraidRenderer pOBMraidRendererCreateInstance = POBMraidRenderer.createInstance(context.getApplicationContext(), str, i11);
        if (pOBMraidRendererCreateInstance != null) {
            pOBMraidRendererCreateInstance.setTrackerHandler(POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandler(context)));
            pOBMraidRendererCreateInstance.setRenderingTimeout(i10);
            pOBMraidRendererCreateInstance.setBaseURL(a());
            POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = (POBHTMLMeasurementProvider) POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBHTMLMeasurement");
            if (pOBHTMLMeasurementProvider != null) {
                pOBMraidRendererCreateInstance.setHTMLMeasurementListener(pOBHTMLMeasurementProvider);
            }
        }
        return pOBMraidRendererCreateInstance;
    }

    @NonNull
    public static POBBannerRendering getBannerRenderer(@NonNull Context context, int i10) {
        return new POBBannerRenderer(new a(context, i10));
    }

    @NonNull
    public static POBInterstitialRenderer getInterstitialRenderer(@NonNull Context context, @NonNull POBBid pOBBid) {
        POBInterstitialRenderer pOBInterstitialRenderer = new POBInterstitialRenderer(context.getApplicationContext(), new b(context, pOBBid));
        if (!pOBBid.isVideo()) {
            pOBInterstitialRenderer.setTrackerHandler(POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandler(context)));
        }
        return pOBInterstitialRenderer;
    }

    @NonNull
    public static POBVideoRendering videoRenderer(@NonNull Context context, @NonNull POBAdDescriptor pOBAdDescriptor, @NonNull String str, int i10, boolean z10) {
        POBViewabilityTracker pOBViewabilityTracker;
        POBAdSize pOBAdSize;
        boolean zEquals = "interstitial".equals(str);
        POBVastPlayer pOBVastPlayerCreateInstance = POBVastPlayer.createInstance(context, POBVastPlayerConfig.ConfigBuilder.createVastConfig(pOBAdDescriptor.getRawBid(), zEquals, z10, !z10, str));
        if (pOBAdDescriptor.getCTAOverlayData() != null) {
            pOBVastPlayerCreateInstance.setCTAOverlayData(pOBAdDescriptor.getCTAOverlayData());
        }
        pOBVastPlayerCreateInstance.setPlacementType(str);
        pOBVastPlayerCreateInstance.setDeviceInfo(POBInstanceProvider.getDeviceInfo(context.getApplicationContext()));
        pOBVastPlayerCreateInstance.setMaxWrapperThreshold(3);
        pOBVastPlayerCreateInstance.setLinearity(POBVastPlayer.Linearity.LINEAR);
        pOBVastPlayerCreateInstance.setSkipabilityEnabled(zEquals);
        pOBVastPlayerCreateInstance.setShowEndCardOnSkip(!z10 && zEquals);
        boolean zA = a(pOBAdDescriptor.getRawBid());
        pOBVastPlayerCreateInstance.setFSCEnabled(!zEquals || zA);
        pOBVastPlayerCreateInstance.setEnableLearnMoreButton((zEquals && zA) ? false : true);
        pOBVastPlayerCreateInstance.setBidBundleId(pOBAdDescriptor.getBundle());
        if (zEquals) {
            pOBViewabilityTracker = new POBViewabilityTracker(pOBVastPlayerCreateInstance);
        } else {
            pOBViewabilityTracker = new POBViewabilityTracker((View) pOBVastPlayerCreateInstance, 50.0f);
            pOBViewabilityTracker.setAllowViewTreeObserverRegistration(true);
        }
        POBVideoRenderer pOBVideoRenderer = new POBVideoRenderer(pOBVastPlayerCreateInstance, pOBViewabilityTracker, str, POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandler(context)));
        pOBVideoRenderer.setMeasurementProvider((POBVideoMeasurementProvider) POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBVideoMeasurement"));
        if (zEquals) {
            pOBAdSize = POBUtils.getInterstitialAdSize(context);
            pOBVideoRenderer.setExpirationTimeout(i10);
        } else {
            pOBAdSize = new POBAdSize(pOBAdDescriptor.getContentWidth(), pOBAdDescriptor.getContentHeight());
        }
        pOBVastPlayerCreateInstance.setEndCardSize(pOBAdSize);
        return pOBVideoRenderer;
    }

    private static String a() {
        return POBInstanceProvider.getSdkConfig().isRequestSecureCreative() ? "https://ow.pubmatic.com/openrtb/2.5" : "http://ow.pubmatic.com/openrtb/2.5";
    }

    private static boolean a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        return (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("ext")) == null || jSONObjectOptJSONObject.optInt("fsc") != 1) ? false : true;
    }
}
