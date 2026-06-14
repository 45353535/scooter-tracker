package com.squareup.picasso;

import androidx.annotation.NonNull;
import hh.b0;
import hh.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public interface Downloader {
    @NonNull
    b0 load(@NonNull z zVar) throws IOException;

    void shutdown();
}
