package com.my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes11.dex */
public interface MediationRewardedAdAdapter extends MediationAdapter {

    public interface MediationRewardedAdListener {
        void onClick(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDismiss(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDisplay(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onFailedToShow(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onLoad(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onReward(@NonNull Reward reward, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);
    }

    void dismiss();

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationRewardedAdListener mediationRewardedAdListener, @NonNull Context context);

    void show(@NonNull Context context);
}
