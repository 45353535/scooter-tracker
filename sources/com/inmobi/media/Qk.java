package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import j$.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Qk extends AbstractC4127w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f37612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(String url, Ak uidMap, String str, int i10, int i11, int i12) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        this.f37612b = uidMap;
        this.f37613c = str;
        this.f37614d = i10;
        this.f37615e = i11;
        this.f37616f = i12;
    }

    public final Le a() {
        String string;
        InMobiUserDataTypes obj;
        InMobiUserDataTypes obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C3572a7.f38170a);
        String str = (String) Tg.a().get("u-age");
        if (str != null) {
        }
        String string2 = Ok.b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        linkedHashMap.put("ufids", string2);
        C4044t1 c4044t1 = AbstractC4213zk.f40073a;
        Boolean bool = c4044t1 != null ? c4044t1.f39573c : null;
        if (bool == null || (string = bool.toString()) == null) {
            string = "true";
        }
        linkedHashMap.put(com.ironsource.N6.f41419s, string);
        linkedHashMap.put("mk-version", Ki.a());
        String str2 = A1.f36539a;
        if (str2 != null) {
        }
        linkedHashMap.put(com.ironsource.N6.f41375d0, Ji.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str3 = this.f37613c;
        if (str3 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C3572a7.f38171b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel2 = C3572a7.f38171b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            Intrinsics.checkNotNullParameter(obj2, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel3 = C3572a7.f38171b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.f37612b.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f36543e);
        linkedHashMap.putAll(C4148x5.f39893a.a(false));
        linkedHashMap.putAll(AbstractC4201z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string3 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            linkedHashMap.put("consentObject", string3);
        }
        String str4 = this.f39834a;
        Y6 y62 = new Y6(linkedHashMap);
        int i10 = this.f37614d;
        int i11 = this.f37615e;
        IntRange intRange = Se.f37724a;
        Ai ai2 = new Ai(i10, i11 * 1000, 0);
        long j10 = this.f37616f * 1000;
        return new Le(str4, null, new C3964pk(j10, j10, j10), y62, ai2, 32);
    }
}
