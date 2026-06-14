package com.inmobi.media;

import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.I2;
import com.inmobi.media.La;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class La implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f37273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3850l6 f37274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R9 f37275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f37276d;

    public La(CrashConfig crashConfig) {
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        this.f37273a = crashConfig;
        this.f37275c = new R9(crashConfig);
        this.f37276d = new Function1() { // from class: w3.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return La.a(this.f107314b, (I2) obj);
            }
        };
    }

    public static final Unit a(La la2, I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = it.f37045a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = it.f37047c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.f37047c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        Q9 incident = (Q9) obj;
                        la2.getClass();
                        Intrinsics.checkNotNullParameter(incident, "incident");
                        AbstractC3790il.a(new Ka(la2, incident, null));
                    }
                    break;
            }
        } else {
            C3850l6 c3850l6 = la2.f37274b;
            if (c3850l6 != null) {
                c3850l6.f38950f.set(false);
                c3850l6.f38951g.set(true);
                c3850l6.f38952h.clear();
                c3850l6.f38954j = null;
            }
            la2.f37274b = null;
            ((C4155xc) Ji.f37161e.getValue()).a(la2.f37276d);
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.d) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.La r13, com.inmobi.media.Q9 r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.La.a(com.inmobi.media.La, com.inmobi.media.Q9, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.La r4, kotlin.coroutines.jvm.internal.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.inmobi.media.Ja
            if (r0 == 0) goto L16
            r0 = r5
            com.inmobi.media.Ja r0 = (com.inmobi.media.Ja) r0
            int r1 = r0.f37122c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f37122c = r1
            goto L1b
        L16:
            com.inmobi.media.Ja r0 = new com.inmobi.media.Ja
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f37120a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37122c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r5)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.d.b(r5)
            kotlin.Lazy r5 = com.inmobi.media.P9.f37527a
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.N9 r5 = (com.inmobi.media.N9) r5
            r0.f37122c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L53
            r4.a()
        L53:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.La.a(com.inmobi.media.La, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        La la2;
        C3623c6 eventConfig = this.f37273a.getEventConfig();
        eventConfig.f38330k = this.f37273a.getUrl();
        C3850l6 c3850l6 = this.f37274b;
        if (c3850l6 != null) {
            Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
            c3850l6.f38954j = eventConfig;
            la2 = this;
        } else {
            la2 = this;
            la2.f37274b = new C3850l6("crash", (N9) P9.f37527a.getValue(), la2, this.f37273a.getEventConfig(), null);
        }
        C3850l6 c3850l62 = la2.f37274b;
        if (c3850l62 != null) {
            c3850l62.a(false);
        }
    }

    @Override // com.inmobi.media.Jf
    public final Object a(Continuation continuation) {
        int iA;
        String string;
        C4148x5.f39893a.getClass();
        int iL = C4148x5.l();
        int i10 = 1;
        if (iL == 0 || iL != 1) {
            iA = this.f37273a.getMobileConfig().a();
        } else {
            iA = this.f37273a.getWifiConfig().a();
        }
        List<Q9> list = (List) eg.h.b(null, new Fa(iA, null), 1, null);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.coroutines.jvm.internal.b.d(((Q9) it.next()).f38737d));
            }
            try {
                HashMap map = new HashMap(C4148x5.f39893a.a(false));
                map.put("im-accid", Ji.f37159c);
                map.put("version", "2.0.0");
                map.put("component", "crash");
                map.put("mk-version", Ki.a());
                map.putAll(A1.f36543e);
                map.put("tp", Ki.f37226b);
                String str = Ki.f37225a;
                if (str == null) {
                    str = "";
                }
                map.put("tpVer", str);
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = new JSONArray();
                for (Q9 q92 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", q92.f37584e);
                    jSONObject2.put("eventType", q92.f38734a);
                    String str2 = q92.f38735b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int length = str2.length() - i10;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str2.subSequence(i11, length + 1).toString().length() > 0) {
                        String str3 = q92.f38735b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONObject2.put("crash_report", str3);
                    }
                    jSONObject2.put("ts", q92.f38736c);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put("crash", jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new C3674e6(string, arrayList);
            }
        }
        return null;
    }
}
