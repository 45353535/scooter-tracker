package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class J3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K3 f37090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f37091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3890ml f37092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f37093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K3 f37095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(K3 k32, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f37095f = k32;
        this.f37096g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new J3(this.f37095f, this.f37096g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J3(this.f37095f, this.f37096g, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: cc -> 0x001a, IllegalArgumentException -> 0x001d, TryCatch #3 {cc -> 0x001a, IllegalArgumentException -> 0x001d, blocks: (B:6:0x0015, B:28:0x0083, B:30:0x0091, B:31:0x00a5), top: B:53:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0048 -> B:21:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:28:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00eb -> B:21:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:21:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00c7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.J3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
