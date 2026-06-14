package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class vk2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f117046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk2(kotlinx.coroutines.e eVar) {
        super(1);
        this.f117046b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f117046b.resumeWith(Result.b(Result.a(Result.b((w70) obj))));
        return Unit.f93236a;
    }
}
