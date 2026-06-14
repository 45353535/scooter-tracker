package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class cd extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1277 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1278 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1279 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1280 = 37669;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1281 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1282 = 176;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1283;

    public cd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m5747() {
        f1277 = (f1278 + 117) % 128;
        Class clsM5748 = m5748();
        hu.m6637().m6640();
        try {
            Iterator<Field> it = hu.m6637().m6640().m6589(clsM5748, hq.m6584().m6575(String.class).m6574(8).m6573(16).m6576()).iterator();
            f1278 = (f1277 + 121) % 128;
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (str.startsWith(m5753("菀뾮ऌ\ude59᫁‽㻊♖拫㰽읦衻", (char) Color.red(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "㗷ོ禌圙").intern()) || !(!str.startsWith(m5753("邳릺撶⛭攃ᴃ\ue093优쯮鳘뻔", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", 1474229890 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "脆\udef6蕗较").intern()))) {
                    return str.split(m5754("\u0000", AndroidCharacter.getMirror('0') - '/', false, 1 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 236).intern())[0];
                }
            }
            f1277 = (f1278 + 47) % 128;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Class m5748() {
        int i10 = f1277 + 17;
        f1278 = i10 % 128;
        if (i10 % 2 != 0) {
            return VungleApiClient.class;
        }
        int i11 = 40 / 0;
        return VungleApiClient.class;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Map<String, String> m5749(Advertisement advertisement) {
        f1277 = (f1278 + 29) % 128;
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        f1278 = (f1277 + 11) % 128;
        return downloadableUrls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m5750(Advertisement advertisement) {
        f1278 = (f1277 + 7) % 128;
        Map<String, String> mapM5749 = m5749(advertisement);
        int i10 = f1277 + 47;
        f1278 = i10 % 128;
        if (i10 % 2 != 0) {
            return mapM5749;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5752(Advertisement advertisement) {
        f1277 = (f1278 + 107) % 128;
        String strM5759 = m5759(advertisement);
        f1278 = (f1277 + 117) % 128;
        return strM5759;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m5756(Placement placement) {
        f1277 = (f1278 + 65) % 128;
        boolean zM5760 = m5760(placement);
        f1277 = (f1278 + 75) % 128;
        return zM5760;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5757(Advertisement advertisement) {
        int i10 = f1278 + 17;
        f1277 = i10 % 128;
        int i11 = i10 % 2;
        String strM5755 = m5755(advertisement);
        if (i11 != 0) {
            int i12 = 95 / 0;
        }
        return strM5755;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Placement m5758(Repository repository, String str) {
        f1278 = (f1277 + 69) % 128;
        Placement placementM5751 = m5751(repository, str);
        int i10 = f1278 + 109;
        f1277 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementM5751;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5755(Advertisement advertisement) {
        int i10 = f1278 + 13;
        f1277 = i10 % 128;
        int i11 = i10 % 2;
        String campaign = advertisement.getCampaign();
        if (i11 != 0) {
            int i12 = 37 / 0;
        }
        f1278 = (f1277 + 59) % 128;
        return campaign;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5753("⋧Ⓔټ횠㜣錤졚\uec9b茅❙呵ᗄ", (char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "Ꭿ㻗滶뵽").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cd.m5758((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m5754("￠\n\u0000\ufffb￼\u0011\u0000\r\u0000\u000b\u0005￼\ufffa\u0005", ExpandableListView.getPackedPositionChild(0L) + 15, true, 3 - Gravity.getAbsoluteGravity(0, 0), 329 - AndroidCharacter.getMirror('0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(cd.m5756((Placement) list.get(0)));
            }
        });
        map.put(m5754("￠\u0013\u0004\u0006\u0003￨\u0013\u0004\n\u0011\u0000￬\u0003", Color.rgb(0, 0, 0) + 16777229, true, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + 273).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cd.m5752((Advertisement) list.get(0));
            }
        });
        map.put(m5754("￼\uffde\u000f\u0000\u0002\t\u0002\u0004￼\u000b\b", (ViewConfiguration.getEdgeSlop() >> 16) + 11, true, 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 276 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cd.m5757((Advertisement) list.get(0));
            }
        });
        map.put(m5754("\u0005\b\ufffa�\ufffa\ufffb\u0005\ufffe￮\u000b\u0005\f\u0000\ufffe\r\uffdd\b\u0010\u0007", 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, ImageFormat.getBitsPerPixel(0) + 13, 279 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cd.m5750((Advertisement) list.get(0));
            }
        });
        int i10 = f1278 + 11;
        f1277 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        String strMo5107 = mo5107();
        if (strMo5107 == null) {
            f1277 = (f1278 + 61) % 128;
            return null;
        }
        int i10 = f1277 + 55;
        f1278 = i10 % 128;
        return i10 % 2 == 0 ? strMo5107.split(m5754("\u0000", 1 % (KeyEvent.getMaxKeyCode() * 50), true, Color.alpha(0), 26994 >>> Color.blue(1)).intern())[0] : strMo5107.split(m5754("\u0000", (KeyEvent.getMaxKeyCode() >> 16) + 1, false, Color.alpha(0) + 1, 223 - Color.blue(0)).intern())[1];
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo5107() {
        if (this.f1283 == null) {
            int i10 = f1278 + 93;
            f1277 = i10 % 128;
            if (i10 % 2 != 0) {
                String strM5747 = m5747();
                this.f1283 = strM5747;
                m5101(strM5747);
                throw null;
            }
            String strM57472 = m5747();
            this.f1283 = strM57472;
            m5101(strM57472);
            f1277 = (f1278 + 99) % 128;
        }
        return this.f1283;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m5751(Repository repository, String str) {
        f1278 = (f1277 + 47) % 128;
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i10 = f1278 + 95;
        f1277 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
        return placement;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5754(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[b.f728] = (char) (b.f729 + i12);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f1282);
                    b.f728 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f731 = i11;
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x01e1  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cd.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5753(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1281) ^ ((long) f1279)) ^ ((long) f1280));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5760(Placement placement) {
        int i10 = f1277 + 101;
        f1278 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        f1278 = (f1277 + 37) % 128;
        return zIsIncentivized;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5759(Advertisement advertisement) {
        int i10 = f1277 + 19;
        f1278 = i10 % 128;
        if (i10 % 2 == 0) {
            advertisement.getAdMarketId();
            throw null;
        }
        String adMarketId = advertisement.getAdMarketId();
        f1277 = (f1278 + 31) % 128;
        return adMarketId;
    }
}
