package yads;

import android.view.View;
import com.ironsource.C4240b4;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f110382a;

    public /* synthetic */ ej() {
        this(CollectionsKt.emptyList());
    }

    public final e02 a(View view, uw1 uw1Var) {
        d02 d02Var = new d02(view, d12.f109692c, MapsKt.emptyMap());
        d02Var.f109683e.put("age", uw1Var.h(view));
        d02Var.f109683e.put("body", uw1Var.a(view));
        d02Var.f109683e.put("call_to_action", uw1Var.e(view));
        d02Var.f109683e.put(C4240b4.j.D, uw1Var.n(view));
        d02Var.f109683e.put("favicon", uw1Var.g(view));
        d02Var.f109683e.put("feedback", uw1Var.l(view));
        d02Var.f109683e.put("icon", uw1Var.o(view));
        d02Var.f109683e.put("media", uw1Var.c(view));
        d02Var.f109681c = uw1Var.b(view);
        d02Var.f109682d = uw1Var.k(view);
        d02Var.f109683e.put("price", uw1Var.d(view));
        View viewI = uw1Var.i(view);
        if (!(viewI instanceof pj2)) {
            viewI = null;
        }
        d02Var.f109683e.put("rating", viewI);
        d02Var.f109683e.put("review_count", uw1Var.p(view));
        d02Var.f109683e.put("sponsored", uw1Var.m(view));
        d02Var.f109683e.put("title", uw1Var.j(view));
        d02Var.f109683e.put("warning", uw1Var.f(view));
        for (String str : this.f110382a) {
            View viewA = uw1Var.a(view, str);
            if (viewA != null) {
                d02Var.f109683e.put(str, viewA);
            }
        }
        return new e02(d02Var);
    }

    public ej(Collection collection) {
        this.f110382a = collection;
    }
}
