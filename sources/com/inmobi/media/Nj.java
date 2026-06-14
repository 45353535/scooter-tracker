package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37459b;

    public Nj(String tableName, String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.f37458a = tableName;
        this.f37459b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nj)) {
            return false;
        }
        Nj nj = (Nj) obj;
        return Intrinsics.areEqual(this.f37458a, nj.f37458a) && Intrinsics.areEqual(this.f37459b, nj.f37459b);
    }

    public final int hashCode() {
        return this.f37459b.hashCode() + (this.f37458a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f37458a + ", tableSchema=" + this.f37459b + ")";
    }
}
