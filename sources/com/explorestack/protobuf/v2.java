package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class v2 extends AbstractList implements p0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f19385b;

    class a implements ListIterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListIterator f19386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19387c;

        a(int i10) {
            this.f19387c = i10;
            this.f19386b = v2.this.f19385b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f19386b.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f19386b.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19386b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19386b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19386b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19386b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator f19389b;

        b() {
            this.f19389b = v2.this.f19385b.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f19389b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19389b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public v2(p0 p0Var) {
        this.f19385b = p0Var;
    }

    @Override // com.explorestack.protobuf.p0
    public void c(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f19385b.get(i10);
    }

    @Override // com.explorestack.protobuf.p0
    public ByteString getByteString(int i10) {
        return this.f19385b.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.p0
    public Object getRaw(int i10) {
        return this.f19385b.getRaw(i10);
    }

    @Override // com.explorestack.protobuf.p0
    public List getUnderlyingElements() {
        return this.f19385b.getUnderlyingElements();
    }

    @Override // com.explorestack.protobuf.p0
    public p0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19385b.size();
    }
}
