package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f75094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f75095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f75097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f75098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f75099f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.f75094a = utilsProvider;
        this.f75095b = function0;
        this.f75096c = list;
        this.f75097d = list2;
        this.f75098e = dVar;
        this.f75099f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f75094a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
