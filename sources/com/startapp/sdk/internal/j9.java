package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f64750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f64754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f64756g;

    public j9(i9 i9Var) {
        this.f64750a = i9Var.f64679a;
        this.f64751b = i9Var.f64680b;
        this.f64752c = i9Var.f64681c;
        this.f64753d = i9Var.f64682d;
        this.f64754e = Math.max(60000L, vi.e(i9Var.f64683e));
        this.f64755f = Math.max(0L, vi.e(i9Var.f64684f));
        ArrayList arrayList = i9Var.f64685g;
        this.f64756g = arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public j9(j9 j9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long jMax;
        long jMax2;
        Double dValueOf = Double.valueOf(j9Var.f64750a);
        Double dA = analyticsCategoryConfig.a();
        this.f64750a = (dA != null ? dA : dValueOf).doubleValue();
        Integer numValueOf = Integer.valueOf(j9Var.f64751b);
        Integer numD = analyticsCategoryConfig.d();
        this.f64751b = (numD != null ? numD : numValueOf).intValue();
        Integer numValueOf2 = Integer.valueOf(j9Var.f64752c);
        Integer numE = analyticsCategoryConfig.e();
        this.f64752c = (numE != null ? numE : numValueOf2).intValue();
        Boolean boolValueOf = Boolean.valueOf(j9Var.f64753d);
        Boolean boolF = analyticsCategoryConfig.f();
        this.f64753d = (boolF != null ? boolF : boolValueOf).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            jMax = j9Var.f64754e;
        } else {
            jMax = Math.max(60000L, vi.e(analyticsCategoryConfig.g()));
        }
        this.f64754e = jMax;
        if (analyticsCategoryConfig.c() == null) {
            jMax2 = j9Var.f64755f;
        } else {
            jMax2 = Math.max(0L, vi.e(analyticsCategoryConfig.c()));
        }
        this.f64755f = jMax2;
        List list = j9Var.f64756g;
        List<AnalyticsCategoryFilterConfig> listB = analyticsCategoryConfig.b();
        List listUnmodifiableList = null;
        if (listB != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : listB) {
                if (analyticsCategoryFilterConfig != null) {
                    listUnmodifiableList = listUnmodifiableList == null ? new ArrayList(listB.size()) : listUnmodifiableList;
                    listUnmodifiableList.add(new m9(analyticsCategoryFilterConfig));
                }
            }
            if (listUnmodifiableList != null) {
                WeakHashMap weakHashMap = vi.f65408a;
                listUnmodifiableList = DesugarCollections.unmodifiableList(listUnmodifiableList);
            }
        }
        this.f64756g = listUnmodifiableList != null ? listUnmodifiableList : list;
    }
}
