package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
class ContentStreamRequestHandler extends RequestHandler {
    final Context context;

    ContentStreamRequestHandler(Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return "content".equals(request.uri.getScheme());
    }

    InputStream getInputStream(Request request) throws FileNotFoundException {
        return this.context.getContentResolver().openInputStream(request.uri);
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        return new RequestHandler.Result(x.k(getInputStream(request)), Picasso.LoadedFrom.DISK);
    }
}
