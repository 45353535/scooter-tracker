package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CustomSignals {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f32950a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f32951a = new HashMap();

        @NonNull
        public CustomSignals build() {
            return new CustomSignals(this);
        }

        @NonNull
        public Builder put(@NonNull String str, @Nullable String str2) {
            this.f32951a.put(str, str2);
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, long j10) {
            this.f32951a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, double d10) {
            this.f32951a.put(str, Double.toString(d10));
            return this;
        }
    }

    CustomSignals(Builder builder) {
        this.f32950a = builder.f32951a;
    }
}
