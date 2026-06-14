package ze;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {
    public static final x c(x xVar, x builder) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (Map.Entry entry : builder.entries()) {
            xVar.c((String) entry.getKey(), (List) entry.getValue());
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Set set, Set set2) {
        return Intrinsics.areEqual(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Set set, int i10) {
        return (i10 * 31) + set.hashCode();
    }
}
