package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class i72 extends LruCache {
    public i72(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap != null ? bitmap.getByteCount() / 1024 : super.sizeOf((String) obj, null);
    }
}
