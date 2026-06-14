package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5 f108555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5 f108556b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5() {
        this(c5.a(), new b5());
        Object obj = d5.f109760c;
    }

    public final String a(Context context) {
        List list;
        d5 d5Var = this.f108555a;
        d5Var.getClass();
        synchronized (d5.f109760c) {
            list = CollectionsKt.toList(d5Var.f109763b);
        }
        return a(context, list);
    }

    public final String b(Context context) {
        List list;
        d5 d5Var = this.f108555a;
        d5Var.getClass();
        synchronized (d5.f109760c) {
            list = CollectionsKt.toList(d5Var.f109762a);
        }
        return a(context, list);
    }

    public a5(d5 d5Var, b5 b5Var) {
        this.f108555a = d5Var;
        this.f108556b = b5Var;
    }

    public final String a(Context context, List list) {
        int i10;
        this.f108556b.getClass();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || (i10 = hr2VarA.f111715a) == 0) {
            i10 = 5;
        }
        return CollectionsKt.joinToString$default(list.subList(list.size() - kotlin.ranges.g.j(i10, list.size()), list.size()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
