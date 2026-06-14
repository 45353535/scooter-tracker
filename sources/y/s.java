package y;

import android.view.View;
import coil.request.ViewTargetRequestDelegate;
import eg.o0;
import eg.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f108333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f108334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Job f108335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewTargetRequestDelegate f108336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f108337f;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108338r;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return s.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f108338r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            s.this.c(null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public s(View view) {
        this.f108333b = view;
    }

    public final synchronized void a() {
        try {
            Job job = this.f108335d;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            this.f108335d = eg.i.d(x0.f69181b, o0.c().w(), null, new a(null), 2, null);
            this.f108334c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized r b(Deferred deferred) {
        r rVar = this.f108334c;
        if (rVar != null && c0.i.r() && this.f108337f) {
            this.f108337f = false;
            rVar.a(deferred);
            return rVar;
        }
        Job job = this.f108335d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f108335d = null;
        r rVar2 = new r(this.f108333b, deferred);
        this.f108334c = rVar2;
        return rVar2;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f108336e;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.d();
        }
        this.f108336e = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f108336e;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f108337f = true;
        viewTargetRequestDelegate.e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f108336e;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.d();
        }
    }
}
