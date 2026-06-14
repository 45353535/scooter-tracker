package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        AppMetricaService.f78669c.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i10, Bundle bundle) {
        AppMetricaService.f78669c.reportData(i10, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        AppMetricaService.f78669c.resumeUserSession(bundle);
    }
}
