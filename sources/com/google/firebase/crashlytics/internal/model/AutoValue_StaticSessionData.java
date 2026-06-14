package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StaticSessionData.AppData f32626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StaticSessionData.OsData f32627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StaticSessionData.DeviceData f32628c;

    AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData == null) {
            throw new NullPointerException("Null appData");
        }
        this.f32626a = appData;
        if (osData == null) {
            throw new NullPointerException("Null osData");
        }
        this.f32627b = osData;
        if (deviceData == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f32628c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.f32626a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.f32628c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData) {
            StaticSessionData staticSessionData = (StaticSessionData) obj;
            if (this.f32626a.equals(staticSessionData.appData()) && this.f32627b.equals(staticSessionData.osData()) && this.f32628c.equals(staticSessionData.deviceData())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f32626a.hashCode() ^ 1000003) * 1000003) ^ this.f32627b.hashCode()) * 1000003) ^ this.f32628c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.f32627b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f32626a + ", osData=" + this.f32627b + ", deviceData=" + this.f32628c + "}";
    }
}
