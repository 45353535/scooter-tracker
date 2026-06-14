package ve;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {
    public static final m0 b(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return s0.l(new m0(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final m0 c(f1 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return k(new m0(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final f1 d(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return b(urlString).b();
    }

    public static final void e(Appendable appendable, String encodedPath, h0 encodedQueryParameters, boolean z10) {
        List listListOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.y0(encodedPath) && !StringsKt.a0(encodedPath, "/", false, 2, null)) {
            appendable.append(IOUtils.DIR_SEPARATOR_UNIX);
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z10) {
            appendable.append("?");
        }
        Set<Map.Entry> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntries) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt.listOf(TuplesKt.to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(TuplesKt.to(str, (String) it.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt.addAll(arrayList, listListOf);
        }
        CollectionsKt___CollectionsKt.joinTo(arrayList, appendable, (124 & 2) != 0 ? ", " : C4240b4.j.f42670c, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (124 & 64) != 0 ? null : new Function1() { // from class: ve.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.f((Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = (String) it.getFirst();
        if (it.getSecond() == null) {
            return str;
        }
        return str + D5.T + String.valueOf(it.getSecond());
    }

    public static final void g(StringBuilder sb2, String str, String str2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(':');
            sb2.append(str2);
        }
        sb2.append("@");
    }

    public static final String h(f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        return f1Var.getHost() + ':' + f1Var.x();
    }

    public static final String i(f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        int specifiedPort = f1Var.getSpecifiedPort();
        return (specifiedPort == 0 || specifiedPort == f1Var.getProtocol().h()) ? f1Var.getHost() : h(f1Var);
    }

    public static final m0 j(m0 m0Var, m0 url) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        m0Var.A(url.p());
        m0Var.x(url.j());
        m0Var.y(url.n());
        m0Var.v(url.g());
        m0Var.w(url.h());
        m0Var.u(url.f());
        h0 h0VarB = k0.b(0, 1, null);
        ze.b0.c(h0VarB, url.e());
        m0Var.t(h0VarB);
        m0Var.s(url.d());
        m0Var.B(url.q());
        return m0Var;
    }

    public static final m0 k(m0 m0Var, f1 url) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        m0Var.A(url.getProtocolOrNull());
        m0Var.x(url.getHost());
        m0Var.y(url.x());
        o0.j(m0Var, url.s());
        m0Var.w(url.u());
        m0Var.u(url.r());
        h0 h0VarB = k0.b(0, 1, null);
        h0VarB.d(l0.d(url.t(), 0, 0, false, 6, null));
        m0Var.t(h0VarB);
        m0Var.s(url.q());
        m0Var.B(url.getTrailingQuery());
        return m0Var;
    }
}
