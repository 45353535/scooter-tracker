package xc;

import android.graphics.Bitmap;
import android.graphics.Color;
import ic.v;
import id.p;
import kotlin.jvm.internal.Intrinsics;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f108167a;

    public a(p algorithmParams) {
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
        this.f108167a = algorithmParams;
    }

    public final float a(int i10) {
        return (f0.w(i10) * 0.299f) + (f0.o(i10) * 0.587f) + (f0.a(i10) * 0.114f);
    }

    public final int b(Bitmap bitmap, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return f(bitmap.getPixel(i10, i11));
    }

    public final p c() {
        return this.f108167a;
    }

    public abstract Boolean d(Bitmap bitmap);

    public final void e(Float f10, Boolean bool) {
        if (v.j()) {
            v.g("BrokenCreativeDetector", this.f108167a.b().name() + " result - " + f10 + " (isBroken - " + bool + ')', new Object[0]);
        }
    }

    public final int f(int i10) {
        return (int) ((Color.red(i10) * 0.299f) + (Color.green(i10) * 0.587f) + (Color.blue(i10) * 0.114f));
    }

    public final Boolean g(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            return d(image);
        } catch (Throwable unused) {
            return null;
        }
    }
}
