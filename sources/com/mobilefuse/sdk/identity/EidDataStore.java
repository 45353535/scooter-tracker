package com.mobilefuse.sdk.identity;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidDataStore;", "", "loadEidOverrides", "", "", "loadSdkEids", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "storeEidOverrides", "", "eids", "storeSdkEids", "eidData", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public interface EidDataStore {
    @NotNull
    Map<String, String> loadEidOverrides();

    @NotNull
    EidSdkData loadSdkEids();

    void storeEidOverrides(@NotNull Map<String, String> eids);

    void storeSdkEids(@NotNull EidSdkData eidData);
}
