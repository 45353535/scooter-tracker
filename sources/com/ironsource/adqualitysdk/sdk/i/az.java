package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class az {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f710 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f711 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f712 = 64;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f713 = -8838354928780161941L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f714 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f715 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f716 = {161, 163, 180, 159, 176, 181, 179, 165, 164, 182, 'z', 178, 175, 133, 174, 147};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private af f717;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ISAdQualityAdListener f718;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Handler f721;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<il> f720 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<String> f719 = new HashSet();

    public az(Handler handler, af afVar) {
        this.f717 = afVar;
        this.f721 = handler;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ af m5037(az azVar) {
        int i10 = (f711 + 37) % 128;
        f710 = i10;
        af afVar = azVar.f717;
        int i11 = i10 + 99;
        f711 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 6 / 0;
        }
        return afVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m5044(JSONObject jSONObject) {
        f710 = (f711 + 51) % 128;
        m5053(m5039("౷阰ఖ僿\uda38葵졝慫㶿\ue842騎鋬潝㦜겨첉餗", View.MeasureSpec.getMode(0) + 1).intern(), jSONObject);
        int i10 = f711 + 41;
        f710 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m5045(JSONObject jSONObject) {
        f710 = (f711 + 61) % 128;
        m5053(m5039("郧当邆ࢴ\u135b屽逖륣ꄸℰ쉙䫠\uf3cf\uf0f5\uf4fe", View.resolveSize(0, 0) + 1).intern(), jSONObject);
        f711 = (f710 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final void m5046(JSONObject jSONObject) {
        int i10 = f710 + 59;
        f711 = i10 % 128;
        m5053(m5042((String) null, i10 % 2 != 0 ? TextUtils.indexOf((CharSequence) "", '(') * 60 : 126 - TextUtils.indexOf((CharSequence) "", '0'), (int[]) null, "\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final void m5047(JSONObject jSONObject) {
        int i10 = f710 + 99;
        f711 = i10 % 128;
        m5053(m5042((String) null, i10 % 2 != 0 ? (ViewConfiguration.getTouchSlop() % 100) * 81 : (ViewConfiguration.getTouchSlop() >> 8) + 127, (int[]) null, "\u0088\u0083\u0081\u0083\u0087\u0084\u0089\u0088\u008a\u0081\u0087\u0084\u0083\u0082\u0081").intern(), jSONObject);
        f711 = (f710 + 45) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m5050(JSONObject jSONObject) {
        f710 = (f711 + 91) % 128;
        m5053(m5039("㙼肷㘝詥첿彲\u12c7멬ޣﻔ䂆䧭啐⼑瘯", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), jSONObject);
        f711 = (f710 + 83) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5051(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f710;
        int i11 = i10 + 21;
        f711 = i11 % 128;
        int i12 = i11 % 2;
        this.f718 = iSAdQualityAdListener;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i10 + 77;
        f711 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m5055(JSONObject jSONObject) {
        int i10 = f711 + 3;
        f710 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ISAdQualityAdListener iSAdQualityAdListener = this.f718;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adClosed(jSONObject.optString(ih.f2568), ISAdQualityAdType.fromInt(jSONObject.optInt(ih.f2564)));
        }
        int i11 = f711 + 43;
        f710 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m5057(JSONObject jSONObject) {
        f711 = (f710 + 47) % 128;
        m5053(m5039("퓠嵊풁齻ᅂᢛߙﶅ\ue52f⌯喜ท럌\uf2ec挱", KeyEvent.keyCodeFromString("") + 1).intern(), jSONObject);
        f710 = (f711 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5038(az azVar, String str, JSONObject jSONObject) {
        f711 = (f710 + 53) % 128;
        azVar.m5041(str, jSONObject);
        int i10 = f711 + 123;
        f710 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5054(JSONObject jSONObject) {
        String strM5039;
        int i10 = f710 + 75;
        f711 = i10 % 128;
        if (i10 % 2 != 0) {
            View.MeasureSpec.getSize(1);
            strM5039 = m5039("ل鋟إ芕\uded7喵ᨷ낫㞚\uecad䡤䌭敱㵹统", 0);
        } else {
            strM5039 = m5039("ل鋟إ芕\uded7喵ᨷ낫㞚\uecad䡤䌭敱㵹统", View.MeasureSpec.getSize(0) + 1);
        }
        m5053(strM5039.intern(), jSONObject);
        int i11 = f711 + 39;
        f710 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m5056(String str, String str2, String str3, String str4) {
        f710 = (f711 + 99) % 128;
        m5052(str, str2, str3, str4, null, false);
        f710 = (f711 + 29) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[PHI: r1
  0x003c: PHI (r1v11 org.json.JSONObject) = (r1v7 org.json.JSONObject), (r1v17 org.json.JSONObject) binds: [B:12:0x003a, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5043(java.lang.String r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<com.ironsource.adqualitysdk.sdk.i.il> r1 = r3.f720
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == r2) goto L13
            return
        L13:
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f711
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f710 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L30
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.il r1 = (com.ironsource.adqualitysdk.sdk.i.il) r1
            org.json.JSONObject r1 = r1.mo4924(r4, r5)
            r2 = 17
            int r2 = r2 / 0
            if (r1 == 0) goto L4f
            goto L3c
        L30:
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.il r1 = (com.ironsource.adqualitysdk.sdk.i.il) r1
            org.json.JSONObject r1 = r1.mo4924(r4, r5)
            if (r1 == 0) goto L4f
        L3c:
            int r2 = com.ironsource.adqualitysdk.sdk.i.az.f710
            int r2 = r2 + 107
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f711 = r2
            com.ironsource.adqualitysdk.sdk.i.jz.m7083(r5, r1)
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f710
            int r1 = r1 + 19
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f711 = r1
        L4f:
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f711
            int r1 = r1 + 35
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f710 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.az.m5043(java.lang.String, org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m5049(JSONObject jSONObject) {
        f710 = (f711 + 63) % 128;
        int iOptInt = jSONObject.optInt(ih.f2564);
        ISAdQualityAdListener iSAdQualityAdListener = this.f718;
        if (iSAdQualityAdListener != null) {
            int i10 = f710 + 51;
            f711 = i10 % 128;
            if (i10 % 2 != 0) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2568), ISAdQualityAdType.fromInt(iOptInt));
                int i11 = 35 / 0;
            } else {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2568), ISAdQualityAdType.fromInt(iOptInt));
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5053(final String str, final JSONObject jSONObject) {
        this.f721.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                az.m5038(az.this, str, jSONObject);
            }
        });
        int i10 = f710 + 61;
        f711 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5052(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z10) {
        synchronized (this.f719) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m5042((String) null, 127 - Gravity.getAbsoluteGravity(0, 0), (int[]) null, "\u008b").intern());
                sb2.append(str2);
                String string = sb2.toString();
                if (!this.f719.contains(string) || z10 || ar.m4771().mo4792()) {
                    this.f719.add(string);
                    if (Math.random() * 100.0d < m5040()) {
                        JSONObject jSONObjectM4634 = af.m4634(str, str2, str3, str4, jSONObject);
                        m5043(m5042((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM4634);
                        this.f717.m4656(m5042((String) null, TextUtils.getOffsetBefore("", 0) + 127, (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM4634);
                        return;
                    }
                    k.m7097(m5042((String) null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, (int[]) null, "\u008c\u0088\u0089\u008f\u0088\u0090\u0083\u008f\u0088\u008a\u008e").intern(), m5039("嶵䁈己鴲ొ㲪֗\ud988汸㸭埔⨮㺃\uefec愼瑇죁ꅸ낍䚝魷匼싆靻ꖌӹ\u0c65\ue159矉㘛忁㏃٥\ue83e槜簱탲駷묤乻\ue2d8䭌쪣飇굹紃ᓎ\ue936羢⻯♧㭣ু", 1 - TextUtils.indexOf("", "", 0, 0)).intern());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5041(final String str, JSONObject jSONObject) {
        m5043(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = ih.f2568;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = ih.f2521;
            jSONObject2.put(str3, jSONObject.remove(str3));
            f710 = (f711 + 83) % 128;
        } catch (JSONException unused) {
        }
        this.f717.m4663(str, jSONObject, jSONObject2, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (ih.f2512.contains(str)) {
                    t.m7281(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            az.m5037(az.this).m4662();
                        }
                    });
                }
            }
        });
        int i10 = f711 + 101;
        f710 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5042(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3012) {
            try {
                char[] cArr2 = f716;
                int i11 = f712;
                if (f715) {
                    int length = bArr.length;
                    m.f3014 = length;
                    char[] cArr3 = new char[length];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i12 = m.f3013;
                        int i13 = m.f3014 - 1;
                        int i14 = m.f3013;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3013 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f714) {
                    int length2 = cArr.length;
                    m.f3014 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i15 = m.f3013;
                        int i16 = m.f3014 - 1;
                        int i17 = m.f3013;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3013 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3014 = length3;
                char[] cArr5 = new char[length3];
                m.f3013 = 0;
                while (m.f3013 < m.f3014) {
                    int i18 = m.f3013;
                    int i19 = m.f3014 - 1;
                    int i20 = m.f3013;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3013 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m5048(il ilVar) {
        f710 = (f711 + 97) % 128;
        this.f720.add(ilVar);
        int i10 = f710 + 77;
        f711 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static double m5040() {
        int i10 = f710 + 57;
        f711 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4771().mo4788();
            throw null;
        }
        if (!ar.m4771().mo4788()) {
            return ar.m4771().mo4789();
        }
        f710 = (f711 + 83) % 128;
        return 100.0d;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5039(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f713, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f713));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
