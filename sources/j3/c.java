package j3;

import i3.c;
import k3.e;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f85508a;

        static {
            int[] iArr = new int[c.EnumC0917c.values().length];
            f85508a = iArr;
            try {
                iArr[c.EnumC0917c.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85508a[c.EnumC0917c.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static k3.c a(c.EnumC0917c enumC0917c) {
        int i10 = a.f85508a[enumC0917c.ordinal()];
        if (i10 == 1) {
            return new e();
        }
        if (i10 == 2) {
            return new k3.d();
        }
        throw new IllegalArgumentException("wrong WHEEL_TYPE");
    }
}
