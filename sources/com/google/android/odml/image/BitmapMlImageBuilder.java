package com.google.android.odml.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f28589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f28591c;

    public BitmapMlImageBuilder(@NonNull Context context, @NonNull Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zze(this.f28589a), this.f28590b, this.f28591c, 0L, this.f28589a.getWidth(), this.f28589a.getHeight());
    }

    @NonNull
    public BitmapMlImageBuilder setRotation(int i10) {
        MlImage.o(i10);
        this.f28590b = i10;
        return this;
    }

    public BitmapMlImageBuilder(@NonNull Bitmap bitmap) {
        this.f28589a = bitmap;
        this.f28590b = 0;
        this.f28591c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
