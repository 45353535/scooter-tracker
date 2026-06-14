package com.google.common.html;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HtmlEscapers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Escaper f30835a = Escapers.builder().addEscape('\"', "&quot;").addEscape('\'', "&#39;").addEscape('&', "&amp;").addEscape('<', "&lt;").addEscape('>', "&gt;").build();

    public static Escaper htmlEscaper() {
        return f30835a;
    }
}
