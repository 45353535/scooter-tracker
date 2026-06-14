package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32646c;

    AutoValue_StaticSessionData_OsData(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f32644a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f32645b = str2;
        this.f32646c = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.OsData) {
            StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
            if (this.f32644a.equals(osData.osRelease()) && this.f32645b.equals(osData.osCodeName()) && this.f32646c == osData.isRooted()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f32644a.hashCode() ^ 1000003) * 1000003) ^ this.f32645b.hashCode()) * 1000003) ^ (this.f32646c ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.f32646c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.f32645b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.f32644a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f32644a + ", osCodeName=" + this.f32645b + ", isRooted=" + this.f32646c + "}";
    }
}
