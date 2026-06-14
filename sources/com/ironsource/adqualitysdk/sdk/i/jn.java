package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jn {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jn f2857;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, e> f2858 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2859 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, e> f2860;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jn m6976() {
        try {
            if (f2857 == null) {
                f2857 = new jn();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2857;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized Map<String, e> m6977() {
        return new HashMap(this.f2858);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized e m6980(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m6977().containsKey(name)) {
                return m6977().get(name);
            }
            if (m6978().containsKey(name)) {
                return m6978().get(name);
            }
        }
        return e.m6985(ar.m4771().mo4777());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m6983(Activity activity) {
        return e.f2872 == m6980(activity);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m6981(final String str, final e eVar) {
        this.f2859.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                synchronized (jn.this) {
                    jn.this.f2858.put(str, eVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m6982(Activity activity) {
        return e.f2871 == m6980(activity);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, e> m6978() {
        try {
            if (this.f2860 == null) {
                this.f2860 = new HashMap();
                JSONObject jSONObjectMo4781 = ar.m4771().mo4781();
                if (jSONObjectMo4781 != null) {
                    this.f2860 = jz.m7085(jSONObjectMo4781, new jz.c<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                        /* JADX INFO: renamed from: ﻛ */
                        public final /* synthetic */ e mo4837(JSONObject jSONObject, String str) {
                            return e.m6985(jSONObject.optString(str));
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2860;
    }

    public enum e {
        f2873,
        f2871,
        f2872;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2864 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2865;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2866;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f2867;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f2868;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2869;

        static {
            m6984();
            int i10 = f2864 + 47;
            f2865 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 19 / 0;
            }
        }

        public static e valueOf(String str) {
            f2864 = (f2865 + 33) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f2865 = (f2864 + 117) % 128;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() throws CloneNotSupportedException {
            int i10 = f2865 + 21;
            f2864 = i10 % 128;
            if (i10 % 2 == 0) {
                values().clone();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            f2864 = (f2865 + 19) % 128;
            return eVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static void m6984() {
            f2868 = (char) 41656;
            f2867 = (char) 41873;
            f2866 = (char) 18113;
            f2869 = (char) 2664;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.ironsource.adqualitysdk.sdk.i.jn.e m6985(java.lang.String r6) {
            /*
                int r0 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2864
                int r0 = r0 + 55
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jn.e.f2865 = r0
                boolean r0 = android.text.TextUtils.isEmpty(r6)
                if (r0 != 0) goto Lad
                int r0 = r6.hashCode()
                r1 = 3642(0xe3a, float:5.104E-42)
                r2 = 1
                r3 = 3
                r4 = 2
                r5 = 0
                if (r0 == r1) goto L63
                r1 = 96921(0x17a99, float:1.35815E-40)
                if (r0 == r1) goto L4b
                r1 = 109261(0x1aacd, float:1.53107E-40)
                if (r0 == r1) goto L25
                goto L86
            L25:
                java.lang.String r0 = ""
                int r0 = android.text.TextUtils.indexOf(r0, r0, r5, r5)
                int r0 = r0 + r3
                java.lang.String r1 = "쭞淮ᐁꌐ"
                java.lang.String r0 = m6986(r1, r0)
                java.lang.String r0 = r0.intern()
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L86
                int r6 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2865
                int r6 = r6 + 43
                int r0 = r6 % 128
                com.ironsource.adqualitysdk.sdk.i.jn.e.f2864 = r0
                int r6 = r6 % r4
                if (r6 != 0) goto L49
            L47:
                r3 = r2
                goto L87
            L49:
                r3 = r5
                goto L87
            L4b:
                int r0 = android.os.Process.myTid()
                int r0 = r0 >> 22
                int r3 = r3 - r0
                java.lang.String r0 = "薛鵂䭮⏳"
                java.lang.String r0 = m6986(r0, r3)
                java.lang.String r0 = r0.intern()
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L86
                goto L47
            L63:
                int r0 = android.view.View.getDefaultSize(r5, r5)
                int r0 = r0 + r4
                java.lang.String r1 = "탣뾗"
                java.lang.String r0 = m6986(r1, r0)
                java.lang.String r0 = r0.intern()
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L86
                int r6 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2865
                int r6 = r6 + 29
                int r0 = r6 % 128
                com.ironsource.adqualitysdk.sdk.i.jn.e.f2864 = r0
                int r6 = r6 % r4
                if (r6 != 0) goto L84
                goto L87
            L84:
                r3 = r4
                goto L87
            L86:
                r3 = -1
            L87:
                if (r3 == 0) goto L9c
                if (r3 == r2) goto L99
                if (r3 == r4) goto L8e
                goto Lad
            L8e:
                com.ironsource.adqualitysdk.sdk.i.jn$e r6 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2872
                int r0 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2865
                int r0 = r0 + 33
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jn.e.f2864 = r0
                return r6
            L99:
                com.ironsource.adqualitysdk.sdk.i.jn$e r6 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2871
                return r6
            L9c:
                com.ironsource.adqualitysdk.sdk.i.jn$e r6 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2873
                int r0 = com.ironsource.adqualitysdk.sdk.i.jn.e.f2865
                int r0 = r0 + 123
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jn.e.f2864 = r1
                int r0 = r0 % r4
                if (r0 != 0) goto Lac
                r0 = 59
                int r0 = r0 / r5
            Lac:
                return r6
            Lad:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jn.e.m6985(java.lang.String):com.ironsource.adqualitysdk.sdk.i.jn$e");
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6986(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f3016) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    n.f3015 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f3015;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2868)) ^ ((c11 >>> 5) + f2866)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2867) ^ ((c12 + i12) ^ ((c12 << 4) + f2869))));
                                i12 -= 40503;
                            }
                            int i14 = n.f3015;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f3015 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }
}
