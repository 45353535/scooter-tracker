package com.inmobi.media;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f36866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f36867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36868c;

    public Fi(Yj telemetryConfigMetaData, double d10, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f36866a = telemetryConfigMetaData;
        this.f36867b = d10;
        this.f36868c = samplingEvents;
        Intrinsics.checkNotNullExpressionValue(Fi.class.getSimpleName(), "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Yj yj = this.f36866a;
        if (yj.f38068e && !yj.f38069f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !Intrinsics.areEqual(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (Intrinsics.areEqual("image", keyValueMap.get("assetType")) && !this.f36866a.f38065b) {
            Wj wj = Wj.f37959a;
            return false;
        }
        if (Intrinsics.areEqual("gif", keyValueMap.get("assetType")) && !this.f36866a.f38066c) {
            Wj wj2 = Wj.f37959a;
            return false;
        }
        if (!Intrinsics.areEqual("video", keyValueMap.get("assetType")) || this.f36866a.f38067d) {
            return true;
        }
        Wj wj3 = Wj.f37959a;
        return false;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (!this.f36868c.contains(eventType)) {
            return 1;
        }
        if (this.f36867b < this.f36866a.f38070g) {
            Wj wj = Wj.f37959a;
            return 2;
        }
        Wj wj2 = Wj.f37959a;
        return 0;
    }
}
