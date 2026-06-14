package io.appmetrica.analytics.impl;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5247ld implements Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5579yl f77698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f77700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f77701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f77703f;

    public C5247ld(@NotNull InterfaceC5579yl interfaceC5579yl, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<C5170id> list) {
        this.f77698a = interfaceC5579yl;
        this.f77699b = str;
        this.f77700c = systemTimeProvider;
        this.f77701d = list;
        this.f77702e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f77703f = TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    public final Xj a() {
        Ad ad2;
        C5170id c5170id;
        if (this.f77701d.isEmpty()) {
            return null;
        }
        List listSortedWith = CollectionsKt.sortedWith(this.f77701d, new C5221kd());
        String strC = ((Fd) this.f77698a).c(this.f77702e, (String) null);
        if (strC != null) {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                IntRange intRangeV = kotlin.ranges.g.v(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
                Iterator it = intRangeV.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((IntIterator) it).nextInt());
                    try {
                        c5170id = new C5170id(jSONObject2.getString("moduleName"), jSONObject2.getBoolean(C4240b4.i.f42648r));
                    } catch (Throwable unused) {
                        c5170id = new C5170id("", false);
                    }
                    arrayList.add(c5170id);
                }
                ad2 = new Ad(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                ad2 = new Ad(CollectionsKt.emptyList(), 0L);
            }
        } else {
            ad2 = null;
        }
        long jCurrentTimeMillis = this.f77700c.currentTimeMillis();
        if (ad2 != null && jCurrentTimeMillis - ad2.f75522b <= this.f77703f && Intrinsics.areEqual(listSortedWith, ad2.f75521a)) {
            return null;
        }
        Ad ad3 = new Ad(listSortedWith, jCurrentTimeMillis);
        InterfaceC5579yl interfaceC5579yl = this.f77698a;
        Fd fd2 = (Fd) interfaceC5579yl;
        return new Xj(this.f77699b + "_status", ad3.a());
    }

    public /* synthetic */ C5247ld(InterfaceC5579yl interfaceC5579yl, String str, SystemTimeProvider systemTimeProvider, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5579yl, str, (i10 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
