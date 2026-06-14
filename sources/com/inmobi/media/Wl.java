package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wl extends AbstractC4124w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f37970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeVideo f37972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(Ec nativeAdUnitComponent, AbstractC3669e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.f37970c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.f36790b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.f37971d = media != null ? media.getType() : null;
        this.f37972e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f A[RETURN] */
    @Override // com.inmobi.media.AbstractC4124w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, java.util.ArrayList r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.inmobi.media.Vl
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Vl r0 = (com.inmobi.media.Vl) r0
            int r1 = r0.f37921c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37921c = r1
            goto L18
        L13:
            com.inmobi.media.Vl r0 = new com.inmobi.media.Vl
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f37919a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37921c
            java.lang.String r3 = "VideoExperienceLoader"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.d.b(r10)     // Catch: com.inmobi.media.C4064tl -> L2b
            goto L6c
        L2b:
            r8 = move-exception
            goto L6f
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.d.b(r10)
            com.inmobi.media.m9 r10 = r7.a()     // Catch: com.inmobi.media.C4064tl -> L2b
            if (r10 == 0) goto L5d
            int r2 = r9.size()     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.inmobi.media.C4064tl -> L2b
            r5.<init>()     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.String r6 = "parseVastTag - processing VAST tag with "
            r5.append(r6)     // Catch: com.inmobi.media.C4064tl -> L2b
            r5.append(r2)     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.String r2 = " error URLs"
            r5.append(r2)     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.String r2 = r5.toString()     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.n9 r10 = (com.inmobi.media.C3903n9) r10     // Catch: com.inmobi.media.C4064tl -> L2b
            r10.a(r3, r2)     // Catch: com.inmobi.media.C4064tl -> L2b
        L5d:
            com.inmobi.media.Il r10 = com.inmobi.media.Il.f37077a     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.Ec r2 = r7.f37970c     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.x r2 = r2.f36789a     // Catch: com.inmobi.media.C4064tl -> L2b
            r0.f37921c = r4     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.Object r10 = r10.a(r8, r2, r9, r0)     // Catch: com.inmobi.media.C4064tl -> L2b
            if (r10 != r1) goto L6c
            return r1
        L6c:
            com.inmobi.media.ql r10 = (com.inmobi.media.C3990ql) r10     // Catch: com.inmobi.media.C4064tl -> L2b
            return r10
        L6f:
            com.inmobi.media.m9 r9 = r7.a()
            if (r9 == 0) goto L8f
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "parseVastTag - VAST parse exception: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3903n9) r9
            r9.b(r3, r8)
        L8f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C3840kl r7, com.inmobi.media.C3966pm r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ul
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ul r0 = (com.inmobi.media.Ul) r0
            int r1 = r0.f37867d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37867d = r1
            goto L18
        L13:
            com.inmobi.media.Ul r0 = new com.inmobi.media.Ul
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f37865b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37867d
            java.lang.String r3 = "VideoExperienceLoader"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.inmobi.media.kl r7 = r0.f37864a
            kotlin.d.b(r9)     // Catch: java.lang.Exception -> L2d
            goto L5c
        L2d:
            r8 = move-exception
            goto L64
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.d.b(r9)
            com.inmobi.media.Ec r9 = r6.f37970c
            kotlin.Lazy r9 = r9.f36795g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3856lc) r9
            com.inmobi.media.m9 r2 = r6.a()     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto L51
            java.lang.String r5 = "onPrepareExperienceModelSuccess - loading video experience"
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3903n9) r2     // Catch: java.lang.Exception -> L2d
            r2.a(r3, r5)     // Catch: java.lang.Exception -> L2d
        L51:
            r0.f37864a = r7     // Catch: java.lang.Exception -> L2d
            r0.f37867d = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Exception -> L2d
            if (r9 != r1) goto L5c
            return r1
        L5c:
            com.inmobi.media.ads.nativeAd.MediaView r9 = (com.inmobi.media.ads.nativeAd.MediaView) r9     // Catch: java.lang.Exception -> L2d
            com.inmobi.media.A6 r8 = new com.inmobi.media.A6     // Catch: java.lang.Exception -> L2d
            r8.<init>(r9, r7)     // Catch: java.lang.Exception -> L2d
            return r8
        L64:
            com.inmobi.media.m9 r9 = r6.a()
            if (r9 == 0) goto L84
            java.lang.String r0 = r8.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPrepareExperienceModelSuccess - exception during media load: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3903n9) r9
            r9.b(r3, r0)
        L84:
            com.inmobi.media.C6 r7 = r6.a(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wl.a(com.inmobi.media.kl, com.inmobi.media.pm, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final C6 a(Exception exc, C3840kl c3840kl) {
        NativeVideo nativeVideo = this.f37972e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC3878m9 interfaceC3878m9A = a();
            if (interfaceC3878m9A != null) {
                ((C3903n9) interfaceC3878m9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new C4199z6((short) 2362);
        }
        return new B6(c3840kl);
    }
}
