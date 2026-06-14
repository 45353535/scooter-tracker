package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class l70 implements u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f112992a;

    public l70(ImageView imageView) {
        this.f112992a = imageView;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
    }

    @Override // yads.u21
    public final void a(t21 t21Var, boolean z10) {
        Bitmap bitmap = t21Var.f116034a;
        if (bitmap != null) {
            this.f112992a.setImageBitmap(bitmap);
        }
    }
}
