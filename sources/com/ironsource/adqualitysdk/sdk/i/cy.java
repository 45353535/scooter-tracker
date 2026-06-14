package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cy extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1670 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1671 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1672 = 3474872421718127106L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m6134(cq cqVar, List<Object> list) {
        String string;
        Class cls = (Class) cz.m6139(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            f1670 = (f1671 + 17) % 128;
            arrayList = (List) cz.m6139(list, 1, List.class);
            f1671 = (f1670 + 39) % 128;
        }
        List list2 = list.size() > 2 ? (List) cz.m6139(list, 2, List.class) : null;
        try {
            if (list2 == null) {
                return kb.m7137(cls, (List<Object>) arrayList);
            }
            int i10 = f1671 + 91;
            f1670 = i10 % 128;
            if (i10 % 2 == 0) {
                Class[] clsArr = new Class[list2.size()];
                list2.toArray(clsArr);
                return kb.m7144(cls, arrayList, clsArr);
            }
            Class[] clsArr2 = new Class[list2.size()];
            list2.toArray(clsArr2);
            kb.m7144(cls, arrayList, clsArr2);
            throw null;
        } catch (Exception e10) {
            String strM5900 = cqVar.m5983().m5900();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6137("片崱Ⳳﾮ콴鹧槧㢷\u086f\udb2a\uaafc疠䕠ᐨ\ue7ac뚣虷儤₰", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12096).intern());
            sb2.append(cls.getName());
            sb2.append(m6137("爢囮㭝ᾧ\ue006씥꧁牍嚽㬂ᰬ", 9371 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(arrayList);
            if (list2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m6137("爢쀎ᚶ攡뮖เ峠銘\ue119㞤訥\ud8de⼾", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 45677).intern());
                sb3.append(list2);
                string = sb3.toString();
            } else {
                string = "";
            }
            sb2.append(string);
            co.m5911(strM5900, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m6135(List<Object> list) {
        f1671 = (f1670 + 59) % 128;
        if (kb.m7131(cz.m6139(list, 0, Object.class), (String) cz.m6139(list, 1, String.class), (List) cz.m6139(list, 2, List.class)) == null) {
            return false;
        }
        f1671 = (f1670 + 79) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m6136(List<Object> list) {
        f1670 = (f1671 + 41) % 128;
        Class<?> cls = Array.newInstance((Class<?>) cz.m6139(list, 0, Class.class), 0).getClass();
        int i10 = f1671 + 75;
        f1670 = i10 % 128;
        if (i10 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6137(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1672);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static char m6133(List<Object> list) {
        int i10 = f1671 + 25;
        f1670 = i10 % 128;
        int i11 = i10 % 2;
        char cIntValue = (char) ((Number) cz.m6139(list, 0, Number.class)).intValue();
        int i12 = f1671 + 75;
        f1670 = i12 % 128;
        if (i12 % 2 == 0) {
            return cIntValue;
        }
        throw null;
    }
}
