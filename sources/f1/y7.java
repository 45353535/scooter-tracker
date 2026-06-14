package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y7 implements xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f71623a;

    public y7(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71623a = context.getResources().getDisplayMetrics().density;
    }

    @Override // f1.xb
    public int a(double d10) {
        return (int) (d10 * ((double) this.f71623a));
    }

    @Override // f1.xb
    public int a(int i10) {
        return (int) (i10 * this.f71623a);
    }
}
