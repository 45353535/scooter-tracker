package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ef extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f64460a;

    public ef(LinkedList linkedList) {
        this.f64460a = linkedList;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof x9) {
            return this.f64460a.contains(((x9) obj).f65531j0.f64550a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef.class != obj.getClass()) {
            return false;
        }
        LinkedList linkedList = this.f64460a;
        LinkedList linkedList2 = ((ef) obj).f64460a;
        WeakHashMap weakHashMap = vi.f65408a;
        return linkedList.equals(linkedList2);
    }

    public final int hashCode() {
        Object[] objArr = {this.f64460a};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
