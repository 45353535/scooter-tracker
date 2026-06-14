package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class m extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f9297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f9298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i8 f9299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f9301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f9302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f9303k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final i8 f9309p;

        b(i8 i8Var, String str, boolean z10) {
            super(i8Var.b().d(), m.this.f10385a);
            this.f9309p = i8Var;
            this.f10276c = StringUtils.createSpannedString(i8Var.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f10277d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f10275b = z10;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f10275b;
        }

        public i8 v() {
            return this.f9309p;
        }
    }

    m(n nVar, o oVar, i8 i8Var, Context context) {
        super(context);
        this.f9297e = nVar;
        this.f9299g = i8Var;
        this.f9298f = oVar != null ? oVar : nVar.f();
        this.f9300h = oVar != null ? oVar.c() : nVar.d();
        this.f9301i = h();
        this.f9302j = e();
        this.f9303k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f9297e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f9298f.b() != null) {
            arrayList.add(f());
        }
        if (this.f9299g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.f9299g.b().a()).a();
    }

    private List l() {
        i8 i8Var = this.f9299g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f9298f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.f9299g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.f9299g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i10) {
        return i10 == a.INFO.ordinal() ? this.f9301i : i10 == a.BIDDERS.ordinal() ? this.f9302j : this.f9303k;
    }

    @Override // com.applovin.impl.s2
    protected int d(int i10) {
        return i10 == a.INFO.ordinal() ? this.f9301i.size() : i10 == a.BIDDERS.ordinal() ? this.f9302j.size() : this.f9303k.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i10) {
        return i10 == a.INFO.ordinal() ? new v4("INFO") : i10 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    public o j() {
        return this.f9298f;
    }

    public String k() {
        return this.f9300h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f9297e.b()).a();
    }

    private List e() {
        i8 i8Var = this.f9299g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f9298f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.f9299g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.f9299g == null));
            }
        }
        return arrayList;
    }
}
