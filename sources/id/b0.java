package id;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f74378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f74379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74380c;

    public b0(e0 eventType, String source, List eventTaskParamsList) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
        this.f74378a = eventType;
        this.f74379b = eventTaskParamsList;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = source.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f74380c = lowerCase;
    }

    public final List a() {
        return this.f74379b;
    }

    public final e0 b() {
        return this.f74378a;
    }

    public final String c() {
        return this.f74380c;
    }
}
