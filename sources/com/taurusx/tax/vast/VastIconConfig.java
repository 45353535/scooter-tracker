package com.taurusx.tax.vast;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VastIconConfig implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f66990t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66991a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f66992c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<VastTracker> f66993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final VastResource f66994o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<VastTracker> f66995s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f66996w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f66997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f66998z;

    public VastIconConfig(int i10, int i11, Integer num, Integer num2, VastResource vastResource, List<VastTracker> list, String str, List<VastTracker> list2) {
        this.f66998z = i10;
        this.f66996w = i11;
        this.f66997y = num == null ? 0 : num.intValue();
        this.f66992c = num2;
        this.f66994o = vastResource;
        this.f66995s = list;
        this.f66991a = str;
        this.f66993n = list2;
    }

    public List<VastTracker> a() {
        return this.f66993n;
    }

    public int c() {
        return this.f66996w;
    }

    public int n() {
        return this.f66998z;
    }

    public int o() {
        return this.f66997y;
    }

    public VastResource s() {
        return this.f66994o;
    }

    public List<VastTracker> w() {
        return this.f66995s;
    }

    public Integer y() {
        return this.f66992c;
    }

    public String z() {
        return this.f66991a;
    }
}
