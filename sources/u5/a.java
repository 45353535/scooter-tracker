package u5;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final /* synthetic */ Integer a(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }

    public static final /* synthetic */ int b(int i10, boolean z10) {
        return z10 ? -i10 : i10;
    }
}
