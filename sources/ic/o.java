package ic;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final boolean a(int i10) {
        return ((i10 >> 24) & 255) == 255;
    }

    public static final int[] b(Object[] objArr, Function1 transform) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int[] iArr = new int[objArr.length];
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) transform.invoke(objArr[i10]);
            if (num != null) {
                iArr[i10] = num.intValue();
            }
        }
        return iArr;
    }
}
