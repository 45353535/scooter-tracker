package zg;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
class s0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JsonObject f119481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SerialDescriptor f119482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f119483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f119484k;

    public /* synthetic */ s0(kotlinx.serialization.json.b bVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean E0(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = (d().e().j() || serialDescriptor.i(i10) || !serialDescriptor.d(i10).b()) ? false : true;
        this.f119484k = z10;
        return z10;
    }

    public final JsonElement C0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) z0().get(tag);
    }

    @Override // zg.c
    /* JADX INFO: renamed from: D0 */
    public JsonObject z0() {
        return this.f119481h;
    }

    @Override // zg.c, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return !this.f119484k && super.E();
    }

    @Override // zg.c, kotlinx.serialization.encoding.Decoder
    public xg.d b(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.f119482i) {
            return super.b(descriptor);
        }
        kotlinx.serialization.json.b bVarD = d();
        JsonElement jsonElementM0 = m0();
        String strH = this.f119482i.h();
        if (jsonElementM0 instanceof JsonObject) {
            return new s0(bVarD, (JsonObject) jsonElementM0, y0(), this.f119482i);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + i0(), jsonElementM0.toString());
    }

    @Override // zg.c, xg.d
    public void c(SerialDescriptor descriptor) {
        Set setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (k0.m(descriptor, d()) || (descriptor.getKind() instanceof wg.d)) {
            return;
        }
        k0.n(descriptor, d());
        if (this.f119390g.o()) {
            Set setA = yg.y0.a(descriptor);
            Map map = (Map) kotlinx.serialization.json.f0.a(d()).a(descriptor, k0.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus(setA, (Iterable) setKeySet);
        } else {
            setPlus = yg.y0.a(descriptor);
        }
        for (String str : z0().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, y0())) {
                throw i0.e(-1, "Encountered an unknown key '" + str + "' at element: " + i0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) i0.j(z0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // yg.p1
    protected String f0(SerialDescriptor descriptor, int i10) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        k0.n(descriptor, d());
        String strF = descriptor.f(i10);
        if (!this.f119390g.o() || z0().keySet().contains(strF)) {
            return strF;
        }
        Map mapE = k0.e(d(), descriptor);
        Iterator<T> it = z0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zg.c
    public JsonElement l0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(z0(), tag);
    }

    @Override // xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f119483j < descriptor.e()) {
            int i10 = this.f119483j;
            this.f119483j = i10 + 1;
            String strZ = Z(descriptor, i10);
            int i11 = this.f119483j - 1;
            this.f119484k = false;
            if (z0().containsKey(strZ) || E0(descriptor, i11)) {
                if (this.f119390g.g()) {
                    kotlinx.serialization.json.b bVarD = d();
                    boolean zI = descriptor.i(i11);
                    SerialDescriptor serialDescriptorD = descriptor.d(i11);
                    if (!zI || serialDescriptorD.b() || !(C0(strZ) instanceof JsonNull)) {
                        if (Intrinsics.areEqual(serialDescriptorD.getKind(), l.b.f108007a)) {
                            if (serialDescriptorD.b() && (C0(strZ) instanceof JsonNull)) {
                                return i11;
                            }
                            JsonElement jsonElementC0 = C0(strZ);
                            JsonPrimitive jsonPrimitive = jsonElementC0 instanceof JsonPrimitive ? (JsonPrimitive) jsonElementC0 : null;
                            String strF = jsonPrimitive != null ? kotlinx.serialization.json.j.f(jsonPrimitive) : null;
                            if (strF == null) {
                                return i11;
                            }
                            int i12 = k0.i(serialDescriptorD, bVarD, strF);
                            boolean z10 = !bVarD.e().j() && serialDescriptorD.b();
                            if (i12 != -3 || ((!zI && !z10) || E0(descriptor, i11))) {
                            }
                        }
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kotlinx.serialization.json.b json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119481h = value;
        this.f119482i = serialDescriptor;
    }
}
