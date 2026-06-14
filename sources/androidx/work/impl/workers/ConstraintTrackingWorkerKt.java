package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "awaitConstraintsNotMet", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "ARGUMENT_CLASS_NAME", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorkerKt {

    @NotNull
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", f = "ConstraintTrackingWorker.kt", l = {160}, m = "awaitConstraintsNotMet")
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorkerKt.awaitConstraintsNotMet(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<ConstraintsState, Continuation, Object> {
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WorkSpec workSpec, Continuation continuation) {
            super(2, continuation);
            this.$workSpec = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$workSpec, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConstraintsState constraintsState, Continuation continuation) {
            return ((AnonymousClass2) create(constraintsState, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            String str = ConstraintTrackingWorkerKt.TAG;
            WorkSpec workSpec = this.$workSpec;
            Logger.get().debug(str, "Constraints changed for " + workSpec);
            return Unit.f93236a;
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitConstraintsNotMet(androidx.work.impl.constraints.WorkConstraintsTracker r4, androidx.work.impl.model.WorkSpec r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.Flow r4 = r4.track(r5)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 r6 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2
            r2 = 0
            r6.<init>(r5, r2)
            kotlinx.coroutines.flow.Flow r4 = hg.i.K(r4, r6)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1 r5 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1
            r5.<init>()
            r0.label = r3
            java.lang.Object r6 = hg.i.x(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            androidx.work.impl.constraints.ConstraintsState$ConstraintsNotMet r6 = (androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) r6
            int r4 = r6.getReason()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorkerKt.awaitConstraintsNotMet(androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
