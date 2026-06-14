package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf0 f115434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf1 f115435b;

    public /* synthetic */ rf0() {
        this(new tf0(), new kf1());
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        String lowerCase = this.f115434a.a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public rf0(tf0 tf0Var, kf1 kf1Var) {
        this.f115434a = tf0Var;
        this.f115435b = kf1Var;
    }
}
