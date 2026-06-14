package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f15691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f15693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f15694d;

    static final class a extends Exception {
        a(Throwable th2) {
            super(th2);
        }
    }

    i(List<h> list, int i10, e eVar, d dVar) {
        this.f15693c = list;
        this.f15692b = i10;
        this.f15691a = eVar;
        this.f15694d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f15694d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f15673a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f15694d;
        if (dVar != null) {
            dVar.f15675c = obj;
            dVar.e();
        }
        if (this.f15692b >= this.f15693c.size()) {
            return obj;
        }
        h hVar = this.f15693c.get(this.f15692b);
        Class<? extends d> cls = hVar.f15685a;
        d dVar2 = (d) this.f15691a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f15693c, this.f15692b + 1, this.f15691a, dVar2);
        dVar2.a(iVar, this.f15694d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f15675c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f15674b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
