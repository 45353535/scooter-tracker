package bd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements m {
    @Override // bd.m
    public int[] a(Bitmap bitmap, Rect rect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int[] iArr = new int[rect.width() * rect.height()];
        bitmap.getPixels(iArr, 0, rect.width(), rect.left, rect.top, rect.width(), rect.height());
        return iArr;
    }
}
