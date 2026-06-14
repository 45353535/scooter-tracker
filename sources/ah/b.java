package ah;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import ug.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer c(b bVar, KClass kClass, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return bVar.b(kClass, list);
    }

    public abstract void a(d dVar);

    public abstract KSerializer b(KClass kClass, List list);

    public abstract boolean d();

    public abstract ug.c e(KClass kClass, String str);

    public abstract n f(KClass kClass, Object obj);

    private b() {
    }
}
