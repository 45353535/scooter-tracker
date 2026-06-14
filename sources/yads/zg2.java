package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zg2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f118668c;

    public zg2(ProgressBar progressBar, int i10, int i11) {
        this.f118666a = i10;
        this.f118667b = i11;
        this.f118668c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.f118668c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            progressBar.setProgress(Math.round(((this.f118667b - r5) * f10) + this.f118666a));
        }
    }
}
