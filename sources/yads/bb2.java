package yads;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bb2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f108960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(Set set) {
        super(1);
        this.f108960b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f108960b.contains(((t5) obj).f116068a));
    }
}
