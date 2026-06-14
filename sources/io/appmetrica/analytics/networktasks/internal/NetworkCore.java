package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f78864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f78865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f78866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f78867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f78868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f78869f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f78866c) {
                }
                this.f78867d = (d) this.f78864a.take();
                networkTask = this.f78867d.f78835a;
                Executor executor = networkTask.getExecutor();
                this.f78868e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f78866c) {
                    this.f78867d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f78866c) {
                        this.f78867d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f78866c) {
                        this.f78867d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th2;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f78869f.canBeExecuted()) {
            synchronized (this.f78865b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f78864a.contains(dVar) && !dVar.equals(this.f78867d) && networkTask.onTaskAdded()) {
                        this.f78864a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f78866c) {
            try {
                ArrayList arrayList = new ArrayList(this.f78864a.size());
                this.f78864a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f78835a.onTaskRemoved();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f78864a = new LinkedBlockingQueue();
        this.f78865b = new Object();
        this.f78866c = new Object();
        this.f78869f = iExecutionPolicy;
        this.f78868e = gVar;
    }
}
