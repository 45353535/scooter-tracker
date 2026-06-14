package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends IllegalArgumentException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String headerName, int i10) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i10) + "' (code " + (headerName.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        this.f106594b = headerName;
        this.f106595c = i10;
    }
}
