package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {392}, m = "invokeSuspend")
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.AnonymousClass2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref$ObjectRef $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef ref$ObjectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt.AnonymousClass2 anonymousClass2, View view, Continuation continuation) {
        super(2, continuation);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = anonymousClass2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th2;
        ?? r12;
        Job jobD;
        Object objG = pf.b.g();
        ?? r13 = this.label;
        try {
            if (r13 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$systemDurationScaleSettingConsumer.f93280b;
                    if (motionDurationScaleImpl != null) {
                        Context applicationContext = this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                        StateFlow animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(applicationContext);
                        motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
                        jobD = eg.i.d(coroutineScope, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(animationScaleFlowFor, motionDurationScaleImpl, null), 3, null);
                    } else {
                        jobD = null;
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.L$0 = jobD;
                    this.label = 1;
                    r13 = jobD;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objG) {
                        return objG;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    r12 = 0;
                    if (r12 != 0) {
                        Job.a.a(r12, null, 1, null);
                    }
                    this.$source.getLifecycle().removeObserver(this.$self);
                    throw th2;
                }
            } else {
                if (r13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job = (Job) this.L$0;
                kotlin.d.b(obj);
                r13 = job;
            }
            if (r13 != 0) {
                Job.a.a(r13, null, 1, null);
            }
            this.$source.getLifecycle().removeObserver(this.$self);
            return Unit.f93236a;
        } catch (Throwable th4) {
            th2 = th4;
            r12 = r13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
