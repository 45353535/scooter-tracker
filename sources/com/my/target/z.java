package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureView f61118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceView f61119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f61122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61123f;

    public interface a {
        void q();
    }

    public z(Context context) {
        super(context);
        this.f61118a = new TextureView(context);
        a();
    }

    public void a(int i10, int i11) {
        this.f61120c = i10;
        this.f61121d = i11;
        requestLayout();
        invalidate();
    }

    @Nullable
    public Bitmap getScreenShot() {
        if (this.f61123f == 1) {
            return null;
        }
        try {
            return this.f61118a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    @NonNull
    public TextureView getTextureView() {
        return this.f61118a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        a aVar;
        super.onAttachedToWindow();
        if (kb.a(this) || (aVar = this.f61122e) == null) {
            return;
        }
        aVar.q();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i13 = this.f61120c;
        if (i13 <= 0 || (i12 = this.f61121d) <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        float f10 = i13 / i12;
        if (mode == 0 && mode2 == 0) {
            size = i13;
            size2 = i12;
        } else {
            if (mode == 0) {
                size = (int) (size2 * f10);
            } else if (mode2 == 0) {
                size2 = (int) (size / f10);
            } else if (e2.a(f10, 1.0f) == -1 && size2 <= size) {
                i13 = size;
                i12 = size2;
                size = (int) (size2 * f10);
            } else {
                i13 = size;
                i12 = size2;
                size2 = (int) (size / f10);
            }
            i13 = size;
            i12 = size2;
        }
        this.f61118a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.f61119b;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i13, i12);
    }

    public void setAdVideoViewListener(@Nullable a aVar) {
        this.f61122e = aVar;
    }

    public void setExoPlayer(@Nullable ExoPlayer exoPlayer) {
        if (exoPlayer == null) {
            return;
        }
        int i10 = this.f61123f;
        if (i10 == 0) {
            exoPlayer.setVideoSurfaceView(null);
            exoPlayer.setVideoTextureView(this.f61118a);
        } else {
            if (i10 != 1) {
                return;
            }
            exoPlayer.setVideoTextureView(null);
            exoPlayer.setVideoSurfaceView(this.f61119b);
        }
    }

    public void setViewMode(int i10) {
        if (this.f61123f == i10) {
            return;
        }
        this.f61123f = i10;
        a();
    }

    public final void a() {
        kb.b(this.f61118a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f61123f == 0) {
            addView(this.f61118a, layoutParams);
            return;
        }
        if (this.f61119b == null) {
            this.f61119b = new SurfaceView(getContext());
        }
        addView(this.f61119b, layoutParams);
    }
}
