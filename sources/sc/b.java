package sc;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import qc.e;
import qc.f;

/* JADX INFO: loaded from: classes3.dex */
public class b extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fd.a f99931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sc.c f99932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaPlayer f99933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f99934e;

    /* JADX INFO: renamed from: sc.b$b, reason: collision with other inner class name */
    private class C1194b implements MediaPlayer.OnVideoSizeChangedListener {
        private C1194b() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            b.this.setVideoAspectRatio(i10 / i11);
        }
    }

    private class c implements f {
        private c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.this.f99934e = new Surface(surfaceTexture);
            b bVar = b.this;
            bVar.setMediaPlayerSurface(bVar.f99934e);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (b.this.f99932c == null) {
                return false;
            }
            b.this.f99932c.a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            e.a(this, surfaceTexture, i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            e.b(this, surfaceTexture);
        }
    }

    public b(Context context) {
        super(context);
        fd.a aVar = new fd.a(context);
        this.f99931b = aVar;
        aVar.setSurfaceTextureListener(new c());
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void e() {
        Surface surface = this.f99934e;
        if (surface != null) {
            surface.release();
        }
        this.f99934e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerSurface(@Nullable Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f99933d;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        setMediaPlayerSurface(null);
        e();
        this.f99933d = null;
        this.f99931b.setSurfaceTextureListener(null);
    }

    public void setListener(@Nullable sc.c cVar) {
        this.f99932c = cVar;
    }

    public void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.f99933d = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new C1194b());
        }
    }

    public void setVideoAspectRatio(float f10) {
        this.f99931b.setVideoAspectRatio(f10);
    }
}
