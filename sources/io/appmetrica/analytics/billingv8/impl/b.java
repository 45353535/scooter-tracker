package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f75112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f75113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f75114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f75115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f75116e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f75112a = billingConfig;
        this.f75113b = billingClient;
        this.f75114c = billingLibraryMonitor$updateBilling$1;
        this.f75115d = dVar;
        this.f75116e = nVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f75114c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
