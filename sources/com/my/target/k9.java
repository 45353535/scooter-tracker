package com.my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes11.dex */
public class k9 extends ProgressBar implements j9 {
    public k9(Context context) {
        super(context, null, android.R.attr.progressBarStyleHorizontal);
    }

    @Override // com.my.target.j9
    public View a() {
        return this;
    }

    @Override // com.my.target.j9
    public void setColor(int i10) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i10), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // com.my.target.j9
    public void setMaxTime(float f10) {
        setMax((int) (f10 * 1000.0f));
    }

    @Override // com.my.target.j9
    public void setTimeChanged(float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            setProgress((int) (f10 * 1000.0f), true);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", getProgress(), (int) (f10 * 1000.0f));
        objectAnimatorOfInt.setDuration(200L);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.start();
    }

    @Override // com.my.target.j9
    public void setVisible(boolean z10) {
        setVisibility(z10 ? 0 : 8);
    }
}
