package com.google.gson;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle("", "", false);
    public static final FormattingStyle PRETTY = new FormattingStyle(IOUtils.LINE_SEPARATOR_UNIX, "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33521c;

    private FormattingStyle(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f33519a = str;
        this.f33520b = str2;
        this.f33521c = z10;
    }

    public String getIndent() {
        return this.f33520b;
    }

    public String getNewline() {
        return this.f33519a;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.f33521c;
    }

    public FormattingStyle withIndent(String str) {
        return new FormattingStyle(this.f33519a, str, this.f33521c);
    }

    public FormattingStyle withNewline(String str) {
        return new FormattingStyle(str, this.f33520b, this.f33521c);
    }

    public FormattingStyle withSpaceAfterSeparators(boolean z10) {
        return new FormattingStyle(this.f33519a, this.f33520b, z10);
    }
}
