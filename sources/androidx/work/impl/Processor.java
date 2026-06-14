package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Processor implements ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map<String, Set<StartStopToken>> mWorkRuns = new HashMap();

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
    }

    public static /* synthetic */ WorkSpec a(Processor processor, ArrayList arrayList, String str) {
        arrayList.addAll(processor.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return processor.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    public static /* synthetic */ void b(Processor processor, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (processor.mLock) {
            try {
                Iterator<ExecutionListener> it = processor.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(Processor processor, ListenableFuture listenableFuture, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        processor.getClass();
        try {
            zBooleanValue = ((Boolean) listenableFuture.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        processor.onExecuted(workerWrapper, zBooleanValue);
    }

    private WorkerWrapper cleanUpWorkerUnsafe(String str) {
        WorkerWrapper workerWrapperRemove = this.mForegroundWorkMap.remove(str);
        boolean z10 = workerWrapperRemove != null;
        if (!z10) {
            workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
        }
        this.mWorkRuns.remove(str);
        if (z10) {
            stopForegroundService();
        }
        return workerWrapperRemove;
    }

    private WorkerWrapper getWorkerWrapperUnsafe(String str) {
        WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(str);
        return workerWrapper == null ? this.mEnqueuedWorkMap.get(str) : workerWrapper;
    }

    private static boolean interrupt(String str, WorkerWrapper workerWrapper, int i10) {
        if (workerWrapper == null) {
            Logger.get().debug(TAG, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.interrupt(i10);
        Logger.get().debug(TAG, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void onExecuted(WorkerWrapper workerWrapper, boolean z10) {
        synchronized (this.mLock) {
            try {
                WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                String workSpecId = workGenerationalId.getWorkSpecId();
                if (getWorkerWrapperUnsafe(workSpecId) == workerWrapper) {
                    cleanUpWorkerUnsafe(workSpecId);
                }
                Logger.get().debug(TAG, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void runOnExecuted(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                Processor.b(this.f5500b, workGenerationalId, z10);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.isEmpty()) {
                    try {
                        this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                    } catch (Throwable th2) {
                        Logger.get().error(TAG, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.mForegroundLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.mForegroundLock = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public WorkSpec getRunningWorkSpec(String str) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapperUnsafe = getWorkerWrapperUnsafe(str);
                if (workerWrapperUnsafe == null) {
                    return null;
                }
                return workerWrapperUnsafe.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hasWork() {
        boolean z10;
        synchronized (this.mLock) {
            try {
                z10 = (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCancelledIds.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(String str) {
        boolean z10;
        synchronized (this.mLock) {
            z10 = getWorkerWrapperUnsafe(str) != null;
        }
        return z10;
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            try {
                Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.mForegroundLock == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                        this.mForegroundLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.mForegroundWorkMap.put(str, workerWrapperRemove);
                    ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, workerWrapperRemove.getWorkGenerationalId(), foregroundInfo));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean startWork(StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean stopAndCancelWork(String str, int i10) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Processor cancelling " + str);
            this.mCancelledIds.add(str);
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(str);
        }
        return interrupt(str, workerWrapperCleanUpWorkerUnsafe, i10);
    }

    public boolean stopForegroundWork(StartStopToken startStopToken, int i10) {
        WorkerWrapper workerWrapperCleanUpWorkerUnsafe;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            workerWrapperCleanUpWorkerUnsafe = cleanUpWorkerUnsafe(workSpecId);
        }
        return interrupt(workSpecId, workerWrapperCleanUpWorkerUnsafe, i10);
    }

    public boolean stopWork(StartStopToken startStopToken, int i10) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.get(workSpecId) == null) {
                    Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                    if (set != null && set.contains(startStopToken)) {
                        return interrupt(workSpecId, cleanUpWorkerUnsafe(workSpecId), i10);
                    }
                    return false;
                }
                Logger.get().debug(TAG, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } finally {
            }
        }
    }

    public boolean startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = startStopToken.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Processor.a(this.f5506b, arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            Logger.get().warning(TAG, "Didn't find WorkSpec for id " + id2);
            runOnExecuted(id2, false);
            return false;
        }
        synchronized (this.mLock) {
            try {
                try {
                    try {
                        if (isEnqueued(workSpecId)) {
                            Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(startStopToken);
                                Logger.get().debug(TAG, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                runOnExecuted(id2, false);
                            }
                            return false;
                        }
                        if (workSpec.getGeneration() != id2.getGeneration()) {
                            runOnExecuted(id2, false);
                            return false;
                        }
                        final WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
                        final ListenableFuture<Boolean> listenableFutureLaunch = workerWrapperBuild.launch();
                        listenableFutureLaunch.addListener(new Runnable() { // from class: androidx.work.impl.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                Processor.c(this.f5512b, listenableFutureLaunch, workerWrapperBuild);
                            }
                        }, this.mWorkTaskExecutor.getMainThreadExecutor());
                        this.mEnqueuedWorkMap.put(workSpecId, workerWrapperBuild);
                        HashSet hashSet = new HashSet();
                        hashSet.add(startStopToken);
                        this.mWorkRuns.put(workSpecId, hashSet);
                        Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id2);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }
}
