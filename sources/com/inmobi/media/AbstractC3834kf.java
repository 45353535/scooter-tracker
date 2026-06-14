package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3834kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38883a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(AbstractC3834kf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th2) {
            th2.getStackTrace();
            return false;
        }
    }
}
