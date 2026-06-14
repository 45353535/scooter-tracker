package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.p.a;
import io.bidmachine.analytics.internal.y.a;
import io.bidmachine.protobuf.sdk.OSLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.text.Charsets;
import uf.r;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements a.InterfaceC0974a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p.e f79994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p.a f79995b = new io.bidmachine.analytics.internal.p.a();

    public d(io.bidmachine.analytics.internal.p.e eVar) {
        this.f79994a = eVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0974a
    public BytesValue a(c.a aVar) throws IOException {
        if (!(aVar instanceof c.a.C0949a)) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamA = this.f79994a.a(((c.a.C0949a) aVar).a());
        if (inputStreamA != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA, Charsets.UTF_8), 8192);
            try {
                Iterator it = r.e(bufferedReader).iterator();
                while (it.hasNext()) {
                    a.b bVarA = this.f79995b.a((String) it.next());
                    if (bVarA != null) {
                        arrayList.add(OSLog.Record.newBuilder().setTimestamp(io.bidmachine.analytics.internal.a.c.a(bVarA.d())).setTag(bVarA.c()).setLevel(bVarA.a()).setMessage(bVarA.b()).setSource("").build());
                    }
                }
                Unit unit = Unit.f93236a;
                uf.c.a(bufferedReader, null);
            } finally {
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException("No records found");
        }
        return BytesValue.newBuilder().setValue(OSLog.newBuilder().addAllRecords(arrayList).build().toByteString()).build();
    }
}
