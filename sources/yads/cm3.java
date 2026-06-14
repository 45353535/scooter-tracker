package yads;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class cm3 {
    public static Rect a(View view) {
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i10 = -iArr[0];
        int i11 = -iArr[1];
        rect.offset(i10, i11);
        return rect;
    }
}
