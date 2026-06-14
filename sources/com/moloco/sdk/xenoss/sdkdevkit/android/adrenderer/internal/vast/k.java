package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f57422i = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f57423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o f57424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m f57425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f57426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f57427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.c f57428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y f57429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f57430h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f57431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f57432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f57433c;

        public a(List impressions, List errorUrls, List creativesPerWrapper) {
            Intrinsics.checkNotNullParameter(impressions, "impressions");
            Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            this.f57431a = impressions;
            this.f57432b = errorUrls;
            this.f57433c = creativesPerWrapper;
        }

        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.f57431a;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.f57432b;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.f57433c;
            }
            return aVar.b(list, list2, list3);
        }

        public final a b(List impressions, List errorUrls, List creativesPerWrapper) {
            Intrinsics.checkNotNullParameter(impressions, "impressions");
            Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            return new a(impressions, errorUrls, creativesPerWrapper);
        }

        public final List c() {
            return this.f57433c;
        }

        public final List d() {
            return this.f57432b;
        }

        public final List e() {
            return this.f57431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f57431a, aVar.f57431a) && Intrinsics.areEqual(this.f57432b, aVar.f57432b) && Intrinsics.areEqual(this.f57433c, aVar.f57433c);
        }

        public int hashCode() {
            return (((this.f57431a.hashCode() * 31) + this.f57432b.hashCode()) * 31) + this.f57433c.hashCode();
        }

        public String toString() {
            return "AggregatedWrapperChainAdData(impressions=" + this.f57431a + ", errorUrls=" + this.f57432b + ", creativesPerWrapper=" + this.f57433c + ')';
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f57434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a f57435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f57436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f57437d;

        public b(List linearTrackingList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar, List iconsPerWrapper, List companionsPerWrapper) {
            Intrinsics.checkNotNullParameter(linearTrackingList, "linearTrackingList");
            Intrinsics.checkNotNullParameter(iconsPerWrapper, "iconsPerWrapper");
            Intrinsics.checkNotNullParameter(companionsPerWrapper, "companionsPerWrapper");
            this.f57434a = linearTrackingList;
            this.f57435b = aVar;
            this.f57436c = iconsPerWrapper;
            this.f57437d = companionsPerWrapper;
        }

        public final List a() {
            return this.f57437d;
        }

        public final List b() {
            return this.f57436c;
        }

        public final List c() {
            return this.f57434a;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a d() {
            return this.f57435b;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h b(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVarA = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) obj).a();
                Object arrayList = linkedHashMap.get(xVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(xVarA, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(e(aVar), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57633b), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57634c), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57635d), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57636e), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57637f), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57638g), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57639h), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57640i), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57641j), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57643l), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57642k), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57645n), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57644m), h(linkedHashMap));
        }

        public final List e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            List listB;
            if (aVar == null || (listB = aVar.b()) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((b0) it.next()).a());
            }
            return arrayList;
        }

        public final List f(List list, Object obj) {
            List listG;
            return (obj == null || (listG = k.f57422i.g(list, CollectionsKt.listOf(obj))) == null) ? list == null ? CollectionsKt.emptyList() : list : listG;
        }

        public final List g(List list, List list2) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                CollectionsKt.addAll(arrayList, list);
            }
            if (list2 != null) {
                CollectionsKt.addAll(arrayList, list2);
            }
            return arrayList;
        }

        public final List h(Map map) {
            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> list = (List) map.get(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57646o);
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar : list) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar = wVar.b() == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g(wVar.c(), wVar.b());
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            return arrayList;
        }

        public final List i(Map map, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar) {
            List list = (List) map.get(xVar);
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) it.next()).c());
            }
            return arrayList;
        }

        public final Set k(Set set, Object obj) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                CollectionsKt.addAll(linkedHashSet, set);
            }
            if (obj != null) {
                linkedHashSet.add(obj);
            }
            return linkedHashSet;
        }

        public final boolean q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar) {
            String strA = gVar.a();
            return !(strA == null || StringsKt.y0(strA));
        }

        public final boolean r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar) {
            String strA = iVar.a();
            return !(strA == null || StringsKt.y0(strA));
        }

        public final boolean s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar) {
            String strA = nVar.a();
            return !(strA == null || StringsKt.y0(strA));
        }

        public final boolean t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar) {
            String strA = sVar.a();
            return !(strA == null || StringsKt.y0(strA));
        }

        public final boolean u(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Intrinsics.areEqual(lowerCase, "video/mp4") || Intrinsics.areEqual(lowerCase, "video/3gpp") || Intrinsics.areEqual(lowerCase, "video/webm");
        }

        public c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f57439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f57441d;

        public d(int i10, Set usedVastAdTagUrls, boolean z10, a aggregatedWrapperChainData) {
            Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            this.f57438a = i10;
            this.f57439b = usedVastAdTagUrls;
            this.f57440c = z10;
            this.f57441d = aggregatedWrapperChainData;
        }

        public static /* synthetic */ d b(d dVar, int i10, Set set, boolean z10, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = dVar.f57438a;
            }
            if ((i11 & 2) != 0) {
                set = dVar.f57439b;
            }
            if ((i11 & 4) != 0) {
                z10 = dVar.f57440c;
            }
            if ((i11 & 8) != 0) {
                aVar = dVar.f57441d;
            }
            return dVar.a(i10, set, z10, aVar);
        }

        public final d a(int i10, Set usedVastAdTagUrls, boolean z10, a aggregatedWrapperChainData) {
            Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            return new d(i10, usedVastAdTagUrls, z10, aggregatedWrapperChainData);
        }

        public final a c() {
            return this.f57441d;
        }

        public final boolean d() {
            return this.f57440c;
        }

        public final Set e() {
            return this.f57439b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f57438a == dVar.f57438a && Intrinsics.areEqual(this.f57439b, dVar.f57439b) && this.f57440c == dVar.f57440c && Intrinsics.areEqual(this.f57441d, dVar.f57441d);
        }

        public final int f() {
            return this.f57438a;
        }

        public int hashCode() {
            return (((((this.f57438a * 31) + this.f57439b.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f57440c)) * 31) + this.f57441d.hashCode();
        }

        public String toString() {
            return "WrapperChainParams(wrapperDepth=" + this.f57438a + ", usedVastAdTagUrls=" + this.f57439b + ", followAdditionalWrappers=" + this.f57440c + ", aggregatedWrapperChainData=" + this.f57441d + ')';
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57442r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57443s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f57444t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f57445u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f57447w;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57445u = obj;
            this.f57447w |= Integer.MIN_VALUE;
            return k.this.b(null, null, false, this);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57448r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f57450t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f57451u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f57452v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, boolean z10, String str, Continuation continuation) {
            super(2, continuation);
            this.f57450t = yVar;
            this.f57451u = z10;
            this.f57452v = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new f(this.f57450t, this.f57451u, this.f57452v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57448r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            k kVar = k.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = this.f57450t;
            double dX = kVar.x();
            com.moloco.sdk.common_adapter_internal.b bVarInvoke = k.this.f57429g.invoke();
            boolean z10 = this.f57451u;
            String str = this.f57452v;
            this.f57448r = 1;
            Object objV = kVar.v(yVar, null, dX, bVarInvoke, z10, str, this);
            return objV == objG ? objG : objV;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57453r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57454s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f57455t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f57457v;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57455t = obj;
            this.f57457v |= Integer.MIN_VALUE;
            return k.this.s(null, null, this);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.d {
        public Object A;
        public Object B;
        public Object C;
        public double D;
        public boolean E;
        public /* synthetic */ Object F;
        public int H;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57458r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57459s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f57460t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f57461u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f57462v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f57463w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f57464x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f57465y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f57466z;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return k.this.t(null, null, 0.0d, null, false, null, this);
        }
    }

    public static final class i implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f57467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f57468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f57469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f57470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.common_adapter_internal.b f57471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f57472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f57473h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f57474i;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f57475b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f57476c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f57477d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ double f57478e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.common_adapter_internal.b f57479f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f57480g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f57481h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f57482i;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i$a$a, reason: collision with other inner class name */
            public static final class C0742a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f57483r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f57484s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f57485t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f57487v;

                public C0742a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57483r = obj;
                    this.f57484s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, k kVar, d dVar, double d10, com.moloco.sdk.common_adapter_internal.b bVar, boolean z10, String str, Ref$ObjectRef ref$ObjectRef) {
                this.f57475b = flowCollector;
                this.f57476c = kVar;
                this.f57477d = dVar;
                this.f57478e = d10;
                this.f57479f = bVar;
                this.f57480g = z10;
                this.f57481h = str;
                this.f57482i = ref$ObjectRef;
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
            
                if (r3.emit(r1, r11) == r2) goto L46;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
                /*
                    Method dump skipped, instruction units count: 349
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public i(Flow flow, k kVar, d dVar, double d10, com.moloco.sdk.common_adapter_internal.b bVar, boolean z10, String str, Ref$ObjectRef ref$ObjectRef) {
            this.f57467b = flow;
            this.f57468c = kVar;
            this.f57469d = dVar;
            this.f57470e = d10;
            this.f57471f = bVar;
            this.f57472g = z10;
            this.f57473h = str;
            this.f57474i = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f57467b.collect(new a(flowCollector, this.f57468c, this.f57469d, this.f57470e, this.f57471f, this.f57472g, this.f57473h, this.f57474i), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj).b(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj2).b());
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$k, reason: collision with other inner class name */
    public static final class C0743k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57488r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57489s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f57490t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f57492v;

        public C0743k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57490t = obj;
            this.f57492v |= Integer.MIN_VALUE;
            return k.this.v(null, null, 0.0d, null, false, null, this);
        }
    }

    public static final class l extends kotlin.coroutines.jvm.internal.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57493r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57494s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f57495t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f57496u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f57497v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f57498w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public double f57499x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f57500y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f57501z;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return k.this.r(null, null, 0.0d, null, false, null, this);
        }
    }

    public static final class m implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f57502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f57503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f57504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f57505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f57506f;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f57507b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f57508c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f57509d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f57510e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f57511f;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m$a$a, reason: collision with other inner class name */
            public static final class C0744a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f57512r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f57513s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f57514t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f57516v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Object f57517w;

                public C0744a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57512r = obj;
                    this.f57513s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, boolean z10, k kVar, String str, Ref$ObjectRef ref$ObjectRef) {
                this.f57507b = flowCollector;
                this.f57508c = z10;
                this.f57509d = kVar;
                this.f57510e = str;
                this.f57511f = ref$ObjectRef;
            }

            /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L49;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public m(Flow flow, boolean z10, k kVar, String str, Ref$ObjectRef ref$ObjectRef) {
            this.f57502b = flow;
            this.f57503c = z10;
            this.f57504d = kVar;
            this.f57505e = str;
            this.f57506f = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f57502b.collect(new a(flowCollector, this.f57503c, this.f57504d, this.f57505e, this.f57506f), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f57520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f57521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f57522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f57523w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f57525y;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57523w = obj;
            this.f57525y |= Integer.MIN_VALUE;
            return k.this.u(null, null, null, null, 0.0d, null, null, false, null, this);
        }
    }

    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57526r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f57527s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f57528t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f57530v;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57528t = obj;
            this.f57530v |= Integer.MIN_VALUE;
            return k.this.a(null, 0L, this);
        }
    }

    public static final class p extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57531r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f57533t;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57534r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f57535s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ k f57536t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, Continuation continuation) {
                super(2, continuation);
                this.f57536t = kVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar, Continuation continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f57536t, continuation);
                aVar.f57535s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f57534r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) this.f57535s;
                if (hVar instanceof h.c) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    String str = this.f57536t.f57430h;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Stream status: ");
                    h.c cVar = (h.c) hVar;
                    sb2.append(cVar.b().a());
                    sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                    sb2.append(cVar.b().b());
                    sb2.append(" bytes downloaded");
                    MolocoLogger.info$default(molocoLogger, str, sb2.toString(), null, false, 12, null);
                }
                return kotlin.coroutines.jvm.internal.b.a((hVar instanceof h.a) || (hVar instanceof h.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f57533t = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new p(this.f57533t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57531r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Flow flowB = k.this.f57425c.b(this.f57533t.g().g());
            a aVar = new a(k.this, null);
            this.f57531r = 1;
            Object objA = hg.i.A(flowB, aVar, this);
            return objA == objG ? objG : objA;
        }
    }

    public k(t parseVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m mediaCacheRepository, x vastTracker, e0 connectivityService, ie.c httpClient, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y screenService) {
        Intrinsics.checkNotNullParameter(parseVast, "parseVast");
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(screenService, "screenService");
        this.f57423a = parseVast;
        this.f57424b = mediaConfig;
        this.f57425c = mediaCacheRepository;
        this.f57426d = vastTracker;
        this.f57427e = connectivityService;
        this.f57428f = httpClient;
        this.f57429g = screenService;
        this.f57430h = "VastAdLoaderImpl";
    }

    public static final b f(k kVar, a aVar) {
        return kVar.e(aVar);
    }

    public static final b g(Lazy lazy) {
        return (b) lazy.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c i(k kVar, com.moloco.sdk.common_adapter_internal.b bVar, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kVar.j(it, bVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e k(k kVar, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kVar.l(it);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r19, java.lang.String r20, boolean r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final double c(long j10, int i10) {
        return (j10 * ((long) 8)) / ((double) (i10 * 1000));
    }

    public final b e(a aVar) {
        List<List> listC;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (aVar != null && (listC = aVar.c()) != null) {
            for (List list : listC) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i> arrayList8 = new ArrayList();
                for (Object obj : list) {
                    if (!f57422i.r((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj)) {
                        arrayList8.add(obj);
                    }
                }
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar : arrayList8) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVarB = iVar.b();
                    if (jVarB instanceof j.b) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVarA = ((j.b) iVar.b()).a();
                        CollectionsKt.addAll(arrayList, rVarA.e());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVarF = rVarA.f();
                        if (aVarF != null) {
                            CollectionsKt.addAll(arrayList2, aVarF.b());
                            CollectionsKt.addAll(arrayList3, aVarF.c());
                        }
                        CollectionsKt.addAll(arrayList6, rVarA.b());
                    } else {
                        if (!(jVarB instanceof j.a)) {
                            throw new lf.m();
                        }
                        CollectionsKt.addAll(arrayList7, ((j.a) iVar.b()).a());
                    }
                }
                arrayList4.add(arrayList6);
                arrayList5.add(arrayList7);
            }
        }
        return new b(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a(null, arrayList2, arrayList3), arrayList4, arrayList5);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c j(List list, com.moloco.sdk.common_adapter_internal.b bVar) {
        List listEmptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
            if (!f57422i.q(gVar) && !gVar.e().isEmpty()) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, r.h(Integer.valueOf(bVar.f()), Integer.valueOf(bVar.c()))));
        if (gVar2 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) CollectionsKt.first(CollectionsKt.sortedWith(gVar2.e(), r.s()));
        Integer numF = gVar2.f();
        int iIntValue = numF != null ? numF.intValue() : 0;
        Integer numD = gVar2.d();
        int iIntValue2 = numD != null ? numD.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarB = gVar2.b();
        String strA = hVarB != null ? hVarB.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarB2 = gVar2.b();
        if (hVarB2 == null || (listEmptyList = hVarB2.b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        List listC = gVar2.c();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) it.next()).c());
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c(a0Var, iIntValue, iIntValue2, strA, list2, arrayList2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e l(List list) {
        List listEmptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!f57422i.s((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, r.f()));
        if (nVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0VarF = nVar.f();
        Integer numH = nVar.h();
        int iIntValue = numH != null ? numH.intValue() : 0;
        Integer numD = nVar.d();
        int iIntValue2 = numD != null ? numD.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB = nVar.b();
        String strA = oVarB != null ? oVarB.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB2 = nVar.b();
        if (oVarB2 == null || (listEmptyList = oVarB2.b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e(a0VarF, iIntValue, iIntValue2, strA, listEmptyList, nVar.g(), nVar.c(), nVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d r28, double r29, com.moloco.sdk.common_adapter_internal.b r31, boolean r32, java.lang.String r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r18, java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x018b -> B:39:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q r30, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a r31, double r32, com.moloco.sdk.common_adapter_internal.b r34, boolean r35, java.lang.String r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r17, java.util.List r18, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r19, java.util.List r20, double r21, java.lang.Long r23, com.moloco.sdk.common_adapter_internal.b r24, boolean r25, java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r, java.util.List, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, java.util.List, double, java.lang.Long, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r21, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d r22, double r23, com.moloco.sdk.common_adapter_internal.b r25, boolean r26, java.lang.String r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar) {
        x.a.a(this.f57426d, list, zVar, null, null, 12, null);
    }

    public final double x() {
        return !this.f57427e.b() ? 10.0d : 2.0d;
    }
}
