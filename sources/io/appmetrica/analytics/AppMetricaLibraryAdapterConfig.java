package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaLibraryAdapterConfig {

    @Nullable
    public final Boolean advIdentifiersTracking;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f74884a;

        @NonNull
        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f74884a = Boolean.valueOf(z10);
            return this;
        }
    }

    /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    @NonNull
    public String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + '}';
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.f74884a;
    }
}
