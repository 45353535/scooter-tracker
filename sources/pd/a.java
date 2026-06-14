package pd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98215a = new a();

    private a() {
    }

    public final Rect a(Bitmap bitmap, Rect rect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (rect == null) {
            return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        Rect rect2 = new Rect(Math.max(0, rect.left), Math.max(0, rect.top), Math.min(bitmap.getWidth(), rect.right), Math.min(bitmap.getHeight(), rect.bottom));
        if (rect2.isEmpty()) {
            return null;
        }
        return rect2;
    }
}
