package ve;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {
    private static final void b(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!StringsKt.b1(str2, IOUtils.DIR_SEPARATOR_UNIX, false, 2, null)) {
            appendable.append(IOUtils.DIR_SEPARATOR_UNIX);
        }
        appendable.append(str2);
    }

    private static final void c(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        appendable.append(str);
        appendable.append(str2);
    }

    private static final void d(Appendable appendable, String str) throws IOException {
        appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        appendable.append(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Appendable e(m0 m0Var, Appendable appendable) throws IOException {
        appendable.append(m0Var.o().i());
        String strI = m0Var.o().i();
        switch (strI.hashCode()) {
            case -1081572750:
                if (strI.equals("mailto")) {
                    c(appendable, h(m0Var), m0Var.j());
                    return appendable;
                }
                break;
            case 114715:
                if (strI.equals(MRAIDNativeFeature.TEL)) {
                    d(appendable, m0Var.j());
                    return appendable;
                }
                break;
            case 3076010:
                if (strI.equals("data")) {
                    d(appendable, m0Var.j());
                    return appendable;
                }
                break;
            case 3143036:
                if (strI.equals(C4240b4.i.f42616b)) {
                    b(appendable, m0Var.j(), g(m0Var));
                    return appendable;
                }
                break;
            case 92611469:
                if (strI.equals("about")) {
                    d(appendable, m0Var.j());
                    return appendable;
                }
                break;
        }
        appendable.append("://");
        appendable.append(f(m0Var));
        w0.e(appendable, g(m0Var), m0Var.e(), m0Var.q());
        if (m0Var.d().length() > 0) {
            appendable.append('#');
            appendable.append(m0Var.d());
        }
        return appendable;
    }

    public static final String f(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h(m0Var));
        sb2.append(m0Var.j());
        if (m0Var.n() != 0 && m0Var.n() != m0Var.o().h()) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(String.valueOf(m0Var.n()));
        }
        return sb2.toString();
    }

    public static final String g(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        return i(m0Var.g());
    }

    public static final String h(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        w0.g(sb2, m0Var.h(), m0Var.f());
        return sb2.toString();
    }

    private static final String i(List list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) CollectionsKt.first(list)).length() == 0 ? "/" : (String) CollectionsKt.first(list) : CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void j(m0 m0Var, String value) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        m0Var.v(StringsKt.y0(value) ? CollectionsKt.emptyList() : Intrinsics.areEqual(value, "/") ? s0.e() : CollectionsKt.toMutableList((Collection) StringsKt.X0(value, new char[]{IOUtils.DIR_SEPARATOR_UNIX}, false, 0, 6, null)));
    }
}
