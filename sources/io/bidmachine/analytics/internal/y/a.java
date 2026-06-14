package io.bidmachine.analytics.internal.y;

import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.analytics.internal.a.d;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.w.b;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.w.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f79988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Struct f79989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f79990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0974a f79991i;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.y.a$a, reason: collision with other inner class name */
    public interface InterfaceC0974a {
        BytesValue a(c.a aVar);
    }

    public /* synthetic */ a(String str, String str2, Struct struct, List list, InterfaceC0974a interfaceC0974a, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, struct, list, interfaceC0974a, (i10 & 32) != 0 ? d.f79505g.a() : dVar);
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public byte[] b() {
        Object next;
        Timestamp timestampA;
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Reader.Builder name = Reader.newBuilder().setName(this.f79988f);
            List<c> list = this.f79990h;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (c cVar : list) {
                Reader.Record.Builder rule = Reader.Record.newBuilder().setRule(a(cVar.e()));
                e eVarB = cVar.b();
                if (eVarB == null) {
                    try {
                        Result.Companion companion2 = Result.f93230c;
                        objB = Result.b(rule.setRawData(this.f79991i.a(cVar.e())));
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.f93230c;
                        objB = Result.b(kotlin.d.a(th2));
                    }
                    Throwable thG = Result.g(objB);
                    if (thG != null) {
                        eVarB = new e(this.f79988f, thG instanceof io.bidmachine.analytics.internal.g.a ? true : thG instanceof FileNotFoundException ? e.a.READER_NO_CONTENT : thG instanceof SecurityException ? e.a.READER_NO_ACCESS : e.a.READER_INVALID, io.bidmachine.analytics.internal.a.e.a(thG));
                    }
                }
                if (eVarB != null) {
                    rule.setError(Error.newBuilder().setName(eVarB.a()).setError(Error.Data.newBuilder().setCode(b.a(eVarB.c()).getNumber()).setDescription(eVarB.b()).build()).build());
                }
                arrayList.add(rule.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Reader.Record) it.next());
            }
            Iterator it2 = this.f79990h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long jF = ((c) next).f();
                    do {
                        Object next2 = it2.next();
                        long jF2 = ((c) next2).f();
                        if (jF < jF2) {
                            next = next2;
                            jF = jF2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            c cVar2 = (c) next;
            if (cVar2 != null && (timestampA = io.bidmachine.analytics.internal.a.c.a(cVar2.f())) != null) {
                name.setTimestamp(timestampA);
            }
            return Event.newBuilder().setReader(name.build()).setExtrasPrivate(this.f79989g).build().toByteArray();
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.f93230c;
            Result.b(kotlin.d.a(th3));
            return null;
        }
    }

    @Override // io.bidmachine.analytics.internal.w.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }

    private final Reader.Rule.Builder a(c.a aVar) {
        Reader.Rule.Builder builderNewBuilder = Reader.Rule.newBuilder();
        if (aVar instanceof c.a.C0949a) {
            c.a.C0949a c0949a = (c.a.C0949a) aVar;
            builderNewBuilder.setGeneralRule(Reader.Rule.GeneralRule.newBuilder().setTag(io.bidmachine.analytics.internal.a.c.c(c0949a.b())).setPath(io.bidmachine.analytics.internal.a.c.c(c0949a.a())).build());
            return builderNewBuilder;
        }
        if (aVar instanceof c.a.b) {
            c.a.b bVar = (c.a.b) aVar;
            Reader.Rule.PurRule.Builder shouldReport = Reader.Rule.PurRule.newBuilder().setTag(io.bidmachine.analytics.internal.a.c.c(bVar.d())).setPath(io.bidmachine.analytics.internal.a.c.c(bVar.a())).setShouldReport(io.bidmachine.analytics.internal.a.c.a(bVar.c()));
            String strB = bVar.b();
            if (strB != null) {
                shouldReport.setQuery(io.bidmachine.analytics.internal.a.c.c(strB));
            }
            builderNewBuilder.setPurRule(shouldReport.build());
        }
        return builderNewBuilder;
    }

    public a(String str, String str2, Struct struct, List list, InterfaceC0974a interfaceC0974a, d dVar) {
        super(io.bidmachine.analytics.internal.w.c.Post, str, dVar, null, 8, null);
        this.f79988f = str2;
        this.f79989g = struct;
        this.f79990h = list;
        this.f79991i = interfaceC0974a;
    }
}
