package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f75073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f75074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f75075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f75076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f75077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f75078g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f75072a = str;
        this.f75073b = billingClient;
        this.f75074c = utilsProvider;
        this.f75075d = hVar;
        this.f75076e = list;
        this.f75077f = dVar;
        this.f75078g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f75074c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
