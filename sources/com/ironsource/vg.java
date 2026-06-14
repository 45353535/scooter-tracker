package com.ironsource;

import com.ironsource.AbstractC4478p3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class vg<Smash extends AbstractC4478p3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final U f45674a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return mf.a.d(Integer.valueOf(((AbstractC4478p3) t10).i().l()), Integer.valueOf(((AbstractC4478p3) t11).i().l()));
        }
    }

    public vg(@NotNull U managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.f45674a = managerData;
    }

    public final boolean a(@NotNull AbstractC4478p3<?> smash, @NotNull List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC4478p3) next).x()) {
                break;
            }
        }
        return Intrinsics.areEqual(next, smash);
    }

    @NotNull
    public final List<Smash> b(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    @Nullable
    public final Smash c(@NotNull List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC4478p3) next).B()) {
                break;
            }
        }
        return (Smash) next;
    }

    @NotNull
    public final wg<Smash> d(@NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f45674a.b().name() + " waterfall size: " + waterfall.size());
        xg<Smash> xgVarA = xg.f45835g.a(this.f45674a.c() ? tg.BIDDER_SENSITIVE : tg.DEFAULT, this.f45674a.i(), this.f45674a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            xgVarA.d(it.next());
            if (xgVarA.e()) {
                return new wg<>(xgVarA);
            }
        }
        return new wg<>(xgVarA);
    }

    public final boolean a(@NotNull List<? extends Smash> waterfall) {
        int i10;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC4478p3) it.next()).y() && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i10 >= this.f45674a.i();
    }
}
