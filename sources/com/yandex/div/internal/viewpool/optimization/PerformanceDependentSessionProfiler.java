package com.yandex.div.internal.viewpool.optimization;

import androidx.annotation.AnyThread;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@AnyThread
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "", "", "isDebuggingViewPoolOptimization", "<init>", "(Z)V", "Z", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PerformanceDependentSessionProfiler {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isDebuggingViewPoolOptimization;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PerformanceDependentSessionProfiler(boolean z10) {
        this.isDebuggingViewPoolOptimization = z10;
    }

    public static final /* synthetic */ PerformanceDependentSession access$getSession$p(PerformanceDependentSessionProfiler performanceDependentSessionProfiler) {
        performanceDependentSessionProfiler.getClass();
        return null;
    }
}
