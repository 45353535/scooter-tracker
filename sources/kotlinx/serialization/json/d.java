package kotlinx.serialization.json;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f93664a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93665b = a.f93666b;

    private static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f93666b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f93667c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ SerialDescriptor f93668a = vg.a.h(q.f93710a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean b() {
            return this.f93668a.b();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f93668a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor d(int i10) {
            return this.f93668a.d(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return this.f93668a.e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i10) {
            return this.f93668a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List g(int i10) {
            return this.f93668a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List getAnnotations() {
            return this.f93668a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public wg.l getKind() {
            return this.f93668a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String h() {
            return f93667c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean i(int i10) {
            return this.f93668a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.f93668a.isInline();
        }
    }

    private d() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonArray deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        return new JsonArray((List) vg.a.h(q.f93710a).deserialize(decoder));
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonArray value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        vg.a.h(q.f93710a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93665b;
    }
}
