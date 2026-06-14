package zg;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
final class w0 extends s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final JsonObject f119493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f119494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f119495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f119496o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlinx.serialization.json.b json, JsonObject value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119493l = value;
        List list = CollectionsKt.toList(z0().keySet());
        this.f119494m = list;
        this.f119495n = list.size() * 2;
        this.f119496o = -1;
    }

    @Override // zg.s0, zg.c
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public JsonObject z0() {
        return this.f119493l;
    }

    @Override // zg.s0, zg.c, xg.d
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // zg.s0, yg.p1
    protected String f0(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f119494m.get(i10 / 2);
    }

    @Override // zg.s0, zg.c
    protected JsonElement l0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f119496o % 2 == 0 ? kotlinx.serialization.json.j.c(tag) : (JsonElement) MapsKt.getValue(z0(), tag);
    }

    @Override // zg.s0, xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.f119496o;
        if (i10 >= this.f119495n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f119496o = i11;
        return i11;
    }
}
