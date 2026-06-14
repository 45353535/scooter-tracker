package com.yandex.div.core.downloader;

import androidx.annotation.NonNull;
import com.yandex.div.core.downloader.DivPatchDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes11.dex */
public interface DivDownloader {
    public static final DivDownloader STUB = new DivDownloader() { // from class: z6.a
        @Override // com.yandex.div.core.downloader.DivDownloader
        public final LoadReference downloadPatch(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
            return b.a(div2View, str, divPatchDownloadCallback);
        }
    };

    LoadReference downloadPatch(@NonNull Div2View div2View, @NonNull String str, @NonNull DivPatchDownloadCallback divPatchDownloadCallback);
}
