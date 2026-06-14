package tc;

import android.view.View;
import android.view.ViewPropertyAnimator;
import ic.v;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import pd.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f105050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f105051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f105052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f105053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f105054e;

    public b(z tag, k animatorFactory, h valuesCalculator) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(animatorFactory, "animatorFactory");
        Intrinsics.checkNotNullParameter(valuesCalculator, "valuesCalculator");
        this.f105050a = tag;
        this.f105051b = animatorFactory;
        this.f105052c = valuesCalculator;
        this.f105054e = new AtomicBoolean(false);
    }

    private final void e(View view, g gVar) {
        view.setAlpha(gVar.a());
        view.setTranslationX(gVar.b());
        view.setTranslationY(gVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f105054e.set(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b() {
        v.g(this.f105050a, "Cancel animation", new Object[0]);
        ViewPropertyAnimator viewPropertyAnimator = this.f105053d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.f105053d = null;
        this.f105054e.set(false);
    }

    public final void c(View view, id.f eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        g gVarB = this.f105052c.b(view, eventType);
        e(view, gVarB);
        v.g(this.f105050a, "Prepare animation for event: " + eventType + "; initial values: " + gVarB, new Object[0]);
    }

    public final void d(View view, id.f eventType, Runnable runnable, final Runnable runnable2, boolean z10) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (runnable != null) {
            runnable.run();
        }
        if (view == null) {
            v.g(this.f105050a, "Animation not started for event: " + eventType + "; view is null", new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        if (g() || z10) {
            v.g(this.f105050a, "Animation is already running for event: " + eventType, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        g gVarA = this.f105052c.a(view, eventType);
        ViewPropertyAnimator viewPropertyAnimatorC = this.f105051b.c(view, eventType, gVarA);
        if (viewPropertyAnimatorC == null) {
            e(view, gVarA);
            v.g(this.f105050a, "Apply values without animation for event: " + eventType + "; target values: " + gVarA, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        v.g(this.f105050a, "Start animation for event: " + eventType + "; target values: " + gVarA, new Object[0]);
        this.f105054e.set(true);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorC.withEndAction(new Runnable() { // from class: tc.a
            @Override // java.lang.Runnable
            public final void run() {
                b.f(this.f105048b, runnable2);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        this.f105053d = viewPropertyAnimatorWithEndAction;
    }

    public final boolean g() {
        return this.f105054e.get();
    }
}
