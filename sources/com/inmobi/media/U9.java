package com.inmobi.media;

import com.taurusx.tax.y.z.w.s;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class U9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V9 f37832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(V9 v92, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f37832b = v92;
        this.f37833c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new U9(this.f37832b, this.f37833c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new U9(this.f37832b, this.f37833c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        W9 w92;
        Object objG = pf.b.g();
        int i10 = this.f37831a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4154xb c4154xb = (C4154xb) AbstractC4179yb.f39987a.getValue();
            this.f37831a = 1;
            obj = c4154xb.b(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ArrayList arrayList = this.f37833c;
        for (C3980qb c3980qb : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
            if (!Lb.a(c3980qb.f39367a)) {
                String strB = Tb.b(c3980qb.f39367a);
                if (strB != null) {
                    JSONObject jSONObject = new JSONObject(strB);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray(s.z.f67719y);
                    Intrinsics.checkNotNull(jSONObject2);
                    Intrinsics.checkNotNull(jSONArray);
                    w92 = new W9(jSONObject2, jSONArray, c3980qb);
                } else {
                    w92 = null;
                }
                if (w92 != null) {
                    arrayList.add(w92);
                }
            }
        }
        return Unit.f93236a;
    }
}
