package com.startapp.sdk.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f64861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f64862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f64863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64864d;

    public final l9 a(String... strArr) {
        ArrayList arrayList = this.f64863c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f64863c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
