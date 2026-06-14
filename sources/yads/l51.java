package yads;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l51 implements go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f112972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f112973b;

    public l51(vk2 vk2Var, wk2 wk2Var) {
        this.f112972a = vk2Var;
        this.f112973b = wk2Var;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        this.f112973b.invoke(oj3Var);
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        this.f112972a.invoke((w70) obj);
    }
}
