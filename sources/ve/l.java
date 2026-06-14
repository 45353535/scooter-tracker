package ve;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106687c;

    public l(String name, String value, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106685a = name;
        this.f106686b = value;
        this.f106687c = z10;
    }

    public final String a() {
        return this.f106685a;
    }

    public final String b() {
        return this.f106686b;
    }

    public final String c() {
        return this.f106685a;
    }

    public final String d() {
        return this.f106686b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return StringsKt.N(lVar.f106685a, this.f106685a, true) && StringsKt.N(lVar.f106686b, this.f106686b, true);
    }

    public int hashCode() {
        String str = this.f106685a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f106686b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f106685a + ", value=" + this.f106686b + ", escapeValue=" + this.f106687c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String name, String value) {
        this(name, value, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
