package com.yandex.div.internal.util;

import android.database.Cursor;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IOUtils {
    public static void closeCursorSilently(@Nullable Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
