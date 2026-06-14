package com.moloco.sdk.internal.services.config;

import com.moloco.sdk.ConfigsOuterClass$Configs;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55513a = "RemoteConfigService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f55514b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f55515c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f55516d = CollectionsKt.listOf(new com.moloco.sdk.internal.services.config.handlers.b());

    @Override // com.moloco.sdk.internal.services.config.a
    public void a(Init$SDKInitResponse sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        c(sdkInitResponse);
        d(sdkInitResponse);
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public String b(String featureFlagName) {
        Intrinsics.checkNotNullParameter(featureFlagName, "featureFlagName");
        return (String) this.f55515c.get(featureFlagName);
    }

    public final void c(Init$SDKInitResponse init$SDKInitResponse) {
        for (com.moloco.sdk.internal.services.config.handlers.a aVar : this.f55516d) {
            this.f55514b.put(aVar.a().getName(), aVar.a(init$SDKInitResponse));
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f55513a, "Adding config: " + aVar.a().getName(), null, false, 12, null);
        }
        this.f55514b.put(o.class.getName(), e(init$SDKInitResponse));
    }

    public final void d(Init$SDKInitResponse init$SDKInitResponse) {
        List<Init$SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = init$SDKInitResponse.getExperimentalFeatureFlagsList();
        Intrinsics.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        for (Init$SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag : experimentalFeatureFlagsList) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f55513a, "Adding ExperimentalFeatureFlag: " + experimentalFeatureFlag.getName(), null, false, 12, null);
            Map map = this.f55515c;
            String name = experimentalFeatureFlag.getName();
            String value = experimentalFeatureFlag.getValue();
            map.put(name, (value == null || value.length() == 0) ? null : experimentalFeatureFlag.getValue());
        }
    }

    public final o e(Init$SDKInitResponse init$SDKInitResponse) {
        o oVar;
        List<Init$SDKInitResponse.ExperimentalFeatureFlag> experimentalFeatureFlagsList = init$SDKInitResponse.getExperimentalFeatureFlagsList();
        Intrinsics.checkNotNullExpressionValue(experimentalFeatureFlagsList, "getExperimentalFeatureFlagsList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experimentalFeatureFlagsList, 10));
        Iterator<T> it = experimentalFeatureFlagsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Init$SDKInitResponse.ExperimentalFeatureFlag) it.next()).getName());
        }
        boolean zContains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, this.f55513a, "Adding StreamingEnabled: " + zContains, null, false, 12, null);
        if (init$SDKInitResponse.hasConfigs() && init$SDKInitResponse.getConfigs().hasCommonConfigs() && init$SDKInitResponse.getConfigs().getCommonConfigs().hasMediaConfig()) {
            ConfigsOuterClass$Configs.CommonConfigs.MediaConfig mediaConfig = init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig();
            oVar = new o(((int) init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getStreamingChunkSizeKilobytes()) > 0 ? ((int) mediaConfig.getStreamingChunkSizeKilobytes()) * 1024 : p.a().a(), zContains, init$SDKInitResponse.getConfigs().getCommonConfigs().getMediaConfig().getMinStreamingPlayableDurationOnTimeoutSecs() > 0.0d ? mediaConfig.getMinStreamingPlayableDurationOnTimeoutSecs() : p.a().c(), p.a().b());
        } else {
            oVar = new o(p.a().a(), zContains, p.a().c(), p.a().b());
        }
        MolocoLogger.debug$default(molocoLogger, this.f55513a, "Parsed and adding MediaConfig: " + oVar.a() + ", " + oVar.d() + ", " + oVar.c() + ", " + oVar.b() + ' ', false, 4, null);
        return oVar;
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public Object b(Class configType, Object obj) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f55513a, "Retrieving config: " + configType, false, 4, null);
        Object obj2 = this.f55514b.get(configType.getName());
        return obj2 == null ? obj : obj2;
    }

    @Override // com.moloco.sdk.internal.services.config.a
    public boolean a(String featureFlagName) {
        Intrinsics.checkNotNullParameter(featureFlagName, "featureFlagName");
        return this.f55515c.containsKey(featureFlagName);
    }
}
