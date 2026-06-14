package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3809jf implements InterfaceC3695f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImpressionType f38815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSessionContext f38816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f38818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f38819f;

    public C3809jf(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        Intrinsics.checkNotNullParameter(mAdSessionType, "mAdSessionType");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        this.f38814a = mAdSessionType;
        this.f38815b = impressionType;
        this.f38816c = adSessionContext;
        this.f38817d = z10;
    }

    public static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        Lazy lazy = P9.f37527a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: " + ((int) b11))));
        return false;
    }

    public static boolean a(byte b10) {
        if (b10 > 0) {
            return true;
        }
        Lazy lazy = P9.f37527a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.webkit.WebView r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3809jf.a(android.webkit.WebView, java.util.Map):void");
    }
}
