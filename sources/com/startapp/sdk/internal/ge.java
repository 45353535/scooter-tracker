package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f64570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f64571b = UUID.randomUUID();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f64572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f64574e;

    public ge(fe feVar) {
        this.f64570a = feVar.f64504a;
        this.f64572c = feVar.f64505b;
        this.f64573d = feVar.f64506c;
        this.f64574e = feVar.f64507d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            strArr[i10] = clsArr[i10].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
