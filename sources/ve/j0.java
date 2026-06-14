package ve;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends ze.a0 implements g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Map values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public String toString() {
        return "Parameters " + entries();
    }
}
