package zg;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f119490g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlinx.serialization.json.b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f119490g = new ArrayList();
    }

    @Override // zg.e, yg.q1
    protected String b0(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // zg.e
    public JsonElement s0() {
        return new JsonArray(this.f119490g);
    }

    @Override // zg.e
    public void w0(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f119490g.add(Integer.parseInt(key), element);
    }
}
