package com.inmobi.media;

import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static JSONObject f37933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f37934b;

    public static final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullExpressionValue("W6", "TAG");
        JSONObject jSONObject2 = f37933a;
        Objects.toString(jSONObject);
        Objects.toString(jSONObject2);
        if (jSONObject != null) {
            f37933a = jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.json.JSONObject b() {
        /*
            java.lang.String r0 = "W6"
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.content.SharedPreferences r2 = com.inmobi.media.Ri.a()
            r3 = 0
            if (r2 == 0) goto L62
            r4 = -1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "IABTCF_TCString"
            java.lang.String r5 = r2.getString(r5, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.String r6 = "IABTCF_gdprApplies"
            int r6 = r2.getInt(r6, r4)     // Catch: java.lang.Exception -> L20
            goto L21
        L1f:
            r5 = r3
        L20:
            r6 = r4
        L21:
            java.lang.String r7 = "gdpr"
            java.lang.String r8 = "gdpr_consent"
            if (r5 == 0) goto L39
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L39
            r9.<init>()     // Catch: org.json.JSONException -> L39
            r9.put(r8, r5)     // Catch: org.json.JSONException -> L39
            if (r6 == r4) goto L3a
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: org.json.JSONException -> L39
            r9.put(r7, r4)     // Catch: org.json.JSONException -> L39
            goto L3a
        L39:
            r9 = r3
        L3a:
            if (r9 != 0) goto L60
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "IABConsent_ConsentString"
            java.lang.String r0 = r2.getString(r0, r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "IABConsent_SubjectToGDPR"
            java.lang.String r1 = r2.getString(r1, r3)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4c:
            r0 = r3
        L4d:
            r1 = r3
        L4e:
            if (r0 == 0) goto L5f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5f
            r2.<init>()     // Catch: org.json.JSONException -> L5f
            r2.put(r8, r0)     // Catch: org.json.JSONException -> L5f
            if (r1 == 0) goto L5d
            r2.put(r7, r1)     // Catch: org.json.JSONException -> L5f
        L5d:
            r9 = r2
            goto L60
        L5f:
            r9 = r3
        L60:
            if (r9 != 0) goto Lc0
        L62:
            org.json.JSONObject r0 = com.inmobi.media.W6.f37934b
            if (r0 != 0) goto L69
            org.json.JSONObject r9 = com.inmobi.media.W6.f37933a
            goto Lc0
        L69:
            org.json.JSONObject r1 = com.inmobi.media.W6.f37933a
            if (r1 != 0) goto L6f
        L6d:
            r9 = r0
            goto Lc0
        L6f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = com.inmobi.media.W6.f37934b
            if (r1 == 0) goto L7d
            java.util.Iterator r1 = r1.keys()
            goto L7e
        L7d:
            r1 = r3
        L7e:
            if (r1 == 0) goto L9a
        L80:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r4 = com.inmobi.media.W6.f37934b     // Catch: org.json.JSONException -> L80
            if (r4 == 0) goto L95
            java.lang.Object r4 = r4.opt(r2)     // Catch: org.json.JSONException -> L80
            goto L96
        L95:
            r4 = r3
        L96:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L80
            goto L80
        L9a:
            org.json.JSONObject r1 = com.inmobi.media.W6.f37933a
            if (r1 == 0) goto La3
            java.util.Iterator r1 = r1.keys()
            goto La4
        La3:
            r1 = r3
        La4:
            if (r1 == 0) goto L6d
        La6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r4 = com.inmobi.media.W6.f37933a     // Catch: org.json.JSONException -> La6
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r4.opt(r2)     // Catch: org.json.JSONException -> La6
            goto Lbc
        Lbb:
            r4 = r3
        Lbc:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> La6
            goto La6
        Lc0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.W6.b():org.json.JSONObject");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a() {
        /*
            org.json.JSONObject r0 = b()
            r1 = 1
            if (r0 != 0) goto L8
            goto L1e
        L8:
            java.lang.String r2 = "gdpr_consent"
            boolean r2 = r0.has(r2)
            if (r2 != 0) goto L20
            java.lang.String r2 = "gdpr_consent_available"
            boolean r3 = r0.has(r2)
            if (r3 != 0) goto L19
            goto L1e
        L19:
            boolean r0 = r0.getBoolean(r2)     // Catch: org.json.JSONException -> L1e
            goto L21
        L1e:
            r0 = -1
            goto L21
        L20:
            r0 = r1
        L21:
            com.inmobi.media.i4 r2 = com.inmobi.media.Y3.f38021a
            java.lang.String r2 = "clazz"
            java.lang.Class<com.inmobi.media.core.config.models.RootConfig> r3 = com.inmobi.media.core.config.models.RootConfig.class
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            com.inmobi.media.i4 r2 = com.inmobi.media.Y3.f38021a
            com.inmobi.media.core.config.models.Config r2 = r2.a(r3)
            com.inmobi.media.core.config.models.RootConfig r2 = (com.inmobi.media.core.config.models.RootConfig) r2
            boolean r2 = r2.shouldTransmitRequest()
            java.lang.String r3 = "W6"
            java.lang.String r4 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            if (r0 == r1) goto L42
            if (r2 != 0) goto L42
            r1 = 0
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.W6.a():boolean");
    }
}
