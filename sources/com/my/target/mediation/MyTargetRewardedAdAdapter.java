package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.m;
import com.my.target.mediation.MediationRewardedAdAdapter;
import com.my.target.t4;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetRewardedAdAdapter implements MediationRewardedAdAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t4 f60162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardedAd f60163b;

    public class a implements RewardedAd.RewardedAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediationRewardedAdAdapter.MediationRewardedAdListener f60164a;

        public a(MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener) {
            this.f60164a = mediationRewardedAdListener;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: Ad clicked");
            this.f60164a.onClick(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: Ad dismissed");
            this.f60164a.onDismiss(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: Ad displayed");
            this.f60164a.onDisplay(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: Ad failed to show");
            this.f60164a.onFailedToShow(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: Ad loaded");
            this.f60164a.onLoad(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: No ad (" + iAdLoadingError.getMessage() + ")");
            this.f60164a.onNoAd(iAdLoadingError, MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(Reward reward, RewardedAd rewardedAd) {
            gb.a("MyTargetRewardedAdAdapter$AdListener: onReward - " + reward.type);
            this.f60164a.onReward(reward, MyTargetRewardedAdAdapter.this);
        }
    }

    public void a(t4 t4Var) {
        this.f60162a = t4Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        RewardedAd rewardedAd = this.f60163b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.setListener(null);
        this.f60163b.destroy();
        this.f60163b = null;
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void dismiss() {
        RewardedAd rewardedAd = this.f60163b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.dismiss();
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int i10 = Integer.parseInt(placementId);
            RewardedAd rewardedAd = new RewardedAd(i10, context);
            this.f60163b = rewardedAd;
            rewardedAd.setMediationEnabled(false);
            this.f60163b.setListener(new a(mediationRewardedAdListener));
            CustomParams customParams = this.f60163b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.f60162a != null) {
                gb.a("MyTargetRewardedAdAdapter: Got banner from mediation response");
                this.f60163b.a(this.f60162a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                gb.a("MyTargetRewardedAdAdapter: Load id " + i10);
                this.f60163b.load();
                return;
            }
            gb.a("MyTargetRewardedAdAdapter: Load id " + i10 + " from BID " + payload);
            this.f60163b.loadFromBid(payload);
        } catch (Throwable unused) {
            gb.b("MyTargetRewardedAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationRewardedAdListener.onNoAd(m.f60110o, this);
        }
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void show(@NonNull Context context) {
        RewardedAd rewardedAd = this.f60163b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.show();
    }
}
