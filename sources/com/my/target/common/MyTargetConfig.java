package com.my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTargetConfig {
    public final boolean isTrackingEnvironmentEnabled;
    public final boolean isTrackingLocationEnabled;

    @Nullable
    public final String[] testDevices;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59420a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f59421b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f59422c;

        @NonNull
        public MyTargetConfig build() {
            return new MyTargetConfig(this.f59420a, this.f59421b, this.f59422c);
        }

        @NonNull
        public Builder from(@NonNull MyTargetConfig myTargetConfig) {
            this.f59421b = myTargetConfig.isTrackingLocationEnabled;
            this.f59420a = myTargetConfig.isTrackingEnvironmentEnabled;
            this.f59422c = myTargetConfig.testDevices;
            return this;
        }

        @NonNull
        public Builder withTestDevices(@Nullable String... strArr) {
            this.f59422c = strArr;
            return this;
        }

        @NonNull
        public Builder withTrackingEnvironment(boolean z10) {
            this.f59420a = z10;
            return this;
        }

        @NonNull
        public Builder withTrackingLocation(boolean z10) {
            this.f59421b = z10;
            return this;
        }
    }

    public MyTargetConfig(boolean z10, boolean z11, String[] strArr) {
        this.isTrackingEnvironmentEnabled = z10;
        this.isTrackingLocationEnabled = z11;
        this.testDevices = strArr;
    }
}
