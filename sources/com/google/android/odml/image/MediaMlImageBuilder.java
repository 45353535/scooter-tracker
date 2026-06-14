package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(19)
public class MediaMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f28598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28599b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f28600c;

    public MediaMlImageBuilder(@NonNull Image image) {
        this.f28598a = image;
        this.f28600c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zzi(this.f28598a), this.f28599b, this.f28600c, 0L, this.f28598a.getWidth(), this.f28598a.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i10) {
        MlImage.o(i10);
        this.f28599b = i10;
        return this;
    }
}
