package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.m;
import com.my.target.mediation.MediationInterstitialAdAdapter;
import com.my.target.t4;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetInterstitialAdAdapter implements MediationInterstitialAdAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t4 f60150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAd f60151b;

    public class a implements InterstitialAd.InterstitialAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediationInterstitialAdAdapter.MediationInterstitialAdListener f60152a;

        public a(MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener) {
            this.f60152a = mediationInterstitialAdListener;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onClick(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: Ad clicked");
            this.f60152a.onClick(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDismiss(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: Ad dismissed");
            this.f60152a.onDismiss(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDisplay(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: Ad displayed");
            this.f60152a.onDisplay(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onFailedToShow(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: On failed to show");
            this.f60152a.onFailedToShow(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onLoad(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: Ad loaded");
            this.f60152a.onLoad(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.f60152a.onNoAd(iAdLoadingError, MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onVideoCompleted(InterstitialAd interstitialAd) {
            gb.a("MyTargetInterstitialAdAdapter: Video completed");
            this.f60152a.onVideoCompleted(MyTargetInterstitialAdAdapter.this);
        }
    }

    public void a(t4 t4Var) {
        this.f60150a = t4Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        InterstitialAd interstitialAd = this.f60151b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.setListener(null);
        this.f60151b.destroy();
        this.f60151b = null;
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void dismiss() {
        InterstitialAd interstitialAd = this.f60151b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.dismiss();
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int i10 = Integer.parseInt(placementId);
            InterstitialAd interstitialAd = new InterstitialAd(i10, context);
            this.f60151b = interstitialAd;
            interstitialAd.setMediationEnabled(false);
            this.f60151b.setListener(new a(mediationInterstitialAdListener));
            CustomParams customParams = this.f60151b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.f60150a != null) {
                gb.a("MyTargetInterstitialAdAdapter: Got banner from mediation response");
                this.f60151b.a(this.f60150a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                gb.a("MyTargetInterstitialAdAdapter: Load id " + i10);
                this.f60151b.load();
                return;
            }
            gb.a("MyTargetInterstitialAdAdapter: Load id " + i10 + " from BID " + payload);
            this.f60151b.loadFromBid(payload);
        } catch (Throwable unused) {
            gb.b("MyTargetInterstitialAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationInterstitialAdListener.onNoAd(m.f60110o, this);
        }
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void show(@NonNull Context context) {
        InterstitialAd interstitialAd = this.f60151b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show();
    }
}
