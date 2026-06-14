package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends IllegalArgumentException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String headerValue, int i10) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i10) + "' (code " + (headerValue.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        this.f106604b = headerValue;
        this.f106605c = i10;
    }
}
