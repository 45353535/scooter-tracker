package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class E8 implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F8 f36780a;

    public E8(F8 f82) {
        this.f36780a = f82;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf2, Continuation continuation) {
        WeakReference weakReference = (WeakReference) this.f36780a.f38765b.get(xf2.f38005a.f37665h);
        InterfaceC3710fg interfaceC3710fg = weakReference != null ? (InterfaceC3710fg) weakReference.get() : null;
        if (!AbstractC3581ag.a(xf2)) {
            Object objA = this.f36780a.a(xf2, interfaceC3710fg, continuation);
            return objA == pf.b.g() ? objA : Unit.f93236a;
        }
        F8 f82 = this.f36780a;
        f82.getClass();
        AbstractC3785ig.a(xf2, interfaceC3710fg);
        Object objA2 = f82.f38764a.f39203a.a("pings", "id=?", new String[]{xf2.f38005a.f37659b}, continuation);
        if (objA2 != pf.b.g()) {
            objA2 = Unit.f93236a;
        }
        if (objA2 != pf.b.g()) {
            objA2 = Unit.f93236a;
        }
        return objA2 == pf.b.g() ? objA2 : Unit.f93236a;
    }
}
