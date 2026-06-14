package jf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f85853h;

    public b(int i10, int i11) {
        super(i10);
        this.f85853h = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jf.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ByteBuffer c(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jf.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ByteBuffer n() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f85853h);
        Intrinsics.checkNotNull(byteBufferAllocate);
        return byteBufferAllocate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jf.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void s(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.f85853h) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
