package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes9.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31699g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f31701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f31703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f31704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f31705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f31706g;

        public Builder() {
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.f31701b, this.f31700a, this.f31702c, this.f31703d, this.f31704e, this.f31705f, this.f31706g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            this.f31700a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            this.f31701b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.f31702c = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String str) {
            this.f31703d = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.f31704e = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.f31706g = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.f31705f = str;
            return this;
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.f31701b = firebaseOptions.f31694b;
            this.f31700a = firebaseOptions.f31693a;
            this.f31702c = firebaseOptions.f31695c;
            this.f31703d = firebaseOptions.f31696d;
            this.f31704e = firebaseOptions.f31697e;
            this.f31705f = firebaseOptions.f31698f;
            this.f31706g = firebaseOptions.f31699g;
        }
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.equal(this.f31694b, firebaseOptions.f31694b) && Objects.equal(this.f31693a, firebaseOptions.f31693a) && Objects.equal(this.f31695c, firebaseOptions.f31695c) && Objects.equal(this.f31696d, firebaseOptions.f31696d) && Objects.equal(this.f31697e, firebaseOptions.f31697e) && Objects.equal(this.f31698f, firebaseOptions.f31698f) && Objects.equal(this.f31699g, firebaseOptions.f31699g);
    }

    @NonNull
    public String getApiKey() {
        return this.f31693a;
    }

    @NonNull
    public String getApplicationId() {
        return this.f31694b;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.f31695c;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.f31696d;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.f31697e;
    }

    @Nullable
    public String getProjectId() {
        return this.f31699g;
    }

    @Nullable
    public String getStorageBucket() {
        return this.f31698f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f31694b, this.f31693a, this.f31695c, this.f31696d, this.f31697e, this.f31698f, this.f31699g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f31694b).add(DTBMetricsConfiguration.APSMETRICS_APIKEY, this.f31693a).add("databaseUrl", this.f31695c).add("gcmSenderId", this.f31697e).add("storageBucket", this.f31698f).add("projectId", this.f31699g).toString();
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f31694b = str;
        this.f31693a = str2;
        this.f31695c = str3;
        this.f31696d = str4;
        this.f31697e = str5;
        this.f31698f = str6;
        this.f31699g = str7;
    }
}
