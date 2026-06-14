package com.ironsource;

import com.ironsource.F;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class kg implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f43478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f43479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final sg f43480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ng f43481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private F f43482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private ug f43483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<AbstractC4643z> f43484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private AbstractC4643z f43485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f43486i;

    public kg(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData, @NotNull sg listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43478a = adTools;
        this.f43479b = adUnitData;
        this.f43480c = listener;
        this.f43481d = ng.f44479d.a(adTools, adUnitData);
        this.f43484g = new ArrayList();
    }

    private final boolean e() {
        return this.f43485h != null;
    }

    private final void f() {
        F f10 = this.f43482e;
        F.b bVarD = f10 != null ? f10.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f43480c.a(509, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<AbstractC4643z> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            ug ugVar = this.f43483f;
            if (ugVar != null) {
                ugVar.a();
            }
        }
    }

    @Nullable
    public final AbstractC4643z c() {
        F.c cVarC;
        F f10 = this.f43482e;
        if (f10 == null || (cVarC = f10.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final boolean d() {
        Iterator<AbstractC4643z> it = this.f43484g.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }

    public static final class a implements og {
        a() {
        }

        @Override // com.ironsource.og
        public void a(@NotNull pg waterfallInstances) {
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (kg.this.f43486i) {
                return;
            }
            kg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.og
        public void a(int i10, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (kg.this.f43486i) {
                return;
            }
            kg.this.f43480c.a(i10, errorReason);
        }
    }

    private final void c(AbstractC4643z abstractC4643z) {
        d(abstractC4643z);
        b();
    }

    public final void b() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f43478a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        Iterator<T> it = this.f43484g.iterator();
        while (it.hasNext()) {
            ((AbstractC4643z) it.next()).c();
        }
        this.f43484g.clear();
        this.f43478a.e().h().a();
    }

    private final void d(AbstractC4643z abstractC4643z) {
        this.f43485h = abstractC4643z;
        this.f43484g.remove(abstractC4643z);
    }

    public final void a(@NotNull C adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.f43481d.a(adInstanceFactory, new a());
    }

    public final void a(@NotNull I adInstancePresenter) {
        AbstractC4643z abstractC4643zC;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        F f10 = this.f43482e;
        F.c cVarC = f10 != null ? f10.c() : null;
        if (cVarC == null || (abstractC4643zC = cVarC.c()) == null) {
            return;
        }
        c(abstractC4643zC);
        ug ugVar = this.f43483f;
        if (ugVar != null) {
            ugVar.a(cVarC.c(), cVarC.d());
        }
        cVarC.c().a(adInstancePresenter);
    }

    public final void b(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ug ugVar = this.f43483f;
        if (ugVar != null) {
            ugVar.a(instance, this.f43479b.l(), this.f43479b.o());
        }
    }

    public final void a() {
        this.f43486i = true;
        AbstractC4643z abstractC4643z = this.f43485h;
        if (abstractC4643z != null) {
            abstractC4643z.b();
        }
    }

    @Override // com.ironsource.E
    public void a(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!this.f43486i && !e()) {
            ug ugVar = this.f43483f;
            if (ugVar != null) {
                ugVar.a(instance);
            }
            this.f43484g.add(instance);
            if (this.f43484g.size() == 1) {
                ug ugVar2 = this.f43483f;
                if (ugVar2 != null) {
                    ugVar2.b(instance);
                }
                this.f43480c.b(instance);
                return;
            }
            F f10 = this.f43482e;
            if (f10 == null || !f10.a(instance)) {
                return;
            }
            this.f43480c.a(instance);
            return;
        }
        instance.c();
    }

    @Override // com.ironsource.E
    public void a(@NotNull IronSourceError error, @NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f43486i) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(pg pgVar) {
        F fA = F.f40830c.a(this.f43479b, pgVar);
        this.f43482e = fA;
        this.f43483f = ug.f45580c.a(this.f43478a, this.f43479b, this.f43481d.a(), pgVar, fA);
        f();
    }
}
