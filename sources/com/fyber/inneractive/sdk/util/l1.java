package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class l1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f23880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f23881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23882c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.f23880a = k1Var;
        this.f23881b = uri;
        this.f23882c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23880a.mPriority.compareTo(((l1) obj).f23880a.mPriority);
    }
}
