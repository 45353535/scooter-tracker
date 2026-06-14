package pe;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final b b(String name, Function0 createConfiguration, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        return new e(name, createConfiguration, body);
    }

    public static final b c(String name, Function1 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        return b(name, new Function0() { // from class: pe.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.d();
            }
        }, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f93236a;
    }
}
