package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4117w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f39808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.AdChoiceConfig f39809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3903n9 f39810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39811e;

    public C4117w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adChoiceConfig, "adChoiceConfig");
        this.f39807a = context;
        this.f39808b = image;
        this.f39809c = adChoiceConfig;
        this.f39810d = c3903n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f39811e = "AdChoice-Image-" + string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C4117w r5, com.inmobi.media.Cj r6, java.lang.String r7, int r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof com.inmobi.media.C4017s
            if (r0 == 0) goto L16
            r0 = r9
            com.inmobi.media.s r0 = (com.inmobi.media.C4017s) r0
            int r1 = r0.f39492c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39492c = r1
            goto L1b
        L16:
            com.inmobi.media.s r0 = new com.inmobi.media.s
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f39490a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39492c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r9)
            goto L47
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.d.b(r9)
            long r8 = (long) r8
            com.inmobi.media.v r2 = new com.inmobi.media.v
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.f39492c = r3
            java.lang.Object r9 = eg.x1.e(r8, r2, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L50
            boolean r5 = r9.booleanValue()
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4117w.a(com.inmobi.media.w, com.inmobi.media.Cj, java.lang.String, int, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C4181yd r10) {
        /*
            r9 = this;
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f39808b
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L18
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r0)
            if (r2 == 0) goto L12
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L16
            goto L18
        L16:
            r4 = r0
            goto L1f
        L18:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f39809c
            java.lang.String r0 = r0.getUrl()
            goto L16
        L1f:
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f39808b
            if (r0 == 0) goto L37
            int r0 = r0.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L37
            int r0 = r2.intValue()
        L35:
            r6 = r0
            goto L3e
        L37:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f39809c
            int r0 = r0.getWidth()
            goto L35
        L3e:
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f39808b
            if (r0 == 0) goto L55
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L4d
            r1 = r2
        L4d:
            if (r1 == 0) goto L55
            int r0 = r1.intValue()
        L53:
            r7 = r0
            goto L5c
        L55:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f39809c
            int r0 = r0.getHeight()
            goto L53
        L5c:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f39809c
            int r5 = r0.getLoadTimeout()
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r4)
            if (r0 != 0) goto L88
            com.inmobi.media.n9 r10 = r9.f39810d
            if (r10 == 0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid URL: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdChoiceViewManager"
            r10.b(r1, r0)
        L82:
            com.inmobi.media.dc r10 = new com.inmobi.media.dc
            r10.<init>()
            throw r10
        L88:
            eg.e1 r0 = eg.o0.c()
            com.inmobi.media.r r2 = new com.inmobi.media.r
            r8 = 0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = eg.g.g(r0, r2, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4117w.a(com.inmobi.media.yd):java.lang.Object");
    }
}
