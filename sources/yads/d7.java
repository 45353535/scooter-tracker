package yads;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e7 f109817a;

    public d7(e7 e7Var) {
        this.f109817a = e7Var;
    }

    @Override // yads.y3
    public final void a() {
        this.f109817a.b();
    }

    @Override // yads.y3
    public final void b() {
        e7 e7Var = this.f109817a;
        int i10 = e7Var.f110230m - 1;
        if (i10 == e7Var.f110221d.f108588c && !e7Var.f110231n) {
            e7Var.f110231n = true;
            e7Var.f110219b.b();
        }
        h7 h7Var = (h7) CollectionsKt.getOrNull(this.f109817a.f110228k, i10);
        if ((h7Var != null ? h7Var.f111501c : null) != j7.f112248c || h7Var.f111500b == null) {
            this.f109817a.b();
        }
    }
}
