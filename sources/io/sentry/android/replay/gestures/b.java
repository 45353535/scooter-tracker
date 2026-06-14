package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.r;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f83025e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83026f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f83027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f83028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f83029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f83030d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(p dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f83027a = dateProvider;
        this.f83028b = new LinkedHashMap(10);
    }

    public final List a(MotionEvent event, r recorderConfig) {
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i10 = 10;
        int i11 = 0;
        List list2 = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.f83027a.getCurrentTimeMillis();
                    long j10 = this.f83030d;
                    if (j10 != 0 && j10 + ((long) 50) > currentTimeMillis) {
                        return null;
                    }
                    this.f83030d = currentTimeMillis;
                    Set<Integer> setKeySet = this.f83028b.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.checkNotNull(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex == -1) {
                            list = list2;
                        } else {
                            if (this.f83029c == 0) {
                                this.f83029c = currentTimeMillis;
                            }
                            Object obj = this.f83028b.get(num);
                            Intrinsics.checkNotNull(obj);
                            f.b bVar = new f.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.e());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.f());
                            bVar.f(i11);
                            list = list2;
                            bVar.g(currentTimeMillis - this.f83029c);
                            ((Collection) obj).add(bVar);
                        }
                        list2 = list;
                        i11 = 0;
                    }
                    List list3 = list2;
                    long j11 = currentTimeMillis - this.f83029c;
                    if (j11 <= 500) {
                        return list3;
                    }
                    ArrayList arrayList = new ArrayList(this.f83028b.size());
                    Iterator it = this.f83028b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList<f.b> arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            f fVar = new f();
                            fVar.f(currentTimeMillis);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, i10));
                            for (f.b bVar2 : arrayList2) {
                                bVar2.g(bVar2.e() - j11);
                                arrayList3.add(bVar2);
                                it = it;
                            }
                            fVar.n(arrayList3);
                            fVar.m(iIntValue);
                            arrayList.add(fVar);
                            Object obj2 = this.f83028b.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(obj2);
                            ((ArrayList) obj2).clear();
                            it = it;
                            i10 = 10;
                        }
                    }
                    this.f83029c = 0L;
                    return arrayList;
                }
                if (actionMasked == 3) {
                    this.f83028b.clear();
                    e eVar = new e();
                    eVar.f(this.f83027a.getCurrentTimeMillis());
                    eVar.u(event.getX() * recorderConfig.e());
                    eVar.v(event.getY() * recorderConfig.f());
                    eVar.q(0);
                    eVar.s(0);
                    eVar.r(e.b.TouchCancel);
                    return CollectionsKt.listOf(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.f83028b.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.f(this.f83027a.getCurrentTimeMillis());
            eVar2.u(event.getX(iFindPointerIndex2) * recorderConfig.e());
            eVar2.v(event.getY(iFindPointerIndex2) * recorderConfig.f());
            eVar2.q(0);
            eVar2.s(pointerId);
            eVar2.r(e.b.TouchEnd);
            return CollectionsKt.listOf(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.f83028b.put(Integer.valueOf(pointerId2), new ArrayList(10));
        e eVar3 = new e();
        eVar3.f(this.f83027a.getCurrentTimeMillis());
        eVar3.u(event.getX(iFindPointerIndex3) * recorderConfig.e());
        eVar3.v(event.getY(iFindPointerIndex3) * recorderConfig.f());
        eVar3.q(0);
        eVar3.s(pointerId2);
        eVar3.r(e.b.TouchStart);
        return CollectionsKt.listOf(eVar3);
    }
}
