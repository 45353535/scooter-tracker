package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f75069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f75071c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f75069a = fVar;
        this.f75070b = billingResult;
        this.f75071c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f75069a;
        BillingResult billingResult = this.f75070b;
        List list = this.f75071c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f75078g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f75074c;
            Function0 function0 = fVar.f75075d;
            List list2 = fVar.f75076e;
            d dVar = fVar.f75077f;
            k kVar = new k(utilsProvider, function0, list2, list, dVar, fVar.f75078g);
            dVar.f75068b.add(kVar);
            if (fVar.f75073b.isReady()) {
                fVar.f75073b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f75072a).build(), kVar);
            } else {
                fVar.f75077f.a(kVar);
                fVar.f75078g.onUpdateFinished();
            }
        }
        f fVar2 = this.f75069a;
        fVar2.f75077f.a(fVar2);
    }
}
