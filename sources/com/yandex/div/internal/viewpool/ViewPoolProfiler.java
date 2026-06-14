package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0017R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;", "", "reporter", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "(Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;)V", "frameWatcher", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$FrameWatcher;", "handler", "Landroid/os/Handler;", b.f66095s, "Lcom/yandex/div/internal/viewpool/ProfilingSession;", "onFrameReady", "", "onFrameReady$div_release", "onViewObtainedWithBlock", "viewName", "", "durationNs", "", "onViewObtainedWithBlock$div_release", "onViewObtainedWithoutBlock", "onViewObtainedWithoutBlock$div_release", "onViewRequested", "onViewRequested$div_release", "FrameWatcher", "Reporter", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewPoolProfiler {

    @NotNull
    private final Reporter reporter;

    @NotNull
    private final ProfilingSession session = new ProfilingSession();

    @NotNull
    private final FrameWatcher frameWatcher = new FrameWatcher();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$FrameWatcher;", "Ljava/lang/Runnable;", "(Lcom/yandex/div/internal/viewpool/ViewPoolProfiler;)V", "watching", "", "run", "", "watch", "handler", "Landroid/os/Handler;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FrameWatcher implements Runnable {
        private boolean watching;

        public FrameWatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.onFrameReady$div_release();
            this.watching = false;
        }

        public final void watch(@NotNull Handler handler) {
            if (this.watching) {
                return;
            }
            handler.post(this);
            this.watching = true;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "", "reportEvent", "", PglCryptUtils.KEY_MESSAGE, "", "result", "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Reporter {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final Reporter NO_OP = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(@NotNull String message, @NotNull Map<String, ? extends Object> result) {
            }
        };

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter$Companion;", "", "()V", "NO_OP", "Lcom/yandex/div/internal/viewpool/ViewPoolProfiler$Reporter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void reportEvent(@NotNull String message, @NotNull Map<String, ? extends Object> result);
    }

    public ViewPoolProfiler(@NotNull Reporter reporter) {
        this.reporter = reporter;
    }

    public final void onFrameReady$div_release() {
        synchronized (this.session) {
            try {
                if (this.session.hasLongEvents()) {
                    this.reporter.reportEvent("view pool profiling", this.session.flush());
                }
                this.session.clear();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @AnyThread
    public final void onViewObtainedWithBlock$div_release(@NotNull String viewName, long durationNs) {
        synchronized (this.session) {
            this.session.viewObtainedWithBlock(viewName, durationNs);
            this.frameWatcher.watch(this.handler);
            Unit unit = Unit.f93236a;
        }
    }

    @AnyThread
    public final void onViewObtainedWithoutBlock$div_release(long durationNs) {
        synchronized (this.session) {
            this.session.viewObtainedWithoutBlock(durationNs);
            this.frameWatcher.watch(this.handler);
            Unit unit = Unit.f93236a;
        }
    }

    @AnyThread
    public final void onViewRequested$div_release(long durationNs) {
        this.session.viewRequested(durationNs);
        this.frameWatcher.watch(this.handler);
    }
}
