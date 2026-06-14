package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5462u4 extends C5160i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78323b;

    public C5462u4(int i10, int i11) {
        super(i11);
        this.f78323b = i10;
    }

    @Override // io.appmetrica.analytics.impl.C5160i3
    public final String toString() {
        return "CollectionTrimInfo{itemsDropped=" + this.f78323b + ", bytesTruncated=" + this.f77367a + '}';
    }
}
