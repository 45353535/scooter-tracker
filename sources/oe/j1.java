package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f96790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(se.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f96790c = "Server error(" + response.p().d().getMethod().f() + ' ' + response.p().d().getUrl() + ": " + response.d() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f96790c;
    }
}
