package ef;

import ef.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ze.b f69104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f69105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f69108e;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public d(i... phases) {
        Intrinsics.checkNotNullParameter(phases, "phases");
        this.f69104a = ze.d.a(true);
        this.f69105b = CollectionsKt.mutableListOf(Arrays.copyOf(phases, phases.length));
        this.interceptors$delegate = null;
    }

    private final List b() {
        int lastIndex;
        int i10 = this.f69106c;
        if (i10 == 0) {
            m(CollectionsKt.emptyList());
            return CollectionsKt.emptyList();
        }
        List list = this.f69105b;
        int i11 = 0;
        if (i10 == 1 && (lastIndex = CollectionsKt.getLastIndex(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && !cVar.h()) {
                    List listI = cVar.i();
                    p(cVar);
                    return listI;
                }
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int lastIndex2 = CollectionsKt.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i11 == lastIndex2) {
                    break;
                }
                i11++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    private final e c(Object obj, Object obj2, CoroutineContext coroutineContext) {
        return f.a(obj, q(), obj2, coroutineContext, g());
    }

    private final c e(i iVar) {
        List list = this.f69105b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == iVar) {
                c cVar = new c(iVar, j.c.f69114a);
                list.set(i10, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.e() == iVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int f(i iVar) {
        List list = this.f69105b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == iVar || ((obj instanceof c) && ((c) obj).e() == iVar)) {
                return i10;
            }
        }
        return -1;
    }

    private final List h() {
        return (List) this.interceptors$delegate;
    }

    private final boolean i(i iVar) {
        List list = this.f69105b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == iVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).e() == iVar) {
                return true;
            }
        }
        return false;
    }

    private final void m(List list) {
        o(list);
        this.f69107d = false;
        this.f69108e = null;
    }

    private final void n() {
        o(null);
        this.f69107d = false;
        this.f69108e = null;
    }

    private final void o(List list) {
        this.interceptors$delegate = list;
    }

    private final void p(c cVar) {
        o(cVar.i());
        this.f69107d = false;
        this.f69108e = cVar.e();
    }

    private final List q() {
        if (h() == null) {
            b();
        }
        this.f69107d = true;
        List listH = h();
        Intrinsics.checkNotNull(listH);
        return listH;
    }

    private final boolean r(i iVar, Function3 function3) {
        List listH = h();
        if (this.f69105b.isEmpty() || listH == null || this.f69107d || !b1.p(listH)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f69108e, iVar)) {
            listH.add(function3);
            return true;
        }
        if (!Intrinsics.areEqual(iVar, CollectionsKt.last(this.f69105b)) && f(iVar) != CollectionsKt.getLastIndex(this.f69105b)) {
            return false;
        }
        c cVarE = e(iVar);
        Intrinsics.checkNotNull(cVarE);
        cVarE.a(function3);
        listH.add(function3);
        return true;
    }

    public final Object d(Object obj, Object obj2, Continuation continuation) {
        return c(obj, obj2, continuation.getContext()).a(obj2, continuation);
    }

    public abstract boolean g();

    public final void j(i reference, i phase) throws b {
        j jVarF;
        i iVarA;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF == -1) {
            throw new b("Phase " + reference + " was not registered for this pipeline");
        }
        int i10 = iF + 1;
        int lastIndex = CollectionsKt.getLastIndex(this.f69105b);
        if (i10 <= lastIndex) {
            while (true) {
                Object obj = this.f69105b.get(i10);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (jVarF = cVar.f()) != null) {
                    j.a aVar = jVarF instanceof j.a ? (j.a) jVarF : null;
                    if (aVar != null && (iVarA = aVar.a()) != null && Intrinsics.areEqual(iVarA, reference)) {
                        iF = i10;
                    }
                    if (i10 == lastIndex) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f69105b.add(iF + 1, new c(phase, new j.a(reference)));
    }

    public final void k(i reference, i phase) throws b {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF != -1) {
            this.f69105b.add(iF, new c(phase, new j.b(reference)));
            return;
        }
        throw new b("Phase " + reference + " was not registered for this pipeline");
    }

    public final void l(i phase, Function3 block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        c cVarE = e(phase);
        if (cVarE == null) {
            throw new b("Phase " + phase + " was not registered for this pipeline");
        }
        if (r(phase, block)) {
            this.f69106c++;
            return;
        }
        cVarE.a(block);
        this.f69106c++;
        n();
        a();
    }

    public String toString() {
        return super.toString();
    }

    public void a() {
    }
}
