package yads;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ro3 implements ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5 f115538a;

    public ro3(i5 i5Var) {
        this.f115538a = i5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ro3) && Intrinsics.areEqual(((ro3) obj).f115538a, this.f115538a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f115538a.f111860b;
    }

    public final int hashCode() {
        return this.f115538a.f111860b.hashCode();
    }
}
