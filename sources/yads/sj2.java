package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sj2 extends RatingBar implements pj2 {
    public sj2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return isClickable() && motionEvent.getAction() == 0;
    }

    @Override // android.widget.RatingBar, yads.pj2
    public void setRating(float f10) {
        super.setRating(f10);
    }
}
