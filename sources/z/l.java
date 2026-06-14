package z;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public interface l extends j {

    public static final class a {

        /* JADX INFO: renamed from: z.l$a$a, reason: collision with other inner class name */
        static final class C1338a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f119137f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver f119138g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ b f119139h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1338a(l lVar, ViewTreeObserver viewTreeObserver, b bVar) {
                super(1);
                this.f119137f = lVar;
                this.f119138g = viewTreeObserver;
                this.f119139h = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f93236a;
            }

            public final void invoke(Throwable th2) {
                a.g(this.f119137f, this.f119138g, this.f119139h);
            }
        }

        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f119140b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f119141c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver f119142d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation f119143e;

            b(l lVar, ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
                this.f119141c = lVar;
                this.f119142d = viewTreeObserver;
                this.f119143e = cancellableContinuation;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                i iVarE = a.e(this.f119141c);
                if (iVarE != null) {
                    a.g(this.f119141c, this.f119142d, this);
                    if (!this.f119140b) {
                        this.f119140b = true;
                        this.f119143e.resumeWith(Result.b(iVarE));
                    }
                }
                return true;
            }
        }

        private static c c(l lVar, int i10, int i11, int i12) {
            if (i10 == -2) {
                return c.b.f119121a;
            }
            int i13 = i10 - i12;
            if (i13 > 0) {
                return z.a.a(i13);
            }
            int i14 = i11 - i12;
            if (i14 > 0) {
                return z.a.a(i14);
            }
            return null;
        }

        private static c d(l lVar) {
            ViewGroup.LayoutParams layoutParams = lVar.getView().getLayoutParams();
            return c(lVar, layoutParams != null ? layoutParams.height : -1, lVar.getView().getHeight(), lVar.a() ? lVar.getView().getPaddingTop() + lVar.getView().getPaddingBottom() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i e(l lVar) {
            c cVarD;
            c cVarF = f(lVar);
            if (cVarF == null || (cVarD = d(lVar)) == null) {
                return null;
            }
            return new i(cVarF, cVarD);
        }

        private static c f(l lVar) {
            ViewGroup.LayoutParams layoutParams = lVar.getView().getLayoutParams();
            return c(lVar, layoutParams != null ? layoutParams.width : -1, lVar.getView().getWidth(), lVar.a() ? lVar.getView().getPaddingLeft() + lVar.getView().getPaddingRight() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void g(l lVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                lVar.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static Object h(l lVar, Continuation continuation) {
            i iVarE = e(lVar);
            if (iVarE != null) {
                return iVarE;
            }
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
            eVar.I();
            ViewTreeObserver viewTreeObserver = lVar.getView().getViewTreeObserver();
            b bVar = new b(lVar, viewTreeObserver, eVar);
            viewTreeObserver.addOnPreDrawListener(bVar);
            eVar.v(new C1338a(lVar, viewTreeObserver, bVar));
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objC;
        }
    }

    boolean a();

    View getView();
}
