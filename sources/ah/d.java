package ah;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public interface d {
    void a(KClass kClass, Function1 function1);

    void b(KClass kClass, Function1 function1);

    void c(KClass kClass, KClass kClass2, KSerializer kSerializer);
}
