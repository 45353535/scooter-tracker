package dc;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes12.dex */
public class s extends RelativeLayout {
    public s(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, measuredWidth) : measuredWidth;
        }
        int i12 = (int) (size * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i12) {
            size2 = i12;
        } else {
            size = (int) (size2 * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }
}
