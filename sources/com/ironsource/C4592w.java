package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4592w implements Ze<JSONObject>, Xe<C4558u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, G0> f45689a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45690b;

    /* JADX INFO: renamed from: com.ironsource.w$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45691a;

        static {
            int[] iArr = new int[We.values().length];
            try {
                iArr[We.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[We.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[We.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[We.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[We.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f45691a = iArr;
        }
    }

    private final void b(C4558u c4558u) {
        int i10;
        int i11 = a.f45691a[c4558u.f().ordinal()];
        if (i11 == 2) {
            this.f45690b++;
        } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (i10 = this.f45690b) > 0) {
            this.f45690b = i10 - 1;
        }
    }

    public final int a() {
        return this.f45690b;
    }

    @Override // com.ironsource.Xe
    public void a(@NotNull C4558u record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, G0> map = this.f45689a;
        G0 g02 = map.get(strC);
        if (g02 == null) {
            g02 = new G0();
            map.put(strC, g02);
        }
        g02.a(record.a(new C4575v()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC4294e7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull Ye mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, G0> entry : this.f45689a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f45689a.isEmpty();
    }
}
