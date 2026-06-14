package com.my.target;

import android.content.Context;
import com.ironsource.C4424m2;
import com.my.target.c1;
import com.my.target.f5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f60889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f60890b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f5.c f60891c;

    public u4(List list, c1 c1Var) {
        this.f60889a = c1Var;
        c1Var.setCarouselListener(new a());
        for (int i10 : c1Var.getNumbersOfCurrentShowingCards()) {
            if (i10 < list.size() && i10 >= 0) {
                g4 g4Var = (g4) list.get(i10);
                this.f60890b.add(g4Var);
                bb.b(g4Var.x(), C4424m2.f43623v, 1, c1Var.getView().getContext());
            }
        }
    }

    public static u4 a(List list, c1 c1Var) {
        return new u4(list, c1Var);
    }

    public void a(f5.c cVar) {
        this.f60891c = cVar;
    }

    public class a implements c1.b {
        public a() {
        }

        @Override // com.my.target.c1.b
        public void a(g4 g4Var, int i10) {
            u4 u4Var = u4.this;
            f5.c cVar = u4Var.f60891c;
            if (cVar != null) {
                cVar.a(g4Var, null, i10, u4Var.f60889a.getView().getContext());
            }
        }

        @Override // com.my.target.c1.b
        public void a(List list) {
            Context context = u4.this.f60889a.getView().getContext();
            String strD = kb.d(context);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g4 g4Var = (g4) it.next();
                if (!u4.this.f60890b.contains(g4Var)) {
                    u4.this.f60890b.add(g4Var);
                    za zaVarX = g4Var.x();
                    if (strD != null) {
                        bb.a(zaVarX, strD, 1, context);
                    }
                    bb.a(zaVarX, C4424m2.f43623v, 1, context);
                }
            }
        }
    }
}
