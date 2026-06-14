package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class Struct {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f4573bb;
    protected int bb_pos;

    protected void __reset(int i10, ByteBuffer byteBuffer) {
        this.f4573bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i10;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
