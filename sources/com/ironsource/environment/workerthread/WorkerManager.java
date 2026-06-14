package com.ironsource.environment.workerthread;

import com.ironsource.C4462o4;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Callable<T>> f43060a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f43061b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(@NotNull ExecutorService executorService) {
        this.f43061b = executorService;
    }

    public void addCallable(@NotNull Callable<T> callable) {
        this.f43060a.add(callable);
    }

    public void startWork(@NotNull WorkEndedListener<T> workEndedListener, long j10, @NotNull TimeUnit timeUnit) {
        if (this.f43061b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f43060a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f43061b.invokeAll(this.f43060a, j10, timeUnit);
            for (int i10 = 0; i10 < listInvokeAll.size(); i10++) {
                Future<T> future = listInvokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f43060a.get(i10)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e10) {
                        e = e10;
                        C4462o4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f43060a.get(i10), e));
                    } catch (CancellationException e11) {
                        C4462o4.d().a(e11);
                        arrayList.add(new WorkerResult.Canceled(this.f43060a.get(i10)));
                    } catch (ExecutionException e12) {
                        e = e12;
                        C4462o4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f43060a.get(i10), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f43061b.shutdownNow();
        } catch (Exception e13) {
            C4462o4.d().a(e13);
            IronLog.INTERNAL.error(e13.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e13.getMessage());
            this.f43061b.shutdownNow();
        }
    }
}
