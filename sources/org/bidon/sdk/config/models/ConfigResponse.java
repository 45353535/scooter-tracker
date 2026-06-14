package org.bidon.sdk.config.models;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lorg/bidon/sdk/config/models/ConfigResponse;", "", "initializationTimeout", "", "adapters", "", "", "Lorg/json/JSONObject;", "<init>", "(JLjava/util/Map;)V", "getInitializationTimeout", "()J", "getAdapters", "()Ljava/util/Map;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConfigResponse {

    @NotNull
    private final Map<String, JSONObject> adapters;
    private final long initializationTimeout;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigResponse(long j10, @NotNull Map<String, ? extends JSONObject> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.initializationTimeout = j10;
        this.adapters = adapters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = configResponse.initializationTimeout;
        }
        if ((i10 & 2) != 0) {
            map = configResponse.adapters;
        }
        return configResponse.copy(j10, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInitializationTimeout() {
        return this.initializationTimeout;
    }

    @NotNull
    public final Map<String, JSONObject> component2() {
        return this.adapters;
    }

    @NotNull
    public final ConfigResponse copy(long initializationTimeout, @NotNull Map<String, ? extends JSONObject> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        return new ConfigResponse(initializationTimeout, adapters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigResponse)) {
            return false;
        }
        ConfigResponse configResponse = (ConfigResponse) other;
        return this.initializationTimeout == configResponse.initializationTimeout && Intrinsics.areEqual(this.adapters, configResponse.adapters);
    }

    @NotNull
    public final Map<String, JSONObject> getAdapters() {
        return this.adapters;
    }

    public final long getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public int hashCode() {
        return (b.a(this.initializationTimeout) * 31) + this.adapters.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigResponse(initializationTimeout=" + this.initializationTimeout + ", adapters=" + this.adapters + ")";
    }
}
