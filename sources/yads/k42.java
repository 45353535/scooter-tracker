package yads;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc2 f112589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eg3 f112590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bj3 f112591c;

    public k42(jh3 jh3Var, f42 f42Var, v52 v52Var, z42 z42Var) {
        h42 h42Var = new h42(f42Var);
        this.f112589a = new fc2(z42Var);
        this.f112590b = new eg3(jh3Var);
        this.f112591c = new bj3(h42Var, v52Var);
    }

    public final void a(fd3 fd3Var) {
        CollectionsKt.addAll(fd3Var.f110692a, new ed3[]{this.f112589a, this.f112590b, this.f112591c});
    }
}
