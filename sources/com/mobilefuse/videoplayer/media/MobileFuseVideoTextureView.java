package com.mobilefuse.videoplayer.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.mobilefuse.sdk.StabilityHelper;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J \u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/videoplayer/media/MobileFuseVideoTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/mobilefuse/videoplayer/media/VideoViewInterface;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "mediaPlayer", "Landroid/media/MediaPlayer;", "(Landroid/content/Context;Landroid/media/MediaPlayer;)V", "surface", "Landroid/view/Surface;", "destroy", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onSurfaceTextureAvailable", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
public final class MobileFuseVideoTextureView extends TextureView implements TextureView.SurfaceTextureListener, VideoViewInterface {
    private final MediaPlayer mediaPlayer;
    private Surface surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseVideoTextureView(@NotNull Context context, @NotNull MediaPlayer mediaPlayer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.mediaPlayer = mediaPlayer;
        setSurfaceTextureListener(this);
    }

    @Override // com.mobilefuse.videoplayer.media.VideoViewInterface
    public void destroy() {
        try {
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        try {
            int videoWidth = this.mediaPlayer.getVideoWidth();
            int videoHeight = this.mediaPlayer.getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0) {
                int mode = View.MeasureSpec.getMode(widthMeasureSpec);
                int size = View.MeasureSpec.getSize(widthMeasureSpec);
                int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
                int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i11 = videoWidth * size2;
                    int i12 = size * videoHeight;
                    if (i11 < i12) {
                        size = i11 / videoHeight;
                    } else if (i11 > i12) {
                        size2 = i12 / videoWidth;
                    }
                } else if (mode == 1073741824) {
                    int i13 = (videoHeight * size) / videoWidth;
                    size2 = (mode2 != Integer.MIN_VALUE || i13 <= size2) ? i13 : size2 | 16777216;
                } else if (mode2 == 1073741824) {
                    int i14 = (videoWidth * size2) / videoHeight;
                    size = (mode != Integer.MIN_VALUE || i14 <= size) ? i14 : size | 16777216;
                } else {
                    if (mode2 != Integer.MIN_VALUE || videoHeight <= size2) {
                        i10 = videoWidth;
                        size2 = videoHeight;
                    } else {
                        i10 = (size2 * videoWidth) / videoHeight;
                    }
                    if (mode != Integer.MIN_VALUE || i10 <= size) {
                        size = i10;
                    } else {
                        size2 = (videoHeight * size) / videoWidth;
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            setMeasuredDimension(View.getDefaultSize(videoWidth, widthMeasureSpec), View.getDefaultSize(videoHeight, heightMeasureSpec));
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.surface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.surface = surface;
        this.mediaPlayer.setSurface(surface);
    }
}
