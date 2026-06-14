package org.bidon.sdk.config.models;

import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/config/models/ConfigRequestBody;", "", "adapters", "", "", "Lorg/bidon/sdk/adapter/AdapterInfo;", "<init>", "(Ljava/util/Map;)V", "getAdapters", "()Ljava/util/Map;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConfigRequestBody {

    @NotNull
    private final Map<String, AdapterInfo> adapters;

    public ConfigRequestBody(@NotNull Map<String, AdapterInfo> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.adapters = adapters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigRequestBody copy$default(ConfigRequestBody configRequestBody, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = configRequestBody.adapters;
        }
        return configRequestBody.copy(map);
    }

    @NotNull
    public final Map<String, AdapterInfo> component1() {
        return this.adapters;
    }

    @NotNull
    public final ConfigRequestBody copy(@NotNull Map<String, AdapterInfo> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        return new ConfigRequestBody(adapters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConfigRequestBody) && Intrinsics.areEqual(this.adapters, ((ConfigRequestBody) other).adapters);
    }

    @NotNull
    public final Map<String, AdapterInfo> getAdapters() {
        return this.adapters;
    }

    public int hashCode() {
        return this.adapters.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigRequestBody(adapters=" + this.adapters + ")";
    }
}
