package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ej implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36808b;

    public Ej(String location, byte[] imageBytes) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f36807a = imageBytes;
        this.f36808b = location;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.f36807a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.checkNotNull(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.f36808b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f36808b + "/" + str)));
        return this.f36808b + "/" + str;
    }
}
