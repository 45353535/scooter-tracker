package io.bidmachine.analytics.internal.o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.e;
import io.bidmachine.analytics.internal.n.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;
import pd.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.n.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0957a f79689j = new C0957a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f79690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f79691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f79692i = "aapp";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o.a$a, reason: collision with other inner class name */
    public static final class C0957a {
        public /* synthetic */ C0957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0957a() {
        }
    }

    public a(b bVar) {
        this.f79690g = bVar;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79692i;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
        this.f79691h = context;
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(a.C0956a c0956a) {
        super.b(c0956a);
        if (c0956a.c().size() != 1) {
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c0956a.c().size()).toString());
        }
        ReaderConfig.Rule rule = (ReaderConfig.Rule) CollectionsKt.first(c0956a.c());
        if (!(rule instanceof ReaderConfig.Rule.GeneralRule)) {
            throw new IllegalStateException("Check failed.");
        }
        b bVar = this.f79690g;
        Integer numM = g0.M(e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()), null, 1, null);
        bVar.a(numM != null ? numM.intValue() : 0);
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        Context context = this.f79691h;
        if (context != null) {
            Object objB = s.b(context.getPackageManager(), e.a("cXVlcnlJbnRlbnRBY3Rpdml0aWVz"), new Class[]{Intent.class, Integer.TYPE}, new Object[]{new Intent(e.a("YW5kcm9pZC5pbnRlbnQuYWN0aW9uLk1BSU4=")), kotlin.coroutines.jvm.internal.b.d(0)});
            Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type kotlin.collections.List<android.content.pm.ResolveInfo>");
            List list = (List) objB;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.distinct(arrayList));
            this.f79690g.a(arrayList2);
            return String.valueOf(arrayList2.hashCode());
        }
        throw new IllegalArgumentException("Context is null");
    }
}
