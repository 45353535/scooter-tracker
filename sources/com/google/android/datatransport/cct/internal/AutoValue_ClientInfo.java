package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClientInfo.ClientType f24217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AndroidClientInfo f24218b;

    static final class Builder extends ClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ClientInfo.ClientType f24219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AndroidClientInfo f24220b;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo build() {
            return new AutoValue_ClientInfo(this.f24219a, this.f24220b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo) {
            this.f24220b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType clientType) {
            this.f24219a = clientType;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.f24217a;
            if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
                AndroidClientInfo androidClientInfo = this.f24218b;
                if (androidClientInfo != null ? androidClientInfo.equals(clientInfo.getAndroidClientInfo()) : clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public AndroidClientInfo getAndroidClientInfo() {
        return this.f24218b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public ClientInfo.ClientType getClientType() {
        return this.f24217a;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f24217a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f24218b;
        return iHashCode ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f24217a + ", androidClientInfo=" + this.f24218b + "}";
    }

    private AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f24217a = clientType;
        this.f24218b = androidClientInfo;
    }
}
