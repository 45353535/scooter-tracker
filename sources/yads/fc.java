package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f110685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(JSONObject jSONObject) {
        super(0);
        this.f110685b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return sc1.a("skuId", this.f110685b);
    }
}
