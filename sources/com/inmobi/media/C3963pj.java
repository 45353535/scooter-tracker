package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3963pj extends AbstractC4124w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f39292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeImage f39294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3963pj(Ec nativeAdUnitComponent, AbstractC3669e1 adSessionManager) {
        NativeMedia media;
        NativeMedia media2;
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.f39292c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.f36790b.getAssetsObject();
        NativeImage image = null;
        this.f39293d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.f36790b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            image = media.getImage();
        }
        this.f39294e = image;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.AbstractC4124w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3963pj.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final C6 a(Exception exc) {
        NativeImage nativeImage = this.f39294e;
        if (nativeImage != null && nativeImage.getRequired()) {
            InterfaceC3878m9 interfaceC3878m9A = a();
            if (interfaceC3878m9A != null) {
                ((C3903n9) interfaceC3878m9A).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new C4199z6((short) 2362);
        }
        return new B6();
    }
}
