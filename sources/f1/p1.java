package f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p1 {
    public static final int a(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        double d10 = f10;
        if (d10 < 0.25d) {
            return 1;
        }
        if (d10 < 0.5d) {
            return 2;
        }
        if (d10 < 0.75d) {
            return 3;
        }
        return f10 < 1.0f ? 4 : 5;
    }
}
