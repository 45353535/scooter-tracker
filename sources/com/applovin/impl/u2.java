package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class u2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e3 f11053d;

    u2(String str, String str2, boolean z10, e3 e3Var) {
        this.f11050a = str;
        this.f11051b = str2;
        this.f11052c = z10;
        this.f11053d = e3Var;
    }

    public String a() {
        return this.f11051b;
    }

    public List b() {
        List listL = this.f11053d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f11050a) : listL;
    }

    public String c() {
        return this.f11050a;
    }

    public e3 d() {
        return this.f11053d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f11050a;
            if (str == null ? u2Var.f11050a != null : !str.equals(u2Var.f11050a)) {
                return false;
            }
            String str2 = this.f11051b;
            if (str2 == null ? u2Var.f11051b != null : !str2.equals(u2Var.f11051b)) {
                return false;
            }
            if (this.f11052c == u2Var.f11052c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11050a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11051b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f11052c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f11051b.compareToIgnoreCase(u2Var.f11051b);
    }
}
