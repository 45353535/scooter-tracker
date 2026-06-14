package yads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qq3 implements NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f115130a;

    public qq3(m00 m00Var) {
        this.f115130a = m00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq3) && Intrinsics.areEqual(this.f115130a, ((qq3) obj).f115130a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return (Bitmap) this.f115130a.f113281a.invoke();
    }

    public final int hashCode() {
        return this.f115130a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f115130a + ")";
    }
}
