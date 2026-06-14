package com.appodeal.ads.adapters.admobmediation.mrec;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdView f11932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecCallback f11933e;

    public a(AdView adView, UnifiedMrecCallback unifiedMrecCallback) {
        this.f11932d = adView;
        this.f11933e = unifiedMrecCallback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11933e.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11933e.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11933e.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        ResponseInfo responseInfo = this.f11932d.getResponseInfo();
        ImpressionLevelData impressionLevelDataA = responseInfo != null ? com.appodeal.ads.adapters.admobmediation.a.a(responseInfo) : null;
        if (impressionLevelDataA != null) {
            AdView adView = this.f11932d;
            adView.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11933e, adView.getResponseInfo()));
            this.f11933e.onAdLoaded(this.f11932d, impressionLevelDataA);
        } else {
            UnifiedMrecCallback unifiedMrecCallback = this.f11933e;
            LoadingError error = LoadingError.NoFill;
            Intrinsics.checkNotNullParameter(unifiedMrecCallback, "<this>");
            Intrinsics.checkNotNullParameter(error, "error");
            unifiedMrecCallback.printError("Admob Mediation - custom event price limit reached", Integer.valueOf(error.getCode()));
            unifiedMrecCallback.onAdLoadFailed(error);
        }
    }
}
