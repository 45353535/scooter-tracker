package com.yandex.mobile.ads.nativeads;

import kotlin.jvm.internal.Intrinsics;
import yads.jz1;
import yads.kq3;
import yads.lm;
import yads.pq3;
import yads.wy1;
import yads.xn2;
import yads.yq3;

/* JADX INFO: loaded from: classes12.dex */
public class d implements NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz1 f68289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f68290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yq3 f68291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm f68292d;

    public /* synthetic */ d(jz1 jz1Var) {
        this(jz1Var, new f(), new yq3(), new lm());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        try {
            this.f68290b.getClass();
            this.f68289a.a(f.a(nativeAdViewBinder));
        } catch (wy1 e10) {
            throw new NativeAdException(e10.f117647b, e10);
        } catch (Throwable th2) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && Intrinsics.areEqual(((d) obj).f68289a, this.f68289a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new kq3(this.f68289a.getAdAssets());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdType getAdType() {
        yq3 yq3Var = this.f68291c;
        xn2 adType = this.f68289a.getAdType();
        yq3Var.getClass();
        int iOrdinal = adType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? NativeAdType.CONTENT : NativeAdType.CONTENT : NativeAdType.MEDIA : NativeAdType.APP_INSTALL : NativeAdType.CONTENT;
    }

    public int hashCode() {
        return this.f68289a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f68289a.a(nativeAdEventListener != null ? new pq3(nativeAdEventListener) : null);
    }

    public d(jz1 jz1Var, f fVar, yq3 yq3Var, lm lmVar) {
        this.f68289a = jz1Var;
        this.f68290b = fVar;
        this.f68291c = yq3Var;
        this.f68292d = lmVar;
    }
}
