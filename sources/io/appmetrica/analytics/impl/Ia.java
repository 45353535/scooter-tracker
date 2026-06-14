package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes12.dex */
public interface Ia {
    C5238l4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC4961ab interfaceC4961ab);

    Handler b();

    C4978b2 c();

    C5394rb d();

    ICommonExecutor getDefaultExecutor();
}
