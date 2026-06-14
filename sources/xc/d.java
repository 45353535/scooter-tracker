package xc;

import android.graphics.Bitmap;
import id.p;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p algorithmParams) {
        super(algorithmParams);
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    private final float h(Bitmap bitmap, float f10) {
        int i10;
        int i11;
        int i12 = 0;
        IntRange intRangeV = g.v(0, bitmap.getWidth());
        IntRange intRangeV2 = g.v(0, bitmap.getHeight());
        int iCount = CollectionsKt.count(intRangeV) * CollectionsKt.count(intRangeV2);
        int[] iArr = new int[bitmap.getWidth()];
        int iE = intRangeV2.e();
        int iF = intRangeV2.f();
        if (iE <= iF) {
            i11 = 0;
            int i13 = iE;
            i10 = 0;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i13, bitmap.getWidth(), 1);
                int iE2 = intRangeV.e();
                int iF2 = intRangeV.f();
                if (iE2 <= iF2) {
                    while (true) {
                        int i14 = iArr[iE2];
                        if (i10 == 0) {
                            i11 = i14;
                            i10 = 1;
                        } else {
                            i10 = i14 == i11 ? i10 + 1 : i10 - 1;
                        }
                        if (iE2 == iF2) {
                            break;
                        }
                        iE2++;
                    }
                }
                if (i13 == iF) {
                    break;
                }
                i13++;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        float f11 = iCount;
        if (i10 < ((2 * f10) - 1) * f11) {
            return 0.0f;
        }
        int iE3 = intRangeV2.e();
        int iF3 = intRangeV2.f();
        if (iE3 <= iF3) {
            int i15 = iE3;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i15, bitmap.getWidth(), 1);
                int iE4 = intRangeV.e();
                int iF4 = intRangeV.f();
                if (iE4 <= iF4) {
                    while (true) {
                        if (iArr[iE4] == i11) {
                            i12++;
                        }
                        if (iE4 == iF4) {
                            break;
                        }
                        iE4++;
                    }
                }
                if (i15 == iF3) {
                    break;
                }
                i15++;
            }
        }
        return i12 / f11;
    }

    private final float i(Bitmap bitmap) {
        IntRange intRangeV = g.v(0, bitmap.getWidth());
        IntRange intRangeV2 = g.v(0, bitmap.getHeight());
        int iCount = CollectionsKt.count(intRangeV) * CollectionsKt.count(intRangeV2);
        int[] iArr = new int[bitmap.getWidth()];
        HashMap map = new HashMap();
        int iE = intRangeV2.e();
        int iF = intRangeV2.f();
        if (iE <= iF) {
            int i10 = iE;
            while (true) {
                Bitmap bitmap2 = bitmap;
                bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iE2 = intRangeV.e();
                int iF2 = intRangeV.f();
                if (iE2 <= iF2) {
                    while (true) {
                        int i11 = iArr[iE2];
                        Integer numValueOf = Integer.valueOf(i11);
                        Integer num = (Integer) map.get(Integer.valueOf(i11));
                        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
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
        }
        return (((Integer) CollectionsKt.maxOrNull((Iterable) map.values())) != null ? r14.intValue() : 0) / iCount;
    }

    @Override // xc.a
    public Boolean d(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        float fA = c().a();
        float fH = fA > 0.5f ? h(image, fA) : i(image);
        boolean z10 = fH >= fA;
        e(Float.valueOf(fH), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
