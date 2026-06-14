package pd;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f98221a = new f();

    private f() {
    }

    public static final String a() {
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        return ID;
    }

    public static final String b() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public static final String c() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public static final String d() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    public static final String e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.c(context);
    }

    public static final String f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.d(context);
    }

    public static final float g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.e(context);
    }

    public static final boolean h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.a(context).smallestScreenWidthDp >= 600;
    }
}
