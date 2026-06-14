package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ht {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2425;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<List<Field>> f2426;

    public ht() {
        ArrayList arrayList = new ArrayList();
        this.f2426 = arrayList;
        int i10 = (-1) + 1;
        this.f2425 = i10;
        arrayList.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m6633(Field field) {
        this.f2426.get(this.f2425).remove(field);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final void m6634() {
        int i10 = this.f2425 + 1;
        this.f2425 = i10;
        this.f2426.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m6635(Field field) {
        this.f2426.get(this.f2425).add(field);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m6636() {
        this.f2426.remove(this.f2425);
        this.f2425--;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final List<List<Field>> m6632() {
        return this.f2426;
    }
}
