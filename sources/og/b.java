package og;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    static final class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f96973a;

        a(CancellableContinuation cancellableContinuation) {
            this.f96973a = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                CancellableContinuation cancellableContinuation = this.f96973a;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(d.a(exception)));
            } else {
                if (task.isCanceled()) {
                    CancellableContinuation.a.a(this.f96973a, null, 1, null);
                    return;
                }
                CancellableContinuation cancellableContinuation2 = this.f96973a;
                Result.Companion companion2 = Result.f93230c;
                cancellableContinuation2.resumeWith(Result.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: og.b$b, reason: collision with other inner class name */
    static final class C1117b implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f96974b;

        C1117b(CancellationTokenSource cancellationTokenSource) {
            this.f96974b = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f96974b.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    public static final Object a(Task task, Continuation continuation) {
        return b(task, null, continuation);
    }

    private static final Object b(Task task, CancellationTokenSource cancellationTokenSource, Continuation continuation) throws Exception {
        if (!task.isComplete()) {
            e eVar = new e(pf.b.d(continuation), 1);
            eVar.I();
            task.addOnCompleteListener(og.a.f96972b, new a(eVar));
            if (cancellationTokenSource != null) {
                eVar.v(new C1117b(cancellationTokenSource));
            }
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                g.c(continuation);
            }
            return objC;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
