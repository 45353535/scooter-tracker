package yads;

import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xq3 implements NativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t00 f117931a;

    public xq3(t00 t00Var) {
        this.f117931a = t00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq3) && Intrinsics.areEqual(this.f117931a, ((xq3) obj).f117931a);
    }

    public final int hashCode() {
        return this.f117931a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdMediaAdapter(media=" + this.f117931a + ")";
    }
}
