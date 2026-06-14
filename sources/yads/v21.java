package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm2 f116842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21 f116843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f116844c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f116845d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f116846e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q21 f116847f;

    public v21(xm2 xm2Var, g72 g72Var) {
        this.f116842a = xm2Var;
        this.f116843b = g72Var;
    }

    public final t21 a(String str, u21 u21Var, int i10, int i11) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((px2) this).f114807g.getClass();
        String strA = v11.a(str, scaleType);
        Bitmap bitmapA = ((g72) this.f116843b).a(strA);
        if (bitmapA != null) {
            t21 t21Var = new t21(this, bitmapA, null, null);
            u21Var.a(t21Var, true);
            return t21Var;
        }
        t21 t21Var2 = new t21(this, null, strA, u21Var);
        u21Var.a(t21Var2, true);
        r21 r21Var = (r21) this.f116844c.get(strA);
        if (r21Var == null) {
            r21Var = (r21) this.f116845d.get(strA);
        }
        if (r21Var != null) {
            r21Var.f115284d.add(t21Var2);
            return t21Var2;
        }
        z21 z21Var = new z21(str, new o21(this, strA), i10, i11, scaleType, Bitmap.Config.RGB_565, new p21(this, strA));
        this.f116842a.a(z21Var);
        this.f116844c.put(strA, new r21(z21Var, t21Var2));
        return t21Var2;
    }
}
