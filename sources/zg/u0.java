package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JsonArray f119486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f119487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f119488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlinx.serialization.json.b json, JsonArray value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119486h = value;
        this.f119487i = z0().size();
        this.f119488j = -1;
    }

    @Override // zg.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public JsonArray z0() {
        return this.f119486h;
    }

    @Override // yg.p1
    protected String f0(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zg.c
    public JsonElement l0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return z0().get(Integer.parseInt(tag));
    }

    @Override // xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.f119488j;
        if (i10 >= this.f119487i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f119488j = i11;
        return i11;
    }
}
