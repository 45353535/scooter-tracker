package androidx.test.core.app;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.app.ActivityInvoker;
import androidx.test.internal.platform.os.ControlledLooper;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.Stage;
import androidx.tracing.Trace;
import java.io.Closeable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityScenario<A extends Activity> implements AutoCloseable, Closeable {
    private static final Map<Stage, Lifecycle.State> STEADY_STATES;
    private static final String TAG = "ActivityScenario";
    private static final long TIMEOUT_MILLISECONDS = 45000;
    private final ActivityInvoker activityInvoker;
    private final ActivityLifecycleCallback activityLifecycleObserver;
    private final ControlledLooper controlledLooper;

    @Nullable
    @GuardedBy("lock")
    private A currentActivity;

    @GuardedBy("lock")
    private Stage currentActivityStage;
    private final ReentrantLock lock;
    private final Intent startActivityIntent;
    private final Condition stateChangedCondition;

    /* JADX INFO: renamed from: androidx.test.core.app.ActivityScenario$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;
        static final /* synthetic */ int[] $SwitchMap$androidx$test$runner$lifecycle$Stage;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[Lifecycle.State.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Stage.values().length];
            $SwitchMap$androidx$test$runner$lifecycle$Stage = iArr2;
            try {
                iArr2[Stage.PRE_ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$test$runner$lifecycle$Stage[Stage.DESTROYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface ActivityAction<A extends Activity> {
        void perform(A a10);
    }

    private static class ActivityState<A extends Activity> {

        @Nullable
        final A activity;
        final Stage stage;

        @Nullable
        final Lifecycle.State state;

        ActivityState(@Nullable A a10, @Nullable Lifecycle.State state, Stage stage) {
            this.activity = a10;
            this.state = state;
            this.stage = stage;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(Stage.class);
        STEADY_STATES = enumMap;
        enumMap.put(Stage.RESUMED, Lifecycle.State.RESUMED);
        enumMap.put(Stage.PAUSED, Lifecycle.State.STARTED);
        enumMap.put(Stage.STOPPED, Lifecycle.State.CREATED);
        enumMap.put(Stage.DESTROYED, Lifecycle.State.DESTROYED);
    }

    private ActivityScenario(Intent intent) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.stateChangedCondition = reentrantLock.newCondition();
        this.activityInvoker = (ActivityInvoker) ServiceLoaderWrapper.loadSingleService(ActivityInvoker.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.app.b
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final Object create() {
                return ActivityScenario.n();
            }
        });
        this.controlledLooper = (ControlledLooper) ServiceLoaderWrapper.loadSingleService(ControlledLooper.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.app.c
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final Object create() {
                return ControlledLooper.NO_OP_CONTROLLED_LOOPER;
            }
        });
        this.currentActivityStage = Stage.PRE_ON_CREATE;
        this.activityLifecycleObserver = new ActivityLifecycleCallback() { // from class: androidx.test.core.app.ActivityScenario.1
            @Override // androidx.test.runner.lifecycle.ActivityLifecycleCallback
            public void onActivityLifecycleChanged(Activity activity, Stage stage) {
                if (!ActivityScenario.activityMatchesIntent(ActivityScenario.this.startActivityIntent, activity)) {
                    Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the intent does not match. startActivityIntent=%s, activity.getIntent()=%s, activity=%s", ActivityScenario.this.startActivityIntent, activity.getIntent(), activity));
                    return;
                }
                ActivityScenario.this.lock.lock();
                try {
                    int i10 = AnonymousClass2.$SwitchMap$androidx$test$runner$lifecycle$Stage[ActivityScenario.this.currentActivityStage.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        if (stage != Stage.CREATED) {
                            Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the reported transition was not ON_CREATE while the last known transition was %s", ActivityScenario.this.currentActivityStage));
                            return;
                        }
                    } else if (ActivityScenario.this.currentActivity != activity) {
                        Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the activity instance does not match. currentActivity=%s, receivedActivity=%s", ActivityScenario.this.currentActivity, activity));
                        return;
                    }
                    ActivityScenario.this.currentActivityStage = stage;
                    ActivityScenario activityScenario = ActivityScenario.this;
                    if (stage == Stage.DESTROYED) {
                        activity = null;
                    }
                    activityScenario.currentActivity = activity;
                    Log.v(ActivityScenario.TAG, String.format("Update currentActivityStage to %s, currentActivity=%s", ActivityScenario.this.currentActivityStage, ActivityScenario.this.currentActivity));
                    ActivityScenario.this.stateChangedCondition.signal();
                } finally {
                    ActivityScenario.this.lock.unlock();
                }
            }
        };
        this.startActivityIntent = (Intent) Checks.checkNotNull(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean activityMatchesIntent(Intent intent, Activity activity) {
        Intent intent2 = activity.getIntent();
        if (!equals(intent.getAction(), intent2.getAction()) || !equals(intent.getData(), intent2.getData()) || !equals(intent.getType(), intent2.getType())) {
            return false;
        }
        if ((!hasPackageEquivalentComponent(intent) || !hasPackageEquivalentComponent(intent2)) && !equals(intent.getPackage(), intent2.getPackage())) {
            return false;
        }
        if ((intent.getComponent() == null || equals(intent.getComponent(), intent2.getComponent())) && equals(intent.getCategories(), intent2.getCategories())) {
            return Build.VERSION.SDK_INT < 29 || equals(intent.getIdentifier(), intent2.getIdentifier());
        }
        return false;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private ActivityState<A> getCurrentActivityState() {
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        this.lock.lock();
        try {
            return new ActivityState<>(this.currentActivity, STEADY_STATES.get(this.currentActivityStage), this.currentActivityStage);
        } finally {
            this.lock.unlock();
        }
    }

    private static boolean hasPackageEquivalentComponent(Intent intent) {
        ComponentName component = intent.getComponent();
        String str = intent.getPackage();
        if (component != null) {
            return str == null || str.equals(component.getPackageName());
        }
        return false;
    }

    public static <A extends Activity> ActivityScenario<A> launch(Class<A> cls) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Class) Checks.checkNotNull(cls));
        activityScenario.launchInternal(null, false);
        return activityScenario;
    }

    @NonNull
    public static <A extends Activity> ActivityScenario<A> launchActivityForResult(@NonNull Class<A> cls) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Class) Checks.checkNotNull(cls));
        activityScenario.launchInternal(null, true);
        return activityScenario;
    }

    private void launchInternal(@Nullable Bundle bundle, boolean z10) {
        Checks.checkState(Settings.System.getInt(InstrumentationRegistry.getInstrumentation().getTargetContext().getContentResolver(), "always_finish_activities", 0) == 0, "\"Don't keep activities\" developer options must be disabled for ActivityScenario");
        Checks.checkNotMainThread();
        Trace.beginSection("ActivityScenario launch");
        try {
            InstrumentationRegistry.getInstrumentation().waitForIdleSync();
            ActivityLifecycleMonitorRegistry.getInstance().addLifecycleCallback(this.activityLifecycleObserver);
            if (bundle == null) {
                if (z10) {
                    this.activityInvoker.startActivityForResult(this.startActivityIntent);
                } else {
                    this.activityInvoker.startActivity(this.startActivityIntent);
                }
            } else if (z10) {
                this.activityInvoker.startActivityForResult(this.startActivityIntent, bundle);
            } else {
                this.activityInvoker.startActivity(this.startActivityIntent, bundle);
            }
            waitForActivityToBecomeAnyOf((Lifecycle.State[]) STEADY_STATES.values().toArray(new Lifecycle.State[0]));
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ ActivityInvoker n() {
        return new InstrumentationActivityInvoker();
    }

    public static /* synthetic */ void o(ActivityScenario activityScenario, ActivityAction activityAction) {
        activityScenario.getClass();
        Checks.checkMainThread();
        activityScenario.lock.lock();
        try {
            Checks.checkNotNull(activityScenario.currentActivity, "Cannot run onActivity since Activity has been destroyed already");
            activityAction.perform(activityScenario.currentActivity);
        } finally {
            activityScenario.lock.unlock();
        }
    }

    private void waitForActivityToBecomeAnyOf(Lifecycle.State... stateArr) {
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        HashSet hashSet = new HashSet(Arrays.asList(stateArr));
        this.lock.lock();
        try {
            try {
                if (!hashSet.contains(STEADY_STATES.get(this.currentActivityStage))) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = TIMEOUT_MILLISECONDS + jElapsedRealtime;
                    while (jElapsedRealtime < j10 && !hashSet.contains(STEADY_STATES.get(this.currentActivityStage))) {
                        this.stateChangedCondition.await(j10 - jElapsedRealtime, TimeUnit.MILLISECONDS);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (!hashSet.contains(STEADY_STATES.get(this.currentActivityStage))) {
                        throw new AssertionError(String.format("Activity never becomes requested state \"%s\" (last lifecycle transition = \"%s\")", hashSet, this.currentActivityStage));
                    }
                }
            } catch (InterruptedException e10) {
                throw new AssertionError(String.format("Activity never becomes requested state \"%s\" (last lifecycle transition = \"%s\")", hashSet, this.currentActivityStage), e10);
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        Trace.beginSection("ActivityScenario close");
        try {
            moveToState(Lifecycle.State.DESTROYED);
            ActivityLifecycleMonitorRegistry.getInstance().removeLifecycleCallback(this.activityLifecycleObserver);
        } finally {
            Trace.endSection();
        }
    }

    public Instrumentation.ActivityResult getResult() {
        return this.activityInvoker.getActivityResult();
    }

    public Lifecycle.State getState() {
        ActivityState<A> currentActivityState = getCurrentActivityState();
        return (Lifecycle.State) Checks.checkNotNull(currentActivityState.state, "Could not get current state of activity %s due to the transition is incomplete. Current stage = %s", currentActivityState.activity, currentActivityState.stage);
    }

    public ActivityScenario<A> moveToState(Lifecycle.State state) {
        Checks.checkNotMainThread();
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        ActivityState<A> currentActivityState = getCurrentActivityState();
        Checks.checkNotNull(currentActivityState.state, String.format("Current state was null unexpectedly. Last stage = %s", currentActivityState.stage));
        Lifecycle.State state2 = currentActivityState.state;
        if (state2 == state) {
            return this;
        }
        Checks.checkState((state2 == Lifecycle.State.DESTROYED || currentActivityState.activity == null) ? false : true, String.format("Cannot move to state \"%s\" since the Activity has been destroyed already", state));
        int i10 = AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
        if (i10 == 1) {
            this.activityInvoker.stopActivity(currentActivityState.activity);
        } else if (i10 == 2) {
            moveToState(Lifecycle.State.RESUMED);
            this.activityInvoker.pauseActivity(currentActivityState.activity);
        } else if (i10 == 3) {
            this.activityInvoker.resumeActivity(currentActivityState.activity);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(String.format("A requested state \"%s\" is not supported", state));
            }
            this.activityInvoker.finishActivity(currentActivityState.activity);
        }
        waitForActivityToBecomeAnyOf(state);
        return this;
    }

    public ActivityScenario<A> onActivity(final ActivityAction<A> activityAction) {
        Runnable runnable = new Runnable() { // from class: androidx.test.core.app.d
            @Override // java.lang.Runnable
            public final void run() {
                ActivityScenario.o(this.f5452b, activityAction);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.controlledLooper.drainMainThreadUntilIdle();
            runnable.run();
            return this;
        }
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        InstrumentationRegistry.getInstrumentation().runOnMainSync(runnable);
        return this;
    }

    public ActivityScenario<A> recreate() {
        ActivityState<A> currentActivityState;
        Checks.checkNotMainThread();
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        ActivityState<A> currentActivityState2 = getCurrentActivityState();
        Checks.checkNotNull(currentActivityState2.activity);
        Checks.checkNotNull(currentActivityState2.state);
        moveToState(Lifecycle.State.RESUMED);
        this.activityInvoker.recreateActivity(currentActivityState2.activity);
        long jElapsedRealtime = SystemClock.elapsedRealtime() + TIMEOUT_MILLISECONDS;
        do {
            waitForActivityToBecomeAnyOf(Lifecycle.State.RESUMED);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            currentActivityState = getCurrentActivityState();
            if (jElapsedRealtime2 >= jElapsedRealtime) {
                break;
            }
        } while (currentActivityState.activity == currentActivityState2.activity);
        if (currentActivityState.activity == currentActivityState2.activity) {
            throw new IllegalStateException("Requested a re-creation of Activity but didn't happen");
        }
        moveToState(currentActivityState2.state);
        return this;
    }

    public static <A extends Activity> ActivityScenario<A> launch(Class<A> cls, @Nullable Bundle bundle) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Class) Checks.checkNotNull(cls));
        activityScenario.launchInternal(bundle, false);
        return activityScenario;
    }

    @NonNull
    public static <A extends Activity> ActivityScenario<A> launchActivityForResult(@NonNull Class<A> cls, @Nullable Bundle bundle) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Class) Checks.checkNotNull(cls));
        activityScenario.launchInternal(bundle, true);
        return activityScenario;
    }

    public static <A extends Activity> ActivityScenario<A> launch(Intent intent) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Intent) Checks.checkNotNull(intent));
        activityScenario.launchInternal(null, false);
        return activityScenario;
    }

    @NonNull
    public static <A extends Activity> ActivityScenario<A> launchActivityForResult(@NonNull Intent intent) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Intent) Checks.checkNotNull(intent));
        activityScenario.launchInternal(null, true);
        return activityScenario;
    }

    public static <A extends Activity> ActivityScenario<A> launch(Intent intent, @Nullable Bundle bundle) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Intent) Checks.checkNotNull(intent));
        activityScenario.launchInternal(bundle, false);
        return activityScenario;
    }

    @NonNull
    public static <A extends Activity> ActivityScenario<A> launchActivityForResult(@NonNull Intent intent, @Nullable Bundle bundle) {
        ActivityScenario<A> activityScenario = new ActivityScenario<>((Intent) Checks.checkNotNull(intent));
        activityScenario.launchInternal(bundle, true);
        return activityScenario;
    }

    private ActivityScenario(Class<A> cls) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.stateChangedCondition = reentrantLock.newCondition();
        ActivityInvoker activityInvoker = (ActivityInvoker) ServiceLoaderWrapper.loadSingleService(ActivityInvoker.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.app.b
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final Object create() {
                return ActivityScenario.n();
            }
        });
        this.activityInvoker = activityInvoker;
        this.controlledLooper = (ControlledLooper) ServiceLoaderWrapper.loadSingleService(ControlledLooper.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.app.c
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final Object create() {
                return ControlledLooper.NO_OP_CONTROLLED_LOOPER;
            }
        });
        this.currentActivityStage = Stage.PRE_ON_CREATE;
        this.activityLifecycleObserver = new ActivityLifecycleCallback() { // from class: androidx.test.core.app.ActivityScenario.1
            @Override // androidx.test.runner.lifecycle.ActivityLifecycleCallback
            public void onActivityLifecycleChanged(Activity activity, Stage stage) {
                if (!ActivityScenario.activityMatchesIntent(ActivityScenario.this.startActivityIntent, activity)) {
                    Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the intent does not match. startActivityIntent=%s, activity.getIntent()=%s, activity=%s", ActivityScenario.this.startActivityIntent, activity.getIntent(), activity));
                    return;
                }
                ActivityScenario.this.lock.lock();
                try {
                    int i10 = AnonymousClass2.$SwitchMap$androidx$test$runner$lifecycle$Stage[ActivityScenario.this.currentActivityStage.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        if (stage != Stage.CREATED) {
                            Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the reported transition was not ON_CREATE while the last known transition was %s", ActivityScenario.this.currentActivityStage));
                            return;
                        }
                    } else if (ActivityScenario.this.currentActivity != activity) {
                        Log.v(ActivityScenario.TAG, String.format("Activity lifecycle changed event received but ignored because the activity instance does not match. currentActivity=%s, receivedActivity=%s", ActivityScenario.this.currentActivity, activity));
                        return;
                    }
                    ActivityScenario.this.currentActivityStage = stage;
                    ActivityScenario activityScenario = ActivityScenario.this;
                    if (stage == Stage.DESTROYED) {
                        activity = null;
                    }
                    activityScenario.currentActivity = activity;
                    Log.v(ActivityScenario.TAG, String.format("Update currentActivityStage to %s, currentActivity=%s", ActivityScenario.this.currentActivityStage, ActivityScenario.this.currentActivity));
                    ActivityScenario.this.stateChangedCondition.signal();
                } finally {
                    ActivityScenario.this.lock.unlock();
                }
            }
        };
        this.startActivityIntent = (Intent) Checks.checkNotNull(activityInvoker.getIntentForActivity((Class) Checks.checkNotNull(cls)));
    }
}
