package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ig0 extends lg0 {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("linear_progress_view", str);
    }
}
