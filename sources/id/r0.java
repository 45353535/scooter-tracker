package id;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74612a;

    public r0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f74612a = lowerCase;
    }

    public final String a() {
        return this.f74612a;
    }
}
