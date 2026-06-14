package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5160i3 implements InterfaceC5185j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77367a;

    public C5160i3(int i10) {
        this.f77367a = i10;
    }

    public static InterfaceC5185j3 a(InterfaceC5185j3... interfaceC5185j3Arr) {
        return new C5160i3(b(interfaceC5185j3Arr));
    }

    public static int b(InterfaceC5185j3... interfaceC5185j3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC5185j3 interfaceC5185j3 : interfaceC5185j3Arr) {
            if (interfaceC5185j3 != null) {
                bytesTruncated = interfaceC5185j3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5185j3
    public final int getBytesTruncated() {
        return this.f77367a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f77367a + '}';
    }
}
