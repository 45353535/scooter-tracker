package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class f1 extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient se.c f96770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(se.c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f96770b = response;
    }
}
