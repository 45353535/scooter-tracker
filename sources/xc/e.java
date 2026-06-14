package xc;

import android.graphics.Bitmap;
import id.p;
import kotlin.jvm.internal.Intrinsics;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    private final float h(int i10, int i11) {
        float fW = f0.w(i10) - f0.w(i11);
        float fO = f0.o(i10) - f0.o(i11);
        float fA = f0.a(i10) - f0.a(i11);
        return (float) Math.sqrt((fW * fW) + (fO * fO) + (fA * fA));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Float i(android.graphics.Bitmap r21, float r22) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.e.i(android.graphics.Bitmap, float):java.lang.Float");
    }

    @Override // xc.a
    public Boolean d(Bitmap image) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(image, "image");
        Float fI = i(image, c().a());
        if (fI != null) {
            boolValueOf = Boolean.valueOf(fI.floatValue() <= c().a());
        } else {
            boolValueOf = null;
        }
        e(fI, boolValueOf);
        return boolValueOf;
    }
}
