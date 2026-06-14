package com.mobilefuse.sdk.service;

import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/mobilefuse/sdk/service/ServicesInitResult;", "", "servicesResultMap", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "", "(Ljava/util/Map;)V", "getServicesResultMap", "()Ljava/util/Map;", "component1", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class ServicesInitResult {

    @NotNull
    private final Map<MobileFuseService, Boolean> servicesResultMap;

    public ServicesInitResult(@NotNull Map<MobileFuseService, Boolean> servicesResultMap) {
        Intrinsics.checkNotNullParameter(servicesResultMap, "servicesResultMap");
        this.servicesResultMap = servicesResultMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesInitResult copy$default(ServicesInitResult servicesInitResult, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = servicesInitResult.servicesResultMap;
        }
        return servicesInitResult.copy(map);
    }

    @NotNull
    public final Map<MobileFuseService, Boolean> component1() {
        return this.servicesResultMap;
    }

    @NotNull
    public final ServicesInitResult copy(@NotNull Map<MobileFuseService, Boolean> servicesResultMap) {
        Intrinsics.checkNotNullParameter(servicesResultMap, "servicesResultMap");
        return new ServicesInitResult(servicesResultMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ServicesInitResult) && Intrinsics.areEqual(this.servicesResultMap, ((ServicesInitResult) other).servicesResultMap);
        }
        return true;
    }

    @NotNull
    public final Map<MobileFuseService, Boolean> getServicesResultMap() {
        return this.servicesResultMap;
    }

    public int hashCode() {
        Map<MobileFuseService, Boolean> map = this.servicesResultMap;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ServicesInitResult(servicesResultMap=" + this.servicesResultMap + ")";
    }
}
