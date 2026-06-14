package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4555td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f45504a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f45505b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f45506c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f45507d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f45506c;
    }

    public ArrayList<String> b() {
        return this.f45505b;
    }

    public ArrayList<String> c() {
        return this.f45507d;
    }

    public ArrayList<String> d() {
        return this.f45504a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45506c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45505b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45507d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45504a.add(str);
    }
}
