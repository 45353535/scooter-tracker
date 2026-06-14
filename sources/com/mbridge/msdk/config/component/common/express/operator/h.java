package com.mbridge.msdk.config.component.common.express.operator;

import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f46728a = Arrays.asList("map", "filter", "sorted");

    class a implements Comparator<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.common.express.operator.parts.b f46729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f46731c;

        a(com.mbridge.msdk.config.component.common.express.operator.parts.b bVar, int i10, boolean z10) {
            this.f46729a = bVar;
            this.f46730b = i10;
            this.f46731c = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.h.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(java.lang.String r6, java.lang.Object r7, java.util.List<java.lang.Object> r8) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lb
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.c()
            return r6
        Lb:
            r0 = 0
            int r1 = r6.hashCode()     // Catch: java.lang.Exception -> L2c
            r2 = -1274492040(0xffffffffb408cb78, float:-1.2740009E-7)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L38
            r2 = -896593219(0xffffffffca8f12bd, float:-4688222.5)
            if (r1 == r2) goto L2e
            r2 = 107868(0x1a55c, float:1.51155E-40)
            if (r1 == r2) goto L22
            goto L42
        L22:
            java.lang.String r1 = "map"
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L42
            r6 = 0
            goto L43
        L2c:
            r6 = move-exception
            goto L5d
        L2e:
            java.lang.String r1 = "sorted"
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L42
            r6 = r4
            goto L43
        L38:
            java.lang.String r1 = "filter"
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L42
            r6 = r3
            goto L43
        L42:
            r6 = -1
        L43:
            if (r6 == 0) goto L58
            if (r6 == r3) goto L53
            if (r6 == r4) goto L4e
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r0)     // Catch: java.lang.Exception -> L2c
            return r6
        L4e:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = r5.c(r7, r8)     // Catch: java.lang.Exception -> L2c
            return r6
        L53:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = r5.a(r7, r8)     // Catch: java.lang.Exception -> L2c
            return r6
        L58:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = r5.b(r7, r8)     // Catch: java.lang.Exception -> L2c
            return r6
        L5d:
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "SQLOperator"
            com.mbridge.msdk.foundation.tools.q0.b(r8, r7, r6)
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.h.a(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (!(obj instanceof ArrayList)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        boolean z10 = true;
        if (list.size() > 1 && Integer.parseInt(list.get(1).toString()) != 1) {
            z10 = false;
        }
        int i10 = list.size() > 2 ? Integer.parseInt(list.get(2).toString()) : 0;
        ArrayList arrayList = new ArrayList((ArrayList) obj);
        Collections.sort(arrayList, new a((com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2, i10, z10));
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Iterator<String> it = f46728a.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        boolean z10 = obj instanceof ArrayList;
        if (!z10 && !(obj instanceof HashMap) && !(obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                ArrayList arrayList2 = (ArrayList) obj;
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    bVar.a(arrayList2.get(i10));
                    FutureTask futureTask = new FutureTask(bVar);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null) {
                            arrayList.add(futureTask.get());
                        }
                    } catch (Exception e10) {
                        q0.b("SQLOperator", e10.getMessage(), e10);
                    }
                }
            } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar2 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                    aVar.a(C4240b4.i.W, entry.getKey());
                    aVar.a("value", entry.getValue());
                    bVar2.a(aVar);
                    FutureTask futureTask2 = new FutureTask(bVar2);
                    new Thread(futureTask2).start();
                    try {
                        if (futureTask2.get() != null) {
                            arrayList.add(futureTask2.get());
                        }
                    } catch (Exception e11) {
                        q0.b("SQLOperator", e11.getMessage(), e11);
                    }
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        boolean z10 = obj instanceof ArrayList;
        if (!z10 && !(obj instanceof HashMap) && !(obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                ArrayList arrayList2 = (ArrayList) obj;
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Object obj3 = arrayList2.get(i10);
                    bVar.a(obj3);
                    FutureTask futureTask = new FutureTask(bVar);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null && Integer.parseInt(futureTask.get().toString()) == 1) {
                            arrayList.add(obj3);
                        }
                    } catch (Exception e10) {
                        q0.b("SQLOperator", e10.getMessage(), e10);
                    }
                }
            } else {
                if (obj instanceof HashMap) {
                    HashMap map = new HashMap();
                    com.mbridge.msdk.config.component.common.express.operator.parts.b bVar2 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                    for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                        HashMap map2 = new HashMap();
                        map2.put(C4240b4.i.W, entry.getKey());
                        map2.put("value", entry.getValue());
                        bVar2.a(map2);
                        FutureTask futureTask2 = new FutureTask(bVar2);
                        new Thread(futureTask2).start();
                        try {
                            if (Integer.parseInt(futureTask2.get().toString()) == 1) {
                                arrayList.add(map2);
                                map.put(entry.getKey(), entry.getValue());
                            }
                        } catch (Exception e11) {
                            q0.b("SQLOperator", e11.getMessage(), e11);
                        }
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                    com.mbridge.msdk.config.component.common.express.operator.parts.b bVar3 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                    for (Map.Entry<String, Object> entry2 : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                        HashMap map3 = new HashMap();
                        map3.put(C4240b4.i.W, entry2.getKey());
                        map3.put("value", entry2.getValue());
                        bVar3.a(map3);
                        FutureTask futureTask3 = new FutureTask(bVar3);
                        new Thread(futureTask3).start();
                        try {
                            if (Integer.parseInt(futureTask3.get().toString()) == 1) {
                                arrayList.add(map3);
                                aVar.a(entry2.getKey(), entry2.getValue());
                            }
                        } catch (Exception e12) {
                            q0.b("SQLOperator", e12.getMessage(), e12);
                        }
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }
}
