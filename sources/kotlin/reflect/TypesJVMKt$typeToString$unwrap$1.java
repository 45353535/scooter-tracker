package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends y implements Function1<Class<?>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.getComponentType();
    }
}
