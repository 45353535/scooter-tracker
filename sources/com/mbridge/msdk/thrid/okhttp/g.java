package com.mbridge.msdk.thrid.okhttp;

import androidx.compose.material.TextFieldImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f51189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Comparator<String> f51122b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, g> f51125c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f51128d = a("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f51131e = a("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f51134f = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f51137g = a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f51140h = a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f51143i = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f51146j = a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f51149k = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f51152l = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f51155m = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f51158n = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f51161o = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f51164p = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f51167q = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f51170r = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f51173s = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f51175t = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f51177u = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f51179v = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f51181w = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f51183x = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f51185y = a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f51187z = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final g A = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g B = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g C = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g D = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g E = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g F = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g G = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g H = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g I = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g J = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g K = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g L = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g M = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g N = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g O = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g P = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g Q = a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final g R = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g S = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g T = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g U = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g V = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final g W = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g X = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final g Y = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Z = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final g f51120a0 = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f51123b0 = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final g f51126c0 = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final g f51129d0 = a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final g f51132e0 = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", TsExtractor.TS_STREAM_TYPE_DTS_UHD);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final g f51135f0 = a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final g f51138g0 = a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final g f51141h0 = a("TLS_RSA_WITH_SEED_CBC_SHA", TextFieldImplKt.AnimationDuration);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final g f51144i0 = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final g f51147j0 = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final g f51150k0 = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final g f51153l0 = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final g f51156m0 = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final g f51159n0 = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final g f51162o0 = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f51165p0 = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final g f51168q0 = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final g f51171r0 = a("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final g f51174s0 = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final g f51176t0 = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final g f51178u0 = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final g f51180v0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final g f51182w0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final g f51184x0 = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final g f51186y0 = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final g f51188z0 = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final g A0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C0 = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D0 = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E0 = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final g H0 = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I0 = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J0 = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M0 = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N0 = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O0 = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P0 = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q0 = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final g f51121a1 = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final g f51124b1 = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final g f51127c1 = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final g f51130d1 = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final g f51133e1 = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final g f51136f1 = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final g f51139g1 = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final g f51142h1 = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final g f51145i1 = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final g f51148j1 = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final g f51151k1 = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final g f51154l1 = a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final g f51157m1 = a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final g f51160n1 = a("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final g f51163o1 = a("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final g f51166p1 = a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final g f51169q1 = a("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final g f51172r1 = a("TLS_AES_256_CCM_8_SHA256", 4869);

    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private g(String str) {
        str.getClass();
        this.f51189a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        try {
            Map<String, g> map = f51125c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f51189a;
    }

    static List<g> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static g a(String str, int i10) {
        g gVar = new g(str);
        f51125c.put(str, gVar);
        return gVar;
    }
}
