package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.e.a.b;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends sg.bigo.ads.common.view.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f101135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f101136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected final Drawable f101137c;

    public b(float f10, float f11, float f12, float f13, @Nullable Rect rect, float f14, @Nullable boolean[] zArr, @NonNull b.a aVar) {
        super(f10, f11, f12, f13, rect, aVar.f101123b, aVar.f101124c, f14, zArr);
        int i10 = aVar.f101123b;
        this.f101135a = i10;
        boolean z10 = aVar.f101122a;
        this.f101136b = z10;
        if (z10) {
            this.f101137c = null;
        } else {
            Drawable drawableA = sg.bigo.ads.common.utils.d.a(f10, f11, f12, f13, rect, i10);
            this.f101137c = this.f103027n != null ? new LayerDrawable(new Drawable[]{drawableA, this.f103027n}) : drawableA;
        }
    }

    @Nullable
    public final Drawable a() {
        return this.f101137c;
    }

    public b(float f10, float f11, @NonNull b.a aVar) {
        this(f10, f10, f10, f10, null, f11, null, aVar);
    }
}
