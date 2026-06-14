package com.appodeal.ads;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class s1 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
