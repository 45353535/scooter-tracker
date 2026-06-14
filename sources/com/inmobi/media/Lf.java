package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Lf implements Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f37294a;

    public Lf(Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f37294a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f37294a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Bitmap bitmapCopy = source.copy(this.f37294a, false);
        source.recycle();
        Intrinsics.checkNotNull(bitmapCopy);
        return bitmapCopy;
    }
}
