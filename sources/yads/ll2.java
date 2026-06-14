package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class ll2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl2 f113143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f113144c;

    public ll2(pl2 pl2Var, Bitmap bitmap) {
        this.f113143b = pl2Var;
        this.f113144c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f113143b.setBackground(new BitmapDrawable(this.f113143b.getResources(), this.f113144c));
        this.f113143b.setVisibility(0);
    }
}
