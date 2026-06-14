package com.startapp.sdk.internal;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class sd extends c2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaPlayer f65254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VideoView f65255h;

    public sd(VideoView videoView) {
        this.f65255h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f64328a = str;
        if (str != null) {
            try {
                this.f65255h.setVideoPath(str);
            } catch (Throwable th2) {
                g9.a(th2);
                onError(this.f65254g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.startapp.sdk.ads.video.b bVar = this.f64331d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        if (this.f64330c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        zj zjVar = this.f64330c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i10 == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        String string = (i11 != -1010 ? i11 != -1007 ? i11 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED).toString();
        ck ckVar = new ck(videoPlayerInterface$VideoPlayerErrorType, string, currentPosition);
        com.startapp.sdk.ads.video.c cVar = zjVar.f65698a;
        if (cVar.N != null) {
            if (!cVar.f63866a0 || cVar.f63869d0 > cVar.f63870e0 || currentPosition <= 0 || !string.equals("MEDIA_ERROR_IO")) {
                zjVar.f65698a.a(ckVar);
            } else {
                com.startapp.sdk.ads.video.c cVar2 = zjVar.f65698a;
                cVar2.f63869d0++;
                ProgressBar progressBar = cVar2.R;
                if (progressBar == null || !progressBar.isShown()) {
                    cVar2.f63876k0.postDelayed(new qj(cVar2), AdsCommonMetaData.k().F().h());
                }
                com.startapp.sdk.ads.video.c cVar3 = zjVar.f65698a;
                cVar3.N.a(cVar3.x().getLocalVideoPath());
                zjVar.f65698a.N.a(currentPosition);
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        MediaEvents mediaEvents;
        this.f65254g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        xj xjVar = this.f64329b;
        if (xjVar != null) {
            com.startapp.sdk.ads.video.c cVar = xjVar.f65577a;
            int i10 = cVar.f63873h0;
            if (i10 > 0) {
                sd sdVar = cVar.N;
                if (sdVar != null) {
                    sdVar.a(i10);
                }
                com.startapp.sdk.ads.video.c cVar2 = xjVar.f65577a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                vd vdVar = cVar2.F;
                if (vdVar != null && (mediaEvents = vdVar.f65399c) != null) {
                    mediaEvents.resume();
                }
                cVar2.a(cVar2.f63873h0, new VideoPausedTrackingParams(cVar2.f65443o, cVar2.a(cVar2.f63873h0), cVar2.C, cVar2.W, pauseOrigin, cVar2.f63875j0), "resumed", cVar2.x().getVideoTrackingDetails().n());
                cVar2.W++;
            } else if (cVar.B()) {
                xjVar.f65577a.H();
            }
        }
        if (h0.b(this.f64328a) && (mediaPlayer2 = this.f65254g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new rd(this));
        } else {
            if (h0.b(this.f64328a)) {
                return;
            }
            qe.f65159a.f65217b = this.f64333f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        wj wjVar = this.f64332e;
        if (wjVar != null) {
            wjVar.f65486a.H();
        }
    }

    public final void a(int i10) {
        try {
            MediaPlayer mediaPlayer = this.f65254g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i10, 3);
                } else {
                    mediaPlayer.seekTo(i10);
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
