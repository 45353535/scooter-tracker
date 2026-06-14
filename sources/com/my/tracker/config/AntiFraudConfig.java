package com.my.tracker.config;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.m1;

/* JADX INFO: loaded from: classes11.dex */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f61231a = m1.f61679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f61232b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f61233c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f61234d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f61235e = m1.f61680b;

        Builder() {
        }

        @NonNull
        @AnyThread
        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.f61231a, this.f61232b, this.f61233c, this.f61234d, this.f61235e);
        }

        @NonNull
        @AnyThread
        public Builder useGyroscopeSensor(boolean z10) {
            this.f61233c = z10;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useLightSensor(boolean z10) {
            this.f61231a = z10;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useMagneticFieldSensor(boolean z10) {
            this.f61232b = z10;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder usePressureSensor(boolean z10) {
            this.f61234d = z10;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useProximitySensor(boolean z10) {
            this.f61235e = z10;
            return this;
        }
    }

    AntiFraudConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.useLightSensor = z10;
        this.useMagneticFieldSensor = z11;
        this.useGyroscope = z12;
        this.usePressureSensor = z13;
        this.useProximitySensor = z14;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
