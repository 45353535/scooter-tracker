package com.appodeal.ads.adapters.level_play.mediation.amazon;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DTBAdSize f12419b;

    public a(e eVar, DTBAdSize dTBAdSize) {
        this.f12418a = eVar;
        this.f12419b = dTBAdSize;
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        LogExtKt.logInternal$default("AmazonAdLoader", "onFailure = Code: " + adError.getCode() + ". Message: " + adError.getMessage(), null, 4, null);
        e eVar = this.f12418a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(TuplesKt.to(this.f12419b.getSlotUUID(), adError)));
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public final void onSuccess(DTBAdResponse dtbAdResponse) {
        Intrinsics.checkNotNullParameter(dtbAdResponse, "dtbAdResponse");
        LogExtKt.logInternal$default("AmazonAdLoader", "onSuccess = " + dtbAdResponse, null, 4, null);
        e eVar = this.f12418a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(TuplesKt.to(this.f12419b.getSlotUUID(), dtbAdResponse)));
    }
}
