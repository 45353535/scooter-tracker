package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class o21 implements pn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f114161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21 f114162b;

    public o21(v21 v21Var, String str) {
        this.f114162b = v21Var;
        this.f114161a = str;
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        v21 v21Var = this.f114162b;
        String str = this.f114161a;
        ((g72) v21Var.f116843b).a(str, bitmap);
        r21 r21Var = (r21) v21Var.f116844c.remove(str);
        if (r21Var != null) {
            r21Var.f115282b = bitmap;
            v21Var.f116845d.put(str, r21Var);
            if (v21Var.f116847f == null) {
                q21 q21Var = new q21(v21Var);
                v21Var.f116847f = q21Var;
                v21Var.f116846e.postDelayed(q21Var, 100);
            }
        }
    }
}
