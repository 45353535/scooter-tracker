package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.d
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return e.b();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);
}
