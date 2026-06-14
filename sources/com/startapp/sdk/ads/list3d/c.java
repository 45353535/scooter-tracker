package com.startapp.sdk.ads.list3d;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f63830a;

    public c(List3DView list3DView) {
        this.f63830a = list3DView;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r8
  0x0049: PHI (r8v1 float) = (r8v0 float), (r8v7 float) binds: [B:13:0x0040, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            com.startapp.sdk.ads.list3d.List3DView r0 = r10.f63830a
            com.startapp.sdk.internal.u6 r1 = r0.f63815l
            if (r1 != 0) goto L8
            goto L99
        L8:
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L6c
            com.startapp.sdk.ads.list3d.List3DView r2 = r10.f63830a
            r2.getClass()
            int r0 = com.startapp.sdk.ads.list3d.List3DView.a(r0)
            com.startapp.sdk.ads.list3d.List3DView r3 = r10.f63830a
            int r4 = r3.f63810g
            int r0 = r0 - r4
            r2.f63808e = r0
            com.startapp.sdk.internal.u6 r0 = r3.f63815l
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r0.f65337e
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L5d
            long r4 = r2 - r4
            int r4 = (int) r4
            r5 = 50
            if (r4 <= r5) goto L35
            r4 = r5
        L35:
            r5 = r0
            com.startapp.sdk.internal.ug r5 = (com.startapp.sdk.internal.ug) r5
            float r6 = r5.f65334b
            float r7 = r5.f65333a
            float r8 = r5.f65335c
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L43
            goto L49
        L43:
            float r8 = r5.f65336d
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 >= 0) goto L4b
        L49:
            float r8 = r8 - r7
            goto L4c
        L4b:
            r8 = 0
        L4c:
            float r9 = r5.f65351g
            float r8 = r8 * r9
            float r8 = r8 + r6
            float r4 = (float) r4
            float r4 = r4 * r8
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r6
            float r4 = r4 + r7
            r5.f65333a = r4
            float r4 = r5.f65350f
            float r8 = r8 * r4
            r5.f65334b = r8
        L5d:
            r0.f65337e = r2
            com.startapp.sdk.ads.list3d.List3DView r0 = r10.f63830a
            com.startapp.sdk.internal.u6 r2 = r0.f63815l
            float r2 = r2.f65333a
            int r2 = (int) r2
            int r3 = r0.f63808e
            int r2 = r2 - r3
            r0.b(r2)
        L6c:
            com.startapp.sdk.ads.list3d.List3DView r0 = r10.f63830a
            com.startapp.sdk.internal.u6 r0 = r0.f63815l
            float r2 = r0.f65334b
            float r2 = java.lang.Math.abs(r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 1
            if (r2 >= 0) goto L7f
            r2 = r3
            goto L80
        L7f:
            r2 = r1
        L80:
            float r4 = r0.f65333a
            r5 = 1053609165(0x3ecccccd, float:0.4)
            float r6 = r4 - r5
            float r7 = r0.f65335c
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L95
            float r4 = r4 + r5
            float r0 = r0.f65336d
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L95
            r1 = r3
        L95:
            if (r2 == 0) goto L9a
            if (r1 == 0) goto L9a
        L99:
            return
        L9a:
            com.startapp.sdk.ads.list3d.List3DView r0 = r10.f63830a
            r1 = 16
            r0.postDelayed(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.c.run():void");
    }
}
