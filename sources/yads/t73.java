package yads;

import java.lang.Thread;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class t73 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f116103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f116104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hr2 f116105c;

    public t73(mr1 mr1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, hr2 hr2Var) {
        this.f116103a = mr1Var;
        this.f116104b = uncaughtExceptionHandler;
        this.f116105c = hr2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            Set setEmptySet = this.f116105c.f111742n0;
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
            Set set = t03.f116008a;
            if (t03.a(th2.getStackTrace(), setEmptySet)) {
                this.f116103a.reportUnhandledException(th2);
            }
            if (this.f116105c.f111740m0 || (uncaughtExceptionHandler = this.f116104b) == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion = Result.f93230c;
                this.f116103a.reportError("Failed to report uncaught exception", th3);
                Result.b(Unit.f93236a);
            } finally {
                try {
                    if (this.f116105c.f111740m0 || (uncaughtExceptionHandler = this.f116104b) == null) {
                        return;
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } catch (Throwable th4) {
                }
            }
            if (this.f116105c.f111740m0) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }
}
