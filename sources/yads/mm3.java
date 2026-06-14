package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mm3 implements om2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm3 f113553a;

    public mm3(nm3 nm3Var) {
        this.f113553a = nm3Var;
    }

    public final void a() {
        nm3 nm3Var = this.f113553a;
        om2 om2Var = nm3Var.f113985c;
        if (nm3Var.f113986d != 0 || om2Var == null) {
            return;
        }
        om2Var.a(nm3Var.f113984b);
    }

    @Override // yads.om2
    public final void a(pb3 pb3Var) {
        nm3 nm3Var = this.f113553a;
        nm3Var.f113986d--;
        a();
    }

    @Override // yads.om2
    public final void a(Object obj) {
        r0.f113986d--;
        this.f113553a.f113984b.addAll((List) obj);
        a();
    }
}
