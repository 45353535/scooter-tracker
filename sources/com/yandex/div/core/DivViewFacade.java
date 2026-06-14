package com.yandex.div.core;

import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yandex.div.core.state.DivStatePath;

/* JADX INFO: loaded from: classes11.dex */
public interface DivViewFacade {
    @NonNull
    View getView();

    void hideTooltip(@NonNull String str);

    void showTooltip(@NonNull String str, boolean z10);

    void switchToState(@IntRange(from = 0) long j10, boolean z10);

    void switchToState(@NonNull DivStatePath divStatePath, boolean z10);
}
