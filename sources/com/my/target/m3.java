package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m3 extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f60125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u9 f60126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f60127j;

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return v.a();
        }

        @Override // com.my.target.l.a
        public s b() {
            return o3.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return true;
        }

        @Override // com.my.target.l.a
        public q d() {
            return n3.a();
        }
    }

    public m3(j jVar, h6.a aVar, int i10) {
        this(null, jVar, aVar, i10);
    }

    public static l a(j jVar, h6.a aVar, int i10) {
        return new m3(jVar, aVar, i10);
    }

    public m3(List list, j jVar, h6.a aVar, int i10) {
        super(new a(), jVar, aVar);
        this.f60125h = list;
        this.f60126i = u9.a(i10 * 1000);
    }

    public static l a(u uVar, j jVar, h6.a aVar, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(uVar);
        return new m3(arrayList, jVar, aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(h6 h6Var, Context context) {
        this.f60126i.b(this.f60127j);
        a((t) null, m.f60110o, h6Var, context);
    }

    public static l a(List list, j jVar, h6.a aVar, int i10) {
        return new m3(list, jVar, aVar, i10);
    }

    @Override // com.my.target.l
    public l a(final h6 h6Var, final Context context) {
        if (this.f60127j == null) {
            this.f60127j = new Runnable() { // from class: k5.l1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86080b.c(h6Var, context);
                }
            };
        }
        this.f60126i.a(this.f60127j);
        return super.a(h6Var, context);
    }

    @Override // com.my.target.l
    public void a(h6 h6Var, Context context, l.b bVar) {
        if (this.f60125h != null) {
            n nVarB = n.b();
            p3 p3Var = (p3) a((p3) a(this.f60125h, (t) null, this.f60014a.d(), k2.a(), h6Var, nVarB, context), nVarB, context);
            bVar.a(p3Var, p3Var != null ? null : nVarB.a());
            return;
        }
        super.a(h6Var, context, bVar);
    }
}
