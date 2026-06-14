package f1;

import android.content.Context;
import e1.c;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf f70004a;

    public h5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        nf nfVar = new nf(context);
        nf.c(nfVar, null, 1, null);
        this.f70004a = nfVar;
    }

    public final void a() {
        this.f70004a.g();
    }

    public final Object b() {
        Result.Companion companion = Result.f93230c;
        return Result.b(Unit.f93236a);
    }

    public final Object c() {
        if (this.f70004a.e()) {
            Result.Companion companion = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
        eg.j("Internet connection is not available.", null, 2, null);
        Result.Companion companion2 = Result.f93230c;
        return Result.b(kotlin.d.a(c.a.b.f68710h));
    }

    public final Object d() {
        Object objB = b();
        if (Result.i(objB)) {
            return objB;
        }
        Object objC = c();
        return Result.i(objC) ? objC : Result.b(Unit.f93236a);
    }
}
