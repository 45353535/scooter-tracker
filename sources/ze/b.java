package ze;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a {
        public static Object a(b bVar, ze.a key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Object objA = bVar.a(key);
            if (objA != null) {
                return objA;
            }
            throw new IllegalStateException("No instance for key " + key);
        }
    }

    Object a(ze.a aVar);

    Object b(ze.a aVar);

    List c();

    Object d(ze.a aVar, Function0 function0);

    void e(ze.a aVar, Object obj);

    void f(ze.a aVar);

    boolean g(ze.a aVar);
}
