package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class G1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Af f36920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36916b = -1;
        this.f36917c = -1;
        this.f36918d = -1;
        this.f36919e = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 == this.f36916b && i11 == this.f36917c && i14 == this.f36918d && i15 == this.f36919e) {
            return;
        }
        this.f36916b = i10;
        this.f36917c = i11;
        this.f36918d = i14;
        this.f36919e = i15;
        Af af2 = this.f36920f;
        if (af2 != null) {
            N7 n72 = ((B7) af2).f36613a;
            VideoViewPosition videoViewPosition = new VideoViewPosition();
            videoViewPosition.setX(i10);
            videoViewPosition.setY(i11);
            videoViewPosition.setWidth(F3.a(i14));
            videoViewPosition.setHeight(F3.a(i15));
            n72.a(new C3827k8(videoViewPosition));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f36915a;
        if (f10 > 0.0f) {
            float f11 = size;
            float f12 = size2;
            if (f11 / f12 > f10) {
                size = (int) (f12 * f10);
            } else {
                size2 = (int) (f11 / f10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setOnPositionChangeListener(@Nullable Af af2) {
        this.f36920f = af2;
    }
}
