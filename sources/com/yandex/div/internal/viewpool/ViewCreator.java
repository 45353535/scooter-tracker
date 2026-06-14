package com.yandex.div.internal.viewpool;

import android.os.Process;
import com.appsflyer.AppsFlyerProperties;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0002\b\u000bJ!\u0010\f\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator;", "", "cpuUsageHistogramReporter", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "(Lcom/yandex/div/histogram/CpuUsageHistogramReporter;)V", "creatorThread", "Lcom/yandex/div/internal/viewpool/ViewCreator$ViewCreatorThread;", "promote", "", AppsFlyerProperties.CHANNEL, "Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "promote$div_release", "request", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "request$div_release", y.f66058y, "CreateViewTask", "ViewCreatorThread", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewCreator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewCreatorThread creatorThread;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$Companion;", "", "()V", "CPU_USAGE_HISTOGRAM_NAME", "", "TASK_HIGHEST_PRIORITY", "", "TASK_QUEUE_INITIAL_CAPACITY", "THREAD_DEFAULT_PRIORITY", "THREAD_LOW_PRIORITY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$CreateViewTask;", "Ljava/lang/Runnable;", "", "Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", AppsFlyerProperties.CHANNEL, "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "<init>", "(Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;I)V", "", "run", "()V", "other", "compareTo", "(Lcom/yandex/div/internal/viewpool/ViewCreator$CreateViewTask;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "", "viewName", "Ljava/lang/String;", "getViewName", "()Ljava/lang/String;", "channelRef$delegate", "Lkotlin/properties/e;", "getChannelRef", "()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "channelRef", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};

        /* JADX INFO: renamed from: channelRef$delegate, reason: from kotlin metadata */
        @NotNull
        private final e channelRef;
        private final int priority;

        @NotNull
        private final String viewName;

        public CreateViewTask(@NotNull AdvanceViewPool.Channel<?> channel, int i10) {
            this.priority = i10;
            this.viewName = channel.getViewName();
            this.channelRef = UtilsKt.weak(channel);
        }

        private final AdvanceViewPool.Channel<?> getChannelRef() {
            return (AdvanceViewPool.Channel) this.channelRef.getValue(this, $$delegatedProperties[0]);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(CreateViewTask.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            CreateViewTask createViewTask = (CreateViewTask) other;
            return Intrinsics.areEqual(this.viewName, createViewTask.viewName) && this.priority == createViewTask.priority;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return ((6913 + this.priority) * 31) + this.viewName.hashCode();
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel<?> channelRef = getChannelRef();
            if (channelRef != null) {
                channelRef.createAndEnqueueView();
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull CreateViewTask other) {
            int i10 = this.priority - other.priority;
            return i10 != 0 ? i10 : !Intrinsics.areEqual(this.viewName, other.viewName) ? 1 : 0;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$ViewCreatorThread;", "Ljava/lang/Thread;", "name", "", "cpuUsageHistogramReporter", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "(Ljava/lang/String;Lcom/yandex/div/histogram/CpuUsageHistogramReporter;)V", "<set-?>", "currentViewName", "getCurrentViewName", "()Ljava/lang/String;", "taskQueue", "Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "Lcom/yandex/div/internal/viewpool/ViewCreator$CreateViewTask;", "kotlin.jvm.PlatformType", "getTaskQueue", "()Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "createView", "", "run", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ViewCreatorThread extends Thread {

        @NotNull
        private final CpuUsageHistogramReporter cpuUsageHistogramReporter;

        @Nullable
        private volatile String currentViewName;

        @NotNull
        private final BatchBlockingQueue<CreateViewTask> taskQueue;

        public ViewCreatorThread(@NotNull String str, @NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(str);
            this.cpuUsageHistogramReporter = cpuUsageHistogramReporter;
            this.taskQueue = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        private final void createView() throws InterruptedException {
            CreateViewTask createViewTaskPoll = this.taskQueue.poll();
            if (createViewTaskPoll == null) {
                try {
                    setPriority(3);
                    createViewTaskPoll = this.taskQueue.take();
                } finally {
                    setPriority(5);
                }
            }
            this.currentViewName = createViewTaskPoll.getViewName();
            createViewTaskPoll.run();
            this.currentViewName = null;
        }

        @Nullable
        public final String getCurrentViewName() {
            return this.currentViewName;
        }

        @NotNull
        public final BatchBlockingQueue<CreateViewTask> getTaskQueue() {
            return this.taskQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable cancelableStartReporting = this.cpuUsageHistogramReporter.startReporting("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        createView();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        cancelableStartReporting.cancel();
                        return;
                    }
                } catch (Throwable th2) {
                    cancelableStartReporting.cancel();
                    throw th2;
                }
            }
        }
    }

    public ViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.creatorThread = viewCreatorThread;
        viewCreatorThread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r2.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void promote$div_release(@org.jetbrains.annotations.NotNull com.yandex.div.internal.viewpool.AdvanceViewPool.Channel<?> r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getViewName()
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread
            java.lang.String r1 = r1.getCurrentViewName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto La3
            boolean r0 = r6.getNotEmpty()
            if (r0 == 0) goto L18
            goto La3
        L18:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r0 = r5.creatorThread
            com.yandex.div.internal.viewpool.BatchBlockingQueue r0 = r0.getTaskQueue()
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r1.lock()
            java.lang.String r1 = r6.getViewName()     // Catch: java.lang.Throwable -> L91
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r2 = r5.creatorThread     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r2.getCurrentViewName()     // Catch: java.lang.Throwable -> L91
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
            boolean r1 = r6.getNotEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L3c
            goto L89
        L3c:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread     // Catch: java.lang.Throwable -> L91
            com.yandex.div.internal.viewpool.BatchBlockingQueue r1 = r1.getTaskQueue()     // Catch: java.lang.Throwable -> L91
            java.util.concurrent.locks.ReentrantLock r2 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L91
            r2.lock()     // Catch: java.lang.Throwable -> L91
            java.util.Queue r2 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getQueue$p(r1)     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6f
        L51:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6f
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r3 = (com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.getViewName()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r6.getViewName()     // Catch: java.lang.Throwable -> L6f
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L51
            r2.remove()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r6 = move-exception
            goto L93
        L71:
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L91
            r1.unlock()     // Catch: java.lang.Throwable -> L91
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread     // Catch: java.lang.Throwable -> L91
            com.yandex.div.internal.viewpool.BatchBlockingQueue r1 = r1.getTaskQueue()     // Catch: java.lang.Throwable -> L91
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r2 = new com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask     // Catch: java.lang.Throwable -> L91
            r3 = -1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L91
            r1.offer(r2)     // Catch: java.lang.Throwable -> L91
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L91
        L89:
            java.util.concurrent.locks.ReentrantLock r6 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r6.unlock()
            return
        L91:
            r6 = move-exception
            goto L9b
        L93:
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L91
            r1.unlock()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L9b:
            java.util.concurrent.locks.ReentrantLock r0 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r0.unlock()
            throw r6
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.ViewCreator.promote$div_release(com.yandex.div.internal.viewpool.AdvanceViewPool$Channel):void");
    }

    public final void request$div_release(@NotNull AdvanceViewPool.Channel<?> channel, int priority) {
        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, priority));
    }
}
