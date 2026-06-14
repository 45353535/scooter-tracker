package yads;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class df0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f109903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f109904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f109905c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ df0(c4 c4Var, es2 es2Var, t9 t9Var) {
        pr3 pr3Var = (pr3) es2Var;
        this(pr3Var.a(), new p1(c4Var, es2Var, t9Var), new l2(pr3Var.c()));
    }

    public final Object a(Context context, Intent intent, re2 re2Var) {
        Object objB;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(re2Var), 1);
        eVar.I();
        long andIncrement = j11.f112217a.getAndIncrement();
        this.f109905c.f112925a.getClass();
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        p1 p1Var = this.f109904b;
        bf0 bf0Var = new bf0(eVar);
        cf0 cf0Var = new cf0(eVar);
        p1Var.getClass();
        x1 x1Var = new x1(p1Var.f114519c, p1Var.f114517a, new x9(), p1Var.f114518b, null, 0, new ze0(intent, bf0Var, cf0Var), 48);
        Object obj = z1.f118487b;
        z1 z1VarA = y1.a();
        z1VarA.a(andIncrement, x1Var);
        eVar.v(new af0(z1VarA, andIncrement));
        try {
            Result.Companion companion = Result.f93230c;
            context.startActivity(intent2);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            z1VarA.a(andIncrement);
            this.f109903a.reportError("Failed to launch AdActivity for result", thG);
            if (eVar.isActive()) {
                eVar.resumeWith(Result.b(kotlin.d.a(thG)));
            }
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(re2Var);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    public df0(dm2 dm2Var, p1 p1Var, l2 l2Var) {
        this.f109903a = dm2Var;
        this.f109904b = p1Var;
        this.f109905c = l2Var;
    }
}
