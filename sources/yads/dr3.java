package yads;

import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dr3 implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f110042a;

    public dr3(ko2 ko2Var) {
        this.f110042a = ko2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dr3) && Intrinsics.areEqual(((dr3) obj).f110042a, this.f110042a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return ((tt2) this.f110042a).f116381a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return ((tt2) this.f110042a).f116382b;
    }

    public final int hashCode() {
        return this.f110042a.hashCode();
    }
}
