package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final boolean a(c cVar, String str) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.a(j.c(str));
    }

    public static final JsonElement b(c0 c0Var, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c0Var.b(key, j.a(bool));
    }

    public static final JsonElement c(c0 c0Var, String key, Number number) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c0Var.b(key, j.b(number));
    }

    public static final JsonElement d(c0 c0Var, String key, String str) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c0Var.b(key, j.c(str));
    }

    public static final JsonElement e(c0 c0Var, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        c cVar = new c();
        builderAction.invoke(cVar);
        return c0Var.b(key, cVar.b());
    }

    public static final JsonElement f(c0 c0Var, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        c0 c0Var2 = new c0();
        builderAction.invoke(c0Var2);
        return c0Var.b(key, c0Var2.a());
    }
}
