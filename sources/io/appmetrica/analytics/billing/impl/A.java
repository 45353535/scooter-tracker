package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74955b;

    public A(int i10, int i11) {
        this.f74954a = i10;
        this.f74955b = i11;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f74954a + ", firstCollectingInappMaxAgeSeconds=" + this.f74955b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
