package com.yandex.mobile.ads.common;

import com.ironsource.C4574uf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/mobile/ads/common/AdapterIdentity;", "", "", "adapterNetworkName", C4574uf.f45563b, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAdapterNetworkName", "b", "getAdapterVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AdapterIdentity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adapterNetworkName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adapterVersion;

    public AdapterIdentity(@NotNull String str, @NotNull String str2) {
        this.adapterNetworkName = str;
        this.adapterVersion = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdapterIdentity)) {
            return false;
        }
        AdapterIdentity adapterIdentity = (AdapterIdentity) other;
        return Intrinsics.areEqual(this.adapterNetworkName, adapterIdentity.adapterNetworkName) && Intrinsics.areEqual(this.adapterVersion, adapterIdentity.adapterVersion);
    }

    public int hashCode() {
        return this.adapterVersion.hashCode() + (this.adapterNetworkName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AdapterIdentity(adapterNetworkName=" + this.adapterNetworkName + ", adapterVersion=" + this.adapterVersion + ")";
    }
}
