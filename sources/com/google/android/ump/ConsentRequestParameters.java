package com.google.android.ump;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes9.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConsentDebugSettings f28803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28804d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConsentDebugSettings f28807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f28808d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f28806b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f28807c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f28808d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f28805a = z10;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f28801a = builder.f28805a;
        this.f28802b = builder.f28806b;
        this.f28803c = builder.f28807c;
        this.f28804d = builder.f28808d;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f28803c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.f28804d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f28801a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f28802b;
    }
}
