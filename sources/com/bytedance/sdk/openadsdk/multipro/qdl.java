package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface qdl {
    int qdl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int qdl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor qdl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri qdl(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String qdl();

    String qdl(@NonNull Uri uri);
}
