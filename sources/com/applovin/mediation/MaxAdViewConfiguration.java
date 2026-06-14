package com.applovin.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MaxAdViewConfiguration {

    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE("inline");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11669a;

        AdaptiveType(String str) {
            this.f11669a = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f11669a;
        }
    }

    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i10);

        Builder setInlineMaximumHeight(int i10);
    }

    public static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }

    public abstract AdaptiveType getAdaptiveType();

    public abstract int getAdaptiveWidth();

    public abstract int getInlineMaximumHeight();
}
