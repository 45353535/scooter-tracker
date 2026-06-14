package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@AnyThread
public class ConfigCacheClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f33016d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f33017e = new androidx.media3.exoplayer.hls.offline.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f33018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConfigStorageClient f33019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f33020c = null;

    private static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f33021a;

        private AwaitListener() {
            this.f33021a = new CountDownLatch(1);
        }

        public void await() throws InterruptedException {
            this.f33021a.await();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f33021a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            this.f33021a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f33021a.countDown();
        }

        public boolean await(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f33021a.await(j10, timeUnit);
        }
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f33018a = executor;
        this.f33019b = configStorageClient;
    }

    public static /* synthetic */ Task a(ConfigCacheClient configCacheClient, boolean z10, ConfigContainer configContainer, Void r32) {
        if (z10) {
            configCacheClient.e(configContainer);
        } else {
            configCacheClient.getClass();
        }
        return Tasks.forResult(configContainer);
    }

    private static Object c(Task task, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f33017e;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.await(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        f33016d.clear();
    }

    private synchronized void e(ConfigContainer configContainer) {
        this.f33020c = Tasks.forResult(configContainer);
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        String strA;
        Map map;
        try {
            strA = configStorageClient.a();
            map = f33016d;
            if (!map.containsKey(strA)) {
                map.put(strA, new ConfigCacheClient(executor, configStorageClient));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ConfigCacheClient) map.get(strA);
    }

    public void clear() {
        synchronized (this) {
            this.f33020c = Tasks.forResult(null);
        }
        this.f33019b.clear();
    }

    ConfigContainer d(long j10) {
        synchronized (this) {
            try {
                Task task = this.f33020c;
                if (task != null && task.isSuccessful()) {
                    return (ConfigContainer) this.f33020c.getResult();
                }
                try {
                    return (ConfigContainer) c(get(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d(FirebaseRemoteConfig.TAG, "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized Task<ConfigContainer> get() {
        try {
            Task task = this.f33020c;
            if (task == null || (task.isComplete() && !this.f33020c.isSuccessful())) {
                Executor executor = this.f33018a;
                final ConfigStorageClient configStorageClient = this.f33019b;
                Objects.requireNonNull(configStorageClient);
                this.f33020c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return configStorageClient.read();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f33020c;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return d(5L);
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z10) {
        return Tasks.call(this.f33018a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f33130b.f33019b.write(configContainer);
            }
        }).onSuccessTask(this.f33018a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ConfigCacheClient.a(this.f33132a, z10, configContainer, (Void) obj);
            }
        });
    }
}
