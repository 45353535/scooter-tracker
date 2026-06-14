package u9;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105295b;

    public c0(int i10) {
        super(a(i10));
        this.f105295b = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
