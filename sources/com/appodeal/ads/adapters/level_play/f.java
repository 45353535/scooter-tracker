package com.appodeal.ads.adapters.level_play;

import android.os.Handler;
import android.os.Looper;
import hg.l0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f12400a = l0.a(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f12401b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12402c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12403d;

    public static final void c(f fVar) {
        Object value;
        MutableStateFlow mutableStateFlow = fVar.f12400a;
        do {
            value = mutableStateFlow.getValue();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f12404b.onInitializationFinished();
            }
        } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
    }

    public final void b(boolean z10) {
        this.f12402c.set(z10);
        this.f12401b.set(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appodeal.ads.adapters.level_play.e
            @Override // java.lang.Runnable
            public final void run() {
                f.c(this.f12396b);
            }
        });
    }
}
