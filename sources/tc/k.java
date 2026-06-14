package tc;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f105063a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105064a;

        static {
            int[] iArr = new int[id.g.values().length];
            try {
                iArr[id.g.EaseIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[id.g.EaseOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[id.g.EaseInOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105064a = iArr;
        }
    }

    public k(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f105063a = params;
    }

    private final TimeInterpolator b(id.g gVar) {
        int i10 = gVar == null ? -1 : a.f105064a[gVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator();
    }

    public final ViewPropertyAnimator c(View view, id.f eventType, g targetValues) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(targetValues, "targetValues");
        id.h hVar = (id.h) this.f105063a.get(eventType);
        if (hVar == null) {
            return null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(targetValues.a()).translationX(targetValues.b()).translationY(targetValues.c()).setDuration(hVar.b()).withStartAction(new Runnable() { // from class: tc.j
            @Override // java.lang.Runnable
            public final void run() {
                k.d();
            }
        });
        viewPropertyAnimatorWithStartAction.setInterpolator(b(hVar.c()));
        return viewPropertyAnimatorWithStartAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
    }
}
