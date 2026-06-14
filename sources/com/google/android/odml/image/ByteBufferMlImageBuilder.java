package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f28592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28596e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f28597f;

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12) {
        this.f28592a = byteBuffer;
        this.f28593b = i10;
        this.f28594c = i11;
        this.f28595d = i12;
        this.f28597f = new Rect(0, 0, i10, i11);
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zzf(this.f28592a, this.f28595d), this.f28596e, this.f28597f, 0L, this.f28593b, this.f28594c);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i10) {
        MlImage.o(i10);
        this.f28596e = i10;
        return this;
    }
}
