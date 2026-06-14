package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends xg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f119054a = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ah.b f119055b = ah.c.a();

    private r1() {
    }

    @Override // xg.b
    public void J(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public ah.b a() {
        return f119055b;
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void f(SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void B() {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void A(long j10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void D(char c10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
    }
}
