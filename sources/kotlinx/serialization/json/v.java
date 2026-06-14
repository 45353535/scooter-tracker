package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static final b a(b from, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new u(eVar.a(), eVar.b());
    }

    public static /* synthetic */ b b(b bVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b.f93658d;
        }
        return a(bVar, function1);
    }
}
