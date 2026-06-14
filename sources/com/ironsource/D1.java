package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class D1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40530d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40532f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f40528b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40527a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40531e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40533g = true;

    public void a(boolean z10) {
        this.f40527a = z10;
    }

    public HashSet<String> b() {
        return this.f40528b;
    }

    public void c(String str) {
        this.f40529c = str;
    }

    public String d() {
        return this.f40529c;
    }

    public boolean e() {
        return this.f40531e;
    }

    public boolean f() {
        return this.f40527a;
    }

    public boolean g() {
        return this.f40533g;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40528b.add(str);
    }

    public void b(String str) {
        this.f40530d = str;
    }

    public String c() {
        return this.f40530d;
    }

    public void b(boolean z10) {
        this.f40533g = z10;
    }

    public void c(boolean z10) {
        this.f40531e = z10;
    }

    public int a() {
        return this.f40532f;
    }

    public void a(int i10) {
        this.f40532f = i10;
    }
}
