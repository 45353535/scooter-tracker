package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@NotNull BillingInfo billingInfo) {
        c cVar = new c();
        int i10 = h.f74973a[billingInfo.type.ordinal()];
        cVar.f74962a = i10 != 1 ? i10 != 2 ? 1 : 3 : 2;
        cVar.f74963b = billingInfo.productId;
        cVar.f74964c = billingInfo.purchaseToken;
        cVar.f74965d = billingInfo.purchaseTime;
        cVar.f74966e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(@NotNull c cVar) {
        ProductType productType;
        int i10 = cVar.f74962a;
        if (i10 == 2) {
            productType = ProductType.INAPP;
        } else if (i10 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f74963b, cVar.f74964c, cVar.f74965d, cVar.f74966e);
    }
}
