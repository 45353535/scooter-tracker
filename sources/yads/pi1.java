package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface pi1 {
    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    void a(int i10);

    void a(int i10, int i11, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, y10 y10Var, long j10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(oi1 oi1Var, Handler handler);

    void a(boolean z10, int i10);

    int b();

    ByteBuffer b(int i10);

    ByteBuffer c(int i10);

    void flush();

    void release();
}
