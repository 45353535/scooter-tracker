package zg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
final class m0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JsonElement f119447h;

    public /* synthetic */ m0(kotlinx.serialization.json.b bVar, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, (i10 & 4) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zg.c
    public JsonElement l0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // zg.c
    public JsonElement z0() {
        return this.f119447h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlinx.serialization.json.b json, JsonElement value, String str) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119447h = value;
        c0("primitive");
    }
}
