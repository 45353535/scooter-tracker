package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ct extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1546 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1547 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1548 = 25;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6072(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1548);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m6073(cq cqVar, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        String str = (String) cz.m6139(list, 0, String.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cqVar.m5971());
        sb2.append(m6072("\u0000", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, Color.argb(0, 0, 0, 0) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 83).intern());
        sb2.append(Integer.toHexString(str.hashCode()));
        String string = sb2.toString();
        Throwable th2 = (Throwable) cz.m6139(list, 1, Throwable.class);
        if (list.size() > 2) {
            if (cz.m6138(list, 2, JSONObject.class)) {
                f1546 = (f1547 + 51) % 128;
                JSONObject jSONObject2 = (JSONObject) cz.m6139(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    f1547 = (f1546 + 113) % 128;
                    if (cz.m6138(list, 3, Boolean.class)) {
                        int i10 = f1547 + 107;
                        f1546 = i10 % 128;
                        zBooleanValue = ((Boolean) (i10 % 2 == 0 ? cz.m6139(list, 2, Boolean.class) : cz.m6139(list, 3, Boolean.class))).booleanValue();
                    }
                }
                jSONObject = jSONObject2;
                zBooleanValue = zBooleanValue;
            } else {
                zBooleanValue = cz.m6138(list, 2, Boolean.class) ? ((Boolean) cz.m6139(list, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            kd.m7163(cqVar.m5971(), str, string, th2, jSONObject, zBooleanValue);
        } else {
            kd.m7163(cqVar.m5971(), str, string, th2, null, false);
        }
        return null;
    }
}
