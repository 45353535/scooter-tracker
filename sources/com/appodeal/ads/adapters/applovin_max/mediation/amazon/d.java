package com.appodeal.ads.adapters.applovin_max.mediation.amazon;

import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdSize;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DTBAdSize f12030s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DTBAdSize dTBAdSize, Continuation continuation) {
        super(2, continuation);
        this.f12030s = dTBAdSize;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f12030s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f12030s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12029r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        DTBAdSize dTBAdSize = this.f12030s;
        this.f12029r = 1;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
        eVar.I();
        LogExtKt.logInternal$default("AmazonAdLoader", "load call for ad type: " + dTBAdSize, null, 4, null);
        DTBAdRequest dTBAdRequest = new DTBAdRequest(new DTBAdNetworkInfo(DTBAdNetwork.MAX));
        dTBAdRequest.setSizes(dTBAdSize);
        dTBAdRequest.loadAd(new c(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
