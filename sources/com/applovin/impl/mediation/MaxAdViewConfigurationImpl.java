package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxAdViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f9360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9362c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f9363a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9364b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9365c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f9363a;
        }

        public int getAdaptiveWidth() {
            return this.f9364b;
        }

        public int getInlineMaximumHeight() {
            return this.f9365c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f9363a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i10 + ")");
            this.f9364b = i10;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i10 + ")");
            this.f9365c = i10;
            return this;
        }

        @NonNull
        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f9363a + ", adaptiveWidth=" + this.f9364b + ", inlineMaximumHeight=" + this.f9365c + "}";
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f9360a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f9361b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f9362c;
    }

    @NonNull
    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f9360a + ", adaptiveWidth=" + this.f9361b + ", inlineMaximumHeight=" + this.f9362c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f9360a = builderImpl.f9363a;
        this.f9361b = builderImpl.f9364b;
        this.f9362c = builderImpl.f9365c;
    }
}
