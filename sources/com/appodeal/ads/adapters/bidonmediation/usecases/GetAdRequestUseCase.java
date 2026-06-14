package com.appodeal.ads.adapters.bidonmediation.usecases;

import android.os.Bundle;
import com.appodeal.ads.adapters.admobmediation.AppodealCustomEvent;
import com.appodeal.ads.adapters.bidonmediation.ext.RegulationExtKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdRequestUseCase;", "", "<init>", "()V", "invoke", "Lcom/google/android/gms/ads/AdRequest;", "adParams", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "getDspAdRequest", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAdRequestUseCase {
    private final AdRequest getDspAdRequest(AdAuctionParams adParams) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Bundle bundleAsBundle = RegulationExtKt.asBundle(BidonSdk.getRegulation());
        double price = adParams.getPrice();
        Intrinsics.checkNotNullParameter(bundleAsBundle, "<this>");
        bundleAsBundle.putDouble("appodeal_pf", price);
        Intrinsics.checkNotNullParameter(bundleAsBundle, "<this>");
        Intrinsics.checkNotNullParameter(GetAdRequestUseCaseKt.DEFAULT_COMPARATOR, "comparator");
        bundleAsBundle.putString("appodeal_pf_compare", GetAdRequestUseCaseKt.DEFAULT_COMPARATOR);
        RequestConfiguration.Builder builder2 = MobileAds.getRequestConfiguration().toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder2, "toBuilder(...)");
        builder2.setTagForChildDirectedTreatment(BidonSdk.getRegulation().getCoppaApplies() ? 1 : 0);
        if (BidonSdk.isTestMode()) {
            builder2.setTestDeviceIds(CollectionsKt.listOf(AdRequest.DEVICE_ID_EMULATOR));
        }
        MobileAds.setRequestConfiguration(builder2.build());
        builder.addNetworkExtrasBundle(AppodealCustomEvent.class, bundleAsBundle);
        AdRequest adRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(adRequestBuild, "build(...)");
        return adRequestBuild;
    }

    @NotNull
    public final AdRequest invoke(@NotNull AdAuctionParams adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        return getDspAdRequest(adParams);
    }
}
