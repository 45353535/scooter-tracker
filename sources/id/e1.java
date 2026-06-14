package id;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f74479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74480b;

    public e1(f1 targetSideType, String targetName) {
        Intrinsics.checkNotNullParameter(targetSideType, "targetSideType");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        this.f74479a = targetSideType;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = targetName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f74480b = lowerCase;
    }

    public final String a() {
        return this.f74480b;
    }

    public final f1 b() {
        return this.f74479a;
    }
}
