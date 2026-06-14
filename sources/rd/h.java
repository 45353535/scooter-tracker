package rd;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ Object a(i iVar, String str, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toOrDefault");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return iVar.a(str, obj);
    }
}
