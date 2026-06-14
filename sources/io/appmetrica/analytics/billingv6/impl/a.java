package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f75057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75058b;

    public a(b bVar, BillingResult billingResult) {
        this.f75057a = bVar;
        this.f75058b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f75057a;
        BillingResult billingResult = this.f75058b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f75063e.onUpdateFinished();
            return;
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"inapp", "subs"})) {
            BillingConfig billingConfig = bVar.f75059a;
            BillingClient billingClient = bVar.f75060b;
            UtilsProvider utilsProvider = bVar.f75061c;
            d dVar = bVar.f75062d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f75063e);
            dVar.f75068b.add(iVar);
            if (bVar.f75060b.isReady()) {
                bVar.f75060b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f75062d.a(iVar);
                bVar.f75063e.onUpdateFinished();
            }
        }
    }
}
