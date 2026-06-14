package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class JvmBuiltInsCustomizerKt {

    @NotNull
    private static final Name GET_FIRST_LIST_NAME;

    @NotNull
    private static final Name GET_LAST_LIST_NAME;

    static {
        Name nameIdentifier = Name.identifier("getFirst");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        GET_FIRST_LIST_NAME = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("getLast");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        GET_LAST_LIST_NAME = nameIdentifier2;
    }
}
