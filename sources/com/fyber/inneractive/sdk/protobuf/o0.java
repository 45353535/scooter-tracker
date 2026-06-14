package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23541b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f23541b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23541b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23541b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[p0.values().length];
        f23540a = iArr2;
        try {
            iArr2[p0.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f23540a[p0.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f23540a[p0.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
