package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5536x3 implements F5 {
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC5295nb.c(asString);
        if (Jm.a(mapC)) {
            return mapC;
        }
        AbstractC5227kj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
