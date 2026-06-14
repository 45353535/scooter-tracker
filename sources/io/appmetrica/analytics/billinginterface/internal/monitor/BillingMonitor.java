package io.appmetrica.analytics.billinginterface.internal.monitor;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener;

/* JADX INFO: loaded from: classes12.dex */
public interface BillingMonitor extends BillingConfigChangedListener {
    void onSessionResumed() throws Throwable;
}
