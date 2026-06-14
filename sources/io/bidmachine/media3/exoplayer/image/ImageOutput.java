package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageOutput f81091a = new a();

    class a implements ImageOutput {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }

    void onDisabled();

    void onImageAvailable(long j10, Bitmap bitmap);
}
