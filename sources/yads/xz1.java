package yads;

import android.content.Context;
import android.view.View;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class xz1 implements z32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y02 f118035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f118036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f118037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yz1 f118038d;

    public xz1(zw1 zw1Var, t9 t9Var) {
        this.f118035a = zw1Var;
        this.f118036b = t9Var;
    }

    public h93 a(int i10, Context context, boolean z10) {
        yz1 yz1Var = this.f118038d;
        View viewA = yz1Var != null ? yz1Var.f118468b.a() : null;
        if (viewA == null) {
            return new e93(d93.f109849g, null, null);
        }
        if (qi3.b(viewA)) {
            return new e93(d93.f109850h, null, null);
        }
        dj3 dj3VarA = qi3.f115019a.a(viewA);
        String str = dj3VarA.f109938b;
        this.f118037c = str;
        if (dj3VarA.f109937a < 1) {
            return new e93(d93.f109851i, null, str);
        }
        if (a(viewA, i10) && !z10) {
            return new e93(d93.f109847e, null, this.f118037c);
        }
        String str2 = this.f118036b.f116118k;
        mf0[] mf0VarArr = mf0.f113454b;
        return (!Intrinsics.areEqual(str2, "divkit") || this.f118036b.H) ? ((zw1) this.f118035a).a(z10) : new f93(CollectionsKt.emptyList());
    }

    public final fn2 b() {
        return ((zw1) this.f118035a).e();
    }

    public final boolean a() {
        View viewA;
        yz1 yz1Var = this.f118038d;
        if (yz1Var == null || (viewA = yz1Var.f118468b.a()) == null) {
            return true;
        }
        return qi3.b(viewA);
    }

    public final boolean a(View view, int i10) {
        int iA = qi3.a(view);
        this.f118037c = "actualPercent: " + iA + ", expectedPercent: " + i10;
        return iA < i10;
    }

    public final void a(yz1 yz1Var) {
        ((zw1) this.f118035a).f118865d = yz1Var;
        this.f118038d = yz1Var;
    }
}
