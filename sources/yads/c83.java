package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class c83 implements h72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f109281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v11 f109282b;

    public c83(i72 i72Var, v11 v11Var) {
        this.f109281a = i72Var;
        this.f109282b = v11Var;
    }

    public final Bitmap a(String str) {
        this.f109282b.getClass();
        return (Bitmap) this.f109281a.get(v11.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.f109282b.getClass();
        this.f109281a.put(v11.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
