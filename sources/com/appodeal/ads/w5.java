package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w5 extends a6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc f15175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f15176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final te f15177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.appodeal.ads.storage.c f15179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.g f15180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.appodeal.ads.initializing.h f15181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ApplicationData f15182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15183l;

    public w5(Context context, l0 adController, te adRequest, ArrayList servicesDataList) {
        zc restrictedData = zc.f15321a;
        com.appodeal.ads.storage.e0 keyValueStorage = com.appodeal.ads.storage.e0.f14799b;
        com.appodeal.ads.utils.session.r sessionManager = com.appodeal.ads.utils.session.r.f15109b;
        com.appodeal.ads.initializing.j adNetworkRegistry = com.appodeal.ads.initializing.j.f13479b;
        com.appodeal.ads.utils.app.c applicationData = com.appodeal.ads.utils.app.c.f14961g;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(restrictedData, "restrictedData");
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(servicesDataList, "servicesDataList");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(adNetworkRegistry, "adNetworkRegistry");
        Intrinsics.checkNotNullParameter(applicationData, "applicationData");
        this.f15174c = context;
        this.f15175d = restrictedData;
        this.f15176e = adController;
        this.f15177f = adRequest;
        this.f15178g = servicesDataList;
        this.f15179h = keyValueStorage;
        this.f15180i = sessionManager;
        this.f15181j = adNetworkRegistry;
        this.f15182k = applicationData;
        String str = db.f13239a;
        Boolean bool = (Boolean) com.appodeal.ads.utils.debug.m.f15000a.getValue();
        this.f15183l = bool != null ? bool.booleanValue() : db.f13241c ? Constants.REPORT : Constants.STATS;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0252 A[LOOP:1: B:64:0x024c->B:66:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.appodeal.ads.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.w5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f15183l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.content.Context r10, com.appodeal.ads.modules.common.internal.data.ApplicationData r11, kotlin.coroutines.jvm.internal.d r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.w5.e(android.content.Context, com.appodeal.ads.modules.common.internal.data.ApplicationData, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.Context r9, com.appodeal.ads.zc r10, kotlin.coroutines.jvm.internal.d r11) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.w5.f(android.content.Context, com.appodeal.ads.zc, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
