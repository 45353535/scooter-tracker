package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.y.a;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a.InterfaceC0974a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.o.b f79992a;

    public b(io.bidmachine.analytics.internal.o.b bVar) {
        this.f79992a = bVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0974a
    public BytesValue a(c.a aVar) throws io.bidmachine.analytics.internal.g.a {
        List listB = this.f79992a.b();
        if (listB == null) {
            throw new io.bidmachine.analytics.internal.g.a("List is null");
        }
        if (listB.isEmpty()) {
            throw new io.bidmachine.analytics.internal.g.a("List is empty");
        }
        if (listB.size() >= this.f79992a.a()) {
            return io.bidmachine.analytics.internal.a.c.b(io.bidmachine.analytics.internal.a.e.a(listB).toString());
        }
        throw new io.bidmachine.analytics.internal.g.a("List size less then limit for send");
    }
}
