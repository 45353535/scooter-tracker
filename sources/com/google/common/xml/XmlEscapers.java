package com.google.common.xml;

import com.applovin.shadow.okio.Utf8;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class XmlEscapers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Escaper f31670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Escaper f31671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Escaper f31672c;

    static {
        Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange((char) 0, Utf8.REPLACEMENT_CHARACTER);
        builder.setUnsafeReplacement("�");
        for (char c10 = 0; c10 <= 31; c10 = (char) (c10 + 1)) {
            if (c10 != '\t' && c10 != '\n' && c10 != '\r') {
                builder.addEscape(c10, "�");
            }
        }
        builder.addEscape('&', "&amp;");
        builder.addEscape('<', "&lt;");
        builder.addEscape('>', "&gt;");
        f31671b = builder.build();
        builder.addEscape('\'', "&apos;");
        builder.addEscape('\"', "&quot;");
        f31670a = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        f31672c = builder.build();
    }

    public static Escaper xmlAttributeEscaper() {
        return f31672c;
    }

    public static Escaper xmlContentEscaper() {
        return f31671b;
    }
}
