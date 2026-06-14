package yads;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f117617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw0 f117618b;

    public ww0(dm2 dm2Var, vw0 vw0Var) {
        this.f117617a = dm2Var;
        this.f117618b = vw0Var;
    }

    public final Object a(Context context, x1 x1Var) {
        Object objB;
        long jA = j11.a();
        Intent intentA = this.f117618b.a(context, jA);
        Object obj = z1.f118487b;
        z1 z1VarA = y1.a();
        z1VarA.a(jA, x1Var);
        try {
            Result.Companion companion = Result.f93230c;
            context.startActivity(intentA);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            z1VarA.a(jA);
            wa1.a("Failed to show Fullscreen Ad. Exception: " + thG, new Object[0]);
            this.f117617a.reportError("Failed to show Fullscreen Ad", thG);
        }
        return objB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ww0(es2 es2Var) {
        pr3 pr3Var = (pr3) es2Var;
        this(pr3Var.a(), new vw0(pr3Var.c()));
    }
}
