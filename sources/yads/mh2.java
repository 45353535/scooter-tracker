package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mh2 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f113503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113504b;

    public mh2(Context context, xb3 xb3Var) {
        this.f113503a = context.getApplicationContext();
        this.f113504b = a(xb3Var);
    }

    public static List a(xb3 xb3Var) {
        n10 n10Var = xb3Var.f117776a;
        long j10 = n10Var.f113686i;
        List list = n10Var.f113681d;
        ArrayList<k53> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual("progress", ((k53) obj).f112597a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (k53 k53Var : arrayList) {
            la3 la3Var = k53Var.f112599c;
            lh2 lh2Var = null;
            if (la3Var != null) {
                ka3 ka3Var = ka3.f112665b;
                ka3 ka3Var2 = la3Var.f113027b;
                Long lValueOf = ka3Var == ka3Var2 ? Long.valueOf((long) la3Var.f113028c) : ka3.f112666c == ka3Var2 ? Long.valueOf((long) ((la3Var.f113028c / 100) * j10)) : null;
                if (lValueOf != null) {
                    lh2Var = new lh2(k53Var.f112598b, lValueOf.longValue());
                }
            }
            if (lh2Var != null) {
                arrayList2.add(lh2Var);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        Iterator it = this.f113504b.iterator();
        while (it.hasNext()) {
            lh2 lh2Var = (lh2) it.next();
            if (lh2Var.f113095b <= j11) {
                of3 of3VarA = of3.f114304c.a(this.f113503a);
                of3VarA.f114307b.a(new ob2(of3VarA.f114306a, lh2Var.f113094a, new uj3()));
                it.remove();
            }
        }
    }
}
