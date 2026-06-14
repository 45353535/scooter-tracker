package com.appodeal.ads.nativead.downloader;

import android.content.Context;
import android.media.ThumbnailUtils;
import android.net.Uri;
import com.appodeal.ads.utils.Log;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13869a;

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13869a = context;
    }

    public final Object a(String url) {
        File file;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.f93230c;
            Context context = this.f13869a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                file = new File(m.a(context), m.d(url));
            } catch (Exception e10) {
                Log.log(e10);
                file = null;
            }
            if (file == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!file.exists() || file.length() == 0) {
                m.c(new FileOutputStream(file), url);
                ThumbnailUtils.createVideoThumbnail(file.getPath(), 1);
            }
            return Result.b(Uri.fromFile(file));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }
}
