package zg;

import com.taurusx.tax.y.z.w.s;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends t0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f119497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f119498i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f119498i = true;
    }

    @Override // zg.t0, zg.e
    public JsonElement s0() {
        return new JsonObject(x0());
    }

    @Override // zg.t0, zg.e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.f119498i) {
            Map mapX0 = x0();
            String str = this.f119497h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(s.z.f67720z);
                str = null;
            }
            mapX0.put(str, element);
            this.f119498i = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.f119497h = ((JsonPrimitive) element).e();
            this.f119498i = false;
        } else {
            if (element instanceof JsonObject) {
                throw i0.d(kotlinx.serialization.json.d0.f93669a.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new lf.m();
            }
            throw i0.d(kotlinx.serialization.json.d.f93664a.getDescriptor());
        }
    }
}
