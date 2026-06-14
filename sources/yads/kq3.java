package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kq3 implements NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f112807a;

    public kq3(k00 k00Var) {
        this.f112807a = k00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq3) && Intrinsics.areEqual(this.f112807a, ((kq3) obj).f112807a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f112807a.f112535g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f112807a.f112536h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f112807a.f112537i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        m00 m00Var = this.f112807a.f112531c;
        if (m00Var != null) {
            return new qq3(m00Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdMedia getMedia() {
        t00 t00Var = this.f112807a.f112529a;
        if (t00Var != null) {
            return new xq3(t00Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f112807a.f112539k;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f112807a.f112542n;
    }

    public final int hashCode() {
        return this.f112807a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f112807a + ")";
    }
}
