package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x0 {
    public static final int A(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("SKIP_DELAY_SECONDS", 0);
    }

    public static final boolean B(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("START_MUTED", true);
    }

    public static final String a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
    }

    public static final void b(Intent intent, int i10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("CLOSE_DELAY_SECONDS", i10);
    }

    public static final void c(Intent intent, Boolean bool) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            intent.putExtra("SKIP_ENABLED", bool.booleanValue());
        }
    }

    public static final void d(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra("ANDROID_AUTOINLINE_CLICKTHROUGH", value);
    }

    public static final void e(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("ANDROID_AUTOINLINE_ENABLED", z10);
    }

    public static final void f(Intent intent, int i10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("DEC_DELAY_SECONDS", i10);
    }

    public static final void g(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra("ANDROID_AUTOINLINE_EVENTLINK", value);
    }

    public static final void h(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("ANDROID_AUTOINLINE_SKIP", z10);
    }

    public static final boolean i(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
    }

    public static final String j(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
    }

    public static final void k(Intent intent, int i10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("SKIP_DELAY_SECONDS", i10);
    }

    public static final void l(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra("ANDROID_INLINE_URL", value);
    }

    public static final void m(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("ANDROID_INLINE_ENABLED", z10);
    }

    public static final void n(Intent intent, String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra("BUNDLE_ID", value);
    }

    public static final void o(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_COMPLETE", z10);
    }

    public static final boolean p(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
    }

    public static final void q(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_SKIP", z10);
    }

    public static final boolean r(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
    }

    public static final String s(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra("ANDROID_INLINE_URL");
    }

    public static final void t(Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("START_MUTED", z10);
    }

    public static final boolean u(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false);
    }

    public static final boolean v(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
    }

    public static final String w(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra("BUNDLE_ID");
    }

    public static final int x(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
    }

    public static final int y(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("DEC_DELAY_SECONDS", 0);
    }

    public static final Boolean z(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("SKIP_ENABLED")) {
            return Boolean.valueOf(intent.getBooleanExtra("SKIP_ENABLED", false));
        }
        return null;
    }
}
