package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
class FileRequestHandler extends ContentStreamRequestHandler {
    FileRequestHandler(Context context) {
        super(context);
    }

    static int getFileExifRotation(Uri uri) throws IOException {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return C4240b4.i.f42616b.equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        return new RequestHandler.Result(null, x.k(getInputStream(request)), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
