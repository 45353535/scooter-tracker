package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f23488b;

    public i1(List list, h1 h1Var) {
        this.f23487a = list;
        this.f23488b = h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h1 h1Var = this.f23488b;
        Object obj = this.f23487a.get(i10);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.l0 l0VarA = com.fyber.inneractive.sdk.bidder.l0.a(((Integer) obj).intValue());
        return l0VarA == null ? com.fyber.inneractive.sdk.bidder.l0.UNRECOGNIZED : l0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23487a.size();
    }
}
