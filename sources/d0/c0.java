package d0;

/* JADX INFO: loaded from: classes5.dex */
public enum c0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean g(int i10, boolean z10, int i11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
