package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class UrlEscapers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Escaper f31064a = new PercentEscaper("-_.*", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Escaper f31065b = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Escaper f31066c = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    public static Escaper urlFormParameterEscaper() {
        return f31064a;
    }

    public static Escaper urlFragmentEscaper() {
        return f31066c;
    }

    public static Escaper urlPathSegmentEscaper() {
        return f31065b;
    }
}
