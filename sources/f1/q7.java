package f1;

import f1.z2;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class q7 implements ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f70813b;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Map f70814f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(1);
            this.f70814f = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "matchResult");
            String value = matchResult.getValue();
            String str = (String) this.f70814f.get(value);
            return str != null ? str : value;
        }
    }

    public q7(ag eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70813b = eventTracker;
    }

    public final String a(File htmlFile, Map allParams, String adTypeName, String location) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(allParams, "allParams");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            Regex regex = new Regex("\\{\\{\\s*([^}]+)\\s*\\}\\}|\\{%\\s*([^}]+)\\s*%\\}");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allParams.entrySet()) {
                String str = (String) entry.getKey();
                if (StringsKt.a0(str, "{{", false, 2, null) || StringsKt.a0(str, "{%", false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return b(regex.h(uf.i.l(htmlFile, Charsets.UTF_8), new a(linkedHashMap)));
        } catch (Exception e10) {
            eg.i("Failed to parse template", e10);
            c(adTypeName, location, e10.toString());
            return null;
        }
    }

    public final String b(String str) {
        if (!StringsKt.g0(str, "{{", false, 2, null)) {
            return str;
        }
        throw new IllegalArgumentException("Missing required template parameter " + str);
    }

    public final void c(String str, String str2, String str3) {
        e((y0) w3.f71435m.b(z2.i.f71752h, str3, str, str2));
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70813b.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70813b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70813b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70813b.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70813b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70813b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70813b.mo4436e(event);
    }
}
