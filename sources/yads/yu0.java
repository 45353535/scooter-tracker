package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class yu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f118383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f118384b = lf.i.a(new xu0(this));

    public yu0(Context context) {
        this.f118383a = context;
    }

    public final Object a(String str, zu0 zu0Var) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(zu0Var), 1);
        eVar.I();
        yq yqVar = new yq(str, new vu0(eVar), new wu0(eVar));
        yqVar.f112770j = false;
        UUID uuidRandomUUID = UUID.randomUUID();
        yqVar.f112777q = uuidRandomUUID;
        ((xm2) this.f118384b.getValue()).a(yqVar);
        eVar.v(new uu0(this, uuidRandomUUID));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(zu0Var);
        }
        return objC;
    }
}
