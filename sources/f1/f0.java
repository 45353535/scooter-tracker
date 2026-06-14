package f1;

import java.io.IOException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f0 {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ hh.e f69780f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hh.e eVar) {
            super(1);
            this.f69780f = eVar;
        }

        public final void a(Throwable th2) {
            this.f69780f.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    public static final class b implements hh.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f69781b;

        public b(CancellableContinuation cancellableContinuation) {
            this.f69781b = cancellableContinuation;
        }

        @Override // hh.f
        public void onFailure(hh.e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f69781b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f69781b;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(kotlin.d.a(e10)));
            }
        }

        @Override // hh.f
        public void onResponse(hh.e call, hh.b0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (this.f69781b.isActive()) {
                this.f69781b.resumeWith(Result.b(response));
            } else {
                response.close();
            }
        }
    }

    public static final Object a(hh.x xVar, hh.z zVar, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        hh.e eVarA = xVar.a(zVar);
        eVar.v(new a(eVarA));
        eVarA.m(new b(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
