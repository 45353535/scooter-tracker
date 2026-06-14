package com.mobilefuse.sdk.identity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"eidService", "Lcom/mobilefuse/sdk/identity/EidService;", "getEidService", "()Lcom/mobilefuse/sdk/identity/EidService;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class EidServiceKt {

    @NotNull
    private static final EidService eidService = new EidService(null, null, null, null, null, null, null, null, 255, null);

    @NotNull
    public static final EidService getEidService() {
        return eidService;
    }
}
