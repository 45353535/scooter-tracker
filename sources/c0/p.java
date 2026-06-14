package c0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
final class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6453a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(q qVar) {
        super(null);
    }

    @Override // c0.m
    public boolean a(z.i iVar) {
        z.c cVarB = iVar.b();
        if ((cVarB instanceof c.a ? ((c.a) cVarB).f119120a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        z.c cVarA = iVar.a();
        return (cVarA instanceof c.a ? ((c.a) cVarA).f119120a : Integer.MAX_VALUE) > 100;
    }

    @Override // c0.m
    public boolean b() {
        return l.f6442a.b(null);
    }
}
