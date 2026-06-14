package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3796j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38785a;

    public AbstractC3796j2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38785a = context;
    }

    public abstract Object a(FrameLayout frameLayout, C3831kc c3831kc);

    public abstract Object a(kotlin.coroutines.jvm.internal.d dVar);

    public abstract void a();

    public abstract void a(MutableStateFlow mutableStateFlow);

    public abstract void b();
}
