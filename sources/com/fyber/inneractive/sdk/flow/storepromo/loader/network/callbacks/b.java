package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b f20948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20950d;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar) {
        this.f20948b = bVar;
        this.f20949c = str;
        this.f20947a = gVar;
        this.f20950d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r7, java.lang.Exception r8, boolean r9) {
        /*
            r6 = this;
            r9 = 2
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L3b
            if (r8 != 0) goto L3b
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r8 = r6.f20947a
            com.fyber.inneractive.sdk.flow.storepromo.model.b r2 = r6.f20948b
            int r3 = r6.f20950d
            r8.getClass()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r2
            r9[r1] = r4
            java.lang.String r4 = "StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r9)
            com.fyber.inneractive.sdk.flow.storepromo.model.c r9 = r8.f20918d
            com.fyber.inneractive.sdk.flow.storepromo.model.a r4 = new com.fyber.inneractive.sdk.flow.storepromo.model.a
            r4.<init>(r7, r2, r3)
            java.util.ArrayList r7 = r9.f20957a
            r7.add(r4)
            com.fyber.inneractive.sdk.flow.storepromo.model.b r7 = com.fyber.inneractive.sdk.flow.storepromo.model.b.SCREENSHOT
            if (r2 != r7) goto L36
            int r7 = r9.f20965i
            int r7 = r7 + r1
            r9.f20965i = r7
        L36:
            r7 = 0
            r8.a(r7, r0, r7, r7)
            return
        L3b:
            boolean r7 = r8 instanceof com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a
            if (r7 == 0) goto L42
            com.fyber.inneractive.sdk.flow.storepromo.events.a r7 = com.fyber.inneractive.sdk.flow.storepromo.events.a.FILE_SIZE_EXCEEDS_LIMIT
            goto L44
        L42:
            com.fyber.inneractive.sdk.flow.storepromo.events.a r7 = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR
        L44:
            com.fyber.inneractive.sdk.flow.storepromo.model.b r2 = r6.f20948b
            if (r8 == 0) goto L58
            java.lang.String r3 = r8.getMessage()
            if (r3 == 0) goto L53
            java.lang.String r8 = r8.getMessage()
            goto L5a
        L53:
            java.lang.String r8 = r8.toString()
            goto L5a
        L58:
            java.lang.String r8 = ""
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable download store promo asset type: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", error: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r2 = r6.f20947a
            java.lang.String r3 = r6.f20949c
            com.fyber.inneractive.sdk.flow.storepromo.model.b r4 = r6.f20948b
            int[] r5 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.a.f20946a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r1) goto L94
            if (r4 == r9) goto L91
            r5 = 3
            if (r4 == r5) goto L8e
            r5 = 4
            if (r4 == r5) goto L8b
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.UNKNOWN_FAILURE
            goto L96
        L8b:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.RATING_ICON_FAILURE
            goto L96
        L8e:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.VIDEO_FAILURE
            goto L96
        L91:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE
            goto L96
        L94:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.APP_ICON_FAILURE
        L96:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r5 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE
            if (r4 != r5) goto La4
            int r4 = r2.f20920f
            int r5 = r2.f20921g
            int r5 = r5 + r1
            r2.f20921g = r5
            int r4 = r4 - r5
            if (r4 >= r9) goto La5
        La4:
            r0 = r1
        La5:
            r2.a(r7, r0, r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b.a(java.lang.Object, java.lang.Exception, boolean):void");
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar, int i10) {
        this.f20948b = bVar;
        this.f20949c = str;
        this.f20947a = gVar;
        this.f20950d = i10;
    }
}
