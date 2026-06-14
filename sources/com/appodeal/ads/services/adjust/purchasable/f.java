package com.appodeal.ads.services.adjust.purchasable;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.adjust.sdk.purchase.AdjustPurchase;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult;
import com.appodeal.ads.modules.common.internal.service.Purchasable;
import com.appodeal.ads.service.ServiceError;
import com.appodeal.ads.services.adjust.j;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Purchasable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14557a = i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.purchasable.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.e();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f14558b = b.f14553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f14559c = new Function0() { // from class: com.appodeal.ads.services.adjust.purchasable.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.c();
        }
    };

    public static final Map c() {
        return MapsKt.emptyMap();
    }

    public static final ParsePriceUseCase e() {
        return new ParsePriceUseCase();
    }

    public final InAppPurchaseValidationResult a(InAppPurchase inAppPurchase) {
        String currency = inAppPurchase.getCurrency();
        Double dInvoke = ((ParsePriceUseCase) this.f14557a.getValue()).invoke(inAppPurchase.getPrice(), currency);
        if (dInvoke == null) {
            return new InAppPurchaseValidationResult.Failure(ServiceError.Adjust.SubscriptionTrackError.INSTANCE);
        }
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = new AdjustPlayStoreSubscription((long) dInvoke.doubleValue(), currency, inAppPurchase.getCom.applovin.sdk.AppLovinEventParameters.PRODUCT_IDENTIFIER java.lang.String(), inAppPurchase.getOrderId(), inAppPurchase.getSignature(), inAppPurchase.getPurchaseToken());
        adjustPlayStoreSubscription.setPurchaseTime(inAppPurchase.getPurchaseTimestamp());
        for (Map.Entry entry : MapsKt.plus(inAppPurchase.getAdditionalParameters(), (Map) this.f14559c.invoke()).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            adjustPlayStoreSubscription.addPartnerParameter(str, str2);
            adjustPlayStoreSubscription.addCallbackParameter(str, str2);
        }
        Adjust.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        LogExtKt.logInternal$default("AdjustService", "Appodeal invoked validatePurchase with " + inAppPurchase, null, 4, null);
        return new InAppPurchaseValidationResult.Success("trackSubscription");
    }

    public final Object b(InAppPurchase inAppPurchase, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        AdjustPurchase.verifyPurchase(inAppPurchase.getCom.applovin.sdk.AppLovinEventParameters.PRODUCT_IDENTIFIER java.lang.String(), inAppPurchase.getPurchaseToken(), inAppPurchase.getDeveloperPayload(), new c(eVar, this, inAppPurchase));
        LogExtKt.logInternal$default("AdjustService", "Appodeal invoked validatePurchase with " + inAppPurchase, null, 4, null);
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    public final void d(j getEventToken, Function0 getPartnerParams) {
        Intrinsics.checkNotNullParameter(getEventToken, "getEventToken");
        Intrinsics.checkNotNullParameter(getPartnerParams, "getPartnerParams");
        this.f14558b = getEventToken;
        this.f14559c = getPartnerParams;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Purchasable
    public final Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation) {
        int i10 = a.f14551a[inAppPurchase.getType().ordinal()];
        if (i10 == 1) {
            return b(inAppPurchase, continuation);
        }
        if (i10 == 2) {
            return a(inAppPurchase);
        }
        throw new m();
    }
}
