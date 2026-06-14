package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ac extends y<View> implements View.OnLayoutChangeListener, jl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f132 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f133 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f134 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f135 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f136 = {369, 387, 392, 382, 393, 401, 368, 383, 347, 354, 379, 390, 396, 351, 314, 397, 398, 385, 400, 384, 391, 340, 358, 403, 399, 349, 386};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f137 = 282;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f138;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f139;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f140;

    public class b extends y.c {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f141 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f142 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f143 = {166, 151, 168, 155, 164, 170, 140, 159, 173, 134, 156, 174, 160, 169, 138, 165, Ascii.MAX, 153, 171, 141, 152, 'y', 162, 172, 157};

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f144 = true;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static boolean f145 = true;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f146 = 54;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f147 = -2839741285697766634L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f148;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f149;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f150;

        public b(ac acVar) {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ String m4582(b bVar) {
            int i10 = (f142 + 37) % 128;
            f141 = i10;
            String str = bVar.f150;
            int i11 = i10 + 49;
            f142 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 17 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ String m4583(b bVar) {
            int i10 = (f141 + 9) % 128;
            f142 = i10;
            String str = bVar.f148;
            f141 = (i10 + 31) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m4584(String str) {
            int i10 = f141 + 121;
            f142 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f150 = str;
                return this;
            }
            this.f150 = str;
            int i11 = 14 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ String m4586(b bVar) {
            int i10 = f141;
            f142 = (i10 + 21) % 128;
            String str = bVar.f149;
            int i11 = i10 + 89;
            f142 = i11 % 128;
            if (i11 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public b(ac acVar, JSONObject jSONObject) {
            m4584(jSONObject.optString(m4587("煥焒坡氒弜⥒꡶ᥢ鵔䬙䮡㖯ꦹ羵柽⇷됣汭ላ\ude59쁕耖ົ쪲\uecb4뒤", Color.red(0)).intern()));
            m4585(jSONObject.optString(m4587("埓垥\uecdd힢灞ؗ⟌雹믈\uf0a0擲먥輐쐪䢪깓銾", View.combineMeasuredStates(0, 0)).intern()));
            m4581(jSONObject.optString(m4588(null, 127 - TextUtils.indexOf("", ""), null, "\u008c\u0088\u008b\u0084\u0083\u008a\u0089\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m7376(jSONObject.optString(m4588(null, 175 - AndroidCharacter.getMirror('0'), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern()));
            m7378(false);
            m7374(!TextUtils.isEmpty(jSONObject.optString(m4588(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern())) || jSONObject.optBoolean(m4588(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()) || jSONObject.optBoolean(m4587("䎚䏯슲輪끣옪\ue1bc傩꾧\udedbꓭ籎魘\uea7e袛栫蛑殮ﵷ鞓\uf294ᗕ", View.getDefaultSize(0, 0)).intern()));
            m7380(jSONObject.optBoolean(m4588(null, View.getDefaultSize(0, 0) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()));
            m7373(jSONObject.optBoolean(m4587("둰됅夸扝\ue330镹猘숟塐䕇\uf78f\ueee3沊燨", TextUtils.indexOf("", "", 0)).intern()));
            m7377(TextUtils.isEmpty(jSONObject.optString(m4587("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) ? null : Arrays.asList(jSONObject.optString(m4587("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", TextUtils.lastIndexOf("", '0') + 1).intern()).split(m4587("ㄏㄣ珏횟⇍", TextUtils.indexOf("", "", 0, 0)).intern())));
            m7381(jSONObject.optBoolean(m4587("䝇䜲ῖ⒳唜⍕\uef76幾ꭾΫ䆰犟龔㜇淠更舻", MotionEvent.axisFromString("") + 1).intern(), true));
            m7375(false);
            m7371(jSONObject.optBoolean(m4587("莑菼逶ꭕ롽츽춎粸澠豋곕偱孨룽肒䐈䛸ꬥ\uf56a뮡㊂", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern()));
            m7372(jSONObject.optBoolean(m4587("\udf97\udffe꿬钗쫯벳\uf4be䖳㎡뎩\ude58楗ݓ", View.getDefaultSize(0, 0)).intern()));
            m7379(jz.m7088(jSONObject.optJSONArray(m4588(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0084\u0083\u0090\u0085\u0099\u0091\u0090\u008f\u008e\u0089\u0084\u0088\u0098").intern())));
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m4581(String str) {
            int i10 = f141;
            this.f149 = str;
            f142 = (i10 + 29) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m4585(String str) {
            int i10 = f142;
            this.f148 = str;
            f141 = (i10 + 33) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4587(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f147, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f147));
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4588(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f143;
                    int i11 = f146;
                    if (f144) {
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
                    if (f145) {
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
    }

    ac(JSONObject jSONObject) {
        super(null);
        this.f139 = new WeakHashMap<>();
        this.f140 = new b(this);
        m4575(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static View m4567(View view) {
        int i10 = f132 + 19;
        int i11 = i10 % 128;
        f135 = i11;
        if (i10 % 2 == 0) {
            int i12 = 91 / 0;
        }
        f132 = (i11 + 27) % 128;
        return view;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4571() {
        int i10 = f135 + 73;
        f132 = i10 % 128;
        if (i10 % 2 != 0) {
            ji.m6955().m6962(this);
            throw null;
        }
        ji.m6955().m6962(this);
        int i11 = f132 + 23;
        f135 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        f135 = (f132 + 27) % 128;
        try {
            View viewM4569 = m4569(view, this.f138);
            if (viewM4569 != null) {
                int i18 = f135 + 103;
                f132 = i18 % 128;
                if (i18 % 2 != 0) {
                    m4572(viewM4569);
                    view.removeOnLayoutChangeListener(this);
                    int i19 = 92 / 0;
                } else {
                    m4572(viewM4569);
                    view.removeOnLayoutChangeListener(this);
                }
                f132 = (f135 + 33) % 128;
            }
        } catch (Throwable th2) {
            kd.m7160(m4570((String) null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m4570((String) null, Drawable.resolveOpacity(0, 0) + 127, (int[]) null, "\u0088\u0092\u0083\u008b\u009b\u009a\u0091\u0099\u0085\u0098\u008b\u0097\u0083\u0085\u008f\u0083\u0082\u008f\u008d\u0085\u008d\u008d\u008e").intern(), th2, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final /* synthetic */ void mo4574(View view, List list) {
        int i10 = f135 + 75;
        f132 = i10 % 128;
        int i11 = i10 % 2;
        m4568(view, (List<WebView>) list);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4576() {
        f132 = (f135 + 33) % 128;
        m7339((r) null);
        ji.m6955().m6963(this);
        int i10 = f135 + 25;
        f132 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final /* synthetic */ View mo4579(View view) {
        f132 = (f135 + 101) % 128;
        View viewM4567 = m4567(view);
        f132 = (f135 + 23) % 128;
        return viewM4567;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View m4569(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            f135 = (f132 + 125) % 128;
            View childAt = viewGroup.getChildAt(i10);
            if (!(!cls.isAssignableFrom(childAt.getClass()))) {
                f132 = (f135 + 63) % 128;
                return childAt;
            }
            View viewM4569 = m4569(childAt, cls);
            if (viewM4569 != null) {
                f135 = (f132 + 35) % 128;
                return viewM4569;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4575(JSONObject jSONObject) {
        b bVar = new b(this, jSONObject);
        m7357(bVar);
        this.f140 = bVar;
        try {
            this.f138 = Class.forName(b.m4583(bVar));
            int i10 = f135 + 55;
            f132 = i10 % 128;
            int i11 = i10 % 2;
            m4571();
            if (i11 != 0) {
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            String strIntern = m4570((String) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4570((String) null, KeyEvent.normalizeMetaState(0) + 127, (int[]) null, "\u008f\u0095\u0085\u008d\u0094\u008f\u0090\u0091\u0083\u0088\u0093\u0088\u008f\u0085\u0091\u008f\u0092\u0083\u0082\u0083\u0088\u0091\u0090\u0082\u008c\u008f\u008d\u0085\u008d\u008d\u008e").intern());
            sb2.append(b.m4583(bVar));
            sb2.append(m4570((String) null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (int[]) null, "\u008f\u0096").intern());
            sb2.append(e10.getLocalizedMessage());
            k.m7097(strIntern, sb2.toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final r<WebView, View> mo4578() {
        int i10 = f132 + 95;
        int i11 = i10 % 128;
        f135 = i11;
        if (i10 % 2 == 0) {
            int i12 = 19 / 0;
        }
        int i13 = i11 + 5;
        f132 = i13 % 128;
        if (i13 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final aa mo4580() {
        ad adVar = new ad();
        f135 = (f132 + 95) % 128;
        return adVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4568(View view, List<WebView> list) {
        f132 = (f135 + 85) % 128;
        ke.m7181(view, WebView.class, b.m4582(this.f140), true, false, null, this.f140.f3233, list);
        int i10 = f132 + 93;
        f135 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m4572(View view) {
        if (!this.f139.containsKey(view)) {
            int i10 = f132 + 83;
            f135 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f139.put(view, Boolean.TRUE);
                mo7317(view, Integer.toHexString(view.hashCode()));
            } else {
                this.f139.put(view, Boolean.TRUE);
                mo7317(view, Integer.toHexString(view.hashCode()));
                throw null;
            }
        }
        int i11 = f135 + 51;
        f132 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo4577(View view) {
        View viewM4569 = m4569(view, this.f138);
        if (viewM4569 != null) {
            m4572(viewM4569);
            return;
        }
        if (!TextUtils.isEmpty(b.m4586(this.f140))) {
            int i10 = f132 + 69;
            f135 = i10 % 128;
            if (i10 % 2 != 0) {
                View viewM4566 = m4566(view, b.m4586(this.f140));
                if (viewM4566 != null) {
                    f135 = (f132 + 33) % 128;
                    viewM4566.addOnLayoutChangeListener(this);
                }
            } else {
                m4566(view, b.m4586(this.f140));
                throw null;
            }
        }
        int i11 = f135 + 93;
        f132 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void mo4573(View view) {
        int i10 = f135 + 53;
        f132 = i10 % 128;
        if (i10 % 2 == 0) {
            View viewM4569 = m4569(view, this.f138);
            if (viewM4569 != null && this.f139.remove(viewM4569) != null) {
                mo7315(view);
                f135 = (f132 + 103) % 128;
            }
            f132 = (f135 + 27) % 128;
            return;
        }
        m4569(view, this.f138);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4570(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f136;
                int i11 = f137;
                if (f133) {
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
                if (f134) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private View m4566(View view, String str) {
        int i10 = (f132 + 125) % 128;
        f135 = i10;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        f132 = (i10 + 83) % 128;
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View viewM4566 = m4566(childAt, str);
            if (viewM4566 != null) {
                return viewM4566;
            }
        }
        return null;
    }
}
