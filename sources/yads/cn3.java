package yads;

import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cn3 implements AdError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109490a;

    public cn3(String str) {
        this.f109490a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn3) && Intrinsics.areEqual(this.f109490a, ((cn3) obj).f109490a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f109490a;
    }

    public final int hashCode() {
        return this.f109490a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description=" + this.f109490a + ")";
    }
}
