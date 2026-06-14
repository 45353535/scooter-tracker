package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3881mc {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.C3906nc a(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3881mc.a(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$MediationConfig, java.lang.String, java.lang.String, java.lang.String):com.inmobi.media.nc");
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt("default", 0);
    }
}
