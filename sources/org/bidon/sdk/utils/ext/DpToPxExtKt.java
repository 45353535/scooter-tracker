package org.bidon.sdk.utils.ext;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0004\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"dpToPx", "", "", "getDpToPx", "(Ljava/lang/Number;)I", "pxToDp", "getPxToDp", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DpToPxExtKt {
    public static final int getDpToPx(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return (int) TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final int getPxToDp(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return (int) (number.intValue() / Resources.getSystem().getDisplayMetrics().density);
    }
}
