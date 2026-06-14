package com.appodeal.ads.adapters.applovin_max.mediation.amazon;

import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdResponse;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f12028a;

    public c(kotlinx.coroutines.e eVar) {
        this.f12028a = eVar;
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        LogExtKt.logInternal$default("AmazonAdLoader", "onFailure = Code: " + adError.getCode() + ". Message: " + adError.getMessage(), null, 4, null);
        kotlinx.coroutines.e eVar = this.f12028a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(TuplesKt.to(ApsConstants.AMAZON_ERROR_RESPONSE, adError)));
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public final void onSuccess(DTBAdResponse dtbAdResponse) {
        Intrinsics.checkNotNullParameter(dtbAdResponse, "dtbAdResponse");
        LogExtKt.logInternal$default("AmazonAdLoader", "onSuccess = " + dtbAdResponse, null, 4, null);
        kotlinx.coroutines.e eVar = this.f12028a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(TuplesKt.to(ApsConstants.AMAZON_SUCCESS_RESPONSE, dtbAdResponse)));
    }
}
