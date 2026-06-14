package ve;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends ze.a0 implements o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Map values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public String toString() {
        return "Headers " + entries();
    }
}
