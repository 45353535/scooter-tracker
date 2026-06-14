package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import eg.i;
import gg.t;
import gg.v;
import gg.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(28)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "connManager", "Landroid/net/ConnectivityManager;", "timeoutMs", "", "<init>", "(Landroid/net/ConnectivityManager;J)V", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "constraints", "Landroidx/work/Constraints;", "hasConstraint", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "isCurrentlyConstrained", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkRequestConstraintController implements ConstraintController {

    @NotNull
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgg/v;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {180}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<v, Continuation, Object> {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, Continuation continuation) {
            super(2, continuation);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Job job, v vVar, ConstraintsState constraintsState) {
            Job.a.a(job, null, 1, null);
            vVar.e(constraintsState);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Function0 function0) {
            function0.invoke();
            return Unit.f93236a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constraints, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v vVar, Continuation continuation) {
            return ((AnonymousClass1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final v vVar = (v) this.L$0;
                NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
                if (requiredNetworkRequest == null) {
                    y.a.a(vVar.m(), null, 1, null);
                    return Unit.f93236a;
                }
                final Job jobD = i.d(vVar, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, vVar, null), 3, null);
                Function1<? super ConstraintsState, Unit> function1 = new Function1() { // from class: androidx.work.impl.constraints.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$0(jobD, vVar, (ConstraintsState) obj2);
                    }
                };
                final Function0<Unit> function0AddCallback = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, function1) : IndividualNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, function1);
                Function0 function0 = new Function0() { // from class: androidx.work.impl.constraints.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$1(function0AddCallback);
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
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public NetworkRequestConstraintController(@NotNull ConnectivityManager connManager, long j10) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    @NotNull
    public Flow track(@NotNull Constraints constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return hg.i.f(new AnonymousClass1(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
