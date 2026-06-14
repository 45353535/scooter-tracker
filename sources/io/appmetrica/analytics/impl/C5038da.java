package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5038da {
    public static boolean a(JSONObject jSONObject, String str, boolean z10) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null, Boolean.valueOf(z10))).booleanValue();
    }
}
