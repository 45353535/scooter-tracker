package te;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ve.o;
import ve.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final o a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        p pVar = new p(0, 1, null);
        block.invoke(pVar);
        return pVar.p();
    }
}
