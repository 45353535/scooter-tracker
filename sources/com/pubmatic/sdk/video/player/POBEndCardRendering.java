package com.pubmatic.sdk.video.player;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;

/* JADX INFO: loaded from: classes11.dex */
public interface POBEndCardRendering {
    FrameLayout getView();

    void render(@Nullable POBAdDescriptor pOBAdDescriptor);

    void setLearnMoreTitle(@NonNull String str);

    void setListener(@Nullable a aVar);

    void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener);

    void setSkipAfter(int i10);
}
