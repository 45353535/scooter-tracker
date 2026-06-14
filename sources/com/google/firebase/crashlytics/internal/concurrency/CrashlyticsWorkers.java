package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.f.y;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "backgroundExecutorService", "Ljava/util/concurrent/ExecutorService;", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "common", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "diskWrite", "dataCollect", "network", y.f66058y, "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f32147a;

    @NotNull
    public final CrashlyticsWorker common;

    @NotNull
    public final CrashlyticsWorker dataCollect;

    @NotNull
    public final CrashlyticsWorker diskWrite;

    @NotNull
    public final CrashlyticsWorker network;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "<init>", "()V", "", CampaignEx.JSON_KEY_AD_K, "()Z", "j", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "", "g", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "checkNotMainThread", "checkBlockingThread", "checkBackgroundThread", "kotlin.jvm.PlatformType", "h", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "getEnforcement", "setEnforcement", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d() {
            return "Must be called on a background thread, was called on " + CrashlyticsWorkers.INSTANCE.h() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e() {
            return "Must be called on a blocking thread, was called on " + CrashlyticsWorkers.INSTANCE.h() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f() {
            return "Must not be called on a main thread, was called on " + CrashlyticsWorkers.INSTANCE.h() + '.';
        }

        private final void g(Function0 isCorrectThread, Function0 failureMessage) {
            if (((Boolean) isCorrectThread.invoke()).booleanValue()) {
                return;
            }
            Logger.getLogger().d((String) failureMessage.invoke());
            getEnforcement();
        }

        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private final String h() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i() {
            String strH = h();
            Intrinsics.checkNotNullExpressionValue(strH, "<get-threadName>(...)");
            return StringsKt.g0(strH, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j() {
            String strH = h();
            Intrinsics.checkNotNullExpressionValue(strH, "<get-threadName>(...)");
            return StringsKt.g0(strH, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void checkBackgroundThread() {
            g(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.d();
                }
            });
        }

        public final void checkBlockingThread() {
            g(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.e();
                }
            });
        }

        public final void checkNotMainThread() {
            g(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrashlyticsWorkers.Companion.f();
                }
            });
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.f32147a;
        }

        public final void setEnforcement(boolean z10) {
            CrashlyticsWorkers.f32147a = z10;
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(@NotNull ExecutorService backgroundExecutorService, @NotNull ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void checkBackgroundThread() {
        INSTANCE.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        INSTANCE.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        INSTANCE.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return INSTANCE.getEnforcement();
    }

    public static final void setEnforcement(boolean z10) {
        INSTANCE.setEnforcement(z10);
    }
}
