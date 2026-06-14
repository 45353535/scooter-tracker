package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class PatternFilenameFilter implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f30951a;

    public PatternFilenameFilter(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f30951a.matcher(str).matches();
    }

    public PatternFilenameFilter(Pattern pattern) {
        this.f30951a = (Pattern) Preconditions.checkNotNull(pattern);
    }
}
