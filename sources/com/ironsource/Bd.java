package com.ironsource;

import com.ironsource.C4524s;
import com.ironsource.P7;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class Bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4553tb f40450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<String, C4524s.d> f40451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, C4524s.d> f40452c;

    public Bd(@NotNull C4553tb tools, @Nullable Map<String, C4524s.d> map, @Nullable Map<String, C4524s.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.f40450a = tools;
        this.f40451b = map;
        this.f40452c = map2;
    }

    private final void b(P7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.j(objA)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thG = Result.g(objA);
        if (thG != null) {
            this.f40450a.b(str, 3004, thG.getMessage());
        }
    }

    public final void a(@NotNull P7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C4524s.d> map = this.f40452c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4524s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                C4657zd c4657zdF = entry.getValue().f();
                if (c4657zdF != null) {
                    b(rewardService, key, c4657zdF.b(), c4657zdF.a());
                }
            }
        }
        Map<String, C4524s.d> map2 = this.f40451b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4524s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            C4657zd c4657zdA = entry2.getValue().a();
            if (c4657zdA != null) {
                a(rewardService, key2, c4657zdA.b(), c4657zdA.a());
            }
        }
    }

    private final void a(P7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (Result.j(objA)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thG = Result.g(objA);
        if (thG != null) {
            this.f40450a.b(str, 3004, thG.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
        Result.Companion companion2 = Result.f93230c;
        return Result.b(kotlin.d.a(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
