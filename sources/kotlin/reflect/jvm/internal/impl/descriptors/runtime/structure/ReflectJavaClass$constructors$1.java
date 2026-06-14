package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class ReflectJavaClass$constructors$1 extends y implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$constructors$1 INSTANCE = new ReflectJavaClass$constructors$1();

    ReflectJavaClass$constructors$1() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Member p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(p02.isSynthetic());
    }
}
