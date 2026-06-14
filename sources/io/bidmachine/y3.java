package io.bidmachine;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes12.dex */
final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f82024a = Build.MANUFACTURER + Build.MODEL;

    y3() {
    }

    String a(Context context, String str) {
        return n2.h(context, str + f82024a);
    }

    void b(Context context, String str, String str2) {
        n2.H(context, str + f82024a, str2);
    }
}
