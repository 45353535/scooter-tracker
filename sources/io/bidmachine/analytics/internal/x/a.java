package io.bidmachine.analytics.internal.x;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.internal.a.c;
import io.bidmachine.analytics.internal.a.d;
import io.bidmachine.analytics.internal.g.b;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.w.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f79985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Struct f79986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f79987h;

    public /* synthetic */ a(String str, String str2, Struct struct, List list, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, struct, list, (i10 & 16) != 0 ? d.f79505g.a() : dVar);
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public byte[] b() {
        try {
            Result.Companion companion = Result.f93230c;
            Monitor.Builder name = Monitor.newBuilder().setName(this.f79985f);
            List<b> list = this.f79987h;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (b bVar : list) {
                Monitor.Record.Builder timestamp = Monitor.Record.newBuilder().setFields(c.a(bVar.a())).setTimestamp(c.a(bVar.f()));
                e eVarB = bVar.b();
                if (eVarB != null) {
                    timestamp.setError(Error.newBuilder().setName(eVarB.a()).setError(Error.Data.newBuilder().setCode(io.bidmachine.analytics.internal.w.b.a(eVarB.c()).getNumber()).setDescription(eVarB.b()).build()).build());
                }
                arrayList.add(timestamp.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Monitor.Record) it.next());
            }
            return Event.newBuilder().setMonitor(name.build()).setExtrasPrivate(this.f79986g).build().toByteArray();
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
            return null;
        }
    }

    @Override // io.bidmachine.analytics.internal.w.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }

    public a(String str, String str2, Struct struct, List list, d dVar) {
        super(io.bidmachine.analytics.internal.w.c.Post, str, dVar, null, 8, null);
        this.f79985f = str2;
        this.f79986g = struct;
        this.f79987h = list;
    }
}
