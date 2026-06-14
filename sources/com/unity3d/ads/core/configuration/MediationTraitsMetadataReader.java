package com.unity3d.ads.core.configuration;

import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/MetadataReader;", "Lorg/json/JSONObject;", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "getBooleanTrait", "", C4240b4.i.W, "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getStringTrait", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {

    @NotNull
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";

    @NotNull
    public static final String MEDIATION_TRAITS = "mediation.traits.value";

    @NotNull
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean getBooleanTrait(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r2 = "get(key)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
        L21:
            r0 = r1
        L22:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L39
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L39
            boolean r4 = r0.optBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getBooleanTrait(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getStringTrait(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r2 = "get(key)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
        L21:
            r0 = r1
        L22:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L35
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L35
            java.lang.String r4 = r0.optString(r4)
            return r4
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getStringTrait(java.lang.String):java.lang.String");
    }
}
