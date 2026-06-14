package com.appodeal.ads.adapters.admob.unified;

import androidx.annotation.NonNull;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class UnifiedAdmobFullscreenDisplayListener extends FullScreenContentCallback {

    @NonNull
    private final UnifiedFullscreenAdCallback callback;

    public UnifiedAdmobFullscreenDisplayListener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.callback = unifiedFullscreenAdCallback;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        super.onAdClicked();
        this.callback.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.callback.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        if (adError != null) {
            this.callback.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        }
        this.callback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(adError.getMessage(), Integer.valueOf(adError.getCode())));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
        this.callback.onAdShown();
    }
}
