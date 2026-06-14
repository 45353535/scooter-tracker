package com.yandex.div.core.util;

import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0003\"\u0018\u0010\r\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"Landroid/view/View;", "", "isLayoutRtl", "(Landroid/view/View;)Z", "", "start", "count", "Lkotlin/ranges/d;", "getIndices", "(Landroid/view/View;II)Lkotlin/ranges/d;", "farthestLayoutCaller", "(Landroid/view/View;)Landroid/view/View;", "isActuallyLaidOut", "isHierarchyLaidOut", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    @NotNull
    public static final d getIndices(@NotNull View view, int i10, int i11) {
        int i12 = i11 + i10;
        return isLayoutRtl(view) ? g.r(i12 - 1, i10) : g.v(i10, i12);
    }

    public static final boolean isActuallyLaidOut(@NotNull View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean isHierarchyLaidOut(@NotNull View view) {
        return farthestLayoutCaller(view) == null;
    }

    public static final boolean isLayoutRtl(@NotNull View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }
}
