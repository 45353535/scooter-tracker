package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5004c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2 f76941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76942c;

    public C5004c2(List list, F2 f22, List list2) {
        this.f76940a = list;
        this.f76941b = f22;
        this.f76942c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f76940a + ", mBackgroundRestrictionsState=" + this.f76941b + ", mAvailableProviders=" + this.f76942c + '}';
    }
}
