package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class g21 implements d21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e21 f111037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h21 f111038b;

    public g21(e21 e21Var, h21 h21Var) {
        this.f111037a = e21Var;
        this.f111038b = h21Var;
    }

    public final void a(Bitmap bitmap) {
        this.f111037a.a(bitmap != null ? new BitmapDrawable(this.f111038b.f111447d, bitmap) : null);
    }
}
