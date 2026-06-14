package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkConnectionInfo.NetworkType f24266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkConnectionInfo.MobileSubtype f24267b;

    static final class Builder extends NetworkConnectionInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private NetworkConnectionInfo.NetworkType f24268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private NetworkConnectionInfo.MobileSubtype f24269b;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo build() {
            return new AutoValue_NetworkConnectionInfo(this.f24268a, this.f24269b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f24269b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public NetworkConnectionInfo.Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f24268a = networkType;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.f24266a;
            if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f24267b;
                if (mobileSubtype != null ? mobileSubtype.equals(networkConnectionInfo.getMobileSubtype()) : networkConnectionInfo.getMobileSubtype() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.f24267b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.f24266a;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f24266a;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f24267b;
        return iHashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f24266a + ", mobileSubtype=" + this.f24267b + "}";
    }

    private AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f24266a = networkType;
        this.f24267b = mobileSubtype;
    }
}
