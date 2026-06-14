package com.inmobi.media;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4196z3 {
    public static final int a(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length != 4 ? ViewCompat.MEASURED_STATE_MASK : Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
