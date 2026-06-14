package yads;

import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class je3 implements om2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f112330a;

    public je3(kotlinx.coroutines.e eVar) {
        this.f112330a = eVar;
    }

    @Override // yads.om2
    public final void a(pb3 pb3Var) {
        pb3Var.a();
        boolean z10 = lb1.f113032a;
        if (this.f112330a.isActive()) {
            CancellableContinuation cancellableContinuation = this.f112330a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(new ge3(pb3Var)));
        }
    }

    @Override // yads.om2
    public final void a(Object obj) {
        List list = (List) obj;
        if (this.f112330a.isActive()) {
            CancellableContinuation cancellableContinuation = this.f112330a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(new he3(list)));
        }
    }
}
