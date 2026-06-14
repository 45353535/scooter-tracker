package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f75385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75386b = "id_sync";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75387c = "id_sync";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75388d = "launch_delay_seconds";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75389e = "requests";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75390f = "type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75391g = "url";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f75392h = "headers";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f75393i = "resend_interval_for_valid_response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f75394j = "resend_interval_for_invalid_response";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f75395k = "valid_response_codes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f75396l = "preconditions";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f75397m = "network";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f75398n = "cell";

    public c(@NotNull e eVar) {
        this.f75385a = eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(@NotNull JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        k[] kVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] intArray;
        int i10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f75387c);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f75431a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f75386b, oVar.f75431a);
        n nVar = new n();
        nVar.f75426a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject, this.f75388d, nVar.f75426a);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f75389e);
        int i11 = 0;
        if (jSONArrayOptJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = jSONArrayOptJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i12 = 0;
            while (i12 < length) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i12);
                m mVar = new m();
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    i10 = i11;
                } else {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f75390f);
                    Charset charset = Charsets.UTF_8;
                    mVar.f75418a = strOptString.getBytes(charset);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(this.f75396l);
                    l lVar = new l();
                    if (jSONObjectOptJSONObject3 != null && Intrinsics.areEqual(jSONObjectOptJSONObject3.optString(this.f75397m), this.f75398n)) {
                        lVar.f75416a = 1;
                    }
                    mVar.f75419b = lVar;
                    mVar.f75420c = jSONObjectOptJSONObject2.optString(this.f75391g).getBytes(charset);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(this.f75392h);
                    if (jSONObjectOptJSONObject4 == null) {
                        kVarArr = new k[i11];
                        jSONArray = jSONArrayOptJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> itKeys = jSONObjectOptJSONObject4.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            k kVar = new k();
                            kVar.f75413a = next.getBytes(Charsets.UTF_8);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                bArr = new byte[i11][];
                                jSONArray2 = jSONArrayOptJSONArray;
                            } else {
                                int length2 = jSONArrayOptJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = jSONArrayOptJSONArray;
                                int i13 = 0;
                                while (i13 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i14 = i13;
                                    bArr3[i14] = jSONArrayOptJSONArray2.optString(i13).getBytes(Charsets.UTF_8);
                                    i13 = i14 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            kVar.f75414b = bArr;
                            arrayList.add(kVar);
                            jSONArrayOptJSONArray = jSONArray2;
                            i11 = 0;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        Object[] array = arrayList.toArray(new k[i11]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f75421d = kVarArr;
                    mVar.f75422e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f75393i, mVar.f75422e);
                    mVar.f75423f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f75394j, mVar.f75423f);
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(this.f75395k);
                    if (jSONArrayOptJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = jSONArrayOptJSONArray3.length();
                        int[] iArr2 = new int[length3];
                        for (int i15 = 0; i15 < length3; i15++) {
                            iArr2[i15] = jSONArrayOptJSONArray3.optInt(i15);
                        }
                        iArr = iArr2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i16 : iArr) {
                        if (i16 != 0) {
                            arrayList2.add(Integer.valueOf(i16));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null || (intArray = CollectionsKt.toIntArray(arrayList2)) == null) {
                        i10 = 0;
                        intArray = new int[]{200};
                    } else {
                        i10 = 0;
                    }
                    mVar.f75424g = intArray;
                }
                mVarArr2[i12] = mVar;
                i12++;
                i11 = i10;
                jSONArrayOptJSONArray = jSONArray;
            }
            mVarArr = mVarArr2;
        }
        nVar.f75427b = mVarArr;
        oVar.f75432b = nVar;
        return this.f75385a.toModel(oVar);
    }

    @Nullable
    public final IdSyncConfig b(@NotNull JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
