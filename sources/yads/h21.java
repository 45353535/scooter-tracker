package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class h21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c21 f111444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hg2 f111445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v21 f111446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Resources f111447d;

    public /* synthetic */ h21(Context context, c21 c21Var, hg2 hg2Var) {
        this(context, c21Var, hg2Var, j72.f112253c.a(context).a());
    }

    public final void a(d31 d31Var, e21 e21Var) {
        g21 g21Var = new g21(e21Var, this);
        Bitmap bitmapA = this.f111445b.a(d31Var);
        if (bitmapA != null) {
            g21Var.a(bitmapA);
            return;
        }
        hg2 hg2Var = this.f111445b;
        hg2Var.getClass();
        String str = d31Var.f109737g;
        gg2 gg2Var = str != null ? new gg2(str, new kx2(d31Var.f109731a, d31Var.f109732b)) : null;
        g21Var.a(gg2Var != null ? (Bitmap) hg2Var.f111586c.get(gg2Var) : null);
        if (this.f111444a.a()) {
            String str2 = d31Var.f109733c;
            this.f111446c.a(str2, new f21(this, str2, g21Var), d31Var.f109731a, d31Var.f109732b);
        }
    }

    public h21(Context context, c21 c21Var, hg2 hg2Var, v21 v21Var) {
        this.f111444a = c21Var;
        this.f111445b = hg2Var;
        this.f111446c = v21Var;
        this.f111447d = context.getResources();
    }
}
