package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f71835b;

    public zf(Context context, r2 displayMeasurement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f71834a = context;
        this.f71835b = displayMeasurement;
    }

    public final int a() {
        Integer numC = k.c(this.f71834a);
        Intrinsics.checkNotNullExpressionValue(numC, "getOpenRTBDeviceType(...)");
        return numC.intValue();
    }

    public final String b() {
        String strE = k.e(this.f71834a);
        Intrinsics.checkNotNullExpressionValue(strE, "getType(...)");
        return strE;
    }

    public final boolean c() {
        return ea.g(this.f71834a, this.f71835b);
    }
}
