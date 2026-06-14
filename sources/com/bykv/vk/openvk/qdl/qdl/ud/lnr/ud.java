package com.bykv.vk.openvk.qdl.qdl.ud.lnr;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.RequiresApi;
import com.ironsource.C4240b4;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends com.bykv.vk.openvk.qdl.qdl.ud.lnr.qdl {
    private final qdl lnr;
    private com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl mml;
    private final Object mo;
    private Surface mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final MediaPlayer f15927ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile boolean f15928wd;

    private static class qdl implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<ud> qdl;

        public qdl(ud udVar) {
            this.qdl = new WeakReference<>(udVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    udVar.qdl(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    udVar.lnr();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    return udVar.qdl(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    return udVar.ud(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    udVar.ud();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    udVar.mml();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                ud udVar = this.qdl.get();
                if (udVar != null) {
                    udVar.qdl(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public ud() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.mo = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f15927ud = mediaPlayer;
        }
        qdl(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.lnr = new qdl(this);
        yt();
    }

    private void jl() {
        try {
            Surface surface = this.mzz;
            if (surface != null) {
                surface.release();
                this.mzz = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void jtx() {
        com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl qdlVar = this.mml;
        if (qdlVar != null) {
            try {
                qdlVar.close();
            } catch (Throwable unused) {
            }
            this.mml = null;
        }
    }

    private void qdl(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void yt() {
        this.f15927ud.setOnPreparedListener(this.lnr);
        this.f15927ud.setOnBufferingUpdateListener(this.lnr);
        this.f15927ud.setOnCompletionListener(this.lnr);
        this.f15927ud.setOnSeekCompleteListener(this.lnr);
        this.f15927ud.setOnVideoSizeChangedListener(this.lnr);
        this.f15927ud.setOnErrorListener(this.lnr);
        this.f15927ud.setOnInfoListener(this.lnr);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public int bjy() {
        MediaPlayer mediaPlayer = this.f15927ud;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void exu() throws Throwable {
        try {
            this.f15927ud.reset();
        } catch (Throwable unused) {
        }
        jtx();
        qdl();
        yt();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        jl();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void fs() throws Throwable {
        synchronized (this.mo) {
            try {
                if (!this.f15928wd) {
                    this.f15927ud.release();
                    this.f15928wd = true;
                    jl();
                    jtx();
                    qdl();
                    yt();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void jpc() throws Throwable {
        this.f15927ud.pause();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void lnr(boolean z10) throws Throwable {
        this.f15927ud.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void mml(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.f15927ud;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void mo() throws Throwable {
        this.f15927ud.start();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public PlaybackParams mzz() throws IllegalStateException {
        return this.f15927ud.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public int rdp() {
        MediaPlayer mediaPlayer = this.f15927ud;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public long rq() {
        try {
            return this.f15927ud.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public long to() {
        try {
            return this.f15927ud.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void tvp() {
        MediaPlayer mediaPlayer = this.f15927ud;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void ud(boolean z10) throws Throwable {
        this.f15927ud.setScreenOnWhilePlaying(z10);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void wd() throws Throwable {
        this.f15927ud.stop();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.mo) {
            try {
                if (!this.f15928wd && surfaceHolder != null && surfaceHolder.getSurface() != null && this.qdl) {
                    this.f15927ud.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    @TargetApi(14)
    public void qdl(Surface surface) {
        jl();
        this.mzz = surface;
        this.f15927ud.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    @RequiresApi(api = 23)
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud udVar) throws Throwable {
        this.f15927ud.setPlaybackParams(this.f15927ud.getPlaybackParams().setSpeed(udVar.qdl()));
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(C4240b4.i.f42616b)) {
            this.f15927ud.setDataSource(uri.getPath());
        } else {
            this.f15927ud.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(FileDescriptor fileDescriptor) throws Throwable {
        this.f15927ud.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    @RequiresApi(api = 23)
    public synchronized void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mml = com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(), lnrVar);
        com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.lnr.qdl(lnrVar);
        this.f15927ud.setDataSource(this.mml);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(long j10, int i10) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f15927ud.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f15927ud.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f15927ud.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f15927ud.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.f15927ud.seekTo((int) j10, 3);
        } else {
            this.f15927ud.seekTo((int) j10);
        }
    }
}
