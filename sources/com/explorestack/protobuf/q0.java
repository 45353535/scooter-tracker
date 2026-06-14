package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q0 f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q0 f19305b;

    private static final class b extends q0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f19306c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static List e(Object obj, long j10) {
            return (List) w2.G(obj, j10);
        }

        private static List f(Object obj, long j10, int i10) {
            List listE = e(obj, j10);
            if (listE.isEmpty()) {
                List o0Var = listE instanceof p0 ? new o0(i10) : ((listE instanceof q1) && (listE instanceof j0.j)) ? ((j0.j) listE).mutableCopyWithCapacity(i10) : new ArrayList(i10);
                w2.X(obj, j10, o0Var);
                return o0Var;
            }
            if (f19306c.isAssignableFrom(listE.getClass())) {
                ArrayList arrayList = new ArrayList(listE.size() + i10);
                arrayList.addAll(listE);
                w2.X(obj, j10, arrayList);
                return arrayList;
            }
            if (listE instanceof v2) {
                o0 o0Var2 = new o0(listE.size() + i10);
                o0Var2.addAll((v2) listE);
                w2.X(obj, j10, o0Var2);
                return o0Var2;
            }
            if ((listE instanceof q1) && (listE instanceof j0.j)) {
                j0.j jVar = (j0.j) listE;
                if (!jVar.isModifiable()) {
                    j0.j jVarMutableCopyWithCapacity = jVar.mutableCopyWithCapacity(listE.size() + i10);
                    w2.X(obj, j10, jVarMutableCopyWithCapacity);
                    return jVarMutableCopyWithCapacity;
                }
            }
            return listE;
        }

        @Override // com.explorestack.protobuf.q0
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) w2.G(obj, j10);
            if (list instanceof p0) {
                objUnmodifiableList = ((p0) list).getUnmodifiableView();
            } else {
                if (f19306c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof q1) && (list instanceof j0.j)) {
                    j0.j jVar = (j0.j) list;
                    if (jVar.isModifiable()) {
                        jVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            w2.X(obj, j10, objUnmodifiableList);
        }

        @Override // com.explorestack.protobuf.q0
        List d(Object obj, long j10) {
            return f(obj, j10, 10);
        }
    }

    private static final class c extends q0 {
        private c() {
            super();
        }

        static j0.j e(Object obj, long j10) {
            return (j0.j) w2.G(obj, j10);
        }

        @Override // com.explorestack.protobuf.q0
        void c(Object obj, long j10) {
            e(obj, j10).makeImmutable();
        }

        @Override // com.explorestack.protobuf.q0
        List d(Object obj, long j10) {
            j0.j jVarE = e(obj, j10);
            if (jVarE.isModifiable()) {
                return jVarE;
            }
            int size = jVarE.size();
            j0.j jVarMutableCopyWithCapacity = jVarE.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            w2.X(obj, j10, jVarMutableCopyWithCapacity);
            return jVarMutableCopyWithCapacity;
        }
    }

    static {
        f19304a = new b();
        f19305b = new c();
    }

    static q0 a() {
        return f19304a;
    }

    static q0 b() {
        return f19305b;
    }

    abstract void c(Object obj, long j10);

    abstract List d(Object obj, long j10);

    private q0() {
    }
}
