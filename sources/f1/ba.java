package f1;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f69445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f69446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69447c;

    public ba(z3 googleAdvertisingId, l2 amazonAdvertisingId, String manufacturer) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.checkNotNullParameter(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        this.f69445a = googleAdvertisingId;
        this.f69446b = amazonAdvertisingId;
        this.f69447c = manufacturer;
    }

    public final e1 a() {
        try {
            return c() ? this.f69446b.b() : this.f69445a.b();
        } catch (Exception e10) {
            eg.i("getAdvertisingId error", e10);
            return new e1(f6.f69801c, "");
        }
    }

    public final String b(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = k.b(context, z10);
        Intrinsics.checkNotNullExpressionValue(strB, "getUniqueId(...)");
        return strB;
    }

    public final boolean c() {
        return StringsKt.N("Amazon", this.f69447c, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ba(z3 z3Var, l2 l2Var, String MANUFACTURER, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        }
        this(z3Var, l2Var, MANUFACTURER);
    }
}
