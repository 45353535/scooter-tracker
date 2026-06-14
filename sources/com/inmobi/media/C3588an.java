package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3588an extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f38224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f38225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f38227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3614bn f38228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f38229j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3588an(ProgressBar progressBar, C3614bn c3614bn, int i10, Continuation continuation) {
        super(2, continuation);
        this.f38227h = progressBar;
        this.f38228i = c3614bn;
        this.f38229j = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3588an(this.f38227h, this.f38228i, this.f38229j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3588an) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0066 -> B:13:0x0069). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r13.f38226g
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            int r1 = r13.f38222c
            int r3 = r13.f38221b
            float r4 = r13.f38224e
            long r5 = r13.f38223d
            int r7 = r13.f38220a
            android.widget.ProgressBar r8 = r13.f38225f
            kotlin.d.b(r14)
            goto L69
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            kotlin.d.b(r14)
            android.widget.ProgressBar r14 = r13.f38227h
            int r14 = r14.getProgress()
            com.inmobi.media.bn r1 = r13.f38228i
            com.inmobi.media.Fg r1 = r1.f38296c
            long r3 = r1.f36859f
            r1 = 10
            long r5 = (long) r1
            long r3 = r3 / r5
            int r5 = r13.f38229j
            int r5 = r5 - r14
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r6
            android.widget.ProgressBar r6 = r13.f38227h
            r7 = 0
            r8 = r6
            r10 = r7
            r7 = r14
            r11 = r3
            r3 = r1
            r4 = r5
            r1 = r10
            r5 = r11
        L48:
            if (r1 >= r3) goto L6b
            float r14 = (float) r7
            int r9 = r1 + 1
            float r9 = (float) r9
            float r9 = r9 * r4
            float r9 = r9 + r14
            int r14 = (int) r9
            com.inmobi.media.AbstractC4116vn.a(r8, r14)
            r13.f38225f = r8
            r13.f38220a = r7
            r13.f38223d = r5
            r13.f38224e = r4
            r13.f38221b = r3
            r13.f38222c = r1
            r13.f38226g = r2
            java.lang.Object r14 = eg.k0.a(r5, r13)
            if (r14 != r0) goto L69
            return r0
        L69:
            int r1 = r1 + r2
            goto L48
        L6b:
            kotlin.Unit r14 = kotlin.Unit.f93236a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3588an.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
