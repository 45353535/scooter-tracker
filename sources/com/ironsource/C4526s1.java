package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4526s1 {

    /* JADX INFO: renamed from: com.ironsource.s1$a */
    public static final class a implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f44880a;

        a(Continuation continuation) {
            this.f44880a = continuation;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation continuation = this.f44880a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(kotlin.d.a(error)));
        }

        public void onResult(@Nullable Object obj) {
            Continuation continuation = this.f44880a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @RequiresApi(31)
    @NotNull
    public static final OutcomeReceiver a(@NotNull Continuation continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new a(continuation);
    }
}
