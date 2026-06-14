package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ConsentDebugSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28795b;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f28797b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28799d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f28796a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28798c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f28797b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f28796a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzdb.zza(true) && !this.f28796a.contains(zzct.zza(this.f28797b)) && !this.f28799d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f28798c = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f28799d = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.f28794a = z10;
        this.f28795b = builder.f28798c;
    }

    public int getDebugGeography() {
        return this.f28795b;
    }

    public boolean isTestDevice() {
        return this.f28794a;
    }
}
