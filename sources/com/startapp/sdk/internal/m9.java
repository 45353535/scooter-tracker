package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f64914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f64916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f64917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64918f;

    public m9(l9 l9Var) {
        ArrayList arrayList = l9Var.f64861a;
        WeakHashMap weakHashMap = vi.f65408a;
        this.f64913a = arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = l9Var.f64862b;
        this.f64914b = arrayList2 != null ? DesugarCollections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f64915c = list;
        this.f64916d = list;
        ArrayList arrayList3 = l9Var.f64863c;
        this.f64917e = arrayList3 != null ? DesugarCollections.unmodifiableList(arrayList3) : list;
        this.f64918f = Math.max(0L, vi.e(l9Var.f64864d));
    }

    public m9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List listE = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = vi.f65408a;
        this.f64913a = listE != null ? DesugarCollections.unmodifiableList(listE) : Collections.EMPTY_LIST;
        List listB = analyticsCategoryFilterConfig.b();
        this.f64914b = listB != null ? DesugarCollections.unmodifiableList(listB) : Collections.EMPTY_LIST;
        List listD = analyticsCategoryFilterConfig.d();
        this.f64915c = listD != null ? DesugarCollections.unmodifiableList(listD) : Collections.EMPTY_LIST;
        List listA = analyticsCategoryFilterConfig.a();
        this.f64916d = listA != null ? DesugarCollections.unmodifiableList(listA) : Collections.EMPTY_LIST;
        List listC = analyticsCategoryFilterConfig.c();
        this.f64917e = listC != null ? DesugarCollections.unmodifiableList(listC) : Collections.EMPTY_LIST;
        this.f64918f = Math.max(0L, vi.e(analyticsCategoryFilterConfig.f()));
    }
}
