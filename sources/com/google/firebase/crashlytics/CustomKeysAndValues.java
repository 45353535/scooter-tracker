package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CustomKeysAndValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f31938a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f31939a = new HashMap();

        @NonNull
        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z10) {
            this.f31939a.put(str, Boolean.toString(z10));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d10) {
            this.f31939a.put(str, Double.toString(d10));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f10) {
            this.f31939a.put(str, Float.toString(f10));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i10) {
            this.f31939a.put(str, Integer.toString(i10));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j10) {
            this.f31939a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @NonNull String str2) {
            this.f31939a.put(str, str2);
            return this;
        }
    }

    CustomKeysAndValues(Builder builder) {
        this.f31938a = builder.f31939a;
    }
}
