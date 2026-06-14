package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32971b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32972a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32973b = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        @NonNull
        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.f32972a;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.f32973b;
        }

        @NonNull
        public Builder setFetchTimeoutInSeconds(long j10) throws IllegalArgumentException {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f32972a = j10;
            return this;
        }

        @NonNull
        public Builder setMinimumFetchIntervalInSeconds(long j10) {
            if (j10 >= 0) {
                this.f32973b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.f32970a;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f32971b;
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.f32970a = builder.f32972a;
        this.f32971b = builder.f32973b;
    }
}
