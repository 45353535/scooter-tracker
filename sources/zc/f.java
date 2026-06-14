package zc;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f119342a;

    public f(Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        this.f119342a = shader;
    }

    @Override // zc.g
    public Shader a(boolean z10) {
        return this.f119342a;
    }
}
