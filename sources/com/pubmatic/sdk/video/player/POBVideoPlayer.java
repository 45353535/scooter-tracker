package com.pubmatic.sdk.video.player;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;

/* JADX INFO: loaded from: classes11.dex */
public interface POBVideoPlayer {
    public static final int MAX_STALLING_TIMEOUT = 15000;
    public static final int MEDIA_FILE_TIMEOUT_ERROR = -1;
    public static final int RUNTIME_ERROR = -2;
    public static final SupportedMediaType[] SUPPORTED_MEDIA_TYPE = SupportedMediaType.values();

    public enum SupportedMediaType {
        MEDIA_3GPP("video/3gpp"),
        MEDIA_MP4("video/mp4"),
        MEDIA_WEBM("video/webm");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63127a;

        SupportedMediaType(String str) {
            this.f63127a = str;
        }

        @NonNull
        public static String[] getStringValues() {
            SupportedMediaType[] supportedMediaTypeArrValues = values();
            String[] strArr = new String[supportedMediaTypeArrValues.length];
            for (int i10 = 0; i10 < supportedMediaTypeArrValues.length; i10++) {
                strArr[i10] = supportedMediaTypeArrValues[i10].getValue();
            }
            return strArr;
        }

        public String getValue() {
            return this.f63127a;
        }
    }

    public enum VideoPlayerState {
        UNKNOWN,
        LOADED,
        PLAYING,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR
    }

    void destroy();

    @Nullable
    POBPlayerController getControllerView();

    int getMediaDuration();

    @NonNull
    VideoPlayerState getPlayerState();

    boolean isMute();

    void load(@NonNull String str);

    void mute();

    void pause();

    void play();

    void playOnMute(boolean z10);

    void setAutoPlayOnForeground(boolean z10);

    void setControllerView(@NonNull POBPlayerController pOBPlayerController, @NonNull FrameLayout.LayoutParams layoutParams);

    void setListener(@NonNull POBVideoPlayerView.POBVideoPlayerListener pOBVideoPlayerListener);

    void setPrepareTimeout(int i10);

    void stop();

    void unMute();
}
