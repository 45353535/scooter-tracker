package com.appodeal.ads.nativead.downloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13868a;

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13868a = context;
    }

    public static k a(File file, boolean z10, BitmapFactory.Options options) throws Exception {
        if (file != null) {
            if (((!file.exists() || file.length() <= 0) ? null : file) != null) {
                BitmapFactory.decodeFile(file.getPath(), options);
                if (z10) {
                    if (options.outWidth / options.outHeight < 1.5f) {
                        throw new Exception("Aspect ratio is not correct for file: " + file);
                    }
                }
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return new k(absolutePath);
            }
        }
        return null;
    }

    public static l b(String str, File file, boolean z10, BitmapFactory.Options options, int i10) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m.c(byteArrayOutputStream, str);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (z10) {
            if (options.outWidth / options.outHeight < 1.5f) {
                throw new Exception("Aspect ratio is not correct for url: " + str);
            }
        }
        if (file != null) {
            Intrinsics.checkNotNull(byteArray);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                options.inJustDecodeBounds = false;
                BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options).compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                uf.c.a(fileOutputStream, null);
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return new k(absolutePath);
            } finally {
            }
        } else {
            options.inSampleSize = i10;
            Intrinsics.checkNotNull(byteArray);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(byteArray.length);
            try {
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream2);
                bitmapDecodeByteArray.recycle();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
                uf.c.a(byteArrayOutputStream2, null);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeStream, "use(...)");
                return new j(bitmapDecodeStream);
            } finally {
            }
        }
    }
}
