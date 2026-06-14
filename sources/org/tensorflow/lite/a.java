package org.tensorflow.lite;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97945b;

    /* JADX INFO: renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1155a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f97946a;

        static {
            int[] iArr = new int[a.values().length];
            f97946a = iArr;
            try {
                iArr[a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97946a[a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97946a[a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97946a[a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97946a[a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97946a[a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97946a[a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f97946a[a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    a(int i10) {
        this.f97945b = i10;
    }

    public int d() {
        switch (C1155a.f97946a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
