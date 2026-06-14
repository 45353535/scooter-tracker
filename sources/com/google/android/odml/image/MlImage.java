package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MlImage implements Closeable, AutoCloseable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzg f28601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f28603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28606g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    public static final class Internal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MlImage f28607a;

        /* synthetic */ Internal(MlImage mlImage, zzj zzjVar) {
            this.f28607a = mlImage;
        }

        public void acquire() {
            this.f28607a.p();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    MlImage(zzg zzgVar, int i10, Rect rect, long j10, int i11, int i12) {
        this.f28601b = zzgVar;
        this.f28602c = i10;
        Rect rect2 = new Rect();
        this.f28603d = rect2;
        rect2.set(rect);
        this.f28604e = i11;
        this.f28605f = i12;
        this.f28606g = 1;
    }

    static void o(int i10) {
        if (i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("Rotation value ");
        sb2.append(i10);
        sb2.append(" is not valid. Use only 0, 90, 180 or 270.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void p() {
        this.f28606g++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i10 = this.f28606g - 1;
        this.f28606g = i10;
        if (i10 == 0) {
            this.f28601b.zzc();
        }
    }

    @NonNull
    public List<ImageProperties> getContainedImageProperties() {
        return Collections.singletonList(this.f28601b.zzb());
    }

    public int getHeight() {
        return this.f28605f;
    }

    @NonNull
    public Internal getInternal() {
        return new Internal(this, null);
    }

    public int getRotation() {
        return this.f28602c;
    }

    public int getWidth() {
        return this.f28604e;
    }

    final zzg m() {
        return this.f28601b;
    }
}
