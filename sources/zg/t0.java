package zg;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
class t0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f119485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f119485g = new LinkedHashMap();
    }

    @Override // yg.c3, xg.f
    public void h(SerialDescriptor descriptor, int i10, ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f119406d.j()) {
            super.h(descriptor, i10, serializer, obj);
        }
    }

    @Override // zg.e
    public JsonElement s0() {
        return new JsonObject(this.f119485g);
    }

    @Override // zg.e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f119485g.put(key, element);
    }

    protected final Map x0() {
        return this.f119485g;
    }
}
