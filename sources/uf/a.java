package uf;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {
    public /* synthetic */ a(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(File file, File file2, String str) {
        super(file, file2, str);
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
