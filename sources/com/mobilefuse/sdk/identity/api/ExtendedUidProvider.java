package com.mobilefuse.sdk.identity.api;

import com.mobilefuse.sdk.internal.bidding.Partner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/identity/api/ExtendedUidProvider;", "", "vendorPartner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "(Ljava/lang/String;ILcom/mobilefuse/sdk/internal/bidding/Partner;)V", "getVendorPartner", "()Lcom/mobilefuse/sdk/internal/bidding/Partner;", "LIVERAMP", "FABRICK", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum ExtendedUidProvider {
    LIVERAMP(Partner.LIVERAMP),
    FABRICK(Partner.NEUSTAR);


    @NotNull
    private final Partner vendorPartner;

    ExtendedUidProvider(Partner partner) {
        this.vendorPartner = partner;
    }

    @NotNull
    public final Partner getVendorPartner() {
        return this.vendorPartner;
    }
}
