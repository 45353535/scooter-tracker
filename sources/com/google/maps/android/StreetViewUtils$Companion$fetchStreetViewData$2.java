package com.google.maps.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;
import uf.c;
import uf.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/google/maps/android/Status;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.google.maps.android.StreetViewUtils$Companion$fetchStreetViewData$2", f = "StreetViewUtil.kt", l = {}, m = "invokeSuspend")
final class StreetViewUtils$Companion$fetchStreetViewData$2 extends k implements Function2<CoroutineScope, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f33733s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreetViewUtils$Companion$fetchStreetViewData$2(String str, Continuation continuation) {
        super(2, continuation);
        this.f33733s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new StreetViewUtils$Companion$fetchStreetViewData$2(this.f33733s, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        b.g();
        if (this.f33732r != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.f33733s).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP Error: " + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String strI = r.i(bufferedReader);
                c.a(bufferedReader, null);
                bufferedReader.close();
                inputStream.close();
                return StreetViewUtils.INSTANCE.a(strI).getStatus();
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new IOException("Network error: " + e10.getMessage());
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((StreetViewUtils$Companion$fetchStreetViewData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
