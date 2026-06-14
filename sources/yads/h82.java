package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l82 f111514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm2 f111515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt2 f111516d;

    public h82(Context context) {
        this.f111513a = context.getApplicationContext();
        this.f111514b = m82.a(context);
        Object obj = sm2.f115876a;
        this.f111515c = rm2.a();
        Object obj2 = vt2.f117186j;
        this.f111516d = ut2.a();
    }

    public final void a(j82 j82Var) {
        hr2 hr2VarA = this.f111516d.a(this.f111513a);
        String str = hr2VarA != null ? hr2VarA.Q : null;
        String strC = ((ff1) this.f111514b.f113000a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || Intrinsics.areEqual(str, strC)) {
            j82Var.a();
            return;
        }
        g82 g82Var = new g82(this, str, j82Var);
        t13 t13Var = new t13(str, g82Var, g82Var);
        t13Var.f112777q = "om_sdk_js_request_tag";
        sm2 sm2Var = this.f111515c;
        Context context = this.f111513a;
        synchronized (sm2Var) {
            e72.a(context).a(t13Var);
        }
    }
}
