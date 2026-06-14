package yads;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class wp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bg1 f117526a;

    public wp0(bg1 bg1Var) {
        this.f117526a = bg1Var;
    }

    public final void a(final ct1 ct1Var, final dt1 dt1Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        bg1 bg1Var = this.f117526a;
        bg1Var.f108997a.post(new Runnable() { // from class: yads.xs0
            @Override // java.lang.Runnable
            public final void run() {
                wp0.a(jElapsedRealtime, ct1Var, dt1Var);
            }
        });
    }

    public static final void a(long j10, Function0 function0, Function0 function02) {
        if (SystemClock.elapsedRealtime() - j10 <= 5000) {
            function0.invoke();
        } else {
            function02.invoke();
        }
    }
}
