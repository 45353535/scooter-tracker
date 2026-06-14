package com.my.target.instreamads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.instreamads.InstreamAd;

/* JADX INFO: loaded from: classes11.dex */
public interface InstreamAdVideoMotionPlayer {

    public interface VideoMotionPlayerListener {
        void onBannerComplete(@NonNull Context context);

        void onBannerShow(@NonNull Context context);

        void onCloseByUser(@NonNull Context context);

        void onError(@NonNull String str, @NonNull Context context);

        void onHeaderClick(@NonNull Context context);

        void onItemClick(@NonNull String str, @NonNull Context context);

        void onItemShow(@NonNull String str, @NonNull Context context);
    }

    void playVideoMotionBanner(@NonNull InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

    void setVideoMotionPlayerListener(@Nullable VideoMotionPlayerListener videoMotionPlayerListener);
}
