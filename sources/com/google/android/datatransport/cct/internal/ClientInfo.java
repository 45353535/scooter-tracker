package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes7.dex */
@AutoValue
public abstract class ClientInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ClientInfo build();

        @NonNull
        public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo);

        @NonNull
        public abstract Builder setClientType(@Nullable ClientType clientType);
    }

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24271b;

        ClientType(int i10) {
            this.f24271b = i10;
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    @Nullable
    public abstract AndroidClientInfo getAndroidClientInfo();

    @Nullable
    public abstract ClientType getClientType();
}
