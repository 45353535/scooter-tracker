package com.ironsource;

import com.ironsource.L8;

/* JADX INFO: loaded from: classes8.dex */
public class Je implements L8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41179b;

    public Je(String str, int i10) {
        this.f41178a = str;
        this.f41179b = i10;
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.f41179b;
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.f41178a;
    }
}
