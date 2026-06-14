package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {
    static {
        ExtractorsFactory extractorsFactory = ExtractorsFactory.EMPTY;
    }

    public static Extractor[] a(ExtractorsFactory extractorsFactory, Uri uri, Map map) {
        return extractorsFactory.createExtractors();
    }

    public static /* synthetic */ Extractor[] b() {
        return new Extractor[0];
    }
}
