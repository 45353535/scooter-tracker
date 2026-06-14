package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i21 implements u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j21 f111840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f111841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d31 f111842c;

    public i21(j21 j21Var, Map map, d31 d31Var) {
        this.f111840a = j21Var;
        this.f111841b = map;
        this.f111842c = d31Var;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        boolean z10 = lb1.f113032a;
        this.f111840a.a(this.f111841b);
    }

    @Override // yads.u21
    public final void a(t21 t21Var, boolean z10) {
        String str = this.f111842c.f109733c;
        Bitmap bitmap = t21Var.f116034a;
        if (bitmap != null) {
            if (str != null) {
                this.f111841b.put(str, bitmap);
                this.f111840a.f112222c.a(str, bitmap);
            }
            this.f111840a.a(this.f111841b);
        }
    }
}
