package com.pubmatic.sdk.common.taskhandler;

import android.os.Looper;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/common/taskhandler/POBTaskHandler;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "runOnMainThread", "(Ljava/lang/Runnable;)V", "runOnBackgroundThread", "Ljava/util/concurrent/Executor;", "getBackgroundThreadExecutor", "()Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "backgroundThreadExecutor", "b", "mainThreadExecutor", y.f66058y, "common_release"}, k = 1, mv = {1, 7, 1})
public final class POBTaskHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile POBTaskHandler f62525c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor backgroundThreadExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Executor mainThreadExecutor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/pubmatic/sdk/common/taskhandler/POBTaskHandler$Companion;", "", "()V", C4424m2.f43617p, "Lcom/pubmatic/sdk/common/taskhandler/POBTaskHandler;", Constants.GET_INSTANCE, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBTaskHandler getInstance() {
            POBTaskHandler pOBTaskHandler;
            POBTaskHandler pOBTaskHandler2 = POBTaskHandler.f62525c;
            if (pOBTaskHandler2 != null) {
                return pOBTaskHandler2;
            }
            synchronized (this) {
                pOBTaskHandler = POBTaskHandler.f62525c;
                if (pOBTaskHandler == null) {
                    pOBTaskHandler = new POBTaskHandler(null);
                    POBTaskHandler.f62525c = pOBTaskHandler;
                }
            }
            return pOBTaskHandler;
        }

        private Companion() {
        }
    }

    public /* synthetic */ POBTaskHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final POBTaskHandler getInstance() {
        return INSTANCE.getInstance();
    }

    @NotNull
    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    public final void runOnBackgroundThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            this.backgroundThreadExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void runOnMainThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            this.mainThreadExecutor.execute(runnable);
        }
    }

    private POBTaskHandler() {
        this.backgroundThreadExecutor = new POBBackgroundThreadExecutor();
        this.mainThreadExecutor = new POBMainThreadExecutor();
    }
}
