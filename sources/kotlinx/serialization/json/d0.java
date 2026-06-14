package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f93669a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93670b = a.f93671b;

    private static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f93671b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f93672c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ SerialDescriptor f93673a = vg.a.k(vg.a.E(a1.f93282a), q.f93710a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean b() {
            return this.f93673a.b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f93673a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor d(int i10) {
            return this.f93673a.d(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return this.f93673a.e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i10) {
            return this.f93673a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List g(int i10) {
            return this.f93673a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List getAnnotations() {
            return this.f93673a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public wg.l getKind() {
            return this.f93673a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String h() {
            return f93672c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean i(int i10) {
            return this.f93673a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f93673a.isInline();
        }
    }

    private d0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        return new JsonObject((Map) vg.a.k(vg.a.E(a1.f93282a), q.f93710a).deserialize(decoder));
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonObject value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        vg.a.k(vg.a.E(a1.f93282a), q.f93710a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93670b;
    }
}
