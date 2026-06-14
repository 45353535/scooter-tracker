package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.gb;
import com.my.target.m;
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.o7;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetNativeAdAdapter implements MediationNativeAdAdapter, AdChoicesClickHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o7 f60154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NativeAd f60155b;

    public class a implements NativeAd.NativeAdListener, NativeAd.NativeAdChoicesListener, NativeAd.NativeAdChoicesOptionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediationNativeAdAdapter.MediationNativeAdListener f60156a;

        public a(MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener) {
            this.f60156a = mediationNativeAdListener;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close manually");
            this.f60156a.closeIfAutomaticallyDisabled(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z10, NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: AdChoices icon downloading successfully");
            this.f60156a.onAdChoicesIconLoad(imageData, z10, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Ad clicked");
            this.f60156a.onClick(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void onCloseAutomatically(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close automatically");
            this.f60156a.onCloseAutomatically(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Ad loaded");
            this.f60156a.onLoad(nativePromoBanner, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.f60156a.onNoAd(iAdLoadingError, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onShow(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Ad shown");
            this.f60156a.onShow(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoComplete(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Video completed");
            this.f60156a.onVideoComplete(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPause(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Video paused");
            this.f60156a.onVideoPause(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPlay(NativeAd nativeAd) {
            gb.a("MyTargetNativeAdAdapter: Video playing");
            this.f60156a.onVideoPlay(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            gb.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.f60156a.shouldCloseAutomatically();
        }
    }

    public void a(o7 o7Var) {
        this.f60154a = o7Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeAd nativeAd = this.f60155b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
        this.f60155b.setListener(null);
        this.f60155b = null;
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    @Nullable
    public View getMediaView(@NonNull Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(@NonNull Context context) {
        NativeAd nativeAd = this.f60155b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void load(@NonNull MediationNativeAdConfig mediationNativeAdConfig, @NonNull MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener, @NonNull Context context) {
        String placementId = mediationNativeAdConfig.getPlacementId();
        try {
            int i10 = Integer.parseInt(placementId);
            NativeAd nativeAd = new NativeAd(i10, mediationNativeAdConfig.getMenuFactory(), context);
            this.f60155b = nativeAd;
            nativeAd.setMediationEnabled(false);
            this.f60155b.setCachePolicy(mediationNativeAdConfig.getCachePolicy());
            a aVar = new a(mediationNativeAdListener);
            this.f60155b.setListener(aVar);
            this.f60155b.setAdChoicesListener(aVar);
            this.f60155b.setAdChoicesOptionListener(aVar);
            CustomParams customParams = this.f60155b.getCustomParams();
            customParams.setAge(mediationNativeAdConfig.getAge());
            customParams.setGender(mediationNativeAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeAdConfig.getPayload();
            if (this.f60154a != null) {
                gb.a("MyTargetNativeAdAdapter: Got banner from mediation response");
                this.f60155b.a(this.f60154a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                gb.a("MyTargetNativeAdAdapter: Load id " + i10);
                this.f60155b.load();
                return;
            }
            gb.a("MyTargetNativeAdAdapter: Load id " + i10 + " from BID " + payload);
            this.f60155b.loadFromBid(payload);
        } catch (Throwable unused) {
            gb.b("MyTargetNativeAdAdapter error: " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeAdListener.onNoAd(m.f60110o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list, int i10) {
        NativeAd nativeAd = this.f60155b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setAdChoicesPlacement(i10);
        this.f60155b.registerView(view, list);
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void unregisterView() {
        NativeAd nativeAd = this.f60155b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list, int i10) {
        NativeAd nativeAd = this.f60155b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setAdChoicesPlacement(i10);
        this.f60155b.registerView(nativeAdViewBinder, list);
    }
}
