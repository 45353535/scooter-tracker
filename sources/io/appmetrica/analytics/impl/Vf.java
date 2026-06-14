package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Vf {
    public static final String a(C5243l9 c5243l9) {
        String string;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i10 = c5243l9.f77676c;
        String str = c5243l9.f77677d;
        byte[] bArr = c5243l9.f77678e;
        if (i10 == 1) {
            string = "Attribution";
        } else if (i10 == 2) {
            string = "Session start";
        } else if (i10 == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(" with value ");
                    sb3.append(str2);
                }
            }
            string = sb3.toString();
        } else if (i10 == 5) {
            string = "Referrer";
        } else if (i10 == 7) {
            string = "Session heartbeat";
        } else if (i10 == 13) {
            string = "The very first event";
        } else if (i10 == 35) {
            string = "E-Commerce";
        } else if (i10 == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i10 == 42) {
            string = "External attribution";
        } else if (i10 == 16) {
            string = "Open";
        } else if (i10 == 17) {
            string = "Update";
        } else if (i10 == 20) {
            string = "User profile update";
        } else if (i10 != 21) {
            switch (i10) {
                case 25:
                    string = "ANR";
                    break;
                case 26:
                    string = "Crash: " + str;
                    break;
                case 27:
                    string = "Error: " + str;
                    break;
                default:
                    string = "type=" + i10;
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static final String a(String str, EnumC5168ib enumC5168ib, String str2, String str3) {
        if (!D9.f75660d.contains(EnumC5168ib.a(enumC5168ib.f77427a))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        sb2.append(enumC5168ib.name());
        if (D9.f75662f.contains(enumC5168ib) && !TextUtils.isEmpty(str2)) {
            sb2.append(" with name ");
            sb2.append(str2);
        }
        if (D9.f75661e.contains(enumC5168ib) && !TextUtils.isEmpty(str3)) {
            sb2.append(" with value ");
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
