package yads;

import android.net.Uri;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class lh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg0 f113092a;

    public /* synthetic */ lh0() {
        this(new sg0());
    }

    public final kh0 a(k8.f7 f7Var) {
        Object objB;
        this.f113092a.getClass();
        k8.rb rbVarA = sg0.a(f7Var, "click");
        if (rbVarA == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = rbVarA.f90671b;
            objB = Result.b(Uri.parse(jSONObject != null ? jSONObject.getString("url") : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Uri uri = (Uri) objB;
        if (uri != null) {
            return new kh0(uri);
        }
        return null;
    }

    public lh0(sg0 sg0Var) {
        this.f113092a = sg0Var;
    }
}
