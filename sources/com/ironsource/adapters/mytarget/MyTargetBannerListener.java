package com.ironsource.adapters.mytarget;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class MyTargetBannerListener implements MyTargetView.MyTargetViewListener {
    private final WeakReference<MyTargetAdapter> mAdapter;
    private final FrameLayout.LayoutParams mLayoutParams;
    private final BannerSmashListener mListener;
    private final String mPlacementId;

    public MyTargetBannerListener(MyTargetAdapter myTargetAdapter, BannerSmashListener bannerSmashListener, String str, FrameLayout.LayoutParams layoutParams) {
        this.mAdapter = new WeakReference<>(myTargetAdapter);
        this.mListener = bannerSmashListener;
        this.mPlacementId = str;
        this.mLayoutParams = layoutParams;
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public void onClick(@NonNull MyTargetView myTargetView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public void onLoad(@NonNull MyTargetView myTargetView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLoaded(myTargetView, this.mLayoutParams);
        }
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView) {
        String str = "error message = " + iAdLoadingError.getMessage() + ", error code = " + iAdLoadingError.getCode();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " ," + str);
        if (this.mAdapter.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner", "MyTarget", str));
        }
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public void onShow(@NonNull MyTargetView myTargetView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
