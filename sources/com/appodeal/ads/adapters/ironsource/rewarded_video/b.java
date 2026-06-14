package com.appodeal.ads.adapters.ironsource.rewarded_video;

import android.text.TextUtils;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.ironsource.IronSourceNetwork;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedRewardedCallback f12378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12379c;

    public b(String str, UnifiedRewardedCallback unifiedRewardedCallback, boolean z10) {
        this.f12377a = str;
        this.f12378b = unifiedRewardedCallback;
        this.f12379c = z10;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClicked(String str) {
        if (TextUtils.equals(str, this.f12377a)) {
            this.f12378b.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClosed(String str) {
        if (TextUtils.equals(str, this.f12377a)) {
            this.f12378b.onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        if (TextUtils.equals(str, this.f12377a)) {
            if (this.f12379c) {
                this.f12378b.onAdExpired();
            } else if (ironSourceError == null) {
                this.f12378b.onAdLoadFailed(null);
            } else {
                this.f12378b.printError(ironSourceError.getErrorMessage(), Integer.valueOf(ironSourceError.getErrorCode()));
                this.f12378b.onAdLoadFailed(IronSourceNetwork.mapError(ironSourceError.getErrorCode()));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadSuccess(String str) {
        if (TextUtils.equals(str, this.f12377a)) {
            if (this.f12379c) {
                this.f12378b.onAdExpired();
            } else {
                this.f12379c = true;
                this.f12378b.onAdLoaded();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdOpened(String str) {
        if (TextUtils.equals(str, this.f12377a)) {
            this.f12378b.onAdShown();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdRewarded(String str) {
        if (TextUtils.equals(str, this.f12377a)) {
            this.f12378b.onAdFinished();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        if (TextUtils.equals(str, this.f12377a)) {
            if (ironSourceError != null) {
                this.f12378b.printError(ironSourceError.getErrorMessage(), Integer.valueOf(ironSourceError.getErrorCode()));
            }
            this.f12378b.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(ironSourceError != null ? ironSourceError.getErrorMessage() : "", Integer.valueOf(ironSourceError != null ? ironSourceError.getErrorCode() : 0)));
        }
    }
}
