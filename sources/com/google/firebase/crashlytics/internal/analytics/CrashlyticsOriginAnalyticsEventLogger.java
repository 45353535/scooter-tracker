package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AnalyticsConnector f31967a;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull AnalyticsConnector analyticsConnector) {
        this.f31967a = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        this.f31967a.logEvent("clx", str, bundle);
    }
}
