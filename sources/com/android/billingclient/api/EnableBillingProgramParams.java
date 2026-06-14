package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@zzl
public final class EnableBillingProgramParams {
    private final int zza;

    @Nullable
    private final DeveloperProvidedBillingListener zzb;

    public static final class Builder {
        private int zza;

        @Nullable
        private DeveloperProvidedBillingListener zzb;

        @NonNull
        public EnableBillingProgramParams build() {
            return new EnableBillingProgramParams(this, null);
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setDeveloperProvidedBillingListener(@Nullable DeveloperProvidedBillingListener developerProvidedBillingListener) {
            this.zzb = developerProvidedBillingListener;
            return this;
        }
    }

    /* synthetic */ EnableBillingProgramParams(Builder builder, zzdk zzdkVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public int getBillingProgram() {
        return this.zza;
    }

    @Nullable
    public DeveloperProvidedBillingListener getDeveloperProvidedBillingListener() {
        return this.zzb;
    }
}
