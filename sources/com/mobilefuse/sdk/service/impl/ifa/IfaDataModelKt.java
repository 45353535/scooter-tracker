package com.mobilefuse.sdk.service.impl.ifa;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"IfaDefault", "Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "getIfaDefault", "()Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "IfaError", "getIfaError", "IfaZeros", "getIfaZeros", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class IfaDataModelKt {

    @NotNull
    private static final IfaDetails IfaDefault = new IfaDetails(null, true, null);

    @NotNull
    private static final IfaDetails IfaError = new IfaDetails("", true, null);

    @NotNull
    private static final IfaDetails IfaZeros = new IfaDetails("00000000-0000-0000-0000-000000000000", true, null);

    @NotNull
    public static final IfaDetails getIfaDefault() {
        return IfaDefault;
    }

    @NotNull
    public static final IfaDetails getIfaError() {
        return IfaError;
    }

    @NotNull
    public static final IfaDetails getIfaZeros() {
        return IfaZeros;
    }
}
