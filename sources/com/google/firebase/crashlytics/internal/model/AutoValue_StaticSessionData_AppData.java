package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DevelopmentPlatformProvider f32634f;

    AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i10, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f32629a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f32630b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f32631c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f32632d = str4;
        this.f32633e = i10;
        if (developmentPlatformProvider == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f32634f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.f32629a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.f32633e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f32634f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.AppData) {
            StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
            if (this.f32629a.equals(appData.appIdentifier()) && this.f32630b.equals(appData.versionCode()) && this.f32631c.equals(appData.versionName()) && this.f32632d.equals(appData.installUuid()) && this.f32633e == appData.deliveryMechanism() && this.f32634f.equals(appData.developmentPlatformProvider())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f32629a.hashCode() ^ 1000003) * 1000003) ^ this.f32630b.hashCode()) * 1000003) ^ this.f32631c.hashCode()) * 1000003) ^ this.f32632d.hashCode()) * 1000003) ^ this.f32633e) * 1000003) ^ this.f32634f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.f32632d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f32629a + ", versionCode=" + this.f32630b + ", versionName=" + this.f32631c + ", installUuid=" + this.f32632d + ", deliveryMechanism=" + this.f32633e + ", developmentPlatformProvider=" + this.f32634f + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.f32630b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.f32631c;
    }
}
