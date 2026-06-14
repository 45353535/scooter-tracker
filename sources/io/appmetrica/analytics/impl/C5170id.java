package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5170id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77431b;

    public C5170id(String str, boolean z10) {
        this.f77430a = str;
        this.f77431b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5170id)) {
            return false;
        }
        C5170id c5170id = (C5170id) obj;
        return Intrinsics.areEqual(this.f77430a, c5170id.f77430a) && this.f77431b == c5170id.f77431b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f77430a.hashCode() * 31;
        boolean z10 = this.f77431b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f77430a + ", loaded=" + this.f77431b + ')';
    }
}
