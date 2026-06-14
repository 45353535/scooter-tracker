package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T9 f36582a;

    public Ak(T9 mConfigIncludeIdMaskMap) {
        Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.f36582a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C4044t1 c4044t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.f36582a.a() && (c4044t1 = AbstractC4213zk.f40073a) != null && (str = c4044t1.f39572b) != null) {
                Intrinsics.checkNotNull(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(Ak.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
