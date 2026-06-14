package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String currencyCode;
        z zVar = new z();
        zVar.f75030a = productInfo.quantity;
        zVar.f75035f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        Charset charset = Charsets.UTF_8;
        zVar.f75031b = currencyCode.getBytes(charset);
        zVar.f75032c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f74996a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f74997b = productInfo.signature.getBytes(charset);
        zVar.f75034e = uVar;
        zVar.f75036g = true;
        zVar.f75037h = 1;
        int i10 = n.f74983a[productInfo.type.ordinal()];
        zVar.f75038i = (i10 == 1 || i10 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f75019a = productInfo.purchaseToken.getBytes(charset);
        yVar.f75020b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f75039j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f75012a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f75009a = period.number;
                int i11 = n.f74984b[period.timeUnit.ordinal()];
                wVar.f75010b = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f75013b = wVar;
            }
            v vVar = new v();
            vVar.f74999a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f75009a = period2.number;
                int i12 = n.f74984b[period2.timeUnit.ordinal()];
                wVar2.f75010b = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f75000b = wVar2;
            }
            vVar.f75001c = productInfo.introductoryPriceCycles;
            xVar.f75014c = vVar;
            zVar.f75040k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
