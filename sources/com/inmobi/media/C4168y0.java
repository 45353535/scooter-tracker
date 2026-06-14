package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4168y0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig f39961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0 f39962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f39963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdQualityResult f39964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A0 f39966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig f39967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4168y0(A0 a02, AdConfig adConfig, Continuation continuation) {
        super(2, continuation);
        this.f39966f = a02;
        this.f39967g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4168y0(this.f39966f, this.f39967g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4168y0(this.f39966f, this.f39967g, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:18|80|19|(2:78|21)|24|(1:26)|27|28|74|29|(1:31)|32|46) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:70|41|76|42|(1:44)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r3 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        if (r5 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        return r0;
     */
    /* JADX WARN: Path cross not found for [B:18:0x008e, B:45:0x00e8], limit reached: 82 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011f -> B:49:0x0122). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4168y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
