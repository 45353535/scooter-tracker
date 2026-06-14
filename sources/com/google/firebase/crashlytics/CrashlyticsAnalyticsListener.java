package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnalyticsEventReceiver f31933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnalyticsEventReceiver f31934b;

    CrashlyticsAnalyticsListener() {
    }

    private static void a(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    private void b(String str, Bundle bundle) {
        a("clx".equals(bundle.getString("_o")) ? this.f31933a : this.f31934b, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i10, @Nullable Bundle bundle) {
        String string;
        Logger.getLogger().v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        b(string, bundle2);
    }

    public void setBreadcrumbEventReceiver(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f31934b = analyticsEventReceiver;
    }

    public void setCrashlyticsOriginEventReceiver(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f31933a = analyticsEventReceiver;
    }
}
