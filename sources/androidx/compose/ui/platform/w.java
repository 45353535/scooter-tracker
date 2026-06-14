package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static boolean a(OpenEndRange openEndRange, Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(openEndRange.getStart()) >= 0 && value.compareTo(openEndRange.getEndExclusive()) < 0;
    }

    public static boolean b(OpenEndRange openEndRange) {
        return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
    }
}
