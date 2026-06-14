package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4647z3 {

    /* JADX INFO: renamed from: com.ironsource.z3$a */
    class a implements WorkerManager.WorkEndedListener<A3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f45958a;

        a(b bVar) {
            this.f45958a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<A3>> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<A3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((A3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC4596w3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC4596w3 callableC4596w3 = (CallableC4596w3) failed.callable;
                    arrayList2.add(new A3(callableC4596w3.d(), callableC4596w3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C4647z3.this.a(arrayList2, arrayList, j10);
            this.f45958a.a(arrayList2, j10, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f45958a.onFailure(str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.z3$b */
    public interface b {
        void a(@NotNull List<A3> list, long j10, @NotNull List<String> list2);

        void onFailure(String str);
    }

    public void a(@NotNull List<CallableC4596w3> list, @NotNull b bVar, long j10, @NotNull TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC4596w3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new a(bVar), j10, timeUnit);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "Exception - failed to collect bidding data, error= " + th2.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<A3> list, List<String> list2, long j10) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j10 + " millis");
        for (A3 a32 : list) {
            if (a32.a() != null) {
                IronLog.INTERNAL.verbose(a32.c() + " - success (" + a32.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(a32.c() + " - failed (" + a32.e() + " millis) error: " + a32.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
