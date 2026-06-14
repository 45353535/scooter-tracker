package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak2 f115712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ck2 f115713b;

    public /* synthetic */ s62() {
        this(new ak2(), ck2.f109432b.a());
    }

    public final r62 a(km2 km2Var) {
        String str;
        ck2 ck2Var = this.f115713b;
        ck2Var.getClass();
        synchronized (ck2.f109433c) {
            str = (String) ck2Var.f109435a.get(km2Var);
            ck2Var.f109435a.remove(km2Var);
        }
        if (str == null) {
            return null;
        }
        try {
            this.f115712a.getClass();
            yj2 yj2VarA = ak2.a(str);
            byte[] bytes = yj2VarA.f118246b.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Map map = yj2VarA.f118245a;
            return new r62(200, bytes, map, r62.a(map), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public s62(ak2 ak2Var, ck2 ck2Var) {
        this.f115712a = ak2Var;
        this.f115713b = ck2Var;
    }
}
