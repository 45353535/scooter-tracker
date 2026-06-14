package yads;

import android.content.Context;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8 f118594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8 f118595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8 f118596c;

    public z8(n8 n8Var, o8 o8Var, x8 x8Var) {
        this.f118594a = n8Var;
        this.f118595b = o8Var;
        this.f118596c = x8Var;
    }

    public final y8 a(Context context) {
        Object objB;
        u7 u7Var;
        try {
            Result.Companion companion = Result.f93230c;
            Object obj = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(context);
            d8 d8VarA = hr2VarA != null ? hr2VarA.a() : null;
            if (d8VarA == null || !d8VarA.a()) {
                boolean z10 = lb1.f113032a;
                u7Var = new u7();
            } else {
                this.f118595b.getClass();
                o8.a(d8VarA);
                this.f118594a.getClass();
                n8.a();
                boolean z11 = lb1.f113032a;
                u7Var = new u7();
            }
            objB = Result.b(u7Var);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            thG.getMessage();
            boolean z12 = lb1.f113032a;
            objB = new u7();
        }
        return (y8) objB;
    }
}
