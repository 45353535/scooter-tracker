package org.bidon.mobilefuse.ext;

import android.content.Context;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenRequest;
import com.mobilefuse.sdk.internal.TokenGeneratorListener;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import of.e;
import org.bidon.sdk.BidonSdk;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f97467a = new b();

    public static final class a implements TokenGeneratorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97468a;

        a(Continuation continuation) {
            this.f97468a = continuation;
        }

        @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
        public void onTokenGenerated(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f97468a.resumeWith(Result.b(token));
        }

        @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
        public void onTokenGenerationFailed(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f97468a.resumeWith(Result.b(null));
        }
    }

    private b() {
    }

    public final Object a(Context context, boolean z10, Continuation continuation) throws Throwable {
        MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest = new MobileFuseBiddingTokenRequest(c.a(BidonSdk.getRegulation()), z10, null, 4, null);
        e eVar = new e(pf.b.d(continuation));
        MobileFuseBiddingTokenProvider.INSTANCE.getToken(mobileFuseBiddingTokenRequest, context, new a(eVar));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            g.c(continuation);
        }
        return objB;
    }
}
