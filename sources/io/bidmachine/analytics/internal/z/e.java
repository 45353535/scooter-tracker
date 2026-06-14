package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.q.g;
import io.bidmachine.analytics.internal.y.a;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements a.InterfaceC0974a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f79996a;

    public e(g gVar) {
        this.f79996a = gVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0974a
    public BytesValue a(c.a aVar) throws FileNotFoundException {
        io.bidmachine.analytics.internal.q.a aVarA = this.f79996a.a();
        if (aVarA == null) {
            throw new FileNotFoundException("No data received yet");
        }
        if (aVarA.f()) {
            throw new FileNotFoundException("Empty data");
        }
        return BytesValue.newBuilder().setValue(ByteString.readFrom(new ByteArrayInputStream(aVarA.toString().getBytes(Charsets.UTF_8)))).build();
    }
}
