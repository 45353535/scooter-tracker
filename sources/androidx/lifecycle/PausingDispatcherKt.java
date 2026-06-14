package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import eg.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PausingDispatcherKt {

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    kotlin.d.b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            }
            kotlin.d.b(obj);
            Job job = (Job) ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.N8);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, job);
            try {
                Function2<CoroutineScope, Continuation, Object> function2 = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = eg.g.g(pausingDispatcher, function2, this);
                if (obj == objG) {
                    return objG;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Nullable
    public static final <T> Object whenCreated(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Nullable
    public static final <T> Object whenResumed(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Nullable
    public static final <T> Object whenStarted(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Nullable
    public static final <T> Object whenStateAtLeast(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return eg.g.g(o0.c().w(), new AnonymousClass2(lifecycle, state, function2, null), continuation);
    }

    @Nullable
    public static final <T> Object whenCreated(@NotNull Lifecycle lifecycle, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, continuation);
    }

    @Nullable
    public static final <T> Object whenResumed(@NotNull Lifecycle lifecycle, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, continuation);
    }

    @Nullable
    public static final <T> Object whenStarted(@NotNull Lifecycle lifecycle, @NotNull Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, continuation);
    }
}
