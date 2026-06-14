package xc;

import android.graphics.Bitmap;
import id.p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    private final float h(Bitmap bitmap) {
        float f10;
        float f11;
        IntRange intRangeV = g.v(0, bitmap.getWidth());
        IntRange intRangeV2 = g.v(0, bitmap.getHeight());
        int iCount = CollectionsKt.count(intRangeV) * CollectionsKt.count(intRangeV2);
        int[] iArr = new int[bitmap.getWidth()];
        int iE = intRangeV2.e();
        int iF = intRangeV2.f();
        if (iE <= iF) {
            int i10 = iE;
            f10 = 0.0f;
            f11 = 0.0f;
            while (true) {
                Bitmap bitmap2 = bitmap;
                bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iE2 = intRangeV.e();
                int iF2 = intRangeV.f();
                if (iE2 <= iF2) {
                    while (true) {
                        float fA = a(iArr[iE2]);
                        f10 += fA;
                        f11 += fA * fA;
                        if (iE2 == iF2) {
                            break;
                        }
                        iE2++;
                    }
                }
                if (i10 == iF) {
                    break;
                }
                i10++;
                bitmap = bitmap2;
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f12 = iCount;
        float f13 = f10 / f12;
        float f14 = (f11 / f12) - (f13 * f13);
        if (f14 < 0.0f) {
            return 0.0f;
        }
        return (float) Math.sqrt(f14);
    }

    @Override // xc.a
    public Boolean d(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        float fH = h(image);
        boolean z10 = fH <= c().a();
        e(Float.valueOf(fH), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
