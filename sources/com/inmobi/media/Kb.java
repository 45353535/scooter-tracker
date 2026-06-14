package com.inmobi.media;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f37217a;

    public static final void a(byte b10, String tag, String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null) {
            return;
        }
        if (b10 == 1) {
            byte b11 = f37217a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 != 2) {
            if (b10 == 3) {
                a(tag, str);
            }
        } else {
            byte b12 = f37217a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str);
            }
        }
    }

    public static void a(String str, String str2) {
        if (str2.length() > 4000) {
            String strSubstring = str2.substring(0, 4000);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Log.d(str, strSubstring);
            String strSubstring2 = str2.substring(4000);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            a(str, strSubstring2);
            return;
        }
        Log.d(str, str2);
    }
}
