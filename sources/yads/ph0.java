package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ph0 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh0 f114674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f114675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(qh0 qh0Var, ArrayList arrayList) {
        super(2);
        this.f114674b = qh0Var;
        this.f114675c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        fh0 fh0Var = (fh0) obj2;
        this.f114674b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.f114675c.add(new eh0(fh0Var, str));
        }
        return Unit.f93236a;
    }
}
