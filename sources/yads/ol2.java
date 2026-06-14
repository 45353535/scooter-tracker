package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class ol2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh3 f114369a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ql2 f114371c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vp f114370b = new vp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ml2 f114372d = new ml2();

    public ol2(jh3 jh3Var, e52 e52Var) {
        this.f114369a = jh3Var;
        this.f114371c = new ql2(jh3Var, e52Var);
    }

    public final void a() {
        r52 r52Var = (r52) this.f114369a.b();
        if (r52Var != null) {
            pl2 pl2Var = r52Var.f115325c.f109754a;
            ql2 ql2Var = this.f114371c;
            ql2Var.getClass();
            pl2Var.setVisibility(4);
            pl2Var.f114700a.setOnClickListener(ql2Var.f115068a);
            Bitmap bitmap = r52Var.f115324b.getBitmap();
            if (bitmap != null) {
                this.f114370b.f117139a.execute(new up(bitmap, new nl2(this, r52Var, pl2Var), new Handler(Looper.getMainLooper()), new bq()));
            }
        }
    }
}
