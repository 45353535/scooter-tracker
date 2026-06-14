package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5095fg implements InterfaceC4992bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5198jg f77165a;

    public C5095fg(C5198jg c5198jg) {
        this.f77165a = c5198jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4992bg
    @WorkerThread
    public final void a() {
        C5198jg c5198jg = this.f77165a;
        ArrayList arrayList = c5198jg.f77529g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C5424sg c5424sg = (C5424sg) obj;
            c5198jg.f77525c.getClass();
            String str = c5424sg != null ? c5424sg.f78236a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c5198jg.a(c5198jg.f77525c.a(CollectionsKt.filterNotNull(arrayList2)));
    }
}
