package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f116034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u21 f116035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v21 f116037d;

    public t21(v21 v21Var, Bitmap bitmap, String str, u21 u21Var) {
        this.f116037d = v21Var;
        this.f116034a = bitmap;
        this.f116036c = str;
        this.f116035b = u21Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.f116035b == null) {
            return;
        }
        r21 r21Var = (r21) this.f116037d.f116844c.get(this.f116036c);
        if (r21Var != null) {
            r21Var.f115284d.remove(this);
            if (r21Var.f115284d.size() == 0) {
                r21Var.f115281a.a();
                this.f116037d.f116844c.remove(this.f116036c);
                return;
            }
            return;
        }
        r21 r21Var2 = (r21) this.f116037d.f116845d.get(this.f116036c);
        if (r21Var2 != null) {
            r21Var2.f115284d.remove(this);
            if (r21Var2.f115284d.size() == 0) {
                r21Var2.f115281a.a();
            }
            if (r21Var2.f115284d.size() == 0) {
                this.f116037d.f116845d.remove(this.f116036c);
            }
        }
    }
}
