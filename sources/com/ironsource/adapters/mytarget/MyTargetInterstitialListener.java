package com.ironsource.adapters.mytarget;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class MyTargetInterstitialListener implements InterstitialAd.InterstitialAdListener {
    private WeakReference<MyTargetAdapter> mAdapter;
    private InterstitialSmashListener mListener;
    private String mSlotId;

    public MyTargetInterstitialListener(MyTargetAdapter myTargetAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(myTargetAdapter);
        this.mListener = interstitialSmashListener;
        this.mSlotId = str;
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onClick(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDismiss(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onDisplay(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onFailedToShow(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(this.mSlotId, "Interstitial"));
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onLoad(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (this.mListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
                return;
            }
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mSlotId, Boolean.TRUE);
            this.mAdapter.get().mInterstitialSlotIdToAd.put(this.mSlotId, interstitialAd);
            this.mListener.onInterstitialAdReady();
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd) {
        String str = "error message = " + iAdLoadingError.getMessage() + ", error code = " + iAdLoadingError.getCode();
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId + " ," + str);
        WeakReference<MyTargetAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mSlotId, Boolean.FALSE);
            this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial", "MyTarget", str));
        }
    }

    @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
    public void onVideoCompleted(@NonNull InterstitialAd interstitialAd) {
        IronLog.ADAPTER_CALLBACK.verbose("slotId = " + this.mSlotId);
    }
}
