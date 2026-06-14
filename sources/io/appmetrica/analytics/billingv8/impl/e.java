package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f75122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f75124c;

    public e(f fVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f75122a = fVar;
        this.f75123b = billingResult;
        this.f75124c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f75122a;
        BillingResult billingResult = this.f75123b;
        List<ProductDetails> productDetailsList = this.f75124c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.f75131g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f75127c;
            Function0 function0 = fVar.f75128d;
            List list = fVar.f75129e;
            d dVar = fVar.f75130f;
            k kVar = new k(utilsProvider, function0, list, productDetailsList, dVar, fVar.f75131g);
            dVar.f75121b.add(kVar);
            if (fVar.f75126b.isReady()) {
                fVar.f75126b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f75125a).build(), kVar);
            } else {
                fVar.f75130f.a(kVar);
                fVar.f75131g.onUpdateFinished();
            }
        }
        f fVar2 = this.f75122a;
        fVar2.f75130f.a(fVar2);
    }
}
