package zc;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f119339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Shader f119340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Shader f119341c;

    public e(RectF bounds, int[] colors, Bitmap.Config bitmapConfig, boolean z10) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        this.f119339a = z10;
        this.f119340b = new a(bounds, colors, bitmapConfig);
        this.f119341c = z10 ? new d(bounds, colors) : null;
    }

    @Override // zc.g
    public Shader a(boolean z10) {
        Shader shader;
        return (this.f119339a && (shader = this.f119341c) != null && z10) ? shader : this.f119340b;
    }

    public /* synthetic */ e(RectF rectF, int[] iArr, Bitmap.Config config, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectF, iArr, (i10 & 4) != 0 ? Bitmap.Config.ARGB_8888 : config, (i10 & 8) != 0 ? Build.VERSION.SDK_INT >= 33 : z10);
    }
}
