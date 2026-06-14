package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import hh.b0;
import hh.c0;
import hh.d;
import hh.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i10, int i11) {
            super("HTTP " + i10);
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static z createRequest(Request request, int i10) {
        d dVarA;
        if (i10 == 0) {
            dVarA = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            dVarA = d.f73578p;
        } else {
            d.a aVar = new d.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                aVar.d();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                aVar.e();
            }
            dVarA = aVar.a();
        }
        z.a aVarN = new z.a().n(request.uri.toString());
        if (dVarA != null) {
            aVarN.c(dVarA);
        }
        return aVarN.b();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        b0 b0VarLoad = this.downloader.load(createRequest(request, i10));
        c0 c0VarM = b0VarLoad.m();
        if (!b0VarLoad.isSuccessful()) {
            c0VarM.close();
            throw new ResponseException(b0VarLoad.q(), request.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = b0VarLoad.o() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && c0VarM.contentLength() == 0) {
            c0VarM.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && c0VarM.contentLength() > 0) {
            this.stats.dispatchDownloadFinished(c0VarM.contentLength());
        }
        return new RequestHandler.Result(c0VarM.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }
}
