package bd;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public final View a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup viewGroup = (ViewGroup) view.findViewWithTag(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (viewGroup == null) {
            return view;
        }
        int childCount = viewGroup.getChildCount();
        View view2 = viewGroup;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View child = viewGroup.getChildAt(i11);
            int measuredWidth = child.getMeasuredWidth() * child.getMeasuredHeight();
            if (measuredWidth > i10) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                view2 = child;
                i10 = measuredWidth;
            }
        }
        return view2;
    }
}
