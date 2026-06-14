package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9153b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9158a;

        a(String str) {
            this.f9158a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9158a;
        }
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9153b = str;
        this.f9152a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject a() {
        /*
            r5 = this;
            java.lang.String r0 = "AdToken"
            com.applovin.impl.k$a r1 = r5.c()
            com.applovin.impl.k$a r2 = com.applovin.impl.k.a.AD_RESPONSE_JSON
            if (r1 != r2) goto Lc3
            java.lang.String r1 = r5.d()     // Catch: java.io.UnsupportedEncodingException -> L4f
            int r1 = r1.length()     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r2 = r5.f9153b     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r1 = r2.substring(r1)     // Catch: java.io.UnsupportedEncodingException -> L4f
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r2 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.UnsupportedEncodingException -> L4f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            r1.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            com.applovin.impl.sdk.k r2 = r5.f9152a     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            r2.O()     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            boolean r2 = com.applovin.impl.sdk.o.a()     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            if (r2 == 0) goto L53
            com.applovin.impl.sdk.k r2 = r5.f9152a     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            com.applovin.impl.sdk.o r2 = r2.O()     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            java.lang.String r4 = "Decoded token into ad response: "
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            r3.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            java.lang.String r3 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            r2.a(r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L4f org.json.JSONException -> L51
            return r1
        L4f:
            r1 = move-exception
            goto L8c
        L51:
            r1 = move-exception
            goto L54
        L53:
            return r1
        L54:
            com.applovin.impl.sdk.k r2 = r5.f9152a     // Catch: java.io.UnsupportedEncodingException -> L4f
            r2.O()     // Catch: java.io.UnsupportedEncodingException -> L4f
            boolean r2 = com.applovin.impl.sdk.o.a()     // Catch: java.io.UnsupportedEncodingException -> L4f
            if (r2 == 0) goto L80
            com.applovin.impl.sdk.k r2 = r5.f9152a     // Catch: java.io.UnsupportedEncodingException -> L4f
            com.applovin.impl.sdk.o r2 = r2.O()     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L4f
            r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r4 = "Unable to decode token '"
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r4 = r5.f9153b     // Catch: java.io.UnsupportedEncodingException -> L4f
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r4 = "' into JSON"
            r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r3 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L4f
            r2.a(r0, r3, r1)     // Catch: java.io.UnsupportedEncodingException -> L4f
        L80:
            com.applovin.impl.sdk.k r2 = r5.f9152a     // Catch: java.io.UnsupportedEncodingException -> L4f
            com.applovin.impl.r1 r2 = r2.D()     // Catch: java.io.UnsupportedEncodingException -> L4f
            java.lang.String r3 = "decodeFullAdResponseStr"
            r2.a(r0, r3, r1)     // Catch: java.io.UnsupportedEncodingException -> L4f
            goto Lc3
        L8c:
            com.applovin.impl.sdk.k r2 = r5.f9152a
            r2.O()
            boolean r2 = com.applovin.impl.sdk.o.a()
            if (r2 == 0) goto Lb8
            com.applovin.impl.sdk.k r2 = r5.f9152a
            com.applovin.impl.sdk.o r2 = r2.O()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to process ad response from token '"
            r3.append(r4)
            java.lang.String r4 = r5.f9153b
            r3.append(r4)
            java.lang.String r4 = "'"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.a(r0, r3, r1)
        Lb8:
            com.applovin.impl.sdk.k r2 = r5.f9152a
            com.applovin.impl.r1 r2 = r2.D()
            java.lang.String r3 = "decodeFullAdResponse"
            r2.a(r0, r3, r1)
        Lc3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k.a():org.json.JSONObject");
    }

    public String b() {
        return this.f9153b;
    }

    public a c() {
        return a(x4.f11456x0) != null ? a.REGULAR : a(x4.f11464y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.f11456x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.f11464y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f9153b;
        String str2 = ((k) obj).f9153b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f9153b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f9153b) + ", type=" + c() + '}';
    }

    private String a(x4 x4Var) {
        for (String str : this.f9152a.c(x4Var)) {
            if (this.f9153b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
