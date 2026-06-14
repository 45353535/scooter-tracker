package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import hh.b0;
import hh.c;
import hh.e;
import hh.x;
import hh.z;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class OkHttp3Downloader implements Downloader {
    private final c cache;

    @VisibleForTesting
    final e.a client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    @NonNull
    public b0 load(@NonNull z zVar) throws IOException {
        return this.client.a(zVar).execute();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        c cVar;
        if (this.sharedClient || (cVar = this.cache) == null) {
            return;
        }
        try {
            cVar.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    public OkHttp3Downloader(File file, long j10) {
        this(new x.a().d(new c(file, j10)).c());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(x xVar) {
        this.sharedClient = true;
        this.client = xVar;
        this.cache = xVar.l();
    }

    public OkHttp3Downloader(e.a aVar) {
        this.sharedClient = true;
        this.client = aVar;
        this.cache = null;
    }
}
