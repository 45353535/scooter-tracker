package org.bidon.sdk.utils.visibilitytracker;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ironsource.C4329g8;
import com.mbridge.msdk.MBridgeConstans;
import eg.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.m;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.bidon.sdk.ads.banner.helper.ActivityLifecycleState;
import org.bidon.sdk.ads.banner.helper.PauseResumeObserver;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\t*\u0001\u001c\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010!\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010\"\u001a\u00020\u001aJ\b\u0010#\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lorg/bidon/sdk/utils/visibilitytracker/VisibilityTracker;", "", C4329g8.f43174s, "Lorg/bidon/sdk/utils/visibilitytracker/VisibilityParams;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "pauseResumeObserver", "Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;", "<init>", "(Lorg/bidon/sdk/utils/visibilitytracker/VisibilityParams;Lkotlinx/coroutines/CoroutineScope;Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;)V", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", C4329g8.f43168m, "showTracked", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "requiredOnScreenTime", "", "getRequiredOnScreenTime", "()J", "shownObserverJob", "Lkotlinx/coroutines/Job;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "onViewShown", "Lkotlin/Function0;", "", "attachStateChangeListener", "org/bidon/sdk/utils/visibilitytracker/VisibilityTracker$attachStateChangeListener$2$1", "getAttachStateChangeListener", "()Lorg/bidon/sdk/utils/visibilitytracker/VisibilityTracker$attachStateChangeListener$2$1;", "attachStateChangeListener$delegate", "Lkotlin/Lazy;", "start", AtomManager.ATOM_STOP_METHOD_NAME, "checkVisible", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VisibilityTracker {

    /* JADX INFO: renamed from: attachStateChangeListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy attachStateChangeListener;

    @NotNull
    private final AtomicBoolean isShown;

    @NotNull
    private final AtomicBoolean isStarted;

    @Nullable
    private Function0<Unit> onViewShown;

    @NotNull
    private final PauseResumeObserver pauseResumeObserver;

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final AtomicBoolean showTracked;

    @Nullable
    private Job shownObserverJob;

    @Nullable
    private View view;

    @NotNull
    private final VisibilityParams visibilityParams;

    /* JADX INFO: renamed from: org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$checkVisible$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$checkVisible$1", f = "VisibilityTracker.kt", l = {76, 84, 97}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$checkVisible$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @e(c = "org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$checkVisible$1$1", f = "VisibilityTracker.kt", l = {}, m = "invokeSuspend")
        static final class C11481 extends k implements Function2<ActivityLifecycleState, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;

            C11481(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C11481 c11481 = new C11481(continuation);
                c11481.L$0 = obj;
                return c11481;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((ActivityLifecycleState) this.L$0) == ActivityLifecycleState.Resumed);
                if (!boolA.booleanValue()) {
                    LogExtKt.logInfo("VisibilityTracker", "Paused. Application in background.");
                }
                return boolA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ActivityLifecycleState activityLifecycleState, Continuation continuation) {
                return ((C11481) create(activityLifecycleState, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return VisibilityTracker.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (eg.k0.a(r1, r6) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        
            if (eg.k0.a(100, r6) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.visibilitytracker.VisibilityTracker.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public VisibilityTracker() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$attachStateChangeListener$2$1] */
    public static final VisibilityTracker$attachStateChangeListener$2$1 attachStateChangeListener_delegate$lambda$1(final VisibilityTracker visibilityTracker) {
        return new View.OnAttachStateChangeListener() { // from class: org.bidon.sdk.utils.visibilitytracker.VisibilityTracker$attachStateChangeListener$2$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
                this.this$0.stop();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkVisible() {
        if (this.showTracked.get()) {
            return;
        }
        Job job = this.shownObserverJob;
        if (job == null || !job.isActive()) {
            Job job2 = this.shownObserverJob;
            if (job2 != null) {
                Job.a.a(job2, null, 1, null);
            }
            this.shownObserverJob = i.d(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }

    private final VisibilityTracker$attachStateChangeListener$2$1 getAttachStateChangeListener() {
        return (VisibilityTracker$attachStateChangeListener$2$1) this.attachStateChangeListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getRequiredOnScreenTime() {
        return this.visibilityParams.getTimeThresholdMs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean preDrawListener$lambda$0(VisibilityTracker visibilityTracker) {
        visibilityTracker.checkVisible();
        return true;
    }

    public final void start(@NotNull View view, @NotNull Function0<Unit> onViewShown) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onViewShown, "onViewShown");
        if (!this.isShown.get() && this.isStarted.compareAndSet(false, true)) {
            this.onViewShown = onViewShown;
            this.view = view;
            LogExtKt.logInfo("VisibilityTracker", "Start tracking - " + view);
            view.addOnAttachStateChangeListener(getAttachStateChangeListener());
            view.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
            checkVisible();
        }
    }

    public final void stop() {
        ViewTreeObserver viewTreeObserver;
        LogExtKt.logInfo("VisibilityTracker", "Stop tracking - " + this.view);
        View view = this.view;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
        }
        View view2 = this.view;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(getAttachStateChangeListener());
        }
        Job job = this.shownObserverJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.shownObserverJob = null;
        this.view = null;
        this.onViewShown = null;
        this.isStarted.set(false);
    }

    public VisibilityTracker(@NotNull VisibilityParams visibilityParams, @NotNull CoroutineScope scope, @NotNull PauseResumeObserver pauseResumeObserver) {
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pauseResumeObserver, "pauseResumeObserver");
        this.visibilityParams = visibilityParams;
        this.scope = scope;
        this.pauseResumeObserver = pauseResumeObserver;
        this.isStarted = new AtomicBoolean(false);
        this.isShown = new AtomicBoolean(false);
        this.showTracked = new AtomicBoolean(false);
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.bidon.sdk.utils.visibilitytracker.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return VisibilityTracker.preDrawListener$lambda$0(this.f97663b);
            }
        };
        this.attachStateChangeListener = lf.i.a(new Function0() { // from class: org.bidon.sdk.utils.visibilitytracker.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisibilityTracker.attachStateChangeListener_delegate$lambda$1(this.f97664b);
            }
        });
    }

    public /* synthetic */ VisibilityTracker(VisibilityParams visibilityParams, CoroutineScope coroutineScope, PauseResumeObserver pauseResumeObserver, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        visibilityParams = (i10 & 1) != 0 ? new VisibilityParams(0L, 0.0f, 0, false, false, 31, null) : visibilityParams;
        coroutineScope = (i10 & 2) != 0 ? kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getMain()) : coroutineScope;
        if ((i10 & 4) != 0) {
            InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(PauseResumeObserver.class));
            if (instanceType instanceof InstanceType.Singleton) {
                Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
                if (singleton == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.PauseResumeObserver");
                }
                pauseResumeObserver = (PauseResumeObserver) singleton;
            } else {
                if (!(instanceType instanceof InstanceType.Factory)) {
                    if (instanceType instanceof InstanceType.ParamFactory) {
                        new InstanceType.ParamFactory.Params();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (instanceType == null) {
                        throw new IllegalStateException(("No factory provided for class: " + PauseResumeObserver.class).toString());
                    }
                    throw new m();
                }
                Object objBuild = ((InstanceType.Factory) instanceType).build();
                if (objBuild == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.PauseResumeObserver");
                }
                pauseResumeObserver = (PauseResumeObserver) objBuild;
            }
        }
        this(visibilityParams, coroutineScope, pauseResumeObserver);
    }
}
