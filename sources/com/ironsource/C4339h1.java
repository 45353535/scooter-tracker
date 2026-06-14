package com.ironsource;

import com.ironsource.InterfaceC4496q4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4339h1 implements InterfaceC4476p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4389k1 f43206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7 f43207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Hb<Integer, Integer> f43208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f43209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<InterfaceC4423m1> f43210e;

    public C4339h1(@NotNull InterfaceC4389k1 eventBaseData, @NotNull C7 eventsManager, @NotNull Hb<Integer, Integer> eventsMapper, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f43206a = eventBaseData;
        this.f43207b = eventsManager;
        this.f43208c = eventsMapper;
        this.f43209d = currentTimeProvider;
        this.f43210e = new ArrayList();
    }

    public final void a(@NotNull List<InterfaceC4423m1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f43210e = list;
    }

    @NotNull
    public final List<InterfaceC4423m1> b() {
        return this.f43210e;
    }

    private final JSONObject b(List<? extends InterfaceC4423m1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4423m1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4476p1
    public void a(int i10, @NotNull List<InterfaceC4423m1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.f43206a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC4423m1) it.next());
            }
            Iterator<InterfaceC4423m1> it2 = this.f43210e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.f43207b.a(new C4649z5(this.f43208c.a(Integer.valueOf(i10)).intValue(), this.f43209d.a(), b(arrayList)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            System.out.println((Object) ("LogRemote | Exception: " + e10.getMessage()));
        }
    }

    public /* synthetic */ C4339h1(InterfaceC4389k1 interfaceC4389k1, C7 c72, Hb hb2, InterfaceC4496q4 interfaceC4496q4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4389k1, c72, hb2, (i10 & 8) != 0 ? new InterfaceC4496q4.a() : interfaceC4496q4);
    }

    @Override // com.ironsource.InterfaceC4476p1
    public void a() {
        this.f43210e.clear();
    }

    @Override // com.ironsource.InterfaceC4476p1
    public void a(@NotNull InterfaceC4423m1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC4423m1 interfaceC4423m1 : analyticsEventEntity) {
            this.f43210e.add(interfaceC4423m1);
        }
    }
}
