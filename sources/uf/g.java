package uf;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f105621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f105622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f105623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(File file, File file2, String str) {
        super(d.b(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
        this.f105621b = file;
        this.f105622c = file2;
        this.f105623d = str;
    }
}
