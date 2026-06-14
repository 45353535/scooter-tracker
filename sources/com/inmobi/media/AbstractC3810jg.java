package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3810jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gi f38820a;

    static {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        f38820a = new Gi(((double) 1) - ((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (Intrinsics.areEqual(eventType, "PingDBMaxLimitReached")) {
            Wj wj = Wj.f37959a;
            Wj.b(eventType, keyValueMap, EnumC3585ak.f38215a);
            return;
        }
        if (f38820a.a()) {
            double d10 = 1;
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            C3774i4 c3774i42 = Y3.f38021a;
            double pingSamplingFactor = d10 - ((TelemetryConfig) c3774i42.a(TelemetryConfig.class)).getPingSamplingFactor();
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d10 - ((TelemetryConfig) c3774i42.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * ((double) 100))));
            Wj wj2 = Wj.f37959a;
            Wj.b(eventType, keyValueMap, EnumC3585ak.f38215a);
        }
    }
}
