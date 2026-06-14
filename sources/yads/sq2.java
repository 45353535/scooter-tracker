package yads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class sq2 implements w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f115901a;

    public sq2(t9 t9Var) {
        this.f115901a = t9Var;
    }

    @Override // yads.w9
    public final am2 a() {
        am2 am2Var = new am2((Map) null, 3);
        am2Var.b(this.f115901a.f116119l, FirebaseAnalytics.Param.AD_SOURCE);
        am2Var.b(this.f115901a.f116109b, "ad_type_format");
        am2Var.b(this.f115901a.f116112e, "ad_unit_id");
        am2Var.b(this.f115901a.f116111d, "product_type");
        am2Var.a(this.f115901a.f116122o, "server_log_id");
        am2Var.b(this.f115901a.c().f118812a.f113267b, "size_type");
        am2Var.b(Integer.valueOf(this.f115901a.c().f118813b), "width");
        am2Var.b(Integer.valueOf(this.f115901a.c().f118814c), "height");
        am2Var.f108723b = this.f115901a.f116116i;
        return am2Var;
    }
}
