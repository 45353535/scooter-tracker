package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yn0 extends RuntimeException {
    public yn0(int i10) {
        super(a(i10));
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
