package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BaseConstraintController;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import gg.t;
import gg.v;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "T", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "tracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "reason", "", "getReason$annotations", "()V", "getReason", "()I", "isConstrained", "", "value", "(Ljava/lang/Object;)Z", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "constraints", "Landroidx/work/Constraints;", "isCurrentlyConstrained", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseConstraintController<T> implements ConstraintController {

    @NotNull
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgg/v;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<v, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseConstraintController<T> baseConstraintController, Continuation continuation) {
            super(2, continuation);
            this.this$0 = baseConstraintController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BaseConstraintController baseConstraintController, BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1) {
            baseConstraintController.tracker.removeListener(baseConstraintController$track$1$listener$1);
            return Unit.f93236a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v vVar, Continuation continuation) {
            return ((AnonymousClass1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final v vVar = (v) this.L$0;
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T newValue) {
                        vVar.m().e(baseConstraintController.isConstrained(newValue) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                final BaseConstraintController<T> baseConstraintController2 = this.this$0;
                Function0 function0 = new Function0() { // from class: androidx.work.impl.constraints.controllers.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseConstraintController.AnonymousClass1.invokeSuspend$lambda$0(baseConstraintController2, constraintListener);
                    }
                };
                this.label = 1;
                if (t.b(vVar, function0, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public BaseConstraintController(@NotNull ConstraintTracker<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    protected static /* synthetic */ void getReason$annotations() {
    }

    protected abstract int getReason();

    protected boolean isConstrained(T value) {
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    @NotNull
    public Flow track(@NotNull Constraints constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return i.f(new AnonymousClass1(this, null));
    }
}
