package io.bidmachine.media3.ui;

import android.graphics.Color;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return o0.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
