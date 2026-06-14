package yg;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {
    public static final KSerializer a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        g0 g0Var = new g0(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                g0Var.v(annotation);
            }
        }
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r42 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i11);
            if (strName == null) {
                strName = r42.name();
            }
            i2.o(g0Var, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i11);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    g0Var.u(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new i0(serialName, values, g0Var);
    }

    public static final KSerializer b(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new i0(serialName, values);
    }
}
