package com.appodeal.ads.services.appsflyer.purchasable.validator;

import com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult;
import com.appodeal.ads.service.ServiceError;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AppsFlyerInAppPurchaseValidatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f14609a;

    public a(c cVar) {
        this.f14609a = cVar;
    }

    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
    public final void onValidateInApp() {
        c cVar = this.f14609a;
        if (cVar.f14612a.getAndSet(false)) {
            kotlinx.coroutines.e eVar = cVar.f14613b;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(new InAppPurchaseValidationResult.Success("trackInApp")));
        }
        cVar.f14614c.f14623c.setValue(Boolean.FALSE);
    }

    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
    public final void onValidateInAppFailure(String str) {
        c cVar = this.f14609a;
        if (cVar.f14612a.getAndSet(false)) {
            kotlinx.coroutines.e eVar = cVar.f14613b;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(new InAppPurchaseValidationResult.Failure(new ServiceError.Appsflyer.PurchaseValidationError(str))));
        }
        cVar.f14614c.f14623c.setValue(Boolean.FALSE);
    }
}
