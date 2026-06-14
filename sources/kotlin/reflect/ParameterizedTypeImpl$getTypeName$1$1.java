package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends y implements Function1<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Type p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return TypesJVMKt.typeToString(p02);
    }
}
