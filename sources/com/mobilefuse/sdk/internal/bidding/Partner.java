package com.mobilefuse.sdk.internal.bidding;

import com.mobilefuse.sdk.MobileFuseTargetingData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/internal/bidding/Partner;", "", "vendorName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVendorName", "()Ljava/lang/String;", "NIMBUS", "LIVERAMP", "NEUSTAR", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum Partner {
    NIMBUS("nimbus"),
    LIVERAMP(MobileFuseTargetingData.LEGACY_VENDOR_LIVERAMP),
    NEUSTAR(MobileFuseTargetingData.LEGACY_VENDOR_FABRICK);


    @NotNull
    private final String vendorName;

    Partner(String str) {
        this.vendorName = str;
    }

    @NotNull
    public final String getVendorName() {
        return this.vendorName;
    }
}
