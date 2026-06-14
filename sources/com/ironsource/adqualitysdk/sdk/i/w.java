package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w<K, T> implements r<K, T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3178 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3179 = 40555;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3180 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3181 = 25658;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3182 = 61114;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3183 = 36;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3184 = 15383;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private r<K, T> f3185;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> f3186 = new r<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo5991(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻛ */
        public final void mo5994(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo4550(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo6000(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4555(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo5992(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo5997(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo6001(JSONObject jSONObject, K k10, Object obj, T t10) {
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> m7337() {
        int i10 = f3180 + 55;
        int i11 = i10 % 128;
        f3178 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        r<K, T> rVar = this.f3185;
        if (rVar == null) {
            return this.f3186;
        }
        f3180 = (i11 + 81) % 128;
        return rVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo5992(JSONObject jSONObject, K k10, Object obj, T t10) {
        f3180 = (f3178 + 49) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7335("ﵲ戴﵌ꋶ俹\uef46犯摎∜\ue85a⽘龃", 10 - TextUtils.indexOf((CharSequence) "", '0')).intern(), jSONObjectM7336);
        m7337().mo5992(jSONObjectM7336, k10, obj, t10);
        int i10 = f3180 + 105;
        f3178 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7339(r<K, T> rVar) {
        int i10 = f3180;
        this.f3185 = rVar;
        f3178 = (i10 + 75) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public void mo4550(JSONObject jSONObject, K k10, T t10) {
        f3180 = (f3178 + 77) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338(Process.getGidForName("") + 14, TextUtils.indexOf((CharSequence) "", '0') + 130, TextUtils.indexOf((CharSequence) "", '0') + 3, "\u0007￤\uffdd\u0007\b\u001c\u0004\u000f\u0013\u0016\f\u0007ￃ", true).intern(), jSONObjectM7336);
        m7337().mo4550(jSONObjectM7336, k10, t10);
        int i10 = f3180 + 93;
        f3178 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    protected abstract String mo4551(T t10);

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo6001(JSONObject jSONObject, K k10, Object obj, T t10) {
        f3180 = (f3178 + 7) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338((ViewConfiguration.getFadingEdgeLength() >> 16) + 19, TextUtils.getOffsetAfter("", 0) + 125, 14 - Color.argb(0, 0, 0, 0), "\u0010\n\u0012\f\u000bￇ\r\u0019\u0016\u0014ￇ\u0011\u001a￡￨\u000bￇ\n\u0013", false).intern(), jSONObjectM7336);
        m7337().mo6001(jSONObjectM7336, k10, obj, t10);
        int i10 = f3180 + 89;
        f3178 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public final void mo5994(JSONObject jSONObject, K k10, T t10) {
        f3178 = (f3180 + 51) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338(8 - TextUtils.lastIndexOf("", '0', 0, 0), 128 - View.MeasureSpec.getMode(0), 4 - (Process.myTid() >> 22), "\u0007ￄ\b￥\b\t\u0017\u0013\u0010", true).intern(), jSONObjectM7336);
        m7337().mo5994(jSONObjectM7336, k10, t10);
        int i10 = f3178 + 81;
        f3180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo5991(JSONObject jSONObject, K k10, T t10) {
        f3178 = (f3180 + 7) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338(14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16777083) - Color.rgb(0, 0, 0), Color.red(0) + 3, "\u0004\b\u0015\uffd9\u0003\u0004\u0007\u0002\u0000\u0013\u0013\u0000\uffbf\u0016", true).intern(), jSONObjectM7336);
        m7337().mo5991(jSONObjectM7336, k10, t10);
        int i10 = f3180 + 111;
        f3178 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final void mo5997(JSONObject jSONObject, K k10, Object obj, T t10) {
        JSONObject jSONObjectM7336;
        int iArgb;
        int i10 = f3178 + 123;
        f3180 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM7336 = m7336(jSONObject, t10);
            iArgb = 34 << Color.argb(0, 0, 1, 0);
        } else {
            jSONObjectM7336 = m7336(jSONObject, t10);
            iArgb = 10 - Color.argb(0, 0, 0, 0);
        }
        m7334(m7335("㠍샧ᧉ짼\uf5f5퉋靐䨬퐃歰", iArgb).intern(), jSONObjectM7336);
        m7337().mo5997(jSONObjectM7336, k10, obj, t10);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo6000(JSONObject jSONObject, K k10, T t10) {
        f3178 = (f3180 + 57) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338(14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 4 - (KeyEvent.getMaxKeyCode() >> 16), "\u0004\r\u0013\uffd9￢\u0014\u0012\u0013\u000e\f\uffbf\u0004\u0015", false).intern(), jSONObjectM7336);
        m7337().mo6000(jSONObjectM7336, k10, t10);
        int i10 = f3180 + 65;
        f3178 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public void mo4555(JSONObject jSONObject, K k10, T t10) {
        f3180 = (f3178 + 5) % 128;
        JSONObject jSONObjectM7336 = m7336(jSONObject, t10);
        m7334(m7338((ViewConfiguration.getPressedStateDuration() >> 16) + 19, 129 - TextUtils.lastIndexOf("", '0', 0), 4 - TextUtils.indexOf("", "", 0), "\u0016\u0014\u0003ￜ￣\u0006ￂ\u0006\u000b\u0015\u0012\u000e\u0003\u001b\u0007\u0006ￂ\u0007\u001a", false).intern(), jSONObjectM7336);
        m7337().mo4555(jSONObjectM7336, k10, t10);
        int i10 = f3178 + 49;
        f3180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7334(String str, JSONObject jSONObject) {
        String strIntern = m7338((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, Process.getGidForName("") + Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, '<' - AndroidCharacter.getMirror('0'), "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(m7335("腇ឭ\uee9cऎ", ExpandableListView.getPackedPositionChild(0L) + 4).intern());
        sb2.append(str);
        k.m7110(strIntern, sb2.toString(), jSONObject);
        f3178 = (f3180 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m7336(JSONObject jSONObject, T t10) {
        try {
            if (!jSONObject.has(ih.f2565)) {
                jSONObject.put(ih.f2565, mo4551(t10));
                f3178 = (f3180 + 71) % 128;
            }
            if (!jSONObject.has(ih.f2559)) {
                f3178 = (f3180 + 63) % 128;
                jSONObject.put(ih.f2559, jx.m7068());
                f3180 = (f3178 + 7) % 128;
            }
            return jSONObject;
        } catch (JSONException e10) {
            k.m7118(m7338(14 - (KeyEvent.getMaxKeyCode() >> 16), 136 - (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 13, "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern(), m7335("\uf347七¼ᭂỔ랳㴣\ue180\ufae7鲌⊾י\ua7eb뾄禗됻血혊泥\uebe1㩪읎䐥법ⴴ兌", TextUtils.indexOf("", "", 0) + 25).intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7338(int i10, int i11, int i12, String str, boolean z10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f730) {
            try {
                char[] cArr2 = new char[i10];
                b.f728 = 0;
                while (true) {
                    int i13 = b.f728;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f729 = cArr[i13];
                    cArr2[b.f728] = (char) (b.f729 + i11);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f3183);
                    b.f728 = i14 + 1;
                }
                if (i12 > 0) {
                    b.f731 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f731;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f731;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i17 = b.f728;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f728 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7335(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3181)) ^ ((c11 >>> 5) + f3179)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3182) ^ ((c12 + i12) ^ ((c12 << 4) + f3184))));
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
