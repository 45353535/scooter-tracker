package j1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f85465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String customPrivacyStandard, String customConsent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(customPrivacyStandard, "customPrivacyStandard");
        Intrinsics.checkNotNullParameter(customConsent, "customConsent");
        this.f85464e = customPrivacyStandard;
        this.f85465f = customConsent;
        g();
    }

    private final boolean i(String str) {
        int length = str.length();
        return 1 <= length && length < 100;
    }

    public final void g() {
        if (this.f85464e.length() == 0 || this.f85465f.length() == 0) {
            d("Invalid Custom privacy standard name. Values cannot be null");
            return;
        }
        if (h(this.f85464e)) {
            d("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
            return;
        }
        if (i(this.f85464e) && i(this.f85465f)) {
            f(this.f85464e);
            c(this.f85465f);
            return;
        }
        d("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + this.f85464e + " consent: " + this.f85465f);
    }

    public final boolean h(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.v1(str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        return Intrinsics.areEqual("gdpr", lowerCase);
    }

    @Override // j1.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String getConsent() {
        Object objB = b();
        Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type kotlin.String");
        return (String) objB;
    }
}
