package androidx.media3.exoplayer;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b2 implements Supplier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4973b;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f4973b.get());
    }
}
