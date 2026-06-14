package com.ironsource;

import com.ironsource.AbstractC4478p3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xg<Smash extends AbstractC4478p3<?>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f45835g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Smash> f45838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Smash> f45839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Smash> f45840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Smash> f45841f;

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.xg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0484a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45842a;

            static {
                int[] iArr = new int[tg.values().length];
                try {
                    iArr[tg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[tg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f45842a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <Smash extends AbstractC4478p3<?>> xg<Smash> a(@NotNull tg loadingStrategy, int i10, boolean z10, @NotNull List<? extends Smash> waterfall) {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i11 = C0484a.f45842a[loadingStrategy.ordinal()];
            if (i11 == 1) {
                return new K4(i10, z10, waterfall);
            }
            if (i11 != 2) {
                throw new lf.m();
            }
            return new C4579v3(i10, z10, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xg(int i10, boolean z10, @NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f45836a = i10;
        this.f45837b = z10;
        this.f45838c = waterfall;
        this.f45839d = new ArrayList();
        this.f45840e = new ArrayList();
        this.f45841f = new ArrayList();
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    @NotNull
    public final List<Smash> a() {
        return this.f45841f;
    }

    @NotNull
    public final List<Smash> c() {
        return this.f45839d;
    }

    public abstract void c(@NotNull Smash smash);

    public final int d() {
        return this.f45839d.size() + this.f45840e.size() + this.f45841f.size();
    }

    public boolean e() {
        return d() >= this.f45836a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f45840e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f45841f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f45841f.add(smash);
            return;
        }
        if (!this.f45837b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    private final int b() {
        Integer num;
        List<Smash> list = this.f45838c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4478p3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC4478p3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC4478p3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
