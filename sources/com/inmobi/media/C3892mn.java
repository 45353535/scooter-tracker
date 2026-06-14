package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3892mn implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3967pn f39055a;

    public C3892mn(CoroutineScope coroutineScope, C3967pn c3967pn) {
        this.f39055a = c3967pn;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3903n9 c3903n9 = this.f39055a.f39312c;
        if (c3903n9 != null) {
            c3903n9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        if (zBooleanValue) {
            Ij ij = this.f39055a.f39317h;
            if (ij != null) {
                ij.a();
            }
        } else {
            Ij ij2 = this.f39055a.f39317h;
            if (ij2 != null) {
                ij2.b();
            }
        }
        return Unit.f93236a;
    }
}
