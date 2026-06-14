package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class xa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f117750d = Executors.newCachedThreadPool(new qw1(qw1.f115184b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f117751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f117752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f117753c;

    public xa(Context context, es2 es2Var, c4 c4Var) {
        this.f117751a = c4Var;
        this.f117752b = es2Var;
        this.f117753c = context.getApplicationContext();
    }

    public final void a(String str, x53 x53Var) {
        qb2 qb2Var = new qb2(this.f117753c, this.f117751a, this.f117752b, x53Var);
        if (str.length() > 0) {
            f117750d.execute(new wa(str, qb2Var));
        }
    }
}
