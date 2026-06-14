package com.inmobi.media;

import android.app.ApplicationExitInfo;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4119w1 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4169y1 f39812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplicationExitInfo f39813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119w1(C4169y1 c4169y1, ApplicationExitInfo applicationExitInfo, Continuation continuation) {
        super(1, continuation);
        this.f39812a = c4169y1;
        this.f39813b = applicationExitInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C4119w1(this.f39812a, this.f39813b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4119w1(this.f39812a, this.f39813b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        StringBuilder sb2;
        String string;
        vh.l0 l0VarK;
        pf.b.g();
        kotlin.d.b(obj);
        C4073u5 c4073u5 = this.f39812a.f39575a;
        int reason = this.f39813b.getReason();
        String description = this.f39813b.getDescription();
        InputStream traceInputStream = this.f39813b.getTraceInputStream();
        vh.g gVarD = (traceInputStream == null || (l0VarK = vh.x.k(traceInputStream)) == null) ? null : vh.x.d(l0VarK);
        int i10 = this.f39812a.f39970d;
        Intrinsics.checkNotNullParameter("\"main\"", "startMarker");
        Intrinsics.checkNotNullParameter("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            if (gVarD != null) {
                int i11 = i10;
                boolean z10 = false;
                while (true) {
                    try {
                        String utf8Line = gVarD.readUtf8Line();
                        if (utf8Line == null) {
                            break;
                        }
                        if (i10 > 0 && !z10) {
                            sb4.append(utf8Line);
                            sb4.append(IOUtils.LINE_SEPARATOR_UNIX);
                            i10--;
                        }
                        int i12 = i10;
                        sb2 = sb4;
                        int i13 = i11;
                        try {
                            if (StringsKt.a0(utf8Line, "\"main\"", false, 2, null)) {
                                StringsKt.q(sb2);
                                z10 = true;
                            }
                            if (z10) {
                                i11 = i13 - 1;
                                sb3.append(utf8Line);
                                sb3.append(IOUtils.LINE_SEPARATOR_UNIX);
                            } else {
                                i11 = i13;
                            }
                            if (StringsKt.g0(utf8Line, "ZygoteInit.java", false, 2, null) || i11 <= 0) {
                                break;
                            }
                            i10 = i12;
                            sb4 = sb2;
                        } catch (IOException e10) {
                            e = e10;
                            Log.e("CommonExt", "Error reading from input stream", e);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        sb2 = sb4;
                    }
                }
                sb2 = sb4;
            } else {
                sb2 = sb4;
            }
            if (sb3.length() == 0) {
                string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (gVarD != null) {
                    try {
                        gVarD.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                string = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (gVarD != null) {
                    Intrinsics.checkNotNullParameter(gVarD, "<this>");
                    gVarD.close();
                }
            }
            c4073u5.a(new C4194z1(description, reason, string));
            return Unit.f93236a;
        } finally {
            if (gVarD != null) {
                Intrinsics.checkNotNullParameter(gVarD, "<this>");
                try {
                    gVarD.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
