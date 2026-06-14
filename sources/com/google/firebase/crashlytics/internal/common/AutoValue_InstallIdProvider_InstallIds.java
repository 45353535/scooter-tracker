package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31977c;

    AutoValue_InstallIdProvider_InstallIds(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f31975a = str;
        this.f31976b = str2;
        this.f31977c = str3;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallIdProvider.InstallIds) {
            InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
            if (this.f31975a.equals(installIds.getCrashlyticsInstallId()) && ((str = this.f31976b) != null ? str.equals(installIds.getFirebaseInstallationId()) : installIds.getFirebaseInstallationId() == null) && ((str2 = this.f31977c) != null ? str2.equals(installIds.getFirebaseAuthenticationToken()) : installIds.getFirebaseAuthenticationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @NonNull
    public String getCrashlyticsInstallId() {
        return this.f31975a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public String getFirebaseAuthenticationToken() {
        return this.f31977c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f31976b;
    }

    public int hashCode() {
        int iHashCode = (this.f31975a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31976b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f31977c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f31975a + ", firebaseInstallationId=" + this.f31976b + ", firebaseAuthenticationToken=" + this.f31977c + "}";
    }
}
