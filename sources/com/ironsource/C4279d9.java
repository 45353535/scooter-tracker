package com.ironsource;

import com.ironsource.environment.ContextProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4279d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4279d9 f42909a = new C4279d9();

    private C4279d9() {
    }

    @NotNull
    public static final JSONObject a() throws JSONException {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C4262c9().a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "InitProvider().getInitData().toString()");
        Ge.c(string);
        JSONObject encodedJsonInitResponse = new JSONObject().put("data", K9.e(C4427m5.b().c(), string));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
