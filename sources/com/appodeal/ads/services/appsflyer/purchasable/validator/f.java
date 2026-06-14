package com.appodeal.ads.services.appsflyer.purchasable.validator;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.model.PartnerParams;
import com.appsflyer.AppsFlyerLib;
import hg.l0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements com.appodeal.ads.services.appsflyer.purchasable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConnectorCallback f14621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f14622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f14623c = l0.a(Boolean.FALSE);

    @Override // com.appodeal.ads.services.appsflyer.purchasable.a
    public final void a(Context context, ConnectorCallback connectorCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
        this.f14622b = context;
        this.f14621a = connectorCallback;
    }

    public final Object b(InAppPurchase inAppPurchase, d dVar) {
        PartnerParams partnerParams;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(dVar), 1);
        eVar.I();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        eVar.v(new b(atomicBoolean, this));
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        c cVar = new c(atomicBoolean, eVar, this);
        Map<String, String> additionalParameters = inAppPurchase.getAdditionalParameters();
        ConnectorCallback connectorCallback = this.f14621a;
        Map<String, String> paramsMap = (connectorCallback == null || (partnerParams = connectorCallback.getPartnerParams()) == null) ? null : partnerParams.getParamsMap();
        if (paramsMap == null) {
            paramsMap = MapsKt.emptyMap();
        }
        Map<String, String> mapPlus = MapsKt.plus(additionalParameters, paramsMap);
        AppsFlyerLib.getInstance().registerValidatorListener(this.f14622b, new a(cVar));
        appsFlyerLib.validateAndLogInAppPurchase(this.f14622b, inAppPurchase.getPublicKey(), inAppPurchase.getSignature(), inAppPurchase.getPurchaseData(), inAppPurchase.getPrice(), inAppPurchase.getCurrency(), mapPlus);
        LogExtKt.logInternal$default("AppsflyerService", "Appodeal invoked validatePurchase with " + inAppPurchase, null, 4, null);
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(dVar);
        }
        return objC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.services.appsflyer.purchasable.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object validatePurchase(com.appodeal.ads.inapp.InAppPurchase r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.services.appsflyer.purchasable.validator.d
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.ads.services.appsflyer.purchasable.validator.d r0 = (com.appodeal.ads.services.appsflyer.purchasable.validator.d) r0
            int r1 = r0.f14619v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14619v = r1
            goto L18
        L13:
            com.appodeal.ads.services.appsflyer.purchasable.validator.d r0 = new com.appodeal.ads.services.appsflyer.purchasable.validator.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f14617t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14619v
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.appodeal.ads.inapp.InAppPurchase r7 = r0.f14616s
            com.appodeal.ads.services.appsflyer.purchasable.validator.f r2 = r0.f14615r
            kotlin.d.b(r8)
            goto L55
        L3d:
            kotlin.d.b(r8)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.f14623c
            com.appodeal.ads.services.appsflyer.purchasable.validator.e r2 = new com.appodeal.ads.services.appsflyer.purchasable.validator.e
            r2.<init>(r4)
            r0.f14615r = r6
            r0.f14616s = r7
            r0.f14619v = r5
            java.lang.Object r8 = hg.i.y(r8, r2, r0)
            if (r8 != r1) goto L54
            goto L6a
        L54:
            r2 = r6
        L55:
            kotlinx.coroutines.flow.MutableStateFlow r8 = r2.f14623c
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            r8.setValue(r5)
            r0.f14615r = r4
            r0.f14616s = r4
            r0.f14619v = r3
            java.lang.Object r7 = r2.b(r7, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.appsflyer.purchasable.validator.f.validatePurchase(com.appodeal.ads.inapp.InAppPurchase, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
