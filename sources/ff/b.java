package ff;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final boolean a(Object obj, KClass type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return xf.a.b(type).isInstance(obj);
    }
}
