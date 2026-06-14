package ze;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119353b;

    public k(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f119352a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i10 = 0; i10 < length; i10++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i10));
        }
        this.f119353b = lowerCase;
    }

    public final String a() {
        return this.f119352a;
    }

    public boolean equals(Object obj) {
        String str;
        k kVar = obj instanceof k ? (k) obj : null;
        return (kVar == null || (str = kVar.f119352a) == null || !StringsKt.N(str, this.f119352a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f119353b;
    }

    public String toString() {
        return this.f119352a;
    }
}
