package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f75126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f75127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f75128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f75129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f75130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f75131g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f75125a = str;
        this.f75126b = billingClient;
        this.f75127c = utilsProvider;
        this.f75128d = hVar;
        this.f75129e = list;
        this.f75130f = dVar;
        this.f75131g = nVar;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f75127c.getWorkerExecutor().execute(new e(this, billingResult, queryProductDetailsResult));
    }
}
