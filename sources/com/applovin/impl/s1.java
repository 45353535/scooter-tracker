package com.applovin.impl;

import j$.util.Objects;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10383c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10381a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10384d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.f10382b = str;
        this.f10383c = map;
    }

    public long a() {
        return this.f10384d;
    }

    public String b() {
        return this.f10381a;
    }

    public String c() {
        return this.f10382b;
    }

    public Map d() {
        return this.f10383c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f10384d == s1Var.f10384d && Objects.equals(this.f10382b, s1Var.f10382b) && Objects.equals(this.f10383c, s1Var.f10383c)) {
            return Objects.equals(this.f10381a, s1Var.f10381a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10382b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f10383c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f10384d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f10381a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f10382b + "', id='" + this.f10381a + "', creationTimestampMillis=" + this.f10384d + ", parameters=" + this.f10383c + '}';
    }
}
