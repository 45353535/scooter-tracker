package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class MaxWidthMediaView extends MediaView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102098a;

    public MaxWidthMediaView(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f102098a;
        if (i12 > 0 && size > i12) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f102098a, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxWidth(int i10) {
        this.f102098a = i10;
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
