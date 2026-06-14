package com.appodeal.ads.nativead.downloader;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f13863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f13864c;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13862a = context;
        this.f13863b = lf.i.a(new Function0() { // from class: com.appodeal.ads.nativead.downloader.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(this.f13860b);
            }
        });
        this.f13864c = lf.i.a(new Function0() { // from class: com.appodeal.ads.nativead.downloader.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b(this.f13861b);
            }
        });
    }

    public static final n a(g gVar) {
        return new n(gVar.f13862a);
    }

    public static final o b(g gVar) {
        return new o(gVar.f13862a);
    }
}
