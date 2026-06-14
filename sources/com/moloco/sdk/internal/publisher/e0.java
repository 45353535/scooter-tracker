package com.moloco.sdk.internal.publisher;

import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54749a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54750r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54752t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.f54752t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e0.this.new b(this.f54752t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54750r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
            String strC = e0.this.c(this.f54752t);
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Processed bidresponse: " + strC, false, 4, null);
            return strC;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.g0
    public Object a(String str, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new b(str, null), continuation);
    }

    public final String c(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Base64 decoded bidresponse: " + bArrDecode, false, 4, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 2048);
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int i10 = gZIPInputStream.read(bArr);
                        if (i10 == -1) {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            return sb2.toString();
                        }
                        sb2.append(new String(bArr, 0, i10, Charsets.UTF_8));
                    } catch (Exception unused) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
            return null;
        }
    }
}
