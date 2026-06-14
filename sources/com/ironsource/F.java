package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f40830c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f40831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pg f40832b;

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.F$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0439a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40833a;

            static {
                int[] iArr = new int[tg.values().length];
                try {
                    iArr[tg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[tg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f40833a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final F a(@NotNull AbstractC4576v0 adUnitData, @NotNull pg waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i10 = C0439a.f40833a[(adUnitData.d() ? tg.BIDDER_SENSITIVE : tg.DEFAULT).ordinal()];
            if (i10 == 1) {
                return new C4562u3(adUnitData, waterfallInstances);
            }
            if (i10 == 2) {
                return adUnitData.q() ? new C4336gf(adUnitData, waterfallInstances) : new H4(adUnitData, waterfallInstances);
            }
            throw new lf.m();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<AbstractC4643z> f40834a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<AbstractC4643z> f40835b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<AbstractC4643z> f40836c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40837d;

        @NotNull
        public final List<AbstractC4643z> a() {
            return this.f40834a;
        }

        @NotNull
        public final List<AbstractC4643z> b() {
            return this.f40835b;
        }

        @NotNull
        public final List<AbstractC4643z> c() {
            return this.f40836c;
        }

        public final boolean d() {
            return this.f40837d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f40834a.isEmpty() && this.f40836c.isEmpty();
        }

        public final int g() {
            return this.f40834a.size() + this.f40835b.size() + this.f40836c.size();
        }

        public final void a(boolean z10) {
            this.f40837d = z10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final AbstractC4643z f40838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<AbstractC4643z> f40839b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Nullable AbstractC4643z abstractC4643z, @NotNull List<? extends AbstractC4643z> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f40838a = abstractC4643z;
            this.f40839b = orderedInstances;
        }

        @Nullable
        public final AbstractC4643z a() {
            return this.f40838a;
        }

        @NotNull
        public final List<AbstractC4643z> b() {
            return this.f40839b;
        }

        @Nullable
        public final AbstractC4643z c() {
            return this.f40838a;
        }

        @NotNull
        public final List<AbstractC4643z> d() {
            return this.f40839b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f40838a, cVar.f40838a) && Intrinsics.areEqual(this.f40839b, cVar.f40839b);
        }

        public int hashCode() {
            AbstractC4643z abstractC4643z = this.f40838a;
            return ((abstractC4643z == null ? 0 : abstractC4643z.hashCode()) * 31) + this.f40839b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f40838a + ", orderedInstances=" + this.f40839b + ")";
        }

        @NotNull
        public final c a(@Nullable AbstractC4643z abstractC4643z, @NotNull List<? extends AbstractC4643z> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(abstractC4643z, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, AbstractC4643z abstractC4643z, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC4643z = cVar.f40838a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f40839b;
            }
            return cVar.a(abstractC4643z, list);
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return mf.a.d(Integer.valueOf(((AbstractC4643z) t10).h().l()), Integer.valueOf(((AbstractC4643z) t11).h().l()));
        }
    }

    public F(@NotNull AbstractC4576v0 adUnitData, @NotNull pg waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f40831a = adUnitData;
        this.f40832b = waterfallInstances;
    }

    private final List<AbstractC4643z> b() {
        return CollectionsKt.sortedWith(this.f40832b.b(), new d());
    }

    public abstract void a(@NotNull AbstractC4643z abstractC4643z, @NotNull b bVar);

    protected boolean a(@NotNull AbstractC4643z instance, @NotNull pg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    @NotNull
    public final c c() {
        Object next;
        List<AbstractC4643z> listB = b();
        Iterator<T> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC4643z) next).w()) {
                break;
            }
        }
        return new c((AbstractC4643z) next, listB);
    }

    @NotNull
    public final b d() {
        IronLog.INTERNAL.verbose(this.f40831a.b().a().name() + " waterfall size: " + this.f40832b.b().size());
        b bVar = new b();
        Iterator<AbstractC4643z> it = this.f40832b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    public final boolean a(@NotNull AbstractC4643z instance) {
        Object next;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC4643z) next).v()) {
                break;
            }
        }
        return Intrinsics.areEqual(next, instance);
    }

    private final boolean b(AbstractC4643z abstractC4643z, b bVar) {
        if (abstractC4643z.v()) {
            IronLog.INTERNAL.verbose(abstractC4643z.d().name() + " - Instance " + abstractC4643z.q() + " is failed to load");
        } else if (abstractC4643z.w()) {
            IronLog.INTERNAL.verbose(abstractC4643z.d().name() + " - Instance " + abstractC4643z.q() + " is already loaded");
            bVar.b().add(abstractC4643z);
        } else if (abstractC4643z.x()) {
            IronLog.INTERNAL.verbose(abstractC4643z.d().name() + " - Instance " + abstractC4643z.q() + " still loading");
            bVar.c().add(abstractC4643z);
        } else if (a(abstractC4643z, this.f40832b)) {
            IronLog.INTERNAL.verbose(abstractC4643z.d().name() + " - Instance " + abstractC4643z.q() + " is not better than already loaded instances");
        } else {
            a(abstractC4643z, bVar);
        }
        return a(bVar);
    }

    public final boolean a() {
        int i10;
        List<AbstractC4643z> listB = this.f40832b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC4643z) it.next()).w() && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i10 >= this.f40831a.k();
    }

    public boolean a(@NotNull b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f40831a.k();
    }
}
