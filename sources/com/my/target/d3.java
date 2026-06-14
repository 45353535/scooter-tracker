package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class d3 extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f59480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u9 f59481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f59482j;

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return v.a();
        }

        @Override // com.my.target.l.a
        public s b() {
            return g3.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return true;
        }

        @Override // com.my.target.l.a
        public q d() {
            return f3.a();
        }
    }

    public d3(j jVar, h6.a aVar, int i10) {
        this(null, jVar, aVar, i10);
    }

    public static l a(j jVar, h6.a aVar, int i10) {
        return new d3(jVar, aVar, i10);
    }

    public final /* synthetic */ void c(h6 h6Var, Context context) {
        this.f59481i.b(this.f59482j);
        a((t) null, m.f60110o, h6Var, context);
    }

    public d3(List list, j jVar, h6.a aVar, int i10) {
        super(new a(), jVar, aVar);
        this.f59480h = list;
        this.f59481i = u9.a(i10 * 1000);
    }

    public static l a(u uVar, j jVar, h6.a aVar, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(uVar);
        return new d3(arrayList, jVar, aVar, i10);
    }

    public static l a(List list, j jVar, h6.a aVar, int i10) {
        return new d3(list, jVar, aVar, i10);
    }

    @Override // com.my.target.l
    public l a(final h6 h6Var, final Context context) {
        if (this.f59482j == null) {
            this.f59482j = new Runnable() { // from class: k5.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86143b.c(h6Var, context);
                }
            };
        }
        this.f59481i.a(this.f59482j);
        return super.a(h6Var, context);
    }

    @Override // com.my.target.l
    public void a(h6 h6Var, Context context, l.b bVar) {
        if (this.f59480h != null) {
            n nVarB = n.b();
            h3 h3Var = (h3) a((h3) a(this.f59480h, (t) null, this.f60014a.d(), k2.a(), h6Var, nVarB, context), nVarB, context);
            bVar.a(h3Var, h3Var != null ? null : nVarB.a());
            return;
        }
        super.a(h6Var, context, bVar);
    }
}
