package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ee3 implements om2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om2 f110350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe3 f110352c;

    public ee3(fe3 fe3Var, om2 om2Var, Object obj) {
        this.f110352c = fe3Var;
        this.f110350a = om2Var;
        this.f110351b = obj;
    }

    public final void a() {
        if (!this.f110352c.f110698d.isEmpty()) {
            this.f110350a.a(this.f110352c.f110698d);
            return;
        }
        vk0 vk0Var = new vk0();
        om2 om2Var = this.f110350a;
        String message = vk0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        om2Var.a(new pb3(message));
    }

    @Override // yads.om2
    public final void a(pb3 pb3Var) {
        a();
    }

    @Override // yads.om2
    public final void a(Object obj) {
        this.f110352c.f110697c.getClass();
        ce3 ce3VarA = de3.a((List) obj);
        this.f110352c.f110698d.addAll(ce3VarA.f109380a);
        List list = ce3VarA.f109381b;
        if (list.isEmpty()) {
            a();
        } else {
            fe3 fe3Var = this.f110352c;
            fe3Var.f110696b.a(fe3Var.f110695a, list, this, this.f110351b);
        }
    }
}
