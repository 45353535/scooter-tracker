package com.startapp.sdk.ads.banner.banner3d;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f63698a;

    public a(Banner3D banner3D) {
        this.f63698a = banner3D;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r1 = r0.loaded
            if (r1 == 0) goto Lc4
            java.util.List<com.startapp.sdk.internal.d1> r0 = r0.faces
            int r0 = r0.size()
            if (r0 != 0) goto L10
            goto Lc4
        L10:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r1 = r0.visible
            r2 = 1
            if (r1 == 0) goto L43
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L43
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.access$000(r0)
            if (r0 == 0) goto L43
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            java.util.List<com.startapp.sdk.internal.d1> r1 = r0.faces
            int r0 = r0.getCurrentBannerIndex()
            java.lang.Object r0 = r1.get(r0)
            com.startapp.sdk.internal.d1 r0 = (com.startapp.sdk.internal.d1) r0
            com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = r5.f63698a
            com.startapp.sdk.ads.banner.banner3d.Banner3D.access$100(r1, r0)
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r1 = r0.addedDisplayEvent
            if (r1 != 0) goto L43
            r0.addedDisplayEvent = r2
            com.startapp.sdk.ads.banner.banner3d.Banner3D.access$200(r0)
        L43:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r1 = r0.rotationEnabled
            if (r1 == 0) goto L64
            com.startapp.sdk.ads.banner.BannerOptions r1 = r0.getBannerOptions()
            int r1 = r1.m()
            com.startapp.sdk.ads.banner.banner3d.Banner3D r3 = r5.f63698a
            boolean r4 = r3.firstRotationFinished
            if (r4 != 0) goto L5e
            com.startapp.sdk.ads.banner.BannerOptions r3 = r3.options
            int r3 = r3.k()
            goto L5f
        L5e:
            r3 = r2
        L5f:
            int r1 = r1 * r3
            float r1 = (float) r1
            r0.rotate(r1)
        L64:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            float r1 = r0.rotation
            com.startapp.sdk.ads.banner.BannerOptions r0 = r0.getBannerOptions()
            int r0 = r0.m()
            int r0 = 90 - r0
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto La6
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            float r3 = r0.rotation
            com.startapp.sdk.ads.banner.BannerOptions r0 = r0.getBannerOptions()
            int r0 = r0.m()
            int r0 = r0 + 90
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La6
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            boolean r3 = r0.firstRotation
            if (r3 != 0) goto La6
            boolean r2 = r0.attachedToWindow
            if (r2 == 0) goto La1
            com.startapp.sdk.ads.banner.BannerOptions r2 = r0.getBannerOptions()
            int r2 = r2.b()
            long r2 = (long) r2
            r0.postDelayed(r5, r2)
        La1:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            r0.rotating = r1
            goto Lb8
        La6:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            com.startapp.sdk.ads.banner.BannerOptions r3 = r0.getBannerOptions()
            int r3 = r3.n()
            long r3 = (long) r3
            r0.postDelayed(r5, r3)
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            r0.rotating = r2
        Lb8:
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            int r0 = r0.getNextBannerIndex()
            if (r0 != 0) goto Lc4
            com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = r5.f63698a
            r0.firstRotation = r1
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.a.run():void");
    }
}
