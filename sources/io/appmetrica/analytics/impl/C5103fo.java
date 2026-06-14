package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5103fo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f77186c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f77187a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77188b = 0;

    public C5103fo(int[] iArr) {
        for (int i10 : iArr) {
            this.f77187a.put(i10, new HashMap());
        }
    }
}
