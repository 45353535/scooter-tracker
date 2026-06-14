package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class cf0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f109384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(kotlinx.coroutines.e eVar) {
        super(1);
        this.f109384b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (this.f109384b.isActive()) {
            CancellableContinuation cancellableContinuation = this.f109384b;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(kotlin.d.a(th2)));
        }
        return Unit.f93236a;
    }
}
