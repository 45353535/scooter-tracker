package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes12.dex */
public interface Oc {
    void a(Location location);

    void a(String str);

    void a(String str, String str2);

    void a(boolean z10);

    void a(boolean z10, boolean z11);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z10);

    void setUserProfileID(String str);
}
