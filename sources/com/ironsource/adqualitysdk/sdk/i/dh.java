package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.jz;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class dh {

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1726 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1729;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Map<String, dn> f1731;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private dp f1732;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private du f1734;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1735;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1736;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1737;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f1738;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1739;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1740;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1741;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1728 = {'@', 'y', 'y', '{', '2', 'i', 'g', 'W', 'c', 'm', 'f', 'n', 'q', 'n', 'f', '6', 'k', 'k', '`', '[', 'g', '9', 's', 's', 'p', 'n', 'Y', 'W', 'f', 'a', 'h', 'm', 'i', '2', 'c', IOUtils.DIR_SEPARATOR_WINDOWS, '_', 'g', 'n', '`', '^', 'u', '9', 'k', 'i', 'i', 'l', 's', 'n', 'j', 'o'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1730 = {29873, 5452, 46953, 20862, 62230, 40206, 16189, 5511, 29797, 54862, 12403, 37430, 64551, 'E', 24988, 50094, 9637, 34762, 59782, 19447, 44528, 3861, 28991, 54072, 13651, 38726, 63857, 23332, 48273, 7823, 32928, 58066, 17615, 42747, 2290, 27163, 52240, 11888, 36957, 62019, 21620, 46702, 6047, 31107, 34882, 59808, 19347, 44440, 4077, 25076, 'm', 24971, 50097, 9640, 34781, 59860, 19431, 's', 24970, 50103, 9630, 34775, 59879, 19443, 44519, 3870, 28970, 54042, 13663, 38746, 63845, 23405, 48285, 7822, 32957};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1727 = 5635646060697444846L;

    public dh(String str, du duVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1738 = jSONObject;
            this.f1737 = duVar;
            this.f1740 = jSONObject.optString(m6200(new int[]{0, 4, 18, 0}, "\u0000\u0001\u0000\u0000", false).intern());
            this.f1739 = this.f1738.optString(m6200(new int[]{4, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true).intern());
            this.f1741 = this.f1738.optString(m6198(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (29895 - (Process.myPid() >> 22)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern());
            this.f1735 = this.f1738.optString(m6200(new int[]{15, 6, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            this.f1733 = this.f1738.optString(m6198(7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 5610), View.MeasureSpec.getMode(0) + 6).intern());
            if (this.f1738.has(m6200(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern())) {
                m6201(this.f1738.optJSONObject(m6200(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern()));
            }
        } catch (Throwable th2) {
            co.m5911(this.f1740, m6198(ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6199(dh dhVar) {
        int i10 = f1726;
        f1729 = (i10 + 59) % 128;
        String str = dhVar.f1740;
        f1729 = (i10 + 31) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6201(JSONObject jSONObject) {
        int i10 = f1729 + 21;
        f1726 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i11 = f1729 + 9;
            f1726 = i11 % 128;
            if (i11 % 2 == 0) {
                String next = itKeys.next();
                this.f1737.m6397(next, jSONObject.opt(next));
                throw null;
            }
            String next2 = itKeys.next();
            this.f1737.m6397(next2, jSONObject.opt(next2));
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dn> m6202() {
        f1729 = (f1726 + 31) % 128;
        if (this.f1731 == null) {
            this.f1731 = jz.m7085(this.f1738.optJSONObject(m6200(new int[]{42, 9, 0, 8}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true).intern()), new jz.c<dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final /* synthetic */ dn mo4837(JSONObject jSONObject, String str) {
                    return new dn(dh.m6199(dh.this), str, jSONObject.optJSONObject(str));
                }
            });
        }
        Map<String, dn> map = this.f1731;
        f1726 = (f1729 + 17) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m6203() {
        int i10 = f1726 + 81;
        f1729 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f1734 == null) {
            du duVar = new du(jz.m7085(this.f1738.optJSONObject(m6198((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34850), 6 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()), new jz.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.2

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f1743 = 1;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f1744 = {'q', '>', 't', 'u', '~', 'z', 'w', 'v', 'O', '>', 'g', '~', '|', '|', 'U', '9', 'p', 'n', 'i', 'A', ' ', '-', 'W'};

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f1745;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m6211(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (i.f2472) {
                        try {
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            int i13 = iArr[2];
                            int i14 = iArr[3];
                            char[] cArr = new char[i12];
                            System.arraycopy(f1744, i11, cArr, 0, i12);
                            if (bArr != null) {
                                char[] cArr2 = new char[i12];
                                i.f2471 = 0;
                                char c10 = 0;
                                while (true) {
                                    int i15 = i.f2471;
                                    if (i15 >= i12) {
                                        break;
                                    }
                                    if (bArr[i15] == 1) {
                                        cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c10);
                                    } else {
                                        cArr2[i15] = (char) ((cArr[i15] << 1) - c10);
                                    }
                                    c10 = cArr2[i15];
                                    i.f2471 = i15 + 1;
                                }
                                cArr = cArr2;
                            }
                            if (i14 > 0) {
                                char[] cArr3 = new char[i12];
                                System.arraycopy(cArr, 0, cArr3, 0, i12);
                                int i16 = i12 - i14;
                                System.arraycopy(cArr3, 0, cArr, i16, i14);
                                System.arraycopy(cArr3, i14, cArr, 0, i16);
                            }
                            if (z10) {
                                char[] cArr4 = new char[i12];
                                i.f2471 = 0;
                                while (true) {
                                    int i17 = i.f2471;
                                    if (i17 >= i12) {
                                        break;
                                    }
                                    cArr4[i17] = cArr[(i12 - i17) - 1];
                                    i.f2471 = i17 + 1;
                                }
                                cArr = cArr4;
                            }
                            if (i13 > 0) {
                                i.f2471 = 0;
                                while (true) {
                                    int i18 = i.f2471;
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    cArr[i18] = (char) (cArr[i18] - iArr[2]);
                                    i.f2471 = i18 + 1;
                                }
                            }
                            str2 = new String(cArr);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final Object mo4837(JSONObject jSONObject, String str) {
                    f1745 = (f1743 + 71) % 128;
                    try {
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m6211(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            sb2.append(strOptString);
                            sb2.append(m6211(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            strOptString = sb2.toString();
                            f1743 = (f1745 + 47) % 128;
                        }
                        String strM6199 = dh.m6199(dh.this);
                        return new dq(strM6199, strOptString).m6367(dt.m6387(strM6199, strOptString, strOptString));
                    } catch (Throwable th2) {
                        String strM61992 = dh.m6199(dh.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m6211(new int[]{1, 14, 12, 8}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern());
                        sb3.append(str);
                        sb3.append(m6211(new int[]{15, 8, 0, 5}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000", true).intern());
                        sb3.append(jSONObject.optString(str));
                        co.m5911(strM61992, sb3.toString(), th2);
                        return null;
                    }
                }
            }), this.f1737, true);
            this.f1734 = duVar;
            duVar.m6395(jz.m7093(this.f1738.optJSONArray(m6198(50 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.resolveSizeAndState(0, 0, 0), (Process.myTid() >> 22) + 7).intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ String mo4838(JSONArray jSONArray, int i11) {
                    return dz.m6421(jSONArray.optString(i11));
                }
            }));
            f1726 = (f1729 + 57) % 128;
        }
        return this.f1734;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.dp m6204() {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dh.f1726
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dh.f1729 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1732
            r2 = 60
            int r2 = r2 / r1
            if (r0 != 0) goto L42
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1732
            if (r0 != 0) goto L42
        L19:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = new com.ironsource.adqualitysdk.sdk.i.dp
            org.json.JSONObject r2 = r6.f1738
            r3 = 9
            r4 = 8
            r5 = 33
            int[] r3 = new int[]{r5, r3, r1, r4}
            java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000"
            java.lang.String r1 = m6200(r3, r4, r1)
            java.lang.String r1 = r1.intern()
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            r0.<init>(r1)
            r6.f1732 = r0
            int r0 = com.ironsource.adqualitysdk.sdk.i.dh.f1729
            int r0 = r0 + 67
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dh.f1726 = r0
        L42:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1732
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dh.m6204():com.ironsource.adqualitysdk.sdk.i.dp");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6205() {
        int i10 = f1729;
        String str = this.f1735;
        int i11 = i10 + 87;
        f1726 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6208() {
        int i10 = f1729;
        String str = this.f1740;
        int i11 = i10 + 53;
        f1726 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6210() {
        int i10 = f1726 + 117;
        f1729 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1741;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6206() {
        int i10 = f1726 + 1;
        f1729 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1733;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6209(String str) {
        Map<String, String> mapM7090;
        f1726 = (f1729 + 101) % 128;
        if (this.f1736 == null && (mapM7090 = jz.m7090(this.f1738.optJSONObject(m6198(TextUtils.lastIndexOf("", '0', 0, 0) + 58, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 18 - Color.green(0)).intern()))) != null) {
            ArrayList<String> arrayList = new ArrayList(mapM7090.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    return kc.m7147(str2, str3);
                }
            });
            String str2 = null;
            for (String str3 : arrayList) {
                if (kc.m7147(str, str3) >= 0) {
                    f1729 = (f1726 + 39) % 128;
                    str2 = mapM7090.get(str3);
                    f1726 = (f1729 + 123) % 128;
                }
                f1729 = (f1726 + 103) % 128;
            }
            this.f1736 = str2;
        }
        return this.f1736;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6198(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1730[i10 + i12]) ^ (((long) i12) * f1727)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6207() {
        int i10 = (f1729 + 43) % 128;
        f1726 = i10;
        String str = this.f1739;
        int i11 = i10 + 107;
        f1729 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 50 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6200(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1728, i10, cArr, 0, i11);
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
