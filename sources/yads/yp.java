package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yp implements wp {
    @Override // yads.wp
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return Intrinsics.areEqual(bitmap, ((BitmapDrawable) drawable).getBitmap());
    }
}
