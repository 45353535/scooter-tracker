package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class cr extends cz {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1536 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1537 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f1538 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1539 = -981190970;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1540 = -1758668647;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1541 = 65;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1542 = {7, -15, -38, 5, Ascii.VT, -3, Ascii.VT, -20, 36, -19, 35, 0};

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static ii m6033() {
        int i10 = f1536 + 115;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return jf.m6944().m6951();
        }
        int i11 = 59 / 0;
        return jf.m6944().m6951();
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static JSONObject m6034() {
        f1537 = (f1536 + 63) % 128;
        JSONObject jSONObjectM4765 = ar.m4771().mo4783().m4765();
        int i10 = f1537 + 23;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 90 / 0;
        }
        return jSONObjectM4765;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static double m6035() {
        double dMo4787;
        int i10 = f1536 + 9;
        f1537 = i10 % 128;
        if (i10 % 2 == 0) {
            dMo4787 = ar.m4771().mo4787();
            int i11 = 53 / 0;
        } else {
            dMo4787 = ar.m4771().mo4787();
        }
        f1537 = (f1536 + 81) % 128;
        return dMo4787;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static String m6036() {
        int i10 = f1537 + 17;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4771().mo4783().m4764();
            throw null;
        }
        String strM4764 = ar.m4771().mo4783().m4764();
        f1536 = (f1537 + 15) % 128;
        return strM4764;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static boolean m6037() {
        int i10 = f1536 + 97;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return ar.m4771().mo4792();
        }
        ar.m4771().mo4792();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static JSONObject m6038() {
        int i10 = f1537 + 5;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4771().mo4783().m4805();
            throw null;
        }
        JSONObject jSONObjectM4805 = ar.m4771().mo4783().m4805();
        int i11 = f1537 + 81;
        f1536 = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObjectM4805;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m6039() {
        boolean zMo4788;
        int i10 = f1537 + 39;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            zMo4788 = ar.m4771().mo4788();
            int i11 = 80 / 0;
        } else {
            zMo4788 = ar.m4771().mo4788();
        }
        f1537 = (f1536 + 25) % 128;
        return zMo4788;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m6040() {
        String sDKVersion;
        int i10 = f1536 + 1;
        f1537 = i10 % 128;
        if (i10 % 2 == 0) {
            sDKVersion = IronSourceAdQuality.getSDKVersion();
            int i11 = 65 / 0;
        } else {
            sDKVersion = IronSourceAdQuality.getSDKVersion();
        }
        int i12 = f1536 + 101;
        f1537 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 96 / 0;
        }
        return sDKVersion;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static JSONObject m6042() {
        f1537 = (f1536 + 21) % 128;
        JSONObject jSONObjectM7082 = jz.m7082(ar.m4771().m4805());
        int i10 = f1536 + 59;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return jSONObjectM7082;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static dg m6043() {
        dg dgVar = new dg();
        int i10 = f1536 + 103;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return dgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static di m6045() {
        di diVar = new di();
        int i10 = f1537 + 69;
        f1536 = i10 % 128;
        if (i10 % 2 == 0) {
            return diVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static dj m6047() {
        dj djVar = new dj();
        int i10 = f1537 + 85;
        f1536 = i10 % 128;
        if (i10 % 2 == 0) {
            return djVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m6050(cq cqVar, List<Object> list) {
        String str;
        Object objM6139;
        int i10 = f1536 + 95;
        f1537 = i10 % 128;
        if (i10 % 2 == 0) {
            str = (String) cz.m6139(list, 0, String.class);
            objM6139 = cz.m6139(list, 0, JSONObject.class);
        } else {
            str = (String) cz.m6139(list, 0, String.class);
            objM6139 = cz.m6139(list, 1, JSONObject.class);
        }
        cqVar.m5980(str, (JSONObject) objM6139);
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static long m6052() {
        f1537 = (f1536 + 43) % 128;
        long jM7068 = jx.m7068();
        f1536 = (f1537 + 61) % 128;
        return jM7068;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m6054() {
        f1537 = (f1536 + 39) % 128;
        long jM6780 = m6033().m6780();
        f1537 = (f1536 + 51) % 128;
        return jM6780;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m6059() {
        f1536 = (f1537 + 15) % 128;
        ii iiVarM6033 = m6033();
        JSONObject jSONObjectM7091 = jz.m7091(iiVarM6033.m6778(), iiVarM6033.m6777(), iiVarM6033.m6780(), iiVarM6033.m6779());
        int i10 = f1537 + 101;
        f1536 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM7091;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m6062(cq cqVar) {
        int i10 = f1536 + 73;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        Context contextM5977 = cqVar.m5977();
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        return contextM5977;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m6041(cq cqVar) {
        f1537 = (f1536 + 119) % 128;
        String strM6626 = cqVar.m5976().m6626();
        f1536 = (f1537 + 31) % 128;
        return strM6626;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m6044(cq cqVar) {
        f1537 = (f1536 + 69) % 128;
        String strM5899 = cqVar.m5983().m5899();
        int i10 = f1537 + 121;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
        return strM5899;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String m6046(cq cqVar) {
        int i10 = f1537 + 105;
        f1536 = i10 % 128;
        int i11 = i10 % 2;
        cm cmVarM5983 = cqVar.m5983();
        if (i11 != 0) {
            cmVarM5983.m5900();
            throw null;
        }
        String strM5900 = cmVarM5983.m5900();
        f1536 = (f1537 + 89) % 128;
        return strM5900;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m6053(cq cqVar) {
        int i10 = f1537 + 19;
        f1536 = i10 % 128;
        int i11 = i10 % 2;
        cm cmVarM5983 = cqVar.m5983();
        if (i11 == 0) {
            return cmVarM5983.m5890();
        }
        cmVarM5983.m5890();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m6061() {
        f1536 = (f1537 + 63) % 128;
        Activity activityMo6965 = jj.m6964().mo6965();
        int i10 = f1537 + 99;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 40 / 0;
        }
        return activityMo6965;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m6064(List<Object> list) {
        String str = (String) cz.m6139(list, 0, String.class);
        List<Object> listM6141 = cz.m6141(list, 1);
        at atVarM7265 = s.m7239().m7265();
        if (atVarM7265 != null) {
            f1536 = (f1537 + 39) % 128;
            atVarM7265.m4914(str, listM6141);
        }
        int i10 = f1536 + 101;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m6056(cq cqVar) {
        int i10 = f1537 + 111;
        f1536 = i10 % 128;
        int i11 = i10 % 2;
        String strM5891 = cqVar.m5983().m5891();
        if (i11 != 0) {
            int i12 = 67 / 0;
        }
        f1537 = (f1536 + 49) % 128;
        return strM5891;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m6060(cq cqVar) {
        f1537 = (f1536 + 111) % 128;
        JSONObject jSONObjectM5974 = cqVar.m5974();
        int i10 = f1537 + 53;
        f1536 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM5974;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m6057(List<Object> list) {
        f1537 = (f1536 + 17) % 128;
        String lowerCase = ISAdQualityAdType.fromInt(((Integer) cz.m6139(list, 0, Integer.class)).intValue()).name().toLowerCase();
        f1536 = (f1537 + 1) % 128;
        return lowerCase;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m6058(List<Object> list) {
        f1536 = (f1537 + 41) % 128;
        Object objM4763 = ar.m4771().mo4783().m4763((String) cz.m6139(list, 0, String.class));
        int i10 = f1536 + 57;
        f1537 = i10 % 128;
        if (i10 % 2 != 0) {
            return objM4763;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m6063(final cq cqVar, List<Object> list, final du duVar) {
        final ds dsVar;
        int i10 = f1537 + 69;
        f1536 = i10 % 128;
        if (i10 % 2 == 0 ? (dsVar = (ds) cz.m6139(list, 0, ds.class)) != null : (dsVar = (ds) cz.m6139(list, 1, ds.class)) != null) {
            cqVar.m5984(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.cr.3
                @Override // com.ironsource.adqualitysdk.sdk.i.il
                /* JADX INFO: renamed from: ｋ */
                public final JSONObject mo4924(String str, JSONObject jSONObject) {
                    return (JSONObject) dsVar.m6385(duVar, cqVar, Arrays.asList(str, jSONObject)).m6377();
                }
            });
        }
        f1537 = (f1536 + 89) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6055(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1541;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1542;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1539 + i10] + i13);
                    } else {
                        i14 = (short) (f1538[f1539 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1539 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1540);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1542;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1538;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m6049(cq cqVar) {
        f1537 = (f1536 + 83) % 128;
        cm cmVarM5983 = cqVar.m5983();
        f1536 = (f1537 + 115) % 128;
        return cmVarM5983;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static dk m6048() {
        dk dkVar = new dk();
        int i10 = f1537 + 125;
        f1536 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return dkVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m6051(List<Object> list) {
        f1536 = (f1537 + 31) % 128;
        k.m7109(m6055((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 981190970, (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1758668713 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getOffsetAfter("", 0) - 53).intern(), (String) cz.m6139(list, 0, String.class));
        f1536 = (f1537 + 85) % 128;
        return null;
    }
}
