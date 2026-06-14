package pg;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q {
    public static /* synthetic */ void a(r rVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        rVar.write(bArr, i10, i11);
    }
}
