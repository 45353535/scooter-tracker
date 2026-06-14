package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1gSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.3", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> AFAdRevenueData() {
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.getMediationNetwork.getPlugin().getPluginName()), TuplesKt.to("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            mapMutableMapOf.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, this.getMediationNetwork.getAdditionalParams());
        }
        return mapMutableMapOf;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getMediationNetwork(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMediationNetwork = pluginInfo;
    }
}
