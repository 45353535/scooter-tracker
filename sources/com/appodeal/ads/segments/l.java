package com.appodeal.ads.segments;

import com.appodeal.ads.jc;
import com.appodeal.ads.utils.Version;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static boolean a(r rVar, Object obj) {
        int iA = jc.a(rVar.f14509d);
        return iA != 0 ? iA != 1 ? (iA == 2 || iA == 4 || iA == 6 || iA == 7) && obj != null && obj.equals(rVar.f14508c) : ((com.appodeal.ads.utils.i) rVar.f14508c).compareTo((com.appodeal.ads.utils.i) obj) == 0 : ((Version) rVar.f14508c).compareTo((Version) obj) == 0;
    }

    public static boolean b(r rVar, Object obj) {
        int iA = jc.a(rVar.f14509d);
        if (iA == 2) {
            return ((String) obj).toLowerCase().contains(((String) rVar.f14508c).toLowerCase());
        }
        if (iA == 3) {
            String str = (String) obj;
            for (String str2 : (String[]) rVar.f14508c) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        if (iA != 5) {
            if (iA != 8) {
                return false;
            }
            String str3 = (String) rVar.f14508c;
            int iIntValue = ((Integer) obj).intValue();
            return iIntValue >= 0 && str3.length() > iIntValue && str3.charAt(iIntValue) == '1';
        }
        Integer num = (Integer) obj;
        for (Integer num2 : (Integer[]) rVar.f14508c) {
            if (num2.equals(num)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(r rVar, Object obj) {
        int i10 = rVar.f14509d;
        return i10 == 7 ? ((Float) rVar.f14508c).floatValue() > ((Float) obj).floatValue() : i10 == 5 ? ((Integer) rVar.f14508c).intValue() > ((Integer) obj).intValue() : i10 == 1 ? ((Version) rVar.f14508c).compareTo((Version) obj) > 0 : i10 == 2 && ((com.appodeal.ads.utils.i) rVar.f14508c).compareTo((com.appodeal.ads.utils.i) obj) > 0;
    }

    public static boolean d(r rVar, Object obj) {
        return a(rVar, obj) || c(rVar, obj);
    }

    public static boolean e(r rVar, Object obj) {
        int i10 = rVar.f14509d;
        return i10 == 7 ? ((Float) obj).floatValue() % ((Float) rVar.f14508c).floatValue() == 0.0f : i10 == 5 && ((Integer) obj).intValue() % ((Integer) rVar.f14508c).intValue() == 0;
    }

    public static boolean f(r rVar, Object obj) {
        int i10 = rVar.f14509d;
        return i10 == 7 ? ((Float) rVar.f14508c).floatValue() < ((Float) obj).floatValue() : i10 == 5 ? ((Integer) rVar.f14508c).intValue() < ((Integer) obj).intValue() : i10 == 1 ? ((Version) rVar.f14508c).compareTo((Version) obj) < 0 : i10 == 2 && ((com.appodeal.ads.utils.i) rVar.f14508c).compareTo((com.appodeal.ads.utils.i) obj) < 0;
    }

    public static boolean g(r rVar, Object obj) {
        return a(rVar, obj) || f(rVar, obj);
    }
}
