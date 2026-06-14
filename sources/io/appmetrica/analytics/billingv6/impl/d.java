package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f75067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f75068b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f75067a = billingClient;
    }

    public final void a(Object obj) {
        this.f75068b.remove(obj);
        if (this.f75068b.size() == 0) {
            this.f75067a.endConnection();
        }
    }
}
