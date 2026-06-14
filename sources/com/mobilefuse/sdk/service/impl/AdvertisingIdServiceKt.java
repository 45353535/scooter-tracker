package com.mobilefuse.sdk.service.impl;

import android.content.ContentResolver;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.service.impl.ifa.IfaDetails;
import com.mobilefuse.sdk.service.impl.ifa.IfaSource;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"amazonIfaFactory", "Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "Lcom/mobilefuse/sdk/service/impl/AdvertisingIdService;", "googleIfaFactory", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class AdvertisingIdServiceKt {
    @NotNull
    public static final IfaDetails amazonIfaFactory(@NotNull AdvertisingIdService amazonIfaFactory) {
        Intrinsics.checkNotNullParameter(amazonIfaFactory, "$this$amazonIfaFactory");
        ContentResolver contentResolver = AppLifecycleHelper.getGlobalContext().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "AppLifecycleHelper.globalContext.contentResolver");
        return new IfaDetails(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0, IfaSource.AMAZON);
    }

    @NotNull
    public static final IfaDetails googleIfaFactory(@NotNull AdvertisingIdService googleIfaFactory) throws Throwable {
        Intrinsics.checkNotNullParameter(googleIfaFactory, "$this$googleIfaFactory");
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(AppLifecycleHelper.getGlobalContext());
        return new IfaDetails(advertisingIdInfo != null ? advertisingIdInfo.getId() : null, advertisingIdInfo != null ? advertisingIdInfo.isLimitAdTrackingEnabled() : true, IfaSource.GOOGLE);
    }
}
