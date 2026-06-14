package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3899n5 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3949p5 f39081a;

    public C3899n5(C3949p5 c3949p5) {
        this.f39081a = c3949p5;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, Continuation continuation) {
        WeakReference weakReference = (WeakReference) this.f39081a.f38765b.get(xf2.f38005a.f37665h);
        InterfaceC3710fg interfaceC3710fg = weakReference != null ? (InterfaceC3710fg) weakReference.get() : null;
        if (!AbstractC3581ag.a(xf2)) {
            Object objA = this.f39081a.a(xf2, interfaceC3710fg, continuation);
            return objA == pf.b.g() ? objA : Unit.f93236a;
        }
        C3949p5 c3949p5 = this.f39081a;
        c3949p5.getClass();
        AbstractC3785ig.a(xf2, interfaceC3710fg);
        Object objA2 = c3949p5.f38764a.f39203a.a("pings", "id=?", new String[]{xf2.f38005a.f37659b}, continuation);
        if (objA2 != pf.b.g()) {
            objA2 = Unit.f93236a;
        }
        if (objA2 != pf.b.g()) {
            objA2 = Unit.f93236a;
        }
        return objA2 == pf.b.g() ? objA2 : Unit.f93236a;
    }
}
