package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes9.dex */
public interface InstallIdProvider {

    @AutoValue
    public static abstract class InstallIds {
        static InstallIds a(String str, FirebaseInstallationId firebaseInstallationId) {
            return new AutoValue_InstallIdProvider_InstallIds(str, firebaseInstallationId.getFid(), firebaseInstallationId.getAuthToken());
        }

        public static InstallIds createWithoutFid(String str) {
            return new AutoValue_InstallIdProvider_InstallIds(str, null, null);
        }

        @NonNull
        public abstract String getCrashlyticsInstallId();

        @Nullable
        public abstract String getFirebaseAuthenticationToken();

        @Nullable
        public abstract String getFirebaseInstallationId();
    }

    InstallIds getInstallIds();
}
