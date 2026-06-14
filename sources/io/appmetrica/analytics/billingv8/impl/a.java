package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f75110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75111b;

    public a(b bVar, BillingResult billingResult) {
        this.f75110a = bVar;
        this.f75111b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f75110a;
        BillingResult billingResult = this.f75111b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f75116e.onUpdateFinished();
            return;
        }
        if (!bVar.f75113b.isReady()) {
            bVar.f75116e.onUpdateFinished();
            return;
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"inapp", "subs"})) {
            BillingConfig billingConfig = bVar.f75112a;
            BillingClient billingClient = bVar.f75113b;
            UtilsProvider utilsProvider = bVar.f75114c;
            d dVar = bVar.f75115d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f75116e);
            dVar.f75121b.add(iVar);
            bVar.f75113b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
