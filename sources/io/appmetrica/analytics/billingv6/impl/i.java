package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f75085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f75086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f75087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f75089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f75090f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f75085a = billingConfig;
        this.f75086b = billingClient;
        this.f75087c = utilsProvider;
        this.f75088d = str;
        this.f75089e = dVar;
        this.f75090f = nVar;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f75087c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
