package com.unity3d.ads.core.extensions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuiltInMap", "", "", "", "Lorg/json/JSONObject;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONObjectExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> toBuiltInMap(@org.jetbrains.annotations.NotNull org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Iterator r0 = r7.keys()
            java.lang.String r1 = "keys()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.sequences.Sequence r0 = kotlin.sequences.k.h(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r7.opt(r3)
            r4 = 0
            if (r3 == 0) goto L4d
            java.lang.String r5 = "opt(value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "undefined"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L4d
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "null"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            r1.put(r2, r3)
            goto L1b
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(org.json.JSONObject):java.util.Map");
    }
}
