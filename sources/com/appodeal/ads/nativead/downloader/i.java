package com.appodeal.ads.nativead.downloader;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f13865a = lf.i.a(new Function0() { // from class: com.appodeal.ads.nativead.downloader.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i.a();
        }
    });

    public static final g a() {
        return new g(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
    }
}
