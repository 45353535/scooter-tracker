package com.mobilefuse.sdk.ad;

import com.mobilefuse.sdk.math.MathMf;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a)\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"UNSKIPPABLE", "", "resolveAdSkipOffset", "adSkipOffsetSec", "forceSkipSec", "blockSkipSec", "(Ljava/lang/Float;FF)F", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class AdSkipOffsetResolver {
    public static final float UNSKIPPABLE = -1.0f;

    public static final float resolveAdSkipOffset(@Nullable Float f10, float f11, float f12) {
        if (f10 != null) {
            f11 = MathMf.minPreferPositive(f10.floatValue(), f11);
        }
        return Math.max(f11, f12);
    }

    public static /* synthetic */ float resolveAdSkipOffset$default(Float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = -1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = -1.0f;
        }
        return resolveAdSkipOffset(f10, f11, f12);
    }
}
