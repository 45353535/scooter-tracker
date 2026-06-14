package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f75120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f75121b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f75120a = billingClient;
    }

    public final void a(Object obj) {
        this.f75121b.remove(obj);
        if (this.f75121b.size() == 0) {
            this.f75120a.endConnection();
        }
    }
}
