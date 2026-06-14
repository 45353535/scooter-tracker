package org.bidon.sdk.adapter;

import com.adjust.sdk.purchase.ADJPConstants;
import com.ironsource.C4574uf;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/adapter/AdapterInfo;", "Lorg/bidon/sdk/utils/serializer/Serializable;", C4574uf.f45563b, "", "sdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdapterVersion", "()Ljava/lang/String;", "getSdkVersion", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdapterInfo implements Serializable {

    @JsonName(key = "version")
    @NotNull
    private final String adapterVersion;

    @JsonName(key = ADJPConstants.KEY_SDK_VERSION)
    @NotNull
    private final String sdkVersion;

    public AdapterInfo(@NotNull String adapterVersion, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.adapterVersion = adapterVersion;
        this.sdkVersion = sdkVersion;
    }

    public static /* synthetic */ AdapterInfo copy$default(AdapterInfo adapterInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adapterInfo.adapterVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = adapterInfo.sdkVersion;
        }
        return adapterInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final AdapterInfo copy(@NotNull String adapterVersion, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new AdapterInfo(adapterVersion, sdkVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdapterInfo)) {
            return false;
        }
        AdapterInfo adapterInfo = (AdapterInfo) other;
        return Intrinsics.areEqual(this.adapterVersion, adapterInfo.adapterVersion) && Intrinsics.areEqual(this.sdkVersion, adapterInfo.sdkVersion);
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return (this.adapterVersion.hashCode() * 31) + this.sdkVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdapterInfo(adapterVersion=" + this.adapterVersion + ", sdkVersion=" + this.sdkVersion + ")";
    }
}
