package com.yandex.div.internal.viewpool;

import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "profiler", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "sessionProfiler", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "viewCreator", "<init>", "(Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;Lcom/yandex/div/internal/viewpool/ViewCreator;)V", "Landroid/view/View;", "T", "", s.z.f67720z, "Lcom/yandex/div/internal/viewpool/ViewFactory;", "factory", "", "capacity", "", "register", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/ViewFactory;I)V", "obtain", "(Ljava/lang/String;)Landroid/view/View;", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "", "Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "viewFactories", "Ljava/util/Map;", y.f66058y, "Channel", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdvanceViewPool implements ViewPool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ViewPoolProfiler profiler;

    @NotNull
    private final PerformanceDependentSessionProfiler sessionProfiler;

    @NotNull
    private final ViewCreator viewCreator;

    @NotNull
    private final Map<String, Channel<? extends View>> viewFactories = new ArrayMap();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 4*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00014B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010.\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", "Landroid/view/View;", "T", "Lcom/yandex/div/internal/viewpool/ViewFactory;", "", "viewName", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "profiler", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "sessionProfiler", "viewFactory", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "viewCreator", "", "initCapacity", "<init>", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;Lcom/yandex/div/internal/viewpool/ViewFactory;Lcom/yandex/div/internal/viewpool/ViewCreator;I)V", "extractViewBlocked", "()Landroid/view/View;", "", "requestViewCreation", "()V", "createView", "extractView", "createAndEnqueueView", "Ljava/lang/String;", "getViewName", "()Ljava/lang/String;", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "Lcom/yandex/div/internal/viewpool/ViewFactory;", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "Ljava/util/concurrent/BlockingQueue;", "viewQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/atomic/AtomicInteger;", "realQueueSize", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", C4240b4.i.f42629h0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "notEmpty", "Z", "getNotEmpty", "()Z", "capacity", "I", "getCapacity", "()I", "setCapacity", "(I)V", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Channel<T extends View> implements ViewFactory<T> {
        private volatile int capacity;
        private final boolean notEmpty;

        @Nullable
        private final ViewPoolProfiler profiler;

        @NotNull
        private AtomicInteger realQueueSize;

        @NotNull
        private final PerformanceDependentSessionProfiler sessionProfiler;

        @NotNull
        private final ViewCreator viewCreator;

        @NotNull
        private final ViewFactory<T> viewFactory;

        @NotNull
        private final String viewName;

        @NotNull
        private final BlockingQueue<T> viewQueue = new LinkedBlockingQueue();

        @NotNull
        private final AtomicBoolean stopped = new AtomicBoolean(false);

        public Channel(@NotNull String str, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i10) {
            this.viewName = str;
            this.profiler = viewPoolProfiler;
            this.sessionProfiler = performanceDependentSessionProfiler;
            this.viewFactory = viewFactory;
            this.viewCreator = viewCreator;
            this.realQueueSize = new AtomicInteger(i10);
            this.notEmpty = !r1.isEmpty();
            this.capacity = i10;
            for (int i11 = 0; i11 < i10; i11++) {
                this.viewCreator.request$div_release(this, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @AnyThread
        public final T extractViewBlocked() {
            try {
                this.viewCreator.promote$div_release(this);
                T tPoll = this.viewQueue.poll(16L, TimeUnit.MILLISECONDS);
                if (tPoll == null) {
                    return (T) this.viewFactory.createView();
                }
                this.realQueueSize.decrementAndGet();
                return tPoll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return (T) this.viewFactory.createView();
            }
        }

        private final void requestViewCreation() {
            if (this.capacity <= this.realQueueSize.get()) {
                return;
            }
            Companion companion = AdvanceViewPool.INSTANCE;
            long jNanoTime = System.nanoTime();
            this.viewCreator.request$div_release(this, this.viewQueue.size());
            this.realQueueSize.incrementAndGet();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            ViewPoolProfiler viewPoolProfiler = this.profiler;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.onViewRequested$div_release(jNanoTime2);
            }
        }

        @WorkerThread
        public final void createAndEnqueueView() {
            if (this.stopped.get()) {
                return;
            }
            try {
                this.viewQueue.offer((T) this.viewFactory.createView());
            } catch (Exception unused) {
            }
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NotNull
        public T createView() {
            return (T) extractView();
        }

        @AnyThread
        @NotNull
        public final T extractView() {
            Companion companion = AdvanceViewPool.INSTANCE;
            long jNanoTime = System.nanoTime();
            Object objPoll = this.viewQueue.poll();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            if (objPoll == null) {
                long jNanoTime3 = System.nanoTime();
                objPoll = extractViewBlocked();
                long jNanoTime4 = System.nanoTime() - jNanoTime3;
                ViewPoolProfiler viewPoolProfiler = this.profiler;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.onViewObtainedWithBlock$div_release(this.viewName, jNanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler);
            } else {
                this.realQueueSize.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler2 = this.profiler;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.onViewObtainedWithoutBlock$div_release(jNanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler2);
            }
            requestViewCreation();
            Intrinsics.checkNotNull(objPoll);
            return (T) objPoll;
        }

        public final boolean getNotEmpty() {
            return this.notEmpty;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Companion;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewCreator viewCreator) {
        this.profiler = viewPoolProfiler;
        this.sessionProfiler = performanceDependentSessionProfiler;
        this.viewCreator = viewCreator;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    @NotNull
    public <T extends View> T obtain(@NotNull String tag) {
        Channel channel;
        synchronized (this.viewFactories) {
            channel = (Channel) UtilsKt.getOrThrow(this.viewFactories, tag, "Factory is not registered");
        }
        T t10 = (T) channel.createView();
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.AdvanceViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    public <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int capacity) {
        synchronized (this.viewFactories) {
            if (this.viewFactories.containsKey(tag)) {
                Assert.fail("Factory is already registered");
            } else {
                this.viewFactories.put(tag, new Channel<>(tag, this.profiler, this.sessionProfiler, factory, this.viewCreator, capacity));
                Unit unit = Unit.f93236a;
            }
        }
    }
}
