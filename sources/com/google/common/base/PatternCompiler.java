package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.RestrictedApi;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
interface PatternCompiler {
    @RestrictedApi(allowedOnPath = ".*/com/google/common/base/.*", explanation = "PatternCompiler is an implementation detail of com.google.common.base")
    CommonPattern compile(String str);

    @RestrictedApi(allowedOnPath = ".*/com/google/common/base/.*", explanation = "PatternCompiler is an implementation detail of com.google.common.base")
    boolean isPcreLike();
}
