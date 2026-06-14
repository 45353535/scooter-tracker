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
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.o7;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetNativeBannerAdAdapter implements MediationNativeBannerAdAdapter, AdChoicesClickHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o7 f60158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NativeBannerAd f60159b;

    public class a implements NativeBannerAd.NativeBannerAdListener, NativeBannerAd.NativeBannerAdChoicesOptionListener, NativeBannerAd.NativeBannerAdChoicesListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediationNativeBannerAdAdapter.MediationNativeBannerAdListener f60160a;

        public a(MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener) {
            this.f60160a = mediationNativeBannerAdListener;
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close manually");
            this.f60160a.closeIfAutomaticallyDisabled(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z10, NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeBannerAdAdapter$AdListener: AdChoices icon downloading successfully");
            this.f60160a.onAdChoicesIconLoad(imageData, z10, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onClick(NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeBannerAdAdapter$AdListener: Ad clicked");
            this.f60160a.onClick(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close automatically");
            this.f60160a.onCloseAutomatically(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeBannerAdAdapter$AdListener: Ad loaded");
            this.f60160a.onLoad(nativeBanner, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeBannerAdAdapter$AdListener: No ad (" + iAdLoadingError.getMessage() + ")");
            this.f60160a.onNoAd(iAdLoadingError, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onShow(NativeBannerAd nativeBannerAd) {
            gb.a("MyTargetNativeBannerAdAdapter$AdListener: Ad shown");
            this.f60160a.onShow(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            gb.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.f60160a.shouldCloseAutomatically();
        }
    }

    public void a(o7 o7Var) {
        this.f60158a = o7Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeBannerAd nativeBannerAd = this.f60159b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
        this.f60159b.setListener(null);
        this.f60159b = null;
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    @Nullable
    public View getIconView(@NonNull Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(@NonNull Context context) {
        NativeBannerAd nativeBannerAd = this.f60159b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void load(@NonNull MediationNativeBannerAdConfig mediationNativeBannerAdConfig, @NonNull MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener, @NonNull Context context) {
        String placementId = mediationNativeBannerAdConfig.getPlacementId();
        try {
            int i10 = Integer.parseInt(placementId);
            NativeBannerAd nativeBannerAd = new NativeBannerAd(i10, mediationNativeBannerAdConfig.getMenuFactory(), context);
            this.f60159b = nativeBannerAd;
            nativeBannerAd.setMediationEnabled(false);
            this.f60159b.setCachePolicy(mediationNativeBannerAdConfig.getCachePolicy());
            a aVar = new a(mediationNativeBannerAdListener);
            this.f60159b.setListener(aVar);
            this.f60159b.setAdChoicesListener(aVar);
            this.f60159b.setAdChoicesOptionListener(aVar);
            CustomParams customParams = this.f60159b.getCustomParams();
            customParams.setAge(mediationNativeBannerAdConfig.getAge());
            customParams.setGender(mediationNativeBannerAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeBannerAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeBannerAdConfig.getPayload();
            if (this.f60158a != null) {
                gb.a("MyTargetNativeBannerAdAdapter: Got banner from mediation response");
                this.f60159b.a(this.f60158a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                gb.a("MyTargetNativeBannerAdAdapter: Load id " + i10);
                this.f60159b.load();
                return;
            }
            gb.a("MyTargetNativeBannerAdAdapter: Load id " + i10 + " from BID " + payload);
            this.f60159b.loadFromBid(payload);
        } catch (Throwable unused) {
            gb.b("MyTargetNativeBannerAdAdapter: Error - " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeBannerAdListener.onNoAd(m.f60110o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list, int i10) {
        NativeBannerAd nativeBannerAd = this.f60159b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.setAdChoicesPlacement(i10);
        this.f60159b.registerView(view, list);
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void unregisterView() {
        NativeBannerAd nativeBannerAd = this.f60159b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list, int i10) {
        NativeBannerAd nativeBannerAd = this.f60159b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.setAdChoicesPlacement(i10);
        this.f60159b.registerView(nativeBannerAdViewBinder, list);
    }
}
