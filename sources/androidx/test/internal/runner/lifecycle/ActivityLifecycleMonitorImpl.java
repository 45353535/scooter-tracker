package androidx.test.internal.runner.lifecycle;

import android.app.Activity;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.test.internal.util.Checks;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import androidx.test.runner.lifecycle.Stage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ActivityLifecycleMonitorImpl implements ActivityLifecycleMonitor {
    private static final String TAG = "LifecycleMonitor";
    private List<ActivityStatus> activityStatuses;
    private final List<WeakReference<ActivityLifecycleCallback>> callbacks;
    private final boolean declawThreadCheck;

    private static class ActivityStatus {
        private final WeakReference<Activity> activityRef;
        private Stage lifecycleStage;

        ActivityStatus(Activity activity, Stage stage) {
            this.activityRef = new WeakReference<>((Activity) Checks.checkNotNull(activity));
            this.lifecycleStage = (Stage) Checks.checkNotNull(stage);
        }
    }

    public ActivityLifecycleMonitorImpl() {
        this(false);
    }

    private void checkMainThread() {
        if (!this.declawThreadCheck && !Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Querying activity state off main thread is not allowed.");
        }
    }

    @Override // androidx.test.runner.lifecycle.ActivityLifecycleMonitor
    public void addLifecycleCallback(ActivityLifecycleCallback activityLifecycleCallback) {
        Checks.checkNotNull(activityLifecycleCallback);
        synchronized (this.callbacks) {
            try {
                Iterator<WeakReference<ActivityLifecycleCallback>> it = this.callbacks.iterator();
                boolean z10 = true;
                while (it.hasNext()) {
                    ActivityLifecycleCallback activityLifecycleCallback2 = it.next().get();
                    if (activityLifecycleCallback2 == null) {
                        it.remove();
                    } else if (activityLifecycleCallback2 == activityLifecycleCallback) {
                        z10 = false;
                    }
                }
                if (z10) {
                    this.callbacks.add(new WeakReference<>(activityLifecycleCallback));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.test.runner.lifecycle.ActivityLifecycleMonitor
    public Collection<Activity> getActivitiesInStage(Stage stage) {
        checkMainThread();
        Checks.checkNotNull(stage);
        ArrayList arrayList = new ArrayList();
        Iterator<ActivityStatus> it = this.activityStatuses.iterator();
        while (it.hasNext()) {
            ActivityStatus next = it.next();
            Activity activity = (Activity) next.activityRef.get();
            if (activity == null) {
                it.remove();
            } else if (stage == next.lifecycleStage) {
                arrayList.add(activity);
            }
        }
        return arrayList;
    }

    @Override // androidx.test.runner.lifecycle.ActivityLifecycleMonitor
    public Stage getLifecycleStageOf(Activity activity) {
        checkMainThread();
        Checks.checkNotNull(activity);
        Iterator<ActivityStatus> it = this.activityStatuses.iterator();
        while (it.hasNext()) {
            ActivityStatus next = it.next();
            Activity activity2 = (Activity) next.activityRef.get();
            if (activity2 == null) {
                it.remove();
            } else if (activity == activity2) {
                return next.lifecycleStage;
            }
        }
        throw new IllegalArgumentException("Unknown activity: " + activity);
    }

    @Override // androidx.test.runner.lifecycle.ActivityLifecycleMonitor
    public void removeLifecycleCallback(ActivityLifecycleCallback activityLifecycleCallback) {
        Checks.checkNotNull(activityLifecycleCallback);
        synchronized (this.callbacks) {
            try {
                Iterator<WeakReference<ActivityLifecycleCallback>> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    ActivityLifecycleCallback activityLifecycleCallback2 = it.next().get();
                    if (activityLifecycleCallback2 == null) {
                        it.remove();
                    } else if (activityLifecycleCallback2 == activityLifecycleCallback) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void signalLifecycleChange(Stage stage, Activity activity) {
        Log.d(TAG, "Lifecycle status change: " + activity + " in: " + stage);
        Iterator<ActivityStatus> it = this.activityStatuses.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            ActivityStatus next = it.next();
            Activity activity2 = (Activity) next.activityRef.get();
            if (activity2 == null) {
                it.remove();
            } else if (activity == activity2) {
                next.lifecycleStage = stage;
                z10 = false;
            }
        }
        if (z10) {
            this.activityStatuses.add(new ActivityStatus(activity, stage));
        }
        synchronized (this.callbacks) {
            Iterator<WeakReference<ActivityLifecycleCallback>> it2 = this.callbacks.iterator();
            while (it2.hasNext()) {
                ActivityLifecycleCallback activityLifecycleCallback = it2.next().get();
                if (activityLifecycleCallback == null) {
                    it2.remove();
                } else {
                    try {
                        activityLifecycleCallback.onActivityLifecycleChanged(activity, stage);
                    } catch (RuntimeException e10) {
                        Log.e(TAG, String.format("Callback threw exception! (callback: %s activity: %s stage: %s)", activityLifecycleCallback, activity, stage), e10);
                    }
                }
            }
        }
    }

    public ActivityLifecycleMonitorImpl(boolean z10) {
        this.callbacks = new ArrayList();
        this.activityStatuses = new ArrayList();
        this.declawThreadCheck = z10;
    }
}
