package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    public static final void a(boolean z10, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static bg.b b(float f10, float f11) {
        return new c(f10, f11);
    }
}
