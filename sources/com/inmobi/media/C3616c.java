package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3616c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3616c extends AbstractC4048t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f38303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f38305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f38306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineScope f38307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3616c(long j10, final C4073u5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38302b = j10;
        this.f38303c = new Function0() { // from class: w3.a6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3616c.a(this.f106978b, listener);
            }
        };
        this.f38304d = new AtomicBoolean(false);
        this.f38305e = new AtomicBoolean(false);
        this.f38306f = new Handler(Looper.getMainLooper());
    }

    public static final Unit a(C3616c c3616c, InterfaceC4023s5 interfaceC4023s5) {
        if (c3616c.f38304d.get()) {
            if (c3616c.f38306f.hasMessages(2023)) {
                c3616c.f38306f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c3616c.f38305e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    Intrinsics.checkNotNull(stackTrace);
                    ((C4073u5) interfaceC4023s5).a(new Wn(stackTrace));
                }
            }
            c3616c.f38305e.getAndSet(true);
            c3616c.f38306f.sendEmptyMessage(2023);
        }
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void b() {
        if (this.f38304d.getAndSet(false)) {
            this.f38304d.set(false);
            this.f38305e.set(false);
            F3.a(this.f38307g);
        }
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void a() {
        if (this.f38304d.getAndSet(true)) {
            return;
        }
        Intrinsics.checkNotNullParameter("ANRWatchDog", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("ANRWatchDog", false));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.w0.c(executorServiceNewSingleThreadExecutor));
        this.f38307g = coroutineScopeA;
        if (coroutineScopeA != null) {
            F3.a(coroutineScopeA, 0L, this.f38302b, new C3590b(this.f38303c));
        }
    }
}
