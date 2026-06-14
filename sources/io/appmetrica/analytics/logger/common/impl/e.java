package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f78755a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i10, int i11) {
        if (i11 >= i10) {
            int i12 = ((i11 - i10) / 2) + i10;
            matcher.region(i12, i11);
            if (matcher.find()) {
                int iStart = matcher.start();
                int iA = a(matcher, iStart + 1, i11);
                return iA == -1 ? iStart : iA;
            }
            matcher.region(i10, i12);
            if (matcher.find()) {
                int iStart2 = matcher.start();
                int iA2 = a(matcher, iStart2 + 1, i12);
                return iA2 == -1 ? iStart2 : iA2;
            }
        }
        return -1;
    }
}
