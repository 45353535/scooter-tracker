package f1;

import f1.z2;
import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements ag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f69488c = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f69489b = xe.b();

    public static final void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        c0 c0Var = f69488c;
        Intrinsics.checkNotNull(th2);
        if (c0Var.d(th2)) {
            c0Var.e((y0) new oc(z2.i.f71759o, c0Var.a(th2), null, null, null, 28, null));
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    public final String a(Throwable th2) {
        String string = new JSONObject().put("reason", "dismiss_event due to the unhandled exceptions").put("error", String.valueOf(th2)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void b() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: f1.b0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                c0.c(defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    public final boolean d(Throwable th2) {
        String className;
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                Intrinsics.checkNotNull(className);
                if (StringsKt.a0(className, "com.chartboost.sdk", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69489b.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f69489b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f69489b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f69489b.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69489b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69489b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f69489b.mo4436e(event);
    }
}
