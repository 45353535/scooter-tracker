package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {
    public static long a(ContentMetadata contentMetadata) {
        return contentMetadata.get("exo_len", -1L);
    }

    public static Uri b(ContentMetadata contentMetadata) {
        String str = contentMetadata.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
