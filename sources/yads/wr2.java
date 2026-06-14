package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wr2 implements tm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt2 f117541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn2 f117542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ur2 f117543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f117544d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr2(Context context, mr1 mr1Var) {
        this(context, ut2.a(), new zr2(mr1Var), new ur2());
        Object obj = vt2.f117186j;
    }

    @Override // yads.tm2
    public final Object a(r62 r62Var) {
        return (hr2) this.f117542b.a(r62Var);
    }

    @Override // yads.tm2
    public final boolean a() {
        hr2 hr2VarA = this.f117541a.a(this.f117544d);
        if (hr2VarA == null) {
            return true;
        }
        ur2 ur2Var = this.f117543c;
        ur2Var.f116747a.f112442a.getClass();
        if (System.currentTimeMillis() >= hr2VarA.f111723e) {
            return true;
        }
        ur2Var.f116748b.getClass();
        if (!Intrinsics.areEqual("7.17.0", hr2VarA.R)) {
            return true;
        }
        ur2Var.f116749c.getClass();
        Object obj = vt2.f117186j;
        if (!Intrinsics.areEqual(ut2.a().d(), hr2VarA.L)) {
            return true;
        }
        ur2Var.f116749c.getClass();
        if (ut2.a().a() != hr2VarA.f111761x) {
            return true;
        }
        ur2Var.f116749c.getClass();
        return !Intrinsics.areEqual(ut2.a().b(), hr2VarA.M);
    }

    public wr2(Context context, vt2 vt2Var, zn2 zn2Var, ur2 ur2Var) {
        this.f117541a = vt2Var;
        this.f117542b = zn2Var;
        this.f117543c = ur2Var;
        this.f117544d = context.getApplicationContext();
    }
}
