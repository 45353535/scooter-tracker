package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.C4240b4;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    AssetRequestHandler(Context context) {
        this.context = context;
    }

    static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return C4240b4.i.f42616b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && ANDROID_ASSET.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } finally {
                }
            }
        }
        return new RequestHandler.Result(x.k(this.assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
