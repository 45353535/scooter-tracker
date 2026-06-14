package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final void a(View view, ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(View view, ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int c(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List d(r rVar, Rect globalRect, int i10, int i11) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (rVar == null) {
            return CollectionsKt.listOf(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = rVar.getLineCount();
        for (int i12 = 0; i12 < lineCount; i12++) {
            int iA = (int) rVar.a(i12, rVar.getLineStart(i12));
            int iD = rVar.d(i12);
            int iC = rVar.c(i12);
            int iA2 = (int) rVar.a(i12, (iC - iD) + (iD > 0 ? 1 : 0));
            if (iA2 == 0 && iC > 0) {
                iA2 = ((int) rVar.a(i12, iC - 1)) + 1;
            }
            int lineTop = rVar.getLineTop(i12);
            int lineBottom = rVar.getLineBottom(i12);
            Rect rect = new Rect();
            int i13 = globalRect.left + i10 + iA;
            rect.left = i13;
            rect.right = i13 + (iA2 - iA);
            int i14 = globalRect.top + i11 + lineTop;
            rect.top = i14;
            rect.bottom = i14 + (lineBottom - lineTop);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static final boolean f(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final Pair g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return TuplesKt.to(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return TuplesKt.to(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return TuplesKt.to(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return TuplesKt.to(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void h(View view, ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void i(View view, ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int j(int i10) {
        return i10 | ViewCompat.MEASURED_STATE_MASK;
    }

    public static final void k(View view, io.sentry.android.replay.viewhierarchy.b parentNode, v7 options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f83220a.b(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f83226m.a(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(bVarA);
                    k(childAt, bVarA, options);
                }
            }
            parentNode.f(arrayList);
        }
    }
}
