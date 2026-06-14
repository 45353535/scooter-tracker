package t5;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    public static final /* synthetic */ void b(final View view, final long j10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
        view.post(new Runnable() { // from class: t5.e
            @Override // java.lang.Runnable
            public final void run() {
                f.c(view, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View this_circularRevealed, long j10) {
        Intrinsics.checkNotNullParameter(this_circularRevealed, "$this_circularRevealed");
        if (this_circularRevealed.isAttachedToWindow()) {
            this_circularRevealed.setVisibility(0);
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this_circularRevealed, (this_circularRevealed.getLeft() + this_circularRevealed.getRight()) / 2, (this_circularRevealed.getTop() + this_circularRevealed.getBottom()) / 2, 0.0f, Math.max(this_circularRevealed.getWidth(), this_circularRevealed.getHeight()));
            animatorCreateCircularReveal.setDuration(j10);
            animatorCreateCircularReveal.start();
        }
    }

    public static final /* synthetic */ int d(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if (!(context instanceof Activity) || !z10) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static final /* synthetic */ Point e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final /* synthetic */ void f(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }
}
