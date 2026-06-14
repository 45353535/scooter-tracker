package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public interface tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f116269a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    rk a(rk rkVar);

    void a(ByteBuffer byteBuffer);

    void b();

    boolean c();

    void d();

    void flush();

    boolean isActive();
}
