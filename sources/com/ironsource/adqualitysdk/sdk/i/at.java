package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass4;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass5;
import com.ironsource.adqualitysdk.sdk.i.jc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class at {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f447 = 4824;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char f448 = 7412;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f449 = 0;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f450 = 1;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f451 = {'a', 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 187, 217, 258, 261, 259, 245, 246, 263, 264, 255, 249, 215, 197, 231, 239, 248, 256, 251, 255, 259, 267, 225, '9', 'k', 'f', 'd', 'g', 'g', 'W', '_', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'Y', 187, 142, 188, 183, 184, 178, 188, 187, 174, 191, 'i', 187, 184, 189, 172, 174, 183, 183, 184, 172, 'i', 176, 183, 178, 173, 173, 170, 'i', 187, 184, 187, '2', 'k', 'r', 'r', '9', 'r', 'p', 'p', 'r', 'k', 'B', 'I', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A', 'C', 'j', 'k', 'f', 'd', 'b', '@', 'I', 'p', 'p', 'r', '[', '2', 'c', 'k', '\"', 'D', 'H', 'G', 'A', 'G', 'I', '8', 130, 154, 150, 141, 147, 150, 151, 150, 'o', 316, 313, 308, 313};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f452 = 61156;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f453 = 55904;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ISAdQualityInitListener f454;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private az f455;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private iz f456;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private bb f460;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f461;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f464 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<cm> f465 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<gl> f463 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, JSONObject> f462 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, String> f466 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private db f459 = new db();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private du f458 = du.m6393();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, aw> f457 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.at$2, reason: invalid class name */
    final class AnonymousClass2 extends ir {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ String f512;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private /* synthetic */ List f513;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ Runnable f514;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ Context f515;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f517;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Map f518;

        AnonymousClass2(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f517 = str;
            this.f515 = context;
            this.f512 = str2;
            this.f513 = list;
            this.f518 = map;
            this.f514 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            if (ar.m4771().mo4801(this.f517, at.m4858(at.this))) {
                at.m4908(at.this, this.f515, this.f512, this.f517, this.f513, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        if (at.m4865(at.this)) {
                            t.m7282(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4564() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    at.m4882(at.this, anonymousClass2.f515, anonymousClass2.f518, anonymousClass2.f514);
                                }
                            }, ar.m4771().mo4774());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            at.m4893(at.this, this.f517, jSONObject);
            at.m4857(at.this).put(this.f517, jSONObject);
            t.m7282(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    at.m4882(at.this, anonymousClass2.f515, anonymousClass2.f518, anonymousClass2.f514);
                }
            }, ar.m4771().mo4774());
        }
    }

    public at(iz izVar, af afVar, String str, bb bbVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f456 = izVar;
        az azVar = new az(t.m7278(), afVar);
        this.f455 = azVar;
        kd.m7161(azVar);
        this.f455.m5048(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.at.3

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f522 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f523 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f524 = 3;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f525 = {'t', 'p', '_', 'e', 'r', 'o', 'u', 'v', 'w'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m4923(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f525;
                        char c10 = f524;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            g.f2158 = 0;
                            while (true) {
                                int i11 = g.f2158;
                                if (i11 >= i10) {
                                    break;
                                }
                                g.f2157 = cArr[i11];
                                g.f2155 = cArr[g.f2158 + 1];
                                if (g.f2157 == g.f2155) {
                                    cArr3[g.f2158] = (char) (g.f2157 - b10);
                                    cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                                } else {
                                    g.f2156 = g.f2157 / c10;
                                    g.f2154 = g.f2157 % c10;
                                    g.f2159 = g.f2155 / c10;
                                    g.f2152 = g.f2155 % c10;
                                    if (g.f2154 == g.f2152) {
                                        g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                        g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                        int i12 = (g.f2156 * c10) + g.f2154;
                                        int i13 = (g.f2159 * c10) + g.f2152;
                                        int i14 = g.f2158;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (g.f2156 == g.f2159) {
                                        g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                        g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                        int i15 = (g.f2156 * c10) + g.f2154;
                                        int i16 = (g.f2159 * c10) + g.f2152;
                                        int i17 = g.f2158;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (g.f2156 * c10) + g.f2152;
                                        int i19 = (g.f2159 * c10) + g.f2154;
                                        int i20 = g.f2158;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                g.f2158 += 2;
                            }
                        }
                        str3 = new String(cArr3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.il
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final JSONObject mo4924(String str2, JSONObject jSONObject) {
                f523 = (f522 + 23) % 128;
                if (!str2.equals(m4923("\u0001\u0002\u0000\u0005\u009b\u009b\u0003\u0005", 8 - Color.green(0), (byte) (40 - ImageFormat.getBitsPerPixel(0))).intern())) {
                    return null;
                }
                int i10 = f523 + 121;
                f522 = i10 % 128;
                if (i10 % 2 != 0) {
                    return at.this.m4913();
                }
                at.this.m4913();
                throw null;
            }
        });
        this.f461 = str;
        this.f460 = bbVar;
        this.f454 = iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m4853() {
        f449 = (f450 + 69) % 128;
        if (!ar.m4771().mo4775() || !m4855()) {
            return false;
        }
        int i10 = (f450 + 35) % 128;
        f449 = i10;
        f450 = (i10 + 61) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m4854() {
        if (this.f460.m5079()) {
            m4915().adQualitySdkInitSuccess();
            f449 = (f450 + 71) % 128;
        } else {
            f449 = (f450 + 97) % 128;
            m4915().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m4900("\uf8f1\uf8a0秶\uf087牗ŕᓗ뮕㎘鐜讶ꆼ㎘鐜坤皷ㄡ雫瑇欎鐠쇯뺢⟭钅♧퍮똙\udb93皟\uf241摧睱轴\uec32䊤\u1af7ྺ秶\uf087冞襮슑㸑䠁ᓝ䱣⌮ᓥ︌昄㓧\uf443Ō", 53 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m4855() {
        boolean zMo4772;
        try {
            int i10 = f449 + 57;
            f450 = i10 % 128;
            if (i10 % 2 == 0) {
                ar.m4771().mo4772();
                throw null;
            }
            zMo4772 = ar.m4771().mo4772();
            int i11 = f450 + 115;
            f449 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
        return zMo4772;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Map m4857(at atVar) {
        int i10 = f449 + 63;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            atVar.m4856();
            throw null;
        }
        Map<String, JSONObject> mapM4856 = atVar.m4856();
        int i11 = f450 + 123;
        f449 = i11 % 128;
        if (i11 % 2 == 0) {
            return mapM4856;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m4858(at atVar) {
        int i10 = (f450 + 15) % 128;
        f449 = i10;
        String str = atVar.f461;
        int i11 = i10 + 65;
        f450 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ void m4861(at atVar) {
        int i10 = f449 + 99;
        f450 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4889();
        if (i11 == 0) {
            int i12 = 71 / 0;
        }
        int i13 = f449 + 31;
        f450 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ List m4863(at atVar) {
        int i10 = f449 + 97;
        f450 = i10 % 128;
        if (i10 % 2 != 0) {
            return atVar.m4860();
        }
        atVar.m4860();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ boolean m4865(at atVar) {
        int i10 = f449 + 35;
        f450 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM4855 = atVar.m4855();
        if (i11 == 0) {
            int i12 = 21 / 0;
        }
        return zM4855;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ cm m4867(at atVar, Context context, String str, bd bdVar) {
        f449 = (f450 + 95) % 128;
        cm cmVarM4866 = atVar.m4866(context, str, bdVar);
        f449 = (f450 + 69) % 128;
        return cmVarM4866;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m4878(at atVar) {
        f449 = (f450 + 95) % 128;
        Map<String, String> mapM4859 = atVar.m4859();
        f450 = (f449 + 33) % 128;
        return mapM4859;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m4886(at atVar) {
        f450 = (f449 + 21) % 128;
        List<cm> listM4864 = atVar.m4864();
        int i10 = f450 + 57;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
        return listM4864;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ bb m4897(at atVar) {
        int i10 = f449 + 85;
        int i11 = i10 % 128;
        f450 = i11;
        int i12 = i10 % 2;
        bb bbVar = atVar.f460;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 95;
        f449 = i13 % 128;
        if (i13 % 2 == 0) {
            return bbVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m4901(at atVar, cm cmVar) {
        int i10 = f450 + 53;
        f449 = i10 % 128;
        if (i10 % 2 == 0) {
            return m4879(cmVar);
        }
        m4879(cmVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m4856() {
        int i10 = f450 + 71;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f462;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Map<String, String> m4859() {
        Map<String, String> map;
        try {
            int i10 = f450 + 105;
            f449 = i10 % 128;
            if (i10 % 2 != 0) {
                map = this.f466;
                int i11 = 36 / 0;
            } else {
                map = this.f466;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized List<gl> m4860() {
        List<gl> list;
        try {
            int i10 = f449 + 63;
            f450 = i10 % 128;
            if (i10 % 2 == 0) {
                list = this.f463;
                int i11 = 59 / 0;
            } else {
                list = this.f463;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private synchronized List<cm> m4862() {
        List<cm> list;
        int i10 = (f449 + 33) % 128;
        f450 = i10;
        list = this.f465;
        f449 = (i10 + 105) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<cm> m4864() {
        f450 = (f449 + 79) % 128;
        if (this.f465 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f465);
        f450 = (f449 + 103) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ du m4868(at atVar, du duVar) {
        int i10 = f449 + 115;
        int i11 = i10 % 128;
        f450 = i11;
        int i12 = i10 % 2;
        atVar.f458 = duVar;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 23;
        f449 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 77 / 0;
        }
        return duVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m4882(at atVar, Context context, Map map, Runnable runnable) {
        int i10 = f449 + 3;
        f450 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4904(context, (Map<String, List<gl>>) map, runnable);
        if (i11 == 0) {
            int i12 = 30 / 0;
        }
        int i13 = f450 + 69;
        f449 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 58 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m4887(at atVar, List list) {
        int i10 = f450;
        f449 = (i10 + 67) % 128;
        atVar.f465 = list;
        f449 = (i10 + 125) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m4899(at atVar, Context context, List list, List list2, ir irVar) {
        f450 = (f449 + 67) % 128;
        atVar.m4881(context, (List<gl>) list, (List<String>) list2, irVar);
        f450 = (f449 + 65) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4905(at atVar) {
        f450 = (f449 + 51) % 128;
        atVar.m4854();
        f450 = (f449 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m4870(at atVar) {
        f450 = (f449 + 23) % 128;
        List<cm> listM4862 = atVar.m4862();
        int i10 = f449 + 29;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 34 / 0;
        }
        return listM4862;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m4884(at atVar, String str) {
        int i10 = f450 + 37;
        f449 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM4912 = atVar.m4912(str);
        if (i11 != 0) {
            int i12 = 12 / 0;
        }
        int i13 = f449 + 95;
        f450 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 44 / 0;
        }
        return zM4912;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m4888(at atVar, Map map) {
        int i10 = f449;
        int i11 = i10 + 97;
        f450 = i11 % 128;
        int i12 = i11 % 2;
        atVar.f457 = map;
        if (i12 == 0) {
            int i13 = 21 / 0;
        }
        int i14 = i10 + 3;
        f450 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 16 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4906(at atVar, Context context) {
        int i10 = f450 + 115;
        f449 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4890(context);
        if (i11 != 0) {
            throw null;
        }
        f450 = (f449 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m4919() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : new HashSet(m4859().keySet())) {
                f449 = (f450 + 105) % 128;
                jSONObject2.put(str, m4859().get(str));
                f449 = (f450 + 73) % 128;
            }
            jSONObject.put(m4869(new int[]{83, 4, 0, 0}, "\u0001\u0001\u0000\u0001", false).intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            k.m7118(m4869(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4869(new int[]{87, 29, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m4877(cm cmVar, String str) {
        int i10 = f450 + 107;
        f449 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM4895 = m4895(cmVar, str);
        if (i11 != 0) {
            int i12 = 2 / 0;
        }
        return zM4895;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4891(at atVar, Context context, String str, String str2, gl glVar, ir irVar) {
        int i10 = f449 + 83;
        f450 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4898(context, str, str2, glVar, irVar);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4907(at atVar, Context context, String str, String str2, gl glVar, cm cmVar, boolean z10, bd bdVar, ir irVar) {
        int i10 = f449 + 23;
        f450 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4880(context, str, str2, glVar, cmVar, z10, bdVar, irVar);
        if (i11 == 0) {
            throw null;
        }
        f449 = (f450 + 11) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4916(final Context context, final Runnable runnable) {
        try {
            f449 = (f450 + 15) % 128;
            if (!this.f464) {
                String strIntern = m4900("휩\ue20e읜耄ᚎ摛뭇ꀯ蹲⼓玆蓑", 12 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4869(new int[]{0, 36, 149, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern());
                sb2.append(IronSourceAdQuality.getSDKVersion());
                sb2.append(m4900("钂빴鶊浗鶊浗鶊浗鶊浗鶊浗鶊浗銠㱊", 15 - KeyEvent.keyCodeFromString("")).intern());
                k.m7109(strIntern, sb2.toString());
                ir irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                runnable.run();
                            }
                        });
                        at.m4906(at.this, context);
                    }
                };
                if (!m4853()) {
                    m4874(context, irVar);
                } else {
                    int i10 = f450 + 65;
                    f449 = i10 % 128;
                    if (i10 % 2 != 0) {
                        m4902(context, irVar);
                        int i11 = 52 / 0;
                    } else {
                        m4902(context, irVar);
                    }
                }
                this.f464 = true;
                return;
            }
            t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.11
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    runnable.run();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4892(at atVar, Context context, String str, String str2, List list, ir irVar) {
        f449 = (f450 + 5) % 128;
        atVar.m4875(context, str, str2, list, irVar);
        int i10 = f449 + 39;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4908(at atVar, Context context, String str, String str2, List list, ir irVar) {
        f449 = (f450 + 17) % 128;
        atVar.m4903(context, str, str2, list, irVar);
        int i10 = f450 + 77;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m4913() {
        f449 = (f450 + 109) % 128;
        try {
            JSONObject jSONObjectM4872 = m4872(m4856());
            f450 = (f449 + 53) % 128;
            return jSONObjectM4872;
        } catch (JSONException e10) {
            k.m7118(m4869(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4869(new int[]{52, 31, 73, 2}, (String) null, true).intern(), e10);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4893(at atVar, String str, JSONObject jSONObject) {
        f450 = (f449 + 65) % 128;
        atVar.m4883(str, jSONObject);
        int i10 = f450 + 89;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4909(at atVar, cm cmVar, String str) {
        int i10 = f450 + 63;
        f449 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4910(cmVar, str);
        if (i11 != 0) {
            int i12 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m4911(cm cmVar) {
        f449 = (f450 + 101) % 128;
        boolean zM4894 = m4894(cmVar);
        int i10 = f450 + 53;
        f449 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM4894;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4918(ISAdQualityAdListener iSAdQualityAdListener) {
        f450 = (f449 + 109) % 128;
        this.f455.m5051(iSAdQualityAdListener);
        int i10 = f450 + 97;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4890(final Context context) {
        f450 = (f449 + 75) % 128;
        if (!m4855()) {
            t.m7284(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            at.m4905(at.this);
                        }
                    });
                }
            }, ar.m4771().mo4778());
        }
        final Map<String, List<gl>> mapM5083 = bc.m5083();
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                at.m4888(at.this, ar.m4771().mo4793());
                at.m4882(at.this, context, mapM5083, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        if (at.m4865(at.this)) {
                            at.m4905(at.this);
                        }
                    }
                });
                ar.m4771().mo4795(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f504 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f505 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f506 = 18;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static boolean f507 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f508 = {'U', 129, 128, 'w', 'u', 134, 132, '_', 's', 'y', 'V', '{', 133, 't', '~', '2', 140, 'v'};

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static boolean f509 = true;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m4922(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                                char[] cArr2 = f508;
                                int i11 = f506;
                                if (f507) {
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
                                if (f509) {
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4605() {
                        f505 = (f504 + 67) % 128;
                        at.m4888(at.this, ar.m4771().mo4793());
                        k.m7113(m4922(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), m4922(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008d\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u0090\u0092\u0084\u0091\u008c\u008f\u0089\u008c\u0086\u008c\u0083\u008c\u0090\u008a\u0083\u008c\u008f\u008e\u0089\u008d\u008c\u008b").intern());
                        at.m4861(at.this);
                        int i10 = f505 + 51;
                        f504 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
        });
        int i10 = f449 + 71;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4920() {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.12
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                Iterator it = at.m4886(at.this).iterator();
                while (it.hasNext()) {
                    ((cm) it.next()).m5895();
                }
                at.m4870(at.this).clear();
                at.m4887(at.this, (List) null);
            }
        });
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.1
            AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                bb.this.f769.clear();
                bb.this.f769 = null;
            }
        });
        this.f460 = null;
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.15
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() throws Exception {
                at.m4868(at.this, (du) null);
            }
        });
        f450 = (f449 + 1) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4874(Context context, ir irVar) {
        f449 = (f450 + 15) % 128;
        m4873(context, bc.m5087(), bc.m5089(), irVar);
        int i10 = f449 + 89;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4898(final Context context, final String str, final String str2, final gl glVar, final ir irVar) {
        f449 = (f450 + 57) % 128;
        jc.e eVarM6510 = glVar.m6510();
        if (eVarM6510 == null) {
            t.m7283(irVar);
            return;
        }
        final bd bdVarMo6486 = glVar.mo6486();
        m4876(str2, bdVarMo6486);
        t.m7288(this.f460.new AnonymousClass5(str2, ba.b.f754));
        final String strM6860 = this.f456.m6860(eVarM6510, new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.at.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4930(String str3) {
                at.m4907(at.this, context, str, str2, glVar, at.m4867(at.this, context, str3, bdVarMo6486), false, bdVarMo6486, irVar);
            }
        });
        t.m7284(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                cm cmVarM4867 = at.m4867(at.this, context, strM6860, bdVarMo6486);
                if (cmVarM4867 != null) {
                    at.m4907(at.this, context, str, str2, glVar, cmVarM4867, true, bdVarMo6486, irVar);
                } else {
                    t.m7283(irVar);
                }
            }
        }, m4896(eVarM6510));
        int i10 = f449 + 1;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 13 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4902(Context context, ir irVar) {
        m4881(context, new ArrayList(bc.m5085()), new ArrayList(bc.m5088()), irVar);
        f450 = (f449 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4873(final Context context, final gl glVar, final String str, final ir irVar) {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                final String lowerCase = str.toLowerCase();
                at.m4897(at.this).m5080(lowerCase);
                t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f484 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f485 = true;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f486 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static boolean f487 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f488 = {Ascii.MAX, 171, 170, 161, 159, 176, 174, 137, 157, 163, 133, 165, 168, 182, IOUtils.DIR_SEPARATOR_WINDOWS, 129};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f489 = 60;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m4921(String str2, int i10, int[] iArr, String str3) throws UnsupportedEncodingException {
                        Object bytes = str3;
                        if (str3 != null) {
                            bytes = str3.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (m.f3012) {
                            try {
                                char[] cArr2 = f488;
                                int i11 = f489;
                                if (f485) {
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
                                if (f487) {
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        String strIntern = m4921(null, TextUtils.getTrimmedLength("") + 127, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m4921(null, 127 - TextUtils.indexOf("", ""), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u008e\u008c\u008d\u0089\u008c\u0086\u008c\u0083\u008b").intern());
                        sb2.append(lowerCase);
                        k.m7113(strIntern, sb2.toString());
                        try {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            at.m4891(at.this, context, str, lowerCase, glVar, irVar);
                            int i10 = f486 + 73;
                            f484 = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 94 / 0;
                            }
                        } catch (Throwable th2) {
                            t.m7288(at.m4897(at.this).new AnonymousClass4(lowerCase, ba.c.f767));
                            at.m4878(at.this).put(str, kd.m7169(th2).toString());
                            String strIntern2 = m4921(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m4921(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u0086\u0089\u0084\u0087\u0085\u008f\u0087\u0082\u0087\u0087\u0090").intern());
                            sb3.append(lowerCase);
                            kd.m7168(strIntern2, sb3.toString(), th2, true, true, true);
                        }
                    }
                });
            }
        });
        int i10 = f449 + 51;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 2 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4875(Context context, String str, String str2, List<gl> list, ir irVar) {
        int i10 = f450 + 45;
        f449 = i10 % 128;
        if (i10 % 2 == 0) {
            Iterator<gl> it = list.iterator();
            while (it.hasNext()) {
                int i11 = f449 + 101;
                f450 = i11 % 128;
                if (i11 % 2 == 0) {
                    m4898(context, str, str2, it.next(), irVar);
                    int i12 = 79 / 0;
                } else {
                    m4898(context, str, str2, it.next(), irVar);
                }
            }
            int i13 = f449 + 71;
            f450 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        list.iterator();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4885(List<gl> list) {
        int i10 = f449 + 63;
        f450 = i10 % 128;
        if (i10 % 2 != 0) {
            if (list != null && !list.isEmpty()) {
                int i11 = f450 + 49;
                f449 = i11 % 128;
                if (i11 % 2 == 0 ? list.get(0) != null : list.get(1) != null) {
                    return list.get(0).mo6489();
                }
            }
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4881(Context context, final List<gl> list, final List<String> list2, final ir irVar) {
        final Context context2;
        int i10 = f450 + 91;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            f450 = (f449 + 93) % 128;
            return;
        }
        gl glVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (list.isEmpty()) {
            context2 = context;
        } else {
            context2 = context;
            irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    t.m7284(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            at.m4899(at.this, context2, list, list2, irVar);
                        }
                    }, ar.m4771().mo4774());
                }
            };
        }
        m4873(context2, glVarRemove, strRemove, irVar);
        int i11 = f449 + 51;
        f450 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 77 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r0 r1 r2
  0x0032: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v13 java.lang.String) binds: [B:12:0x0052, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r1v3 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>) = 
  (r1v2 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
  (r1v5 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
 binds: [B:12:0x0052, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v2 java.lang.String) binds: [B:12:0x0052, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4904(android.content.Context r12, java.util.Map<java.lang.String, java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>> r13, java.lang.Runnable r14) {
        /*
            r11 = this;
        L0:
            if (r13 == 0) goto L79
            int r0 = r13.size()
            if (r0 <= 0) goto L79
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f449
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f450 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L3a
            java.util.Set r0 = r13.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r13.remove(r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = m4885(r1)
            r3 = 58
            int r3 = r3 / 0
            if (r2 == 0) goto L36
        L32:
            r7 = r0
            r8 = r1
            r5 = r2
            goto L55
        L36:
            r6 = r12
            r9 = r13
            r10 = r14
            goto L6d
        L3a:
            java.util.Set r0 = r13.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r13.remove(r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = m4885(r1)
            if (r2 == 0) goto L36
            goto L32
        L55:
            com.ironsource.adqualitysdk.sdk.i.bb r0 = r11.f460
            r0.m5080(r5)
            com.ironsource.adqualitysdk.sdk.i.at$2 r3 = new com.ironsource.adqualitysdk.sdk.i.at$2
            r4 = r11
            r6 = r12
            r9 = r13
            r10 = r14
            r3.<init>(r5, r6, r7, r8, r9, r10)
            com.ironsource.adqualitysdk.sdk.i.t.m7281(r3)
            boolean r12 = r11.m4855()
            if (r12 == 0) goto L6d
            return
        L6d:
            int r12 = com.ironsource.adqualitysdk.sdk.i.at.f450
            int r12 = r12 + 65
            int r12 = r12 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f449 = r12
            r12 = r6
            r13 = r9
            r14 = r10
            goto L0
        L79:
            r10 = r14
            com.ironsource.adqualitysdk.sdk.i.at$1 r12 = new com.ironsource.adqualitysdk.sdk.i.at$1
            r12.<init>()
            com.ironsource.adqualitysdk.sdk.i.t.m7283(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m4904(android.content.Context, java.util.Map, java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private cm m4866(Context context, String str, bd bdVar) {
        f449 = (f450 + 119) % 128;
        if (str == null) {
            return null;
        }
        cm cmVar = new cm(context, new dh(str, this.f458), this.f455, this.f459, bdVar);
        int i10 = f449 + 41;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 40 / 0;
        }
        return cmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kc.m7147(r5, r4.m5893()) <= 0) goto L12;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m4895(com.ironsource.adqualitysdk.sdk.i.cm r4, java.lang.String r5) {
        /*
            r0 = 119(0x77, float:1.67E-43)
            r1 = 7
            r2 = 0
            int[] r0 = new int[]{r0, r1, r2, r2}
            java.lang.String r1 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            r3 = 1
            java.lang.String r0 = m4869(r0, r1, r3)
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L45
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f449
            int r0 = r0 + 85
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f450 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L44
            java.lang.String r0 = r4.m5892()
            int r0 = com.ironsource.adqualitysdk.sdk.i.kc.m7147(r5, r0)
            if (r0 < 0) goto L44
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f450
            int r0 = r0 + 71
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f449 = r0
            java.lang.String r4 = r4.m5893()
            int r4 = com.ironsource.adqualitysdk.sdk.i.kc.m7147(r5, r4)
            if (r4 > 0) goto L44
            goto L45
        L44:
            return r2
        L45:
            int r4 = com.ironsource.adqualitysdk.sdk.i.at.f449
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f450 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L54
            r4 = 13
            int r4 = r4 / r2
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m4895(com.ironsource.adqualitysdk.sdk.i.cm, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4883(String str, JSONObject jSONObject) {
        t.m7288(this.f460.new AnonymousClass5(str, ba.b.f755));
        if (jSONObject != null) {
            f449 = (f450 + 121) % 128;
            try {
                jSONObject.put(m4869(new int[]{116, 3, 0, 3}, "\u0000\u0001\u0000", false).intern(), true);
                return;
            } catch (JSONException unused) {
            }
        }
        int i10 = f450 + 123;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long m4896(jc.e eVar) {
        if (ar.m4771().mo4798()) {
            return 2000L;
        }
        if (eVar != null && !this.f456.m6859(eVar)) {
            f449 = (f450 + 111) % 128;
            return 2000L;
        }
        int i10 = f449 + 53;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4876(String str, bd bdVar) {
        if (bdVar != null) {
            f450 = (f449 + 57) % 128;
            m4856().put(str, m4871(bdVar.m5105()));
            f450 = (f449 + 125) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m4894(cm cmVar) {
        int i10 = f450 + 31;
        f449 = i10 % 128;
        if (i10 % 2 == 0) {
            String strM5894 = cmVar.m5894();
            if (strM5894 == null || kc.m7147(IronSourceAdQuality.getSDKVersion(), strM5894) >= 0) {
                f450 = (f449 + 69) % 128;
                return true;
            }
            int i11 = f450 + 19;
            f449 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 54 / 0;
            }
            return false;
        }
        cmVar.m5894();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m4871(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ih.f2523, str);
        } catch (JSONException e10) {
            k.m7118(m4869(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4900("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36).intern(), e10);
        }
        int i10 = f450 + 47;
        f449 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4880(final Context context, final String str, final String str2, final gl glVar, final cm cmVar, final boolean z10, final bd bdVar, final ir irVar) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9

            /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
            private static int f569 = 1;

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static int f571;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char[] f572 = {'C', 59730, 53780, 48089, 42129, 36434, 30490, 24772, 18842, 13160, 7171, 1521, 61117, 55422, 49459, 43745, 'I', 59731, 53779, 48067, 42141, 36432, 30466, 24770, 18834, 13132, 7180, 1528, 61180, ' ', 59727, 53791, 48090, 42139, 36421, 30475, 24715, 18827, 13130, 7180, 1521, 61113, 55418, 49442, 43772, 37794, 32045, 23773, 46507, 36590, 59169, 63593, 53921, 11263, 15479, '(', 59739, 53791, 48067, 42135, 36441, 30475, 24783, 18881};

            /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
            private static long f570 = 5621330307211979069L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4931(int i10, char c10, int i11) {
                String str3;
                synchronized (d.f1677) {
                    try {
                        char[] cArr = new char[i11];
                        d.f1676 = 0;
                        while (true) {
                            int i12 = d.f1676;
                            if (i12 < i11) {
                                cArr[i12] = (char) ((((long) f572[i10 + i12]) ^ (((long) i12) * f570)) ^ ((long) c10));
                                d.f1676 = i12 + 1;
                            } else {
                                str3 = new String(cArr);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                int tapTimeout;
                char mode;
                int iIndexOf;
                if (cmVar != null) {
                    int i10 = f571 + 83;
                    f569 = i10 % 128;
                    if (i10 % 2 == 0) {
                        at.m4863(at.this).contains(glVar);
                        throw null;
                    }
                    if (!at.m4863(at.this).contains(glVar)) {
                        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.3

                            /* JADX INFO: renamed from: ﻐ */
                            private /* synthetic */ cm f771;

                            /* JADX INFO: renamed from: ﻛ */
                            private /* synthetic */ String f772;

                            /* JADX INFO: renamed from: ｋ */
                            private /* synthetic */ boolean f773;

                            AnonymousClass3(String str3, cm cmVar2, boolean z11) {
                                str = str3;
                                cmVar = cmVar2;
                                z = z11;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                ba baVarM5076 = bb.m5076(bb.this, str);
                                if (baVarM5076 != null) {
                                    baVarM5076.m5070(cmVar);
                                }
                            }
                        });
                        if (!cmVar.m5886()) {
                            f569 = (f571 + 111) % 128;
                            ir irVar2 = irVar;
                            if (irVar2 != null) {
                                t.m7283(irVar2);
                            }
                        }
                        if (at.m4911(cmVar)) {
                            String strIntern = m4931((-1) - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 16 - Color.argb(0, 0, 0, 0)).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m4931((KeyEvent.getMaxKeyCode() >> 16) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern());
                            sb2.append(str);
                            sb2.append(m4931(Color.alpha(0) + 29, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                            if (z10) {
                                f569 = (f571 + 75) % 128;
                                tapTimeout = 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                mode = (char) (Color.rgb(0, 0, 0) + 16801013);
                                iIndexOf = 8 - View.combineMeasuredStates(0, 0);
                            } else {
                                tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 55;
                                mode = (char) View.MeasureSpec.getMode(0);
                                iIndexOf = TextUtils.indexOf("", "", 0, 0) + 9;
                            }
                            sb2.append(m4931(tapTimeout, mode, iIndexOf).intern());
                            co.m5914(strIntern, sb2.toString());
                            bdVar.m5103();
                            if (cmVar.m5886()) {
                                int i11 = f571 + 113;
                                f569 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    throw null;
                                }
                                ir irVar3 = irVar;
                                if (irVar3 != null) {
                                    t.m7283(irVar3);
                                }
                            }
                            if (!s.m7239().m7266()) {
                                at.m4909(at.this, cmVar, str);
                                if (!at.m4884(at.this, cmVar.m5900())) {
                                    at.m4863(at.this).add(glVar);
                                    return;
                                }
                            }
                        } else {
                            t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9.1

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f582 = 136;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f583 = 0;

                                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                private static int f584 = 1;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static String m4932(String str3, int i12, boolean z11, int i13, int i14) {
                                    String str4;
                                    Object charArray = str3;
                                    if (str3 != null) {
                                        charArray = str3.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (b.f730) {
                                        try {
                                            char[] cArr2 = new char[i12];
                                            b.f728 = 0;
                                            while (true) {
                                                int i15 = b.f728;
                                                if (i15 >= i12) {
                                                    break;
                                                }
                                                b.f729 = cArr[i15];
                                                cArr2[b.f728] = (char) (b.f729 + i14);
                                                int i16 = b.f728;
                                                cArr2[i16] = (char) (cArr2[i16] - f582);
                                                b.f728 = i16 + 1;
                                            }
                                            if (i13 > 0) {
                                                b.f731 = i13;
                                                char[] cArr3 = new char[i12];
                                                System.arraycopy(cArr2, 0, cArr3, 0, i12);
                                                int i17 = b.f731;
                                                System.arraycopy(cArr3, 0, cArr2, i12 - i17, i17);
                                                int i18 = b.f731;
                                                System.arraycopy(cArr3, i18, cArr2, 0, i12 - i18);
                                            }
                                            if (z11) {
                                                char[] cArr4 = new char[i12];
                                                b.f728 = 0;
                                                while (true) {
                                                    int i19 = b.f728;
                                                    if (i19 >= i12) {
                                                        break;
                                                    }
                                                    cArr4[i19] = cArr2[(i12 - i19) - 1];
                                                    b.f728 = i19 + 1;
                                                }
                                                cArr2 = cArr4;
                                            }
                                            str4 = new String(cArr2);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str4;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4564() {
                                    int i12 = f584 + 95;
                                    f583 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        int i13 = 68 / 0;
                                        if (at.m4878(at.this).containsKey(cmVar.m5900())) {
                                            return;
                                        }
                                    } else if (at.m4878(at.this).containsKey(cmVar.m5900())) {
                                        return;
                                    }
                                    t.m7288(at.m4897(at.this).new AnonymousClass4(cmVar.m5900(), ba.c.f764));
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    JSONObject jSONObjectM4901 = at.m4901(at.this, cmVar);
                                    try {
                                        jSONObjectM4901.put(m4932("\u0005\ufff3\b", 3 - Color.alpha(0), false, 1 - (Process.myTid() >> 22), Process.getGidForName("") + 247).intern(), false);
                                        f583 = (f584 + 89) % 128;
                                    } catch (JSONException unused) {
                                    }
                                    at.m4857(at.this).put(cmVar.m5900(), jSONObjectM4901);
                                    String strM5078 = at.m4897(at.this).m5078(cmVar.m5900());
                                    at.m4878(at.this).put(cmVar.m5900(), strM5078);
                                    ISAdQualityInitListener iSAdQualityInitListenerM4915 = at.this.m4915();
                                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(cmVar.m5896());
                                    sb3.append(m4932("\u001b\n\u0017\u0018\u000e\u0014\u0013ￅￅ\u0018\t\u0010ￅ", '=' - AndroidCharacter.getMirror('0'), false, 8 - (KeyEvent.getMaxKeyCode() >> 16), 227 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                                    sb3.append(cmVar.m5891());
                                    sb3.append(m4932("\u000e\r\u0002\uffc1\u0014\u0005\f\uffc1\u0017\u0006\u0013\u0014\n\u0010\u000f\uffc1\uffc1\u0013\u0006\u0012\u0016\n\u0013\u0006\u0014\uffc1\ufff4\u0010\u0010", (ViewConfiguration.getScrollBarSize() >> 8) + 29, false, Process.getGidForName("") + 17, 231 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                                    sb3.append(cmVar.m5894());
                                    sb3.append(m4932("\u0012\t\u001b\t\u0016ￄ\u0013\u0016ￄ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, false, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 228).intern());
                                    iSAdQualityInitListenerM4915.adQualitySdkInitFailed(iSAdQualityInitError, sb3.toString());
                                    kd.m7168(m4932("\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, false, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 237 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM5078, null, true, true, true);
                                    f584 = (f583 + 107) % 128;
                                }
                            });
                        }
                    }
                }
                f571 = (f569 + 59) % 128;
            }
        });
        int i10 = f450 + 25;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m4879(cm cmVar) {
        int i10 = f450 + 125;
        f449 = i10 % 128;
        ?? r02 = i10 % 2;
        try {
            if (r02 != 0) {
                JSONObject jSONObjectM4871 = m4871(cmVar.m5891());
                jSONObjectM4871.put(ih.f2521, cmVar.m5899());
                int i11 = 15 / 0;
                r02 = jSONObjectM4871;
            } else {
                JSONObject jSONObjectM48712 = m4871(cmVar.m5891());
                jSONObjectM48712.put(ih.f2521, cmVar.m5899());
                r02 = jSONObjectM48712;
            }
        } catch (JSONException e10) {
            k.m7118(m4869(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4900("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", AndroidCharacter.getMirror('0') - 11).intern(), e10);
        }
        f450 = (f449 + 35) % 128;
        return r02;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4903(final Context context, final String str, final String str2, final List<gl> list, final ir irVar) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.4

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f527 = 1;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f528 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f529 = -1106430066;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static long f530;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f531;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4925(String str3, char c10, String str4, int i10, String str5) {
                String str6;
                Object charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2697) {
                    try {
                        char[] cArr4 = (char[]) cArr.clone();
                        char[] cArr5 = (char[]) cArr2.clone();
                        cArr4[0] = (char) (c10 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i10));
                        int length = cArr3.length;
                        char[] cArr6 = new char[length];
                        j.f2699 = 0;
                        while (true) {
                            int i11 = j.f2699;
                            if (i11 < length) {
                                int i12 = (i11 + 2) % 4;
                                int i13 = (i11 + 3) % 4;
                                int i14 = cArr4[i11 % 4] * 32718;
                                char c11 = cArr5[i12];
                                char c12 = (char) ((i14 + c11) % 65535);
                                j.f2698 = c12;
                                cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                                cArr4[i13] = c12;
                                int i15 = j.f2699;
                                cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f530) ^ ((long) f529)) ^ ((long) f528));
                                j.f2699 = i15 + 1;
                            } else {
                                str6 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str6;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                String strIntern = m4925("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", Process.getGidForName("") + 1, "鐒ಗ빹훧").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4925("灂\ued11紴㽌綃ᰶ觹\uf511㸯픢响샤㾼恉ᯢ闦뻯㚁\ue095⊂㴅굳\uee55", (char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", 16302 - AndroidCharacter.getMirror('0'), "纋먿䁩병").intern());
                sb2.append(str2);
                k.m7113(strIntern, sb2.toString());
                try {
                    at.m4892(at.this, context, str, str2, list, irVar);
                    int i10 = f527 + 95;
                    f531 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    if (at.m4897(at.this) != null) {
                        t.m7288(at.m4897(at.this).new AnonymousClass4(str2, ba.c.f767));
                    }
                    at.m4878(at.this).put(str, kd.m7169(th2).toString());
                    String strIntern2 = m4925("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.getDefaultSize(0, 0)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), "鐒ಗ빹훧").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m4925("⤮䶢蠹蘸넾䴁溒曜⠷䋈멺㑹㚿葢냀딨ﶫ\ue72fꞑᇌ囷샲끌뙾祾", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", Color.blue(0) + 878080180, "됓噰怴扔").intern());
                    sb3.append(str2);
                    kd.m7168(strIntern2, sb3.toString(), th2, true, true, true);
                    int i11 = f531 + 97;
                    f527 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 5 / 0;
                    }
                }
            }
        });
        int i10 = f450 + 77;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4889() {
        ArrayList<cm> arrayList = new ArrayList();
        for (cm cmVar : m4864()) {
            if (!(!m4912(cmVar.m5900()))) {
                int i10 = f449 + 17;
                f450 = i10 % 128;
                if (i10 % 2 == 0) {
                    arrayList.add(cmVar);
                    int i11 = 39 / 0;
                } else {
                    arrayList.add(cmVar);
                }
            }
        }
        for (final cm cmVar2 : arrayList) {
            String strIntern = m4869(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4869(new int[]{126, 10, 44, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            sb2.append(cmVar2.m5896());
            sb2.append(m4900("玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            k.m7109(strIntern, sb2.toString());
            String strM5900 = cmVar2.m5900();
            m4883(strM5900, m4856().get(strM5900));
            t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.8
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    cmVar2.m5895();
                }
            });
            m4862().remove(cmVar2);
        }
        int i12 = f449 + 111;
        f450 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4910(final cm cmVar, final String str) {
        final String strM5900 = cmVar.m5900();
        t.m7288(this.f460.new AnonymousClass5(strM5900, ba.b.f753));
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f538 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f540 = 6;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f541;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f544 = {'e', 'x', 'D', 'I', 'S', 'A', 'B', 'L', 'E', 'C', 'o', 'n', 'c', 't', 'r', 'M', 'a', 'g', ' ', 'i', 's', 'd', 'b', 'l', 'w', 'f', 'm', 'h', 'v', 'K', 'y', 'u', 'p', 'j', 'k', 'q'};

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static long f539 = -4808731631170578171L;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f542 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static char f543 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4927(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f544;
                        char c10 = f540;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            g.f2158 = 0;
                            while (true) {
                                int i11 = g.f2158;
                                if (i11 >= i10) {
                                    break;
                                }
                                g.f2157 = cArr[i11];
                                g.f2155 = cArr[g.f2158 + 1];
                                if (g.f2157 == g.f2155) {
                                    cArr3[g.f2158] = (char) (g.f2157 - b10);
                                    cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                                } else {
                                    g.f2156 = g.f2157 / c10;
                                    g.f2154 = g.f2157 % c10;
                                    g.f2159 = g.f2155 / c10;
                                    g.f2152 = g.f2155 % c10;
                                    if (g.f2154 == g.f2152) {
                                        g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                        g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                        int i12 = (g.f2156 * c10) + g.f2154;
                                        int i13 = (g.f2159 * c10) + g.f2152;
                                        int i14 = g.f2158;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (g.f2156 == g.f2159) {
                                        g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                        g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                        int i15 = (g.f2156 * c10) + g.f2154;
                                        int i16 = (g.f2159 * c10) + g.f2152;
                                        int i17 = g.f2158;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (g.f2156 * c10) + g.f2152;
                                        int i19 = (g.f2159 * c10) + g.f2154;
                                        int i20 = g.f2158;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                g.f2158 += 2;
                            }
                        }
                        str3 = new String(cArr3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4928(Throwable th2) {
                t.m7288(at.m4897(at.this).new AnonymousClass4(strM5900, ba.c.f761));
                String strIntern = m4927("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", TextUtils.lastIndexOf("", '0') + 17, (byte) (93 - (Process.myTid() >> 22))).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4926("蚤豸獒ꀜ犤킲睊숀\uf883\uf044渖鹸첹쿱䷥窨嵋鞅릎\ue4a8襣স\u2d68\uefee⒃‸슫뢅繋", (char) (KeyEvent.normalizeMetaState(0) + 25084), "餅⟤\uf40f뵃", (-540511747) - Process.getGidForName(""), "ﻛ족ﳟ깡").intern());
                sb2.append(strM5900);
                kd.m7168(strIntern, sb2.toString(), th2, true, true, true);
                f541 = (f538 + 1) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() throws Exception {
                f541 = (f538 + 29) % 128;
                JSONObject jSONObjectM4901 = at.m4901(at.this, cmVar);
                jSONObjectM4901.put(m4927("\u0001\u0002", (ViewConfiguration.getEdgeSlop() >> 16) + 2, (byte) (19 - TextUtils.lastIndexOf("", '0', 0))).intern(), true);
                at.m4857(at.this).put(cmVar.m5900(), jSONObjectM4901);
                String strM5891 = cmVar.m5891();
                if (m4927("\u0003\u0004\u0005\u0000\u0007\b\u000e\b", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 90)).intern().equals(strM5891)) {
                    String strIntern = m4927("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (Color.argb(0, 0, 0, 0) + 93)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cmVar.m5896());
                    sb2.append(m4927("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0013\u0014\u0015\u0013\u0016\u0014\u0016\u000e\u0017\u0012\u0003\u0012", 22 - (Process.myTid() >> 22), (byte) (79 - Gravity.getAbsoluteGravity(0, 0))).intern());
                    k.m7113(strIntern, sb2.toString());
                    t.m7288(at.m4897(at.this).new AnonymousClass5(strM5900, ba.b.f755));
                } else if (at.m4884(at.this, strM5900)) {
                    String strIntern2 = m4927("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (92 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cmVar.m5896());
                    sb3.append(m4927("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0018\u001e\u000e\u0016\u0013\u0016\u0014\u0015\u0016\u001c\u0012\u0005\u0016\u0013\u001a\r\b\u001c\u0013\f\u0018\u0003\u0013\u0015\u0002\f\u0018\u0004Î", (ViewConfiguration.getPressedStateDuration() >> 16) + 39, (byte) (91 - TextUtils.lastIndexOf("", '0'))).intern());
                    k.m7113(strIntern2, sb3.toString());
                    t.m7288(at.m4897(at.this).new AnonymousClass5(strM5900, ba.b.f755));
                    jSONObjectM4901.put(m4926("埖픴䣐", (char) (42294 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "餅⟤\uf40f뵃", (-1437013406) - (ViewConfiguration.getWindowTouchSlop() >> 8), "扛壪㚪ﮥ").intern(), true);
                } else if (at.m4877(cmVar, strM5891)) {
                    t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5.2

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f549 = 1;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static short[] f550 = null;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static int f551 = 0;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static byte[] f552 = {-86, -116, Ascii.DEL, -121, 114, -116, -107, 90, -126, 122, -112, Ascii.DEL, 118, -127, 126, -83, -67, -19, -7, 3, -17, Ascii.EM, -22, -25, Ascii.EM, -23, Ascii.ETB, 91, -75, Ascii.US, Ascii.DC2, -27, Ascii.GS, -31, Ascii.DC2, Ascii.FS, Ascii.DLE, Ascii.DC2, -4, Ascii.DLE, 65, -68, 17, -23, 3, -20, -27, Ascii.DC2, -19, Ascii.RS, 81, -98, 119, -121, 121, -58, -5, -8, 13, 78, -74, -5, 2, -14, 5, 9, -21, 82, -86, 7, -1, Ascii.NAK, -6, -13, 4, -5, 8, 71, -75, -1, 80, -88, Ascii.SI, -1, 1, 77, -67, -3, 1, -15, 4, Ascii.VT, -10, 87, -86, 7, -7, 4, 41, -83, -16, -80, 76, -90, 88, -76, 66, -79, -68, 66, -78, 76, 0, -25, 74, -76, 73, 100, -92, SignedBytes.MAX_POWER_OF_TWO, -72, 82, -67, -76, 67, -68, 79, 0, -90, 97, -105, -68, 99, 109, -101, 109, -118, 66, -117, 69, -49, -71, 107, -99, 95, -53, 105, 103, -111, 103, UnsignedBytes.MAX_POWER_OF_TWO, 72, -127, 79, -126, 102, 69, -43, -107, 105, -125, 125, -111, 103, -108, -103, 103, -105, 105, 37, -41, -107, 111, 109, -99, 59, -48, -109, -97, 108, -111, 126, 108, -104, 35, -62, 111, -111, 108, 97, 41, -34, 65, -91, -40, 103, -97, 117, -102, -109, 100, -101, 104, 39};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f553 = -2077917528;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f554 = -363816020;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f555 = 102;

                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo4928(Throwable th2) {
                            f549 = (f551 + 61) % 128;
                            try {
                                ((JSONObject) at.m4857(at.this).get(cmVar.m5900())).put(m4929(ExpandableListView.getPackedPositionType(0L) + 363816071, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 2077917633, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 124), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern(), false);
                                f551 = (f549 + 43) % 128;
                            } catch (JSONException e10) {
                                k.m7118(m4929(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) Color.argb(0, 0, 0, 0), 2077917595 - Color.red(0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 127), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern(), m4929(347038859 - Color.rgb(0, 0, 0), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2077917597, (byte) (5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-103) - Color.argb(0, 0, 0, 0)).intern(), e10);
                            }
                            t.m7288(at.m4897(at.this).new AnonymousClass4(strM5900, ba.c.f765));
                            String strIntern3 = m4929(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2077917595, (byte) ((-127) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m4929(363816119 - TextUtils.getTrimmedLength(""), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2077917598 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (73 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern());
                            sb4.append(cmVar.m5896());
                            sb4.append(m4929(363816138 - ((Process.getThreadPriority(0) + 20) >> 6), (short) (Process.myTid() >> 22), 2061140344 - Color.rgb(0, 0, 0), (byte) (67 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-103) - View.MeasureSpec.getMode(0)).intern());
                            kd.m7168(strIntern3, sb4.toString(), th2, true, true, true);
                            String strIntern4 = m4929(Gravity.getAbsoluteGravity(0, 0) + 363816148, (short) (ViewConfiguration.getTapTimeout() >> 16), 2077917593 - View.resolveSize(0, 0), (byte) (TextUtils.getOffsetAfter("", 0) + 102), TextUtils.indexOf("", "", 0, 0) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m4929(363816160 - View.resolveSizeAndState(0, 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2077917593, (byte) (108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-103) - View.getDefaultSize(0, 0)).intern());
                            sb5.append(cmVar.m5896());
                            sb5.append(m4929(Color.rgb(0, 0, 0) + 380593429, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2077917560 - TextUtils.getOffsetBefore("", 0), (byte) (100 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED).intern());
                            k.m7102(strIntern4, sb5.toString());
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            cmVar.m5897();
                            t.m7288(at.m4897(at.this).new AnonymousClass5(strM5900, ba.b.f752));
                            String strIntern3 = m4929(Gravity.getAbsoluteGravity(0, 0) + 363816020, (short) KeyEvent.getDeadChar(0, 0), 2077917595 - ExpandableListView.getPackedPositionType(0L), (byte) ((-128) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(cmVar.m5896());
                            sb4.append(m4929(363816035 - ImageFormat.getBitsPerPixel(0), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2077917560 - View.MeasureSpec.getSize(0), (byte) (Color.alpha(0) + 18), (ViewConfiguration.getScrollDefaultDelay() >> 16) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED).intern());
                            k.m7113(strIntern3, sb4.toString());
                            int i10 = f549 + 123;
                            f551 = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 59 / 0;
                            }
                        }

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m4929(int i10, short s10, int i11, byte b10, int i12) {
                            String string;
                            synchronized (o.f3017) {
                                try {
                                    StringBuilder sb4 = new StringBuilder();
                                    int i13 = f555;
                                    int i14 = i12 + i13;
                                    int i15 = i14 == -1 ? 1 : 0;
                                    if (i15 != 0) {
                                        byte[] bArr = f552;
                                        if (bArr != null) {
                                            i14 = (byte) (bArr[f554 + i10] + i13);
                                        } else {
                                            i14 = (short) (f550[f554 + i10] + i13);
                                        }
                                    }
                                    if (i14 > 0) {
                                        o.f3018 = ((i10 + i14) - 2) + f554 + i15;
                                        o.f3019 = b10;
                                        char c10 = (char) (i11 + f553);
                                        o.f3021 = c10;
                                        sb4.append(c10);
                                        o.f3020 = o.f3021;
                                        o.f3022 = 1;
                                        while (o.f3022 < i14) {
                                            byte[] bArr2 = f552;
                                            if (bArr2 != null) {
                                                int i16 = o.f3018;
                                                o.f3018 = i16 - 1;
                                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                            } else {
                                                short[] sArr = f550;
                                                int i17 = o.f3018;
                                                o.f3018 = i17 - 1;
                                                o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                                            }
                                            sb4.append(o.f3021);
                                            o.f3020 = o.f3021;
                                            o.f3022++;
                                        }
                                    }
                                    string = sb4.toString();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return string;
                        }
                    });
                    at.m4870(at.this).add(cmVar);
                    f541 = (f538 + 87) % 128;
                } else {
                    jSONObjectM4901.put(m4926("ﬖ\uf343︾", (char) (19417 - Process.getGidForName("")), "餅⟤\uf40f뵃", 152449899 - TextUtils.getOffsetBefore("", 0), "殷ᘳ\uda09橋").intern(), false);
                    t.m7288(at.m4897(at.this).new AnonymousClass4(strM5900, ba.c.f766));
                    String strIntern3 = m4927("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (byte) (93 - TextUtils.getOffsetAfter("", 0))).intern();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m4926("꺍봤\ue5db\ue9f9ԃ\ue601훎閼详篂\udfb4褮ꯚ䏣忯쵶庢ゃވ", (char) (61250 - MotionEvent.axisFromString("")), "餅⟤\uf40f뵃", 23545356 - Color.rgb(0, 0, 0), "\u0cd9杆䌂㣯").intern());
                    kd.m7168(strIntern3, sb4.toString(), null, true, true, true);
                    ISAdQualityInitListener iSAdQualityInitListenerM4915 = at.this.m4915();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(cmVar.m5896());
                    sb5.append(m4927("\u0016\u0000\u0005\u001a\u0016\u0018\u0002\f\u0015\u0014\u000b\u0006:", 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26)).intern());
                    sb5.append(cmVar.m5891());
                    sb5.append(m4927("\u0013\u0014\u0015\u0013\u0006\u000b\f\u0013\u0000\u0006\f\u0013\u0013 ÑÑ\b\u0010\f\u0001\u0016\u0013\u0012\"\u0013\f\u0018\u0003\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010", 37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 97)).intern());
                    iSAdQualityInitListenerM4915.adQualitySdkInitFailed(iSAdQualityInitError, sb5.toString());
                    f538 = (f541 + 17) % 128;
                }
                jSONObjectM4901.remove(m4927("\u0001\u0002", 2 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 20)).intern());
                f538 = (f541 + 103) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4926(String str2, char c10, String str3, int i10, String str4) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str3;
                if (str3 != null) {
                    charArray2 = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str2;
                if (str2 != null) {
                    charArray3 = str2.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2697) {
                    try {
                        char[] cArr4 = (char[]) cArr.clone();
                        char[] cArr5 = (char[]) cArr2.clone();
                        cArr4[0] = (char) (c10 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i10));
                        int length = cArr3.length;
                        char[] cArr6 = new char[length];
                        j.f2699 = 0;
                        while (true) {
                            int i11 = j.f2699;
                            if (i11 < length) {
                                int i12 = (i11 + 2) % 4;
                                int i13 = (i11 + 3) % 4;
                                int i14 = cArr4[i11 % 4] * 32718;
                                char c11 = cArr5[i12];
                                char c12 = (char) ((i14 + c11) % 65535);
                                j.f2698 = c12;
                                cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                                cArr4[i13] = c12;
                                int i15 = j.f2699;
                                cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f539) ^ ((long) f542)) ^ ((long) f543));
                                j.f2699 = i15 + 1;
                            } else {
                                str5 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str5;
            }
        });
        f450 = (f449 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m4872(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i10 = f450 + 45;
            f449 = i10 % 128;
            if (i10 % 2 != 0) {
                String str = (String) it.next();
                jSONObject2.put(str.toLowerCase(), map.get(str));
                int i11 = 40 / 0;
            } else {
                String str2 = (String) it.next();
                jSONObject2.put(str2.toLowerCase(), map.get(str2));
            }
        }
        jSONObject.put(m4869(new int[]{136, 4, 198, 1}, (String) null, true).intern(), jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m4912(String str) {
        f449 = (f450 + 83) % 128;
        if (this.f457.containsKey(str) && this.f457.get(str).m4946(this.f461)) {
            f450 = (f449 + 95) % 128;
            return true;
        }
        f450 = (f449 + 99) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4900(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f448)) ^ ((c11 >>> 5) + f447)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f452) ^ ((c12 + i12) ^ ((c12 << 4) + f453))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4917(String str) {
        m4914(str, new ArrayList());
        int i10 = f449 + 91;
        f450 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m4915() {
        int i10 = f450 + 31;
        f449 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f454;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4914(String str, List<Object> list) {
        f450 = (f449 + 1) % 128;
        Iterator<cm> it = m4864().iterator();
        while (it.hasNext()) {
            f450 = (f449 + 31) % 128;
            it.next().m5898(str, list);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4869(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f451, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
