package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py f109133a;

    public /* synthetic */ bv2() {
        this(new py());
    }

    public static boolean a(Context context) {
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        return hr2VarA == null || hr2VarA.f111733j;
    }

    public final boolean b(Context context) {
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || !hr2VarA.f111731i || a(context)) {
            return true;
        }
        this.f109133a.getClass();
        return !Intrinsics.areEqual(ut2.a().b(), hr2VarA.M) && Intrinsics.areEqual(ut2.a().b(), Boolean.TRUE);
    }

    public bv2(py pyVar) {
        this.f109133a = pyVar;
    }
}
