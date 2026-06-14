package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f113155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f113156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa3 f113157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final td3 f113158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f113159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113160f;

    public lm3(Context context, c4 c4Var, es2 es2Var, fa3 fa3Var, td3 td3Var) {
        this.f113155a = c4Var;
        this.f113156b = es2Var;
        this.f113157c = fa3Var;
        this.f113158d = td3Var;
        this.f113159e = context.getApplicationContext();
    }

    public final void a(Context context, List list, om2 om2Var, Object obj) {
        int i10 = this.f113160f + 1;
        this.f113160f = i10;
        if (i10 > 5) {
            om2Var.a(new pb3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new nm3(new im3(this.f113159e, this.f113155a, this.f113156b, this.f113157c, this.f113158d)).a(context, list, om2Var, obj);
    }
}
