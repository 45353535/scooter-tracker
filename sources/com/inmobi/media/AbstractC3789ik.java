package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3789ik {
    public static final Map a(G g10) {
        String creativeType;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(g10.f36898a.f39233a.f37141a)), TuplesKt.to("plType", g10.f36898a.f39233a.f37147g), TuplesKt.to("adType", "native"), TuplesKt.to("markupType", g10.f36900c), TuplesKt.to("creativeId", "\"" + g10.f36902e + "\""), TuplesKt.to("impressionId", "\"" + g10.f36910m.f36818b + "\""), TuplesKt.to("isRewarded", Boolean.valueOf(g10.f36899b.f36691a)));
        MetaInfo metaInfo = g10.f36901d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mapMutableMapOf.put("creativeType", creativeType);
        }
        String str = g10.f36906i;
        if (str != null) {
            mapMutableMapOf.put("metadataBlob", str);
        }
        return mapMutableMapOf;
    }

    public static final Map a(C3945p1 c3945p1) {
        Intrinsics.checkNotNullParameter(c3945p1, "<this>");
        return MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(c3945p1.f39233a.f37141a)), TuplesKt.to("plType", c3945p1.f39233a.f37147g), TuplesKt.to("adType", "native"));
    }
}
