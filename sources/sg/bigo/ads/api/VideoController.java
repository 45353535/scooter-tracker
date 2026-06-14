package sg.bigo.ads.api;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoController {

    public interface VideoLifeCallback {
        void onMuteChange(boolean z10);

        void onVideoEnd();

        void onVideoPause();

        void onVideoPlay();

        void onVideoStart();
    }

    public interface a {
        void i(boolean z10);
    }

    public interface b extends VideoLifeCallback {
        void a();

        void b();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a(int i10, int i11);
    }

    a getBackupLoadCallback();

    c getLoadHTMLCallback();

    @Nullable
    d getProgressChangeListener();

    @Nullable
    VideoLifeCallback getVideoLifeCallback();

    boolean isMuted();

    boolean isPaused();

    boolean isPlaying();

    void mute(boolean z10);

    void notifyBackupResourceReady();

    void notifyPlayViewRegister();

    void notifyResourceReady();

    void pause();

    void play();

    void setBackupLoadCallback(a aVar);

    void setLoadHTMLCallback(c cVar);

    void setNeedPauseWhenVisiblePercentEqual(boolean z10);

    void setProgressChangeListener(d dVar);

    void setVideoLifeCallback(VideoLifeCallback videoLifeCallback);
}
