package org.bidon.sdk.databinders.session;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import eg.i;
import eg.k0;
import eg.q1;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.m;
import org.bidon.sdk.ads.banner.helper.ActivityLifecycleState;
import org.bidon.sdk.ads.banner.helper.PauseResumeObserver;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.LocalDateTimeExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R!\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*¨\u00062"}, d2 = {"Lorg/bidon/sdk/databinders/session/SessionTrackerImpl;", "Lorg/bidon/sdk/databinders/session/SessionTracker;", "pauseResumeObserver", "Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;Landroid/content/Context;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope$annotations", "()V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", JsonStorageKeyNames.SESSION_ID_KEY, "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "launchTs", "", "getLaunchTs", "()J", "launchMonotonicTs", "getLaunchMonotonicTs", "startTs", "getStartTs", "setStartTs", "(J)V", "startMonotonicTs", "getStartMonotonicTs", "setStartMonotonicTs", "ts", "getTs", "monotonicTs", "getMonotonicTs", "memoryWarningsTs", "", "getMemoryWarningsTs", "()Ljava/util/List;", "memoryWarningsMonotonicTs", "getMemoryWarningsMonotonicTs", "systemTime", "monotonicTime", "observeMemoryIssue", "", "observeSessionTime", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionTrackerImpl implements SessionTracker {
    private final long launchMonotonicTs;
    private final long launchTs;

    @NotNull
    private final List<Long> memoryWarningsMonotonicTs;

    @NotNull
    private final List<Long> memoryWarningsTs;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private String sessionId;
    private long startMonotonicTs;
    private long startTs;

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.session.SessionTrackerImpl$observeSessionTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.session.SessionTrackerImpl$observeSessionTime$1", f = "SessionTrackerImpl.kt", l = {}, m = "invokeSuspend")
    static final class C58201 extends k implements Function2<ActivityLifecycleState, Continuation, Object> {
        final /* synthetic */ Ref$ObjectRef $job;
        final /* synthetic */ Ref$BooleanRef $shouldStartNewSession;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SessionTrackerImpl this$0;

        /* JADX INFO: renamed from: org.bidon.sdk.databinders.session.SessionTrackerImpl$observeSessionTime$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @e(c = "org.bidon.sdk.databinders.session.SessionTrackerImpl$observeSessionTime$1$1", f = "SessionTrackerImpl.kt", l = {81}, m = "invokeSuspend")
        static final class C11471 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Ref$BooleanRef $shouldStartNewSession;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11471(Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
                super(2, continuation);
                this.$shouldStartNewSession = ref$BooleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C11471(this.$shouldStartNewSession, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    this.label = 1;
                    if (k0.a(30000L, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                this.$shouldStartNewSession.f93279b = true;
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C11471) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: org.bidon.sdk.databinders.session.SessionTrackerImpl$observeSessionTime$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActivityLifecycleState.values().length];
                try {
                    iArr[ActivityLifecycleState.Resumed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ActivityLifecycleState.Paused.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58201(Ref$ObjectRef ref$ObjectRef, Ref$BooleanRef ref$BooleanRef, SessionTrackerImpl sessionTrackerImpl, Continuation continuation) {
            super(2, continuation);
            this.$job = ref$ObjectRef;
            this.$shouldStartNewSession = ref$BooleanRef;
            this.this$0 = sessionTrackerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58201 c58201 = new C58201(this.$job, this.$shouldStartNewSession, this.this$0, continuation);
            c58201.L$0 = obj;
            return c58201;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            int i10 = WhenMappings.$EnumSwitchMapping$0[((ActivityLifecycleState) this.L$0).ordinal()];
            if (i10 == 1) {
                Job job = (Job) this.$job.f93280b;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
                Ref$BooleanRef ref$BooleanRef = this.$shouldStartNewSession;
                if (ref$BooleanRef.f93279b) {
                    ref$BooleanRef.f93279b = false;
                    this.this$0.setSessionId(UUID.randomUUID().toString());
                    SessionTrackerImpl sessionTrackerImpl = this.this$0;
                    sessionTrackerImpl.setStartTs(sessionTrackerImpl.systemTime());
                    SessionTrackerImpl sessionTrackerImpl2 = this.this$0;
                    sessionTrackerImpl2.setStartMonotonicTs(sessionTrackerImpl2.monotonicTime());
                    LogExtKt.logInfo("SessionTracker", "New session started with sessionId=" + this.this$0.getSessionId());
                }
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                Job job2 = (Job) this.$job.f93280b;
                if (job2 != null) {
                    Job.a.a(job2, null, 1, null);
                }
                this.$job.f93280b = i.d(this.this$0.getScope(), null, null, new C11471(this.$shouldStartNewSession, null), 3, null);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ActivityLifecycleState activityLifecycleState, Continuation continuation) {
            return ((C58201) create(activityLifecycleState, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public SessionTrackerImpl(@NotNull PauseResumeObserver pauseResumeObserver, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(pauseResumeObserver, "pauseResumeObserver");
        Intrinsics.checkNotNullParameter(context, "context");
        this.scope = lf.i.a(new Function0() { // from class: org.bidon.sdk.databinders.session.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SessionTrackerImpl.scope_delegate$lambda$0();
            }
        });
        observeSessionTime(pauseResumeObserver);
        observeMemoryIssue(context);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.sessionId = string;
        this.launchTs = systemTime();
        this.launchMonotonicTs = monotonicTime();
        this.startTs = systemTime();
        this.startMonotonicTs = monotonicTime();
        this.memoryWarningsTs = new ArrayList();
        this.memoryWarningsMonotonicTs = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    private static /* synthetic */ void getScope$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long monotonicTime() {
        return LocalDateTimeExtKt.getElapsedMonotonicTimeNow();
    }

    private final void observeMemoryIssue(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerComponentCallbacks(new ComponentCallbacks2() { // from class: org.bidon.sdk.databinders.session.SessionTrackerImpl.observeMemoryIssue.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                SessionTrackerImpl.this.getMemoryWarningsTs().add(Long.valueOf(SessionTrackerImpl.this.systemTime()));
                SessionTrackerImpl.this.getMemoryWarningsMonotonicTs().add(Long.valueOf(SessionTrackerImpl.this.monotonicTime()));
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
            }
        });
    }

    private final void observeSessionTime(PauseResumeObserver pauseResumeObserver) {
        hg.i.F(hg.i.K(pauseResumeObserver.getLifecycleFlow(), new C58201(new Ref$ObjectRef(), new Ref$BooleanRef(), this, null)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(q1.b("SessionTracker"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long systemTime() {
        return LocalDateTimeExtKt.getSystemTimeNow();
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getLaunchMonotonicTs() {
        return this.launchMonotonicTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getLaunchTs() {
        return this.launchTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    @NotNull
    public List<Long> getMemoryWarningsMonotonicTs() {
        return this.memoryWarningsMonotonicTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    @NotNull
    public List<Long> getMemoryWarningsTs() {
        return this.memoryWarningsTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getMonotonicTs() {
        return monotonicTime();
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getStartMonotonicTs() {
        return this.startMonotonicTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getStartTs() {
        return this.startTs;
    }

    @Override // org.bidon.sdk.databinders.session.SessionTracker
    public long getTs() {
        return systemTime();
    }

    public void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public void setStartMonotonicTs(long j10) {
        this.startMonotonicTs = j10;
    }

    public void setStartTs(long j10) {
        this.startTs = j10;
    }
}
