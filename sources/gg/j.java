package gg;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final g a(int i10, a aVar, Function1 function1) {
        if (i10 == -2) {
            return aVar == a.f72765b ? new e(g.L8.a(), function1) : new r(1, aVar, function1);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == a.f72765b ? new e(i10, function1) : new r(i10, aVar, function1) : new e(Integer.MAX_VALUE, function1) : aVar == a.f72765b ? new e(0, function1) : new r(1, aVar, function1);
        }
        if (aVar == a.f72765b) {
            return new r(1, a.f72766c, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ g b(int i10, a aVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.f72765b;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, aVar, function1);
    }
}
