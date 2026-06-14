package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.c5;
import com.my.target.e5;
import com.my.target.h9;
import com.my.target.k5;
import com.my.target.n9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9 f59663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8 f59664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aa f59666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59667e = true;

    public f9(m9 m9Var, l8 l8Var, Context context) {
        this.f59663a = m9Var;
        this.f59664b = l8Var;
        this.f59665c = context;
        this.f59666d = aa.a(context);
    }

    public static f9 a(m9 m9Var, l8 l8Var, Context context) {
        return new f9(m9Var, l8Var, context);
    }

    public z b() {
        return new z(this.f59665c);
    }

    public b9 c() {
        return new b9(this.f59665c);
    }

    public Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public j9 e() {
        return new k9(this.f59665c);
    }

    public void a(boolean z10) {
        this.f59667e = z10;
    }

    public n9 a(o4 o4Var, View view, View view2, View view3, n9.a aVar) {
        if (!o4Var.S().isEmpty()) {
            return new p9(((g4) o4Var.S().get(0)).L(), view, view2, aVar, view3, this.f59666d, this.f59665c);
        }
        if (o4Var.V() != null) {
            return new r9(view, view2, aVar, view3, this.f59666d, this.f59665c);
        }
        return new q9(view, view2, aVar, view3, this.f59666d, this.f59665c);
    }

    public h9 a(h9.a aVar) {
        return new i9(this.f59666d, this.f59665c, aVar);
    }

    public z4 a(s5 s5Var, z zVar, e5.a aVar) {
        return e5.a(s5Var, zVar, aVar, this, w5.a(this.f59667e, zVar.getContext()));
    }

    public k5 a(b9 b9Var, List list, k5.a aVar) {
        k5 k5VarA = h5.a(b9Var, list, aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((g4) it.next(), k5VarA));
        }
        b9Var.setAdapter(new t0(arrayList, this));
        return k5VarA;
    }

    public c5 a(g4 g4Var, c5.a aVar) {
        return d5.a(g4Var, aVar);
    }

    public v0 a() {
        return new w0(this.f59665c, this.f59663a, this.f59666d);
    }

    public q8 a(s5 s5Var) {
        return q8.a(s5Var, this.f59664b, this.f59665c);
    }
}
