package hh;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f73725a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + vh.h.f106840e.c(username + ':' + password, charset).d();
    }
}
