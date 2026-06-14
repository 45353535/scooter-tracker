package cg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f6834a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f6835b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f6835b = threadLocalArr;
    }

    public static final boolean a() {
        return f6834a;
    }
}
