package ze;

import j$.util.DesugarCollections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final Set a(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
