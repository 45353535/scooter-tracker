package com.my.target.instreamads.postview;

import android.view.ViewGroup;
import com.my.target.instreamads.postview.models.PostViewData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface InstreamAdPostViewPlayer {
    @NotNull
    ViewGroup getView();

    void hide();

    void pause();

    void resume();

    void show(@NotNull PostViewData postViewData);

    void updateProgress(int i10, int i11);
}
