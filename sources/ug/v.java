package ug;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static final KSerializer a(KClass kClass, List list, Function0 function0) {
        return x.e(kClass, list, function0);
    }

    public static final KSerializer b(ah.b bVar, KType kType) {
        return x.f(bVar, kType);
    }

    public static final KSerializer c(ah.b bVar, KType kType) {
        return x.i(bVar, kType);
    }

    public static final KSerializer d(KClass kClass) {
        return x.j(kClass);
    }

    public static final List e(ah.b bVar, List list, boolean z10) {
        return x.k(bVar, list, z10);
    }
}
