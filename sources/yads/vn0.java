package yads;

import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class vn0 extends LruCache {
    public vn0(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        f42 f42Var = (f42) obj2;
        if (f42Var != null) {
            ((do0) f42Var).a();
        }
    }
}
