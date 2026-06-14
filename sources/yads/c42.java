package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr3 f109211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a42 f109212b;

    public /* synthetic */ c42(Context context, yr3 yr3Var) {
        this(yr3Var.a(context), new a42());
    }

    public final void a() {
        List list;
        xr3 xr3Var = this.f109211a;
        if (xr3Var != null) {
            synchronized (xr3Var.f117944b) {
                list = CollectionsKt.toList(xr3Var.f117945c);
                xr3Var.f117945c.clear();
                Unit unit = Unit.f93236a;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xr3Var.f117943a.a((za3) it.next());
            }
        }
    }

    public c42(xr3 xr3Var, a42 a42Var) {
        this.f109211a = xr3Var;
        this.f109212b = a42Var;
    }
}
