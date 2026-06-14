package com.appodeal.ads.services.adjust.purchasable;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.purchase.ADJPVerificationInfo;
import com.adjust.sdk.purchase.ADJPVerificationState;
import com.adjust.sdk.purchase.OnADJPVerificationFinished;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult;
import com.appodeal.ads.service.ServiceError;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements OnADJPVerificationFinished {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InAppPurchase f14556c;

    public c(kotlinx.coroutines.e eVar, f fVar, InAppPurchase inAppPurchase) {
        this.f14554a = eVar;
        this.f14555b = fVar;
        this.f14556c = inAppPurchase;
    }

    @Override // com.adjust.sdk.purchase.OnADJPVerificationFinished
    public final void onVerificationFinished(ADJPVerificationInfo aDJPVerificationInfo) {
        Object failure;
        kotlinx.coroutines.e eVar = this.f14554a;
        f fVar = this.f14555b;
        InAppPurchase inAppPurchase = this.f14556c;
        ADJPVerificationState verificationState = aDJPVerificationInfo.getVerificationState();
        Intrinsics.checkNotNullExpressionValue(verificationState, "getVerificationState(...)");
        fVar.getClass();
        int i10 = a.f14552b[verificationState.ordinal()];
        if (i10 == 1) {
            String currency = inAppPurchase.getCurrency();
            Double dInvoke = ((ParsePriceUseCase) fVar.f14557a.getValue()).invoke(inAppPurchase.getPrice(), currency);
            if (dInvoke != null) {
                double dDoubleValue = dInvoke.doubleValue();
                AdjustEvent adjustEvent = new AdjustEvent((String) fVar.f14558b.invoke("hs_sdk_purchase"));
                adjustEvent.setRevenue(dDoubleValue, currency);
                for (Map.Entry entry : MapsKt.plus(inAppPurchase.getAdditionalParameters(), (Map) fVar.f14559c.invoke()).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    adjustEvent.addPartnerParameter(str, str2);
                    adjustEvent.addCallbackParameter(str, str2);
                }
                Adjust.trackEvent(adjustEvent);
                failure = new InAppPurchaseValidationResult.Success("trackInApp");
            } else {
                failure = new InAppPurchaseValidationResult.Failure(ServiceError.Adjust.InAppPurchaseTrackError.INSTANCE);
            }
        } else if (i10 == 2) {
            Adjust.trackEvent(new AdjustEvent((String) fVar.f14558b.invoke("hs_sdk_purchase_error")));
            failure = new InAppPurchaseValidationResult.Failure(new ServiceError.Adjust.PurchaseValidationError("Adjust purchase verification state failed"));
        } else if (i10 != 3) {
            Adjust.trackEvent(new AdjustEvent((String) fVar.f14558b.invoke("hs_sdk_purchase_error")));
            failure = new InAppPurchaseValidationResult.Failure(new ServiceError.Adjust.PurchaseValidationError("Adjust purchase not verified"));
        } else {
            Adjust.trackEvent(new AdjustEvent((String) fVar.f14558b.invoke("hs_sdk_purchase_error")));
            failure = new InAppPurchaseValidationResult.Failure(new ServiceError.Adjust.PurchaseValidationError("Adjust purchase verification state unknown"));
        }
        eVar.resumeWith(Result.b(failure));
    }
}
