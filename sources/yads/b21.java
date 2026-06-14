package yads;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f108893b;

    public b21(String str, Bitmap bitmap) {
        this.f108892a = str;
        this.f108893b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return Intrinsics.areEqual(this.f108892a, b21Var.f108892a) && Intrinsics.areEqual(this.f108893b, b21Var.f108893b);
    }

    public final int hashCode() {
        return this.f108893b.hashCode() + (this.f108892a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f108892a + ", bitmap=" + this.f108893b + ")";
    }
}
