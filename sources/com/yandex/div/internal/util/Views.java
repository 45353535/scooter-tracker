package com.yandex.div.internal.util;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Views {
    private static final int[] HIT_TEST_ARRAY = new int[2];

    @NonNull
    public static <T extends View> T findViewAndCast(@NonNull View view, @IdRes int i10) {
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i10) + "] doesn't exist");
    }
}
