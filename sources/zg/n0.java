package zg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
final class n0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JsonElement f119450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        Z("primitive");
    }

    @Override // zg.e
    public JsonElement s0() {
        JsonElement jsonElement = this.f119450g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // zg.e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f119450g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f119450g = element;
        t0().invoke(element);
    }
}
