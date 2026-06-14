package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class v1 implements AbstractMessage.BuilderParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractMessage.BuilderParent f19374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f19375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f19377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f19379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f19380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f19381h;

    private static class a extends AbstractList implements List {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v1 f19382b;

        a(v1 v1Var) {
            this.f19382b = v1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractMessage.Builder get(int i10) {
            return this.f19382b.k(i10);
        }

        void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19382b.m();
        }
    }

    private static class b extends AbstractList implements List {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v1 f19383b;

        b(v1 v1Var) {
            this.f19383b = v1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractMessage get(int i10) {
            return this.f19383b.n(i10);
        }

        void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19383b.m();
        }
    }

    private static class c extends AbstractList implements List {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v1 f19384b;

        c(v1 v1Var) {
            this.f19384b = v1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public MessageOrBuilder get(int i10) {
            return this.f19384b.q(i10);
        }

        void f() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19384b.m();
        }
    }

    public v1(List list, boolean z10, AbstractMessage.BuilderParent builderParent, boolean z11) {
        this.f19375b = list;
        this.f19376c = z10;
        this.f19374a = builderParent;
        this.f19378e = z11;
    }

    private void i() {
        if (this.f19377d == null) {
            this.f19377d = new ArrayList(this.f19375b.size());
            for (int i10 = 0; i10 < this.f19375b.size(); i10++) {
                this.f19377d.add(null);
            }
        }
    }

    private void j() {
        if (this.f19376c) {
            return;
        }
        this.f19375b = new ArrayList(this.f19375b);
        this.f19376c = true;
    }

    private AbstractMessage o(int i10, boolean z10) {
        List list = this.f19377d;
        if (list == null) {
            return (AbstractMessage) this.f19375b.get(i10);
        }
        a2 a2Var = (a2) list.get(i10);
        return a2Var == null ? (AbstractMessage) this.f19375b.get(i10) : z10 ? a2Var.a() : a2Var.e();
    }

    private void s() {
        b bVar = this.f19379f;
        if (bVar != null) {
            bVar.f();
        }
        a aVar = this.f19380g;
        if (aVar != null) {
            aVar.f();
        }
        c cVar = this.f19381h;
        if (cVar != null) {
            cVar.f();
        }
    }

    private void u() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.f19378e || (builderParent = this.f19374a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f19378e = false;
    }

    public v1 a(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j0.a((AbstractMessage) it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        j();
        if (size >= 0) {
            List list = this.f19375b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            e((AbstractMessage) it2.next());
        }
        u();
        s();
        return this;
    }

    public AbstractMessage.Builder b(int i10, AbstractMessage abstractMessage) {
        j();
        i();
        a2 a2Var = new a2(abstractMessage, this, this.f19378e);
        this.f19375b.add(i10, null);
        this.f19377d.add(i10, a2Var);
        u();
        s();
        return a2Var.d();
    }

    public AbstractMessage.Builder c(AbstractMessage abstractMessage) {
        j();
        i();
        a2 a2Var = new a2(abstractMessage, this, this.f19378e);
        this.f19375b.add(null);
        this.f19377d.add(a2Var);
        u();
        s();
        return a2Var.d();
    }

    public v1 d(int i10, AbstractMessage abstractMessage) {
        j0.a(abstractMessage);
        j();
        this.f19375b.add(i10, abstractMessage);
        List list = this.f19377d;
        if (list != null) {
            list.add(i10, null);
        }
        u();
        s();
        return this;
    }

    public v1 e(AbstractMessage abstractMessage) {
        j0.a(abstractMessage);
        j();
        this.f19375b.add(abstractMessage);
        List list = this.f19377d;
        if (list != null) {
            list.add(null);
        }
        u();
        s();
        return this;
    }

    public List f() {
        this.f19378e = true;
        boolean z10 = this.f19376c;
        if (!z10 && this.f19377d == null) {
            return this.f19375b;
        }
        if (!z10) {
            for (int i10 = 0; i10 < this.f19375b.size(); i10++) {
                Message message = (Message) this.f19375b.get(i10);
                a2 a2Var = (a2) this.f19377d.get(i10);
                if (a2Var == null || a2Var.a() == message) {
                }
            }
            return this.f19375b;
        }
        j();
        for (int i11 = 0; i11 < this.f19375b.size(); i11++) {
            this.f19375b.set(i11, o(i11, true));
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f19375b);
        this.f19375b = listUnmodifiableList;
        this.f19376c = false;
        return listUnmodifiableList;
    }

    public void g() {
        this.f19375b = Collections.EMPTY_LIST;
        this.f19376c = false;
        List<a2> list = this.f19377d;
        if (list != null) {
            for (a2 a2Var : list) {
                if (a2Var != null) {
                    a2Var.c();
                }
            }
            this.f19377d = null;
        }
        u();
        s();
    }

    public void h() {
        this.f19374a = null;
    }

    public AbstractMessage.Builder k(int i10) {
        i();
        a2 a2Var = (a2) this.f19377d.get(i10);
        if (a2Var == null) {
            a2 a2Var2 = new a2((AbstractMessage) this.f19375b.get(i10), this, this.f19378e);
            this.f19377d.set(i10, a2Var2);
            a2Var = a2Var2;
        }
        return a2Var.d();
    }

    public List l() {
        if (this.f19380g == null) {
            this.f19380g = new a(this);
        }
        return this.f19380g;
    }

    public int m() {
        return this.f19375b.size();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        u();
    }

    public AbstractMessage n(int i10) {
        return o(i10, false);
    }

    public List p() {
        if (this.f19379f == null) {
            this.f19379f = new b(this);
        }
        return this.f19379f;
    }

    public MessageOrBuilder q(int i10) {
        List list = this.f19377d;
        if (list == null) {
            return (MessageOrBuilder) this.f19375b.get(i10);
        }
        a2 a2Var = (a2) list.get(i10);
        return a2Var == null ? (MessageOrBuilder) this.f19375b.get(i10) : a2Var.f();
    }

    public List r() {
        if (this.f19381h == null) {
            this.f19381h = new c(this);
        }
        return this.f19381h;
    }

    public boolean t() {
        return this.f19375b.isEmpty();
    }

    public void v(int i10) {
        a2 a2Var;
        j();
        this.f19375b.remove(i10);
        List list = this.f19377d;
        if (list != null && (a2Var = (a2) list.remove(i10)) != null) {
            a2Var.c();
        }
        u();
        s();
    }

    public v1 w(int i10, AbstractMessage abstractMessage) {
        a2 a2Var;
        j0.a(abstractMessage);
        j();
        this.f19375b.set(i10, abstractMessage);
        List list = this.f19377d;
        if (list != null && (a2Var = (a2) list.set(i10, null)) != null) {
            a2Var.c();
        }
        u();
        s();
        return this;
    }
}
