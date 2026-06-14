package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import hh.x;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Picasso f37593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Mutex f37594b = ng.f.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f37595c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pf f37596d = new Pf();

    public static final Picasso a(Context context) {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Picasso picassoBuild = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new x.a().a(new B8(((long) ((AdConfig) Y3.f38021a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize()) * 1024 * ((long) 1024))).c())).build();
        Intrinsics.checkNotNullExpressionValue(picassoBuild, "build(...)");
        return picassoBuild;
    }

    public static Picasso b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Picasso) eg.h.b(null, new Mf(context, null), 1, null);
    }
}
