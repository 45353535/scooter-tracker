package com.explorestack.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class o0 extends c implements p0, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o0 f19268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0 f19269e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19270c;

    static {
        o0 o0Var = new o0();
        f19268d = o0Var;
        o0Var.makeImmutable();
        f19269e = o0Var;
    }

    public o0() {
        this(10);
    }

    private static ByteString g(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String i(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : j0.m((byte[]) obj);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.explorestack.protobuf.p0
    public void c(ByteString byteString) {
        e();
        this.f19270c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f19270c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        e();
        this.f19270c.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.p0
    public ByteString getByteString(int i10) {
        Object obj = this.f19270c.get(i10);
        ByteString byteStringG = g(obj);
        if (byteStringG != obj) {
            this.f19270c.set(i10, byteStringG);
        }
        return byteStringG;
    }

    @Override // com.explorestack.protobuf.p0
    public Object getRaw(int i10) {
        return this.f19270c.get(i10);
    }

    @Override // com.explorestack.protobuf.p0
    public List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f19270c);
    }

    @Override // com.explorestack.protobuf.p0
    public p0 getUnmodifiableView() {
        return isModifiable() ? new v2(this) : this;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.explorestack.protobuf.c, com.explorestack.protobuf.j0.j
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f19270c.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f19270c.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strM = j0.m(bArr);
        if (j0.j(bArr)) {
            this.f19270c.set(i10, strM);
        }
        return strM;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o0 mutableCopyWithCapacity(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f19270c);
        return new o0(arrayList);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        e();
        Object objRemove = this.f19270c.remove(i10);
        ((AbstractList) this).modCount++;
        return i(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        e();
        return i(this.f19270c.set(i10, str));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19270c.size();
    }

    public o0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof p0) {
            collection = ((p0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f19270c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public o0(p0 p0Var) {
        this.f19270c = new ArrayList(p0Var.size());
        addAll(p0Var);
    }

    private o0(ArrayList arrayList) {
        this.f19270c = arrayList;
    }
}
