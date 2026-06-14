package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.y.a;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements a.InterfaceC0974a {
    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0974a
    public BytesValue a(c.a aVar) throws IOException {
        if (!(aVar instanceof c.a.C0949a)) {
            throw new IllegalStateException("Check failed.");
        }
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        FileInputStream fileInputStream = new FileInputStream(io.bidmachine.analytics.internal.a.e.b(((c.a.C0949a) aVar).a()));
        try {
            ByteString from = ByteString.readFrom(fileInputStream);
            uf.c.a(fileInputStream, null);
            return builderNewBuilder.setValue(from).build();
        } finally {
        }
    }
}
