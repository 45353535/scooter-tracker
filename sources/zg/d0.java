package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends xg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f119393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ah.b f119394c;

    public d0(a lexer, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f119393b = lexer;
        this.f119394c = json.a();
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public byte H() {
        a aVar = this.f119393b;
        String strS = aVar.s();
        try {
            return kotlin.text.c0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, xg.d
    public ah.b a() {
        return this.f119394c;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public long h() {
        a aVar = this.f119393b;
        String strS = aVar.s();
        try {
            return kotlin.text.c0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public short m() {
        a aVar = this.f119393b;
        String strS = aVar.s();
        try {
            return kotlin.text.c0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public int v() {
        a aVar = this.f119393b;
        String strS = aVar.s();
        try {
            return kotlin.text.c0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }

    @Override // xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
