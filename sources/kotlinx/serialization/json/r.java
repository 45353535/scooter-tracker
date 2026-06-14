package kotlinx.serialization.json;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    public static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f93712a;

        a(Function0 function0) {
            this.f93712a = lf.i.a(function0);
        }

        private final SerialDescriptor a() {
            return (SerialDescriptor) this.f93712a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public /* synthetic */ boolean b() {
            return wg.f.c(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return a().c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor d(int i10) {
            return a().d(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int e() {
            return a().e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String f(int i10) {
            return a().f(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List g(int i10) {
            return a().g(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public /* synthetic */ List getAnnotations() {
            return wg.f.a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public wg.l getKind() {
            return a().getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String h() {
            return a().h();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean i(int i10) {
            return a().i(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public /* synthetic */ boolean isInline() {
            return wg.f.b(this);
        }
    }

    public static final h d(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + v0.b(decoder.getClass()));
    }

    public static final s e(Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        s sVar = encoder instanceof s ? (s) encoder : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + v0.b(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor f(Function0 function0) {
        return new a(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Decoder decoder) {
        d(decoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Encoder encoder) {
        e(encoder);
    }
}
