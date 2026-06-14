package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f75138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f75139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f75140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f75142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f75143f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f75138a = billingConfig;
        this.f75139b = billingClient;
        this.f75140c = utilsProvider;
        this.f75141d = str;
        this.f75142e = dVar;
        this.f75143f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f75140c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
