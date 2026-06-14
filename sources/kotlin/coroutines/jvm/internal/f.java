package kotlin.coroutines.jvm.internal;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    private static final e b(a aVar) {
        return (e) aVar.getClass().getAnnotation(e.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String strC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        e eVarB = b(aVar);
        if (eVarB == null) {
            return null;
        }
        a(1, eVarB.v());
        int iC = c(aVar);
        int i10 = iC < 0 ? -1 : eVarB.l()[iC];
        String strB = h.f93269a.b(aVar);
        if (strB == null) {
            strC = eVarB.c();
        } else {
            strC = strB + IOUtils.DIR_SEPARATOR_UNIX + eVarB.c();
        }
        return new StackTraceElement(strC, eVarB.m(), eVarB.f(), i10);
    }
}
